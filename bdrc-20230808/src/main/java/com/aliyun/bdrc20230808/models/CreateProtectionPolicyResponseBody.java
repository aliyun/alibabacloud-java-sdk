// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CreateProtectionPolicyResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateProtectionPolicyResponseBodyData data;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>34081B20-C4C0-514F-93F6-8EEC3D1A587E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProtectionPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectionPolicyResponseBody self = new CreateProtectionPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProtectionPolicyResponseBody setData(CreateProtectionPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateProtectionPolicyResponseBodyData getData() {
        return this.data;
    }

    public CreateProtectionPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateProtectionPolicyResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the protection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>p-123***7890</p>
         */
        @NameInMap("ProtectionPolicyId")
        public String protectionPolicyId;

        public static CreateProtectionPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateProtectionPolicyResponseBodyData self = new CreateProtectionPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateProtectionPolicyResponseBodyData setProtectionPolicyId(String protectionPolicyId) {
            this.protectionPolicyId = protectionPolicyId;
            return this;
        }
        public String getProtectionPolicyId() {
            return this.protectionPolicyId;
        }

    }

}
