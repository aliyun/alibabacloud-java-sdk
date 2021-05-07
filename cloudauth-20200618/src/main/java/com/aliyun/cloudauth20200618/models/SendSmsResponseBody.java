// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20200618.models;

import com.aliyun.tea.*;

public class SendSmsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public SendSmsResponseBodyResultObject resultObject;

    public static SendSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendSmsResponseBody self = new SendSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public SendSmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendSmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendSmsResponseBody setResultObject(SendSmsResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public SendSmsResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class SendSmsResponseBodyResultObject extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        public static SendSmsResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            SendSmsResponseBodyResultObject self = new SendSmsResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public SendSmsResponseBodyResultObject setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

}
