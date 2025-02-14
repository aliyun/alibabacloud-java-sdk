// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreatePolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreatePolicyResponseBodyData data;

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
     * <p>393E2630-DBE7-5221-AB35-9E7406754***</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreatePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyResponseBody self = new CreatePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreatePolicyResponseBody setData(CreatePolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePolicyResponseBodyData getData() {
        return this.data;
    }

    public CreatePolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePolicyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>p-cq7l5s5lhtgi6qasr***</p>
         */
        @NameInMap("policyId")
        public String policyId;

        public static CreatePolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePolicyResponseBodyData self = new CreatePolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePolicyResponseBodyData setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

    }

}
