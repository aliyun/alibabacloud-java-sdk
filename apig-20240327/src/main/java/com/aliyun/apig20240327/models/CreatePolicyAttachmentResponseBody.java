// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePolicyAttachmentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreatePolicyAttachmentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>585657D2-1C20-5B8A-AF17-D727C64***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePolicyAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyAttachmentResponseBody self = new CreatePolicyAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyAttachmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePolicyAttachmentResponseBody setData(CreatePolicyAttachmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePolicyAttachmentResponseBodyData getData() {
        return this.data;
    }

    public CreatePolicyAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePolicyAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePolicyAttachmentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>pr-cqooju5lhtgquuj6***</p>
         */
        @NameInMap("policyAttachmentId")
        public String policyAttachmentId;

        public static CreatePolicyAttachmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyAttachmentResponseBodyData self = new CreatePolicyAttachmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePolicyAttachmentResponseBodyData setPolicyAttachmentId(String policyAttachmentId) {
            this.policyAttachmentId = policyAttachmentId;
            return this;
        }
        public String getPolicyAttachmentId() {
            return this.policyAttachmentId;
        }

    }

}
