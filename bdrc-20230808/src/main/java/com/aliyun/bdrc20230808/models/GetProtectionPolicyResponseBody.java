// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class GetProtectionPolicyResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetProtectionPolicyResponseBodyData data;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AE43C4CB-8074-5EBD-9806-8CA6D12800B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetProtectionPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProtectionPolicyResponseBody self = new GetProtectionPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProtectionPolicyResponseBody setData(GetProtectionPolicyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProtectionPolicyResponseBodyData getData() {
        return this.data;
    }

    public GetProtectionPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProtectionPolicyResponseBodyDataSubProtectionPolicies extends TeaModel {
        /**
         * <p>The sub-protection policy configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;autoSnapshotPolicyId\&quot;:\&quot;sp-123***7890\&quot;}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The sub-protection policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_AUTO_SNAPSHOT_POLICY</p>
         */
        @NameInMap("SubProtectionPolicyType")
        public String subProtectionPolicyType;

        public static GetProtectionPolicyResponseBodyDataSubProtectionPolicies build(java.util.Map<String, ?> map) throws Exception {
            GetProtectionPolicyResponseBodyDataSubProtectionPolicies self = new GetProtectionPolicyResponseBodyDataSubProtectionPolicies();
            return TeaModel.build(map, self);
        }

        public GetProtectionPolicyResponseBodyDataSubProtectionPolicies setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetProtectionPolicyResponseBodyDataSubProtectionPolicies setSubProtectionPolicyType(String subProtectionPolicyType) {
            this.subProtectionPolicyType = subProtectionPolicyType;
            return this;
        }
        public String getSubProtectionPolicyType() {
            return this.subProtectionPolicyType;
        }

    }

    public static class GetProtectionPolicyResponseBodyData extends TeaModel {
        /**
         * <p>The list of associated resource category IDs.</p>
         */
        @NameInMap("BoundResourceCategoryIds")
        public java.util.List<String> boundResourceCategoryIds;

        /**
         * <p>The time when the policy was last applied.</p>
         * 
         * <strong>example:</strong>
         * <p>1742167218</p>
         */
        @NameInMap("LatestApplyTime")
        public Long latestApplyTime;

        /**
         * <p>The ID of the latest application task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-123***7890</p>
         */
        @NameInMap("LatestTaskId")
        public String latestTaskId;

        /**
         * <p>The protection policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-123***7890</p>
         */
        @NameInMap("ProtectionPolicyId")
        public String protectionPolicyId;

        /**
         * <p>The protection policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyProtectionPolicy</p>
         */
        @NameInMap("ProtectionPolicyName")
        public String protectionPolicyName;

        /**
         * <p>The region ID of the protection policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("ProtectionPolicyRegionId")
        public String protectionPolicyRegionId;

        /**
         * <p>The list of configured sub-protection policies.</p>
         */
        @NameInMap("SubProtectionPolicies")
        public java.util.List<GetProtectionPolicyResponseBodyDataSubProtectionPolicies> subProtectionPolicies;

        public static GetProtectionPolicyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProtectionPolicyResponseBodyData self = new GetProtectionPolicyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProtectionPolicyResponseBodyData setBoundResourceCategoryIds(java.util.List<String> boundResourceCategoryIds) {
            this.boundResourceCategoryIds = boundResourceCategoryIds;
            return this;
        }
        public java.util.List<String> getBoundResourceCategoryIds() {
            return this.boundResourceCategoryIds;
        }

        public GetProtectionPolicyResponseBodyData setLatestApplyTime(Long latestApplyTime) {
            this.latestApplyTime = latestApplyTime;
            return this;
        }
        public Long getLatestApplyTime() {
            return this.latestApplyTime;
        }

        public GetProtectionPolicyResponseBodyData setLatestTaskId(String latestTaskId) {
            this.latestTaskId = latestTaskId;
            return this;
        }
        public String getLatestTaskId() {
            return this.latestTaskId;
        }

        public GetProtectionPolicyResponseBodyData setProtectionPolicyId(String protectionPolicyId) {
            this.protectionPolicyId = protectionPolicyId;
            return this;
        }
        public String getProtectionPolicyId() {
            return this.protectionPolicyId;
        }

        public GetProtectionPolicyResponseBodyData setProtectionPolicyName(String protectionPolicyName) {
            this.protectionPolicyName = protectionPolicyName;
            return this;
        }
        public String getProtectionPolicyName() {
            return this.protectionPolicyName;
        }

        public GetProtectionPolicyResponseBodyData setProtectionPolicyRegionId(String protectionPolicyRegionId) {
            this.protectionPolicyRegionId = protectionPolicyRegionId;
            return this;
        }
        public String getProtectionPolicyRegionId() {
            return this.protectionPolicyRegionId;
        }

        public GetProtectionPolicyResponseBodyData setSubProtectionPolicies(java.util.List<GetProtectionPolicyResponseBodyDataSubProtectionPolicies> subProtectionPolicies) {
            this.subProtectionPolicies = subProtectionPolicies;
            return this;
        }
        public java.util.List<GetProtectionPolicyResponseBodyDataSubProtectionPolicies> getSubProtectionPolicies() {
            return this.subProtectionPolicies;
        }

    }

}
