// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendRCSReplyResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SendRCSReplyResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SendRCSReplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendRCSReplyResponseBody self = new SendRCSReplyResponseBody();
        return TeaModel.build(map, self);
    }

    public SendRCSReplyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SendRCSReplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendRCSReplyResponseBody setData(SendRCSReplyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SendRCSReplyResponseBodyData getData() {
        return this.data;
    }

    public SendRCSReplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendRCSReplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendRCSReplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SendRCSReplyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("AccessDeniedDetail")
        public String accessDeniedDetail;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Bdcust")
        public String bdcust;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Debug")
        public java.util.Map<String, ?> debug;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("E")
        public String e;

        @NameInMap("ExtendMap")
        public java.util.Map<String, ?> extendMap;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("GateFailMsg")
        public String gateFailMsg;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("KeyString")
        public String keyString;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("Module")
        public java.util.Map<String, ?> module;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("PartnerId")
        public String partnerId;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static SendRCSReplyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendRCSReplyResponseBodyData self = new SendRCSReplyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendRCSReplyResponseBodyData setAccessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }
        public String getAccessDeniedDetail() {
            return this.accessDeniedDetail;
        }

        public SendRCSReplyResponseBodyData setBdcust(String bdcust) {
            this.bdcust = bdcust;
            return this;
        }
        public String getBdcust() {
            return this.bdcust;
        }

        public SendRCSReplyResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SendRCSReplyResponseBodyData setDebug(java.util.Map<String, ?> debug) {
            this.debug = debug;
            return this;
        }
        public java.util.Map<String, ?> getDebug() {
            return this.debug;
        }

        public SendRCSReplyResponseBodyData setE(String e) {
            this.e = e;
            return this;
        }
        public String getE() {
            return this.e;
        }

        public SendRCSReplyResponseBodyData setExtendMap(java.util.Map<String, ?> extendMap) {
            this.extendMap = extendMap;
            return this;
        }
        public java.util.Map<String, ?> getExtendMap() {
            return this.extendMap;
        }

        public SendRCSReplyResponseBodyData setGateFailMsg(String gateFailMsg) {
            this.gateFailMsg = gateFailMsg;
            return this;
        }
        public String getGateFailMsg() {
            return this.gateFailMsg;
        }

        public SendRCSReplyResponseBodyData setKeyString(String keyString) {
            this.keyString = keyString;
            return this;
        }
        public String getKeyString() {
            return this.keyString;
        }

        public SendRCSReplyResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SendRCSReplyResponseBodyData setModule(java.util.Map<String, ?> module) {
            this.module = module;
            return this;
        }
        public java.util.Map<String, ?> getModule() {
            return this.module;
        }

        public SendRCSReplyResponseBodyData setPartnerId(String partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public String getPartnerId() {
            return this.partnerId;
        }

        public SendRCSReplyResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public SendRCSReplyResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
