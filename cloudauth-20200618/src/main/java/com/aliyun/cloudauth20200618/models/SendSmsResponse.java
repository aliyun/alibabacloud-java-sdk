// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class SendSmsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public SendSmsResponseResultObject resultObject;

    public static SendSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        SendSmsResponse self = new SendSmsResponse();
        return TeaModel.build(map, self);
    }

    public SendSmsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendSmsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendSmsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendSmsResponse setResultObject(SendSmsResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public SendSmsResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class SendSmsResponseResultObject extends TeaModel {
        @NameInMap("BizId")
        @Validation(required = true)
        public String bizId;

        public static SendSmsResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            SendSmsResponseResultObject self = new SendSmsResponseResultObject();
            return TeaModel.build(map, self);
        }

        public SendSmsResponseResultObject setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

}
