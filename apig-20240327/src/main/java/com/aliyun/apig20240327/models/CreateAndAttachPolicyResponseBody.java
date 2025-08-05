// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAndAttachPolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateAndAttachPolicyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>585657D2-1C20-5B8A-AF17-D727C6490BE4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateAndAttachPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAndAttachPolicyResponseBody self = new CreateAndAttachPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAndAttachPolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAndAttachPolicyResponseBody setData(CreateAndAttachPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAndAttachPolicyResponseBodyData getData() {
        return this.data;
    }

    public CreateAndAttachPolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAndAttachPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAndAttachPolicyResponseBodyData extends TeaModel {
        @NameInMap("attachment")
        public Attachment attachment;

        /**
         * <strong>example:</strong>
         * <p>p-cq7l5s5lhtgi6qasrdc0</p>
         */
        @NameInMap("policyId")
        public String policyId;

        public static CreateAndAttachPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAndAttachPolicyResponseBodyData self = new CreateAndAttachPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAndAttachPolicyResponseBodyData setAttachment(Attachment attachment) {
            this.attachment = attachment;
            return this;
        }
        public Attachment getAttachment() {
            return this.attachment;
        }

        public CreateAndAttachPolicyResponseBodyData setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

    }

}
