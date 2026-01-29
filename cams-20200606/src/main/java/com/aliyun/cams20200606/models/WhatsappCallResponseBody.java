// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class WhatsappCallResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public WhatsappCallResponseBodyModel model;

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

    public static WhatsappCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        WhatsappCallResponseBody self = new WhatsappCallResponseBody();
        return TeaModel.build(map, self);
    }

    public WhatsappCallResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public WhatsappCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WhatsappCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public WhatsappCallResponseBody setModel(WhatsappCallResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public WhatsappCallResponseBodyModel getModel() {
        return this.model;
    }

    public WhatsappCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public WhatsappCallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class WhatsappCallResponseBodyModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CallId")
        public String callId;

        public static WhatsappCallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            WhatsappCallResponseBodyModel self = new WhatsappCallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public WhatsappCallResponseBodyModel setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

    }

}
