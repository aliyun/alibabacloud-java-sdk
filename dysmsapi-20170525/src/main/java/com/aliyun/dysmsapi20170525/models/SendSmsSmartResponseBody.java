// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsSmartResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendSmsSmartResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendSmsSmartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendSmsSmartResponseBody self = new SendSmsSmartResponseBody();
        return TeaModel.build(map, self);
    }

    public SendSmsSmartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendSmsSmartResponseBody setData(SendSmsSmartResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendSmsSmartResponseBodyData getData() {
        return this.data;
    }

    public SendSmsSmartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendSmsSmartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendSmsSmartResponseBodyData extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        public static SendSmsSmartResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendSmsSmartResponseBodyData self = new SendSmsSmartResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendSmsSmartResponseBodyData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

    }

}
