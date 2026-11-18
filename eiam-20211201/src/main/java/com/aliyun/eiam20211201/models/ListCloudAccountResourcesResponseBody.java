// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountResourcesResponseBody extends TeaModel {
    /**
     * <p>The list of cloud account resources.</p>
     */
    @NameInMap("CloudAccountResources")
    public java.util.List<ListCloudAccountResourcesResponseBodyCloudAccountResources> cloudAccountResources;

    /**
     * <p>The maximum number of entries per page for paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token returned in the current call. You can use this token for the next paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCloudAccountResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountResourcesResponseBody self = new ListCloudAccountResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountResourcesResponseBody setCloudAccountResources(java.util.List<ListCloudAccountResourcesResponseBodyCloudAccountResources> cloudAccountResources) {
        this.cloudAccountResources = cloudAccountResources;
        return this;
    }
    public java.util.List<ListCloudAccountResourcesResponseBodyCloudAccountResources> getCloudAccountResources() {
        return this.cloudAccountResources;
    }

    public ListCloudAccountResourcesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListCloudAccountResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCloudAccountResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAccountResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta extends TeaModel {
        /**
         * <p>The JSON document of the Tencent Cloud CAM policy. This is returned only for Tencent Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[]}</p>
         */
        @NameInMap("CamPolicyDocument")
        public String camPolicyDocument;

        /**
         * <p>The type of the Tencent Cloud CAM policy. Valid values: qcs and local. This is returned only for Tencent Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>qcs</p>
         */
        @NameInMap("CamPolicyType")
        public String camPolicyType;

        /**
         * <p>The JSON document of the AWS IAM policy. This is returned only for AWS cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;2012-10-17&quot;,&quot;Statement&quot;:[]}</p>
         */
        @NameInMap("IamPolicyDocument")
        public String iamPolicyDocument;

        /**
         * <p>The type of the AWS IAM policy. Valid values: aws and local. This is returned only for AWS cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>aws</p>
         */
        @NameInMap("IamPolicyType")
        public String iamPolicyType;

        /**
         * <p>The JSON document of the RAM policy. This is returned only by the Get API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[]}</p>
         */
        @NameInMap("RamPolicyDocument")
        public String ramPolicyDocument;

        /**
         * <p>The type of the RAM policy. Valid values: system and custom.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("RamPolicyType")
        public String ramPolicyType;

        public static ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta self = new ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta setCamPolicyDocument(String camPolicyDocument) {
            this.camPolicyDocument = camPolicyDocument;
            return this;
        }
        public String getCamPolicyDocument() {
            return this.camPolicyDocument;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta setCamPolicyType(String camPolicyType) {
            this.camPolicyType = camPolicyType;
            return this;
        }
        public String getCamPolicyType() {
            return this.camPolicyType;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta setIamPolicyDocument(String iamPolicyDocument) {
            this.iamPolicyDocument = iamPolicyDocument;
            return this;
        }
        public String getIamPolicyDocument() {
            return this.iamPolicyDocument;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta setIamPolicyType(String iamPolicyType) {
            this.iamPolicyType = iamPolicyType;
            return this;
        }
        public String getIamPolicyType() {
            return this.iamPolicyType;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta setRamPolicyDocument(String ramPolicyDocument) {
            this.ramPolicyDocument = ramPolicyDocument;
            return this;
        }
        public String getRamPolicyDocument() {
            return this.ramPolicyDocument;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta setRamPolicyType(String ramPolicyType) {
            this.ramPolicyType = ramPolicyType;
            return this;
        }
        public String getRamPolicyType() {
            return this.ramPolicyType;
        }

    }

    public static class ListCloudAccountResourcesResponseBodyCloudAccountResources extends TeaModel {
        /**
         * <p>The ID of the cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012xxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>The identifier of the resource entity, which is a unique remote identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>System:AliyunIntelligentcockpitReadOnlyAccessexample</p>
         */
        @NameInMap("CloudAccountResourceEntityId")
        public String cloudAccountResourceEntityId;

        /**
         * <p>The resource entity type. Valid values: ram_role.</p>
         * 
         * <strong>example:</strong>
         * <p>ram_role</p>
         */
        @NameInMap("CloudAccountResourceEntityType")
        public String cloudAccountResourceEntityType;

        /**
         * <p>The identifier of the cloud account resource.</p>
         * 
         * <strong>example:</strong>
         * <p>car_xxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("CloudAccountResourceId")
        public String cloudAccountResourceId;

        /**
         * <p>The metadata of the resource.</p>
         */
        @NameInMap("CloudAccountResourceMeta")
        public ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta cloudAccountResourceMeta;

        /**
         * <p>The name of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-sso-role</p>
         */
        @NameInMap("CloudAccountResourceName")
        public String cloudAccountResourceName;

        /**
         * <p>The time when the resource was created. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649830225000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud account resource used for SSO</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the resource was last updated. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649916625000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListCloudAccountResourcesResponseBodyCloudAccountResources build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountResourcesResponseBodyCloudAccountResources self = new ListCloudAccountResourcesResponseBodyCloudAccountResources();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResources setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResources setCloudAccountResourceEntityId(String cloudAccountResourceEntityId) {
            this.cloudAccountResourceEntityId = cloudAccountResourceEntityId;
            return this;
        }
        public String getCloudAccountResourceEntityId() {
            return this.cloudAccountResourceEntityId;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResources setCloudAccountResourceEntityType(String cloudAccountResourceEntityType) {
            this.cloudAccountResourceEntityType = cloudAccountResourceEntityType;
            return this;
        }
        public String getCloudAccountResourceEntityType() {
            return this.cloudAccountResourceEntityType;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResources setCloudAccountResourceId(String cloudAccountResourceId) {
            this.cloudAccountResourceId = cloudAccountResourceId;
            return this;
        }
        public String getCloudAccountResourceId() {
            return this.cloudAccountResourceId;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResources setCloudAccountResourceMeta(ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta cloudAccountResourceMeta) {
            this.cloudAccountResourceMeta = cloudAccountResourceMeta;
            return this;
        }
        public ListCloudAccountResourcesResponseBodyCloudAccountResourcesCloudAccountResourceMeta getCloudAccountResourceMeta() {
            return this.cloudAccountResourceMeta;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResources setCloudAccountResourceName(String cloudAccountResourceName) {
            this.cloudAccountResourceName = cloudAccountResourceName;
            return this;
        }
        public String getCloudAccountResourceName() {
            return this.cloudAccountResourceName;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResources setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCloudAccountResourcesResponseBodyCloudAccountResources setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
