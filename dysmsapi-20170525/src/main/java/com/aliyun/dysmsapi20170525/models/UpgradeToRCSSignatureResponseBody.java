// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpgradeToRCSSignatureResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public UpgradeToRCSSignatureResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpgradeToRCSSignatureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeToRCSSignatureResponseBody self = new UpgradeToRCSSignatureResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeToRCSSignatureResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpgradeToRCSSignatureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpgradeToRCSSignatureResponseBody setData(UpgradeToRCSSignatureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeToRCSSignatureResponseBodyData getData() {
        return this.data;
    }

    public UpgradeToRCSSignatureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeToRCSSignatureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeToRCSSignatureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpgradeToRCSSignatureResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ChatbotCode")
        public String chatbotCode;

        /**
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("SignId")
        public Long signId;

        public static UpgradeToRCSSignatureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeToRCSSignatureResponseBodyData self = new UpgradeToRCSSignatureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeToRCSSignatureResponseBodyData setChatbotCode(String chatbotCode) {
            this.chatbotCode = chatbotCode;
            return this;
        }
        public String getChatbotCode() {
            return this.chatbotCode;
        }

        public UpgradeToRCSSignatureResponseBodyData setSignId(Long signId) {
            this.signId = signId;
            return this;
        }
        public Long getSignId() {
            return this.signId;
        }

    }

}
