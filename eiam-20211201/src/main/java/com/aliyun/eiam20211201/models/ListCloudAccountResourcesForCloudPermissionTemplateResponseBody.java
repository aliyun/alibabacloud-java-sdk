// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListCloudAccountResourcesForCloudPermissionTemplateResponseBody extends TeaModel {
    /**
     * <p>The list of cloud account resources.</p>
     */
    @NameInMap("CloudAccountResources")
    public java.util.List<ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources> cloudAccountResources;

    /**
     * <p>The number of entries returned per page in a paging query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token returned in the current response. You can use this token to query the next page.</p>
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
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCloudAccountResourcesForCloudPermissionTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudAccountResourcesForCloudPermissionTemplateResponseBody self = new ListCloudAccountResourcesForCloudPermissionTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateResponseBody setCloudAccountResources(java.util.List<ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources> cloudAccountResources) {
        this.cloudAccountResources = cloudAccountResources;
        return this;
    }
    public java.util.List<ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources> getCloudAccountResources() {
        return this.cloudAccountResources;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudAccountResourcesForCloudPermissionTemplateResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta extends TeaModel {
        /**
         * <p>The JSON string of the Tencent Cloud CAM policy document. This parameter is returned only for Tencent Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[]}</p>
         */
        @NameInMap("CamPolicyDocument")
        public String camPolicyDocument;

        /**
         * <p>The type of the Tencent Cloud Access Management (CAM) policy. Valid values: qcs and local. This parameter is returned only for Tencent Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>qcs</p>
         */
        @NameInMap("CamPolicyType")
        public String camPolicyType;

        /**
         * <p>The JSON string of the AWS IAM policy document. This parameter is returned only for AWS cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;2012-10-17&quot;,&quot;Statement&quot;:[]}</p>
         */
        @NameInMap("IamPolicyDocument")
        public String iamPolicyDocument;

        /**
         * <p>The type of the AWS Identity and Access Management (IAM) policy. Valid values: aws and local. This parameter is returned only for AWS cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>aws</p>
         */
        @NameInMap("IamPolicyType")
        public String iamPolicyType;

        /**
         * <p>The JSON string of the RAM policy document. This parameter is returned only by the Get operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[]}</p>
         */
        @NameInMap("RamPolicyDocument")
        public String ramPolicyDocument;

        /**
         * <p>The type of the Resource Access Management (RAM) policy. Valid values: system and custom.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("RamPolicyType")
        public String ramPolicyType;

        public static ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta self = new ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta setCamPolicyDocument(String camPolicyDocument) {
            this.camPolicyDocument = camPolicyDocument;
            return this;
        }
        public String getCamPolicyDocument() {
            return this.camPolicyDocument;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta setCamPolicyType(String camPolicyType) {
            this.camPolicyType = camPolicyType;
            return this;
        }
        public String getCamPolicyType() {
            return this.camPolicyType;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta setIamPolicyDocument(String iamPolicyDocument) {
            this.iamPolicyDocument = iamPolicyDocument;
            return this;
        }
        public String getIamPolicyDocument() {
            return this.iamPolicyDocument;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta setIamPolicyType(String iamPolicyType) {
            this.iamPolicyType = iamPolicyType;
            return this;
        }
        public String getIamPolicyType() {
            return this.iamPolicyType;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta setRamPolicyDocument(String ramPolicyDocument) {
            this.ramPolicyDocument = ramPolicyDocument;
            return this;
        }
        public String getRamPolicyDocument() {
            return this.ramPolicyDocument;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta setRamPolicyType(String ramPolicyType) {
            this.ramPolicyType = ramPolicyType;
            return this;
        }
        public String getRamPolicyType() {
            return this.ramPolicyType;
        }

    }

    public static class ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources extends TeaModel {
        /**
         * <p>The ID of the cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012xxxx</p>
         */
        @NameInMap("CloudAccountId")
        public String cloudAccountId;

        /**
         * <p>The unique remote identifier of the resource entity.</p>
         * 
         * <strong>example:</strong>
         * <p>System:AliyunIntelligentcockpitReadOnlyAccessexample</p>
         */
        @NameInMap("CloudAccountResourceEntityId")
        public String cloudAccountResourceEntityId;

        /**
         * <p>The type of the resource entity. Valid values: ram_role.</p>
         * 
         * <strong>example:</strong>
         * <p>ram_role</p>
         */
        @NameInMap("CloudAccountResourceEntityType")
        public String cloudAccountResourceEntityType;

        /**
         * <p>The ID of the cloud account resource.</p>
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
        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta cloudAccountResourceMeta;

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

        public static ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources build(java.util.Map<String, ?> map) throws Exception {
            ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources self = new ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources();
            return TeaModel.build(map, self);
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources setCloudAccountResourceEntityId(String cloudAccountResourceEntityId) {
            this.cloudAccountResourceEntityId = cloudAccountResourceEntityId;
            return this;
        }
        public String getCloudAccountResourceEntityId() {
            return this.cloudAccountResourceEntityId;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources setCloudAccountResourceEntityType(String cloudAccountResourceEntityType) {
            this.cloudAccountResourceEntityType = cloudAccountResourceEntityType;
            return this;
        }
        public String getCloudAccountResourceEntityType() {
            return this.cloudAccountResourceEntityType;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources setCloudAccountResourceId(String cloudAccountResourceId) {
            this.cloudAccountResourceId = cloudAccountResourceId;
            return this;
        }
        public String getCloudAccountResourceId() {
            return this.cloudAccountResourceId;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources setCloudAccountResourceMeta(ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta cloudAccountResourceMeta) {
            this.cloudAccountResourceMeta = cloudAccountResourceMeta;
            return this;
        }
        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResourcesCloudAccountResourceMeta getCloudAccountResourceMeta() {
            return this.cloudAccountResourceMeta;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources setCloudAccountResourceName(String cloudAccountResourceName) {
            this.cloudAccountResourceName = cloudAccountResourceName;
            return this;
        }
        public String getCloudAccountResourceName() {
            return this.cloudAccountResourceName;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCloudAccountResourcesForCloudPermissionTemplateResponseBodyCloudAccountResources setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
