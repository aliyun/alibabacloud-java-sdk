// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListProtectionPoliciesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public ListProtectionPoliciesResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5B2F09BF-CEBD-5A7E-AC01-E7F86169A5E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProtectionPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProtectionPoliciesResponseBody self = new ListProtectionPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProtectionPoliciesResponseBody setData(ListProtectionPoliciesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProtectionPoliciesResponseBodyData getData() {
        return this.data;
    }

    public ListProtectionPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryApplyStatusCount extends TeaModel {
        /**
         * <p>The application status.</p>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("ApplyStatus")
        public String applyStatus;

        /**
         * <p>The count of resources by type.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Count")
        public Long count;

        public static ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryApplyStatusCount build(java.util.Map<String, ?> map) throws Exception {
            ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryApplyStatusCount self = new ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryApplyStatusCount();
            return TeaModel.build(map, self);
        }

        public ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryApplyStatusCount setApplyStatus(String applyStatus) {
            this.applyStatus = applyStatus;
            return this;
        }
        public String getApplyStatus() {
            return this.applyStatus;
        }

        public ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryApplyStatusCount setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryResourceCount extends TeaModel {
        /**
         * <p>The count of resources by type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::OTS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryResourceCount build(java.util.Map<String, ?> map) throws Exception {
            ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryResourceCount self = new ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryResourceCount();
            return TeaModel.build(map, self);
        }

        public ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryResourceCount setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryResourceCount setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListProtectionPoliciesResponseBodyDataContentLatestApplySummary extends TeaModel {
        /**
         * <p>The count statistics of application status.</p>
         */
        @NameInMap("ApplyStatusCount")
        public java.util.List<ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryApplyStatusCount> applyStatusCount;

        /**
         * <p>The time when the task was completed. Unix timestamp format, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1742167218</p>
         */
        @NameInMap("CompleteTime")
        public Long completeTime;

        /**
         * <p>The count of resources by type.</p>
         */
        @NameInMap("ResourceCount")
        public java.util.List<ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryResourceCount> resourceCount;

        public static ListProtectionPoliciesResponseBodyDataContentLatestApplySummary build(java.util.Map<String, ?> map) throws Exception {
            ListProtectionPoliciesResponseBodyDataContentLatestApplySummary self = new ListProtectionPoliciesResponseBodyDataContentLatestApplySummary();
            return TeaModel.build(map, self);
        }

        public ListProtectionPoliciesResponseBodyDataContentLatestApplySummary setApplyStatusCount(java.util.List<ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryApplyStatusCount> applyStatusCount) {
            this.applyStatusCount = applyStatusCount;
            return this;
        }
        public java.util.List<ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryApplyStatusCount> getApplyStatusCount() {
            return this.applyStatusCount;
        }

        public ListProtectionPoliciesResponseBodyDataContentLatestApplySummary setCompleteTime(Long completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public Long getCompleteTime() {
            return this.completeTime;
        }

        public ListProtectionPoliciesResponseBodyDataContentLatestApplySummary setResourceCount(java.util.List<ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryResourceCount> resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public java.util.List<ListProtectionPoliciesResponseBodyDataContentLatestApplySummaryResourceCount> getResourceCount() {
            return this.resourceCount;
        }

    }

    public static class ListProtectionPoliciesResponseBodyDataContentSubProtectionPolicies extends TeaModel {
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

        public static ListProtectionPoliciesResponseBodyDataContentSubProtectionPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListProtectionPoliciesResponseBodyDataContentSubProtectionPolicies self = new ListProtectionPoliciesResponseBodyDataContentSubProtectionPolicies();
            return TeaModel.build(map, self);
        }

        public ListProtectionPoliciesResponseBodyDataContentSubProtectionPolicies setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListProtectionPoliciesResponseBodyDataContentSubProtectionPolicies setSubProtectionPolicyType(String subProtectionPolicyType) {
            this.subProtectionPolicyType = subProtectionPolicyType;
            return this;
        }
        public String getSubProtectionPolicyType() {
            return this.subProtectionPolicyType;
        }

    }

    public static class ListProtectionPoliciesResponseBodyDataContent extends TeaModel {
        /**
         * <p>The attached resource category IDs.</p>
         */
        @NameInMap("BoundResourceCategoryIds")
        public java.util.List<String> boundResourceCategoryIds;

        /**
         * <p>The summary of the latest application result.</p>
         */
        @NameInMap("LatestApplySummary")
        public ListProtectionPoliciesResponseBodyDataContentLatestApplySummary latestApplySummary;

        /**
         * <p>The time when the policy was last applied.</p>
         * 
         * <strong>example:</strong>
         * <p>1742167218</p>
         */
        @NameInMap("LatestApplyTime")
        public Long latestApplyTime;

        /**
         * <p>The task ID of the latest policy application.</p>
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
         * <p>The sub-protection policies.</p>
         */
        @NameInMap("SubProtectionPolicies")
        public java.util.List<ListProtectionPoliciesResponseBodyDataContentSubProtectionPolicies> subProtectionPolicies;

        public static ListProtectionPoliciesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListProtectionPoliciesResponseBodyDataContent self = new ListProtectionPoliciesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListProtectionPoliciesResponseBodyDataContent setBoundResourceCategoryIds(java.util.List<String> boundResourceCategoryIds) {
            this.boundResourceCategoryIds = boundResourceCategoryIds;
            return this;
        }
        public java.util.List<String> getBoundResourceCategoryIds() {
            return this.boundResourceCategoryIds;
        }

        public ListProtectionPoliciesResponseBodyDataContent setLatestApplySummary(ListProtectionPoliciesResponseBodyDataContentLatestApplySummary latestApplySummary) {
            this.latestApplySummary = latestApplySummary;
            return this;
        }
        public ListProtectionPoliciesResponseBodyDataContentLatestApplySummary getLatestApplySummary() {
            return this.latestApplySummary;
        }

        public ListProtectionPoliciesResponseBodyDataContent setLatestApplyTime(Long latestApplyTime) {
            this.latestApplyTime = latestApplyTime;
            return this;
        }
        public Long getLatestApplyTime() {
            return this.latestApplyTime;
        }

        public ListProtectionPoliciesResponseBodyDataContent setLatestTaskId(String latestTaskId) {
            this.latestTaskId = latestTaskId;
            return this;
        }
        public String getLatestTaskId() {
            return this.latestTaskId;
        }

        public ListProtectionPoliciesResponseBodyDataContent setProtectionPolicyId(String protectionPolicyId) {
            this.protectionPolicyId = protectionPolicyId;
            return this;
        }
        public String getProtectionPolicyId() {
            return this.protectionPolicyId;
        }

        public ListProtectionPoliciesResponseBodyDataContent setProtectionPolicyName(String protectionPolicyName) {
            this.protectionPolicyName = protectionPolicyName;
            return this;
        }
        public String getProtectionPolicyName() {
            return this.protectionPolicyName;
        }

        public ListProtectionPoliciesResponseBodyDataContent setProtectionPolicyRegionId(String protectionPolicyRegionId) {
            this.protectionPolicyRegionId = protectionPolicyRegionId;
            return this;
        }
        public String getProtectionPolicyRegionId() {
            return this.protectionPolicyRegionId;
        }

        public ListProtectionPoliciesResponseBodyDataContent setSubProtectionPolicies(java.util.List<ListProtectionPoliciesResponseBodyDataContentSubProtectionPolicies> subProtectionPolicies) {
            this.subProtectionPolicies = subProtectionPolicies;
            return this;
        }
        public java.util.List<ListProtectionPoliciesResponseBodyDataContentSubProtectionPolicies> getSubProtectionPolicies() {
            return this.subProtectionPolicies;
        }

    }

    public static class ListProtectionPoliciesResponseBodyData extends TeaModel {
        /**
         * <p>The response parameters.</p>
         */
        @NameInMap("Content")
        public java.util.List<ListProtectionPoliciesResponseBodyDataContent> content;

        /**
         * <p>The maximum number of results requested.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The paging token.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJAOTzWWYAAAAACjMDLgAAADFTNzMyZDMwMzAzMDM4NzA3NTcwMzY2MjMwNzY2ODcyMzAzMTY2Nzg3ODY5MzY=</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListProtectionPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProtectionPoliciesResponseBodyData self = new ListProtectionPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProtectionPoliciesResponseBodyData setContent(java.util.List<ListProtectionPoliciesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListProtectionPoliciesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListProtectionPoliciesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListProtectionPoliciesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListProtectionPoliciesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
