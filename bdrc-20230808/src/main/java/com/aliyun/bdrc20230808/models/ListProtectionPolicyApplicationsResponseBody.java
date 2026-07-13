// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class ListProtectionPolicyApplicationsResponseBody extends TeaModel {
    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public ListProtectionPolicyApplicationsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34081B20-C4C0-514F-93F6-8EEC3D1A587E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListProtectionPolicyApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProtectionPolicyApplicationsResponseBody self = new ListProtectionPolicyApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProtectionPolicyApplicationsResponseBody setData(ListProtectionPolicyApplicationsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProtectionPolicyApplicationsResponseBodyData getData() {
        return this.data;
    }

    public ListProtectionPolicyApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProtectionPolicyApplicationsResponseBodyDataContent extends TeaModel {
        /**
         * <p>The error details, returned when the application fails.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;errorCode&quot;:&quot;HbrPolicyNotFound&quot;,&quot;errorMessage&quot;:&quot;po-123***7890&quot;}</p>
         */
        @NameInMap("ApplyDetail")
        public String applyDetail;

        /**
         * <p>The policy application status.</p>
         * 
         * <strong>example:</strong>
         * <p>FAILED</p>
         */
        @NameInMap("ApplyStatus")
        public String applyStatus;

        /**
         * <p>The time the policy was applied.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-11-19T02:19:06Z</p>
         */
        @NameInMap("ApplyTime")
        public Long applyTime;

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <p>The protection policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-123***7890</p>
         */
        @NameInMap("ProtectionPolicyId")
        public String protectionPolicyId;

        /**
         * <p>The resource ARN.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ecs:123<em><strong>890:cn-shanghai:instance/i-001</strong></em>90</p>
         */
        @NameInMap("ResourceArn")
        public String resourceArn;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-xxxxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>123***7890</p>
         */
        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The sub-protection policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_AUTO_SNAPSHOT_POLICY</p>
         */
        @NameInMap("SubProtectionPolicyType")
        public String subProtectionPolicyType;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-0000e4w0u1v592zdf6s7</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ListProtectionPolicyApplicationsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListProtectionPolicyApplicationsResponseBodyDataContent self = new ListProtectionPolicyApplicationsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setApplyDetail(String applyDetail) {
            this.applyDetail = applyDetail;
            return this;
        }
        public String getApplyDetail() {
            return this.applyDetail;
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setApplyStatus(String applyStatus) {
            this.applyStatus = applyStatus;
            return this;
        }
        public String getApplyStatus() {
            return this.applyStatus;
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setProtectionPolicyId(String protectionPolicyId) {
            this.protectionPolicyId = protectionPolicyId;
            return this;
        }
        public String getProtectionPolicyId() {
            return this.protectionPolicyId;
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setResourceArn(String resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }
        public String getResourceArn() {
            return this.resourceArn;
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setSubProtectionPolicyType(String subProtectionPolicyType) {
            this.subProtectionPolicyType = subProtectionPolicyType;
            return this;
        }
        public String getSubProtectionPolicyType() {
            return this.subProtectionPolicyType;
        }

        public ListProtectionPolicyApplicationsResponseBodyDataContent setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class ListProtectionPolicyApplicationsResponseBodyData extends TeaModel {
        /**
         * <p>The response content.</p>
         */
        @NameInMap("Content")
        public java.util.List<ListProtectionPolicyApplicationsResponseBodyDataContent> content;

        /**
         * <p>The maximum number of results to return.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The pagination token for retrieving the next page of results. If this parameter is empty, all results have been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>fb836242f4225fa0f0e0257362dfc6dd</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListProtectionPolicyApplicationsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProtectionPolicyApplicationsResponseBodyData self = new ListProtectionPolicyApplicationsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProtectionPolicyApplicationsResponseBodyData setContent(java.util.List<ListProtectionPolicyApplicationsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListProtectionPolicyApplicationsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListProtectionPolicyApplicationsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListProtectionPolicyApplicationsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListProtectionPolicyApplicationsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
