// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCloudAccountResourceResponseBody extends TeaModel {
    /**
     * <p>The cloud account resource information.</p>
     */
    @NameInMap("CloudAccountResource")
    public GetCloudAccountResourceResponseBodyCloudAccountResource cloudAccountResource;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCloudAccountResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAccountResourceResponseBody self = new GetCloudAccountResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCloudAccountResourceResponseBody setCloudAccountResource(GetCloudAccountResourceResponseBodyCloudAccountResource cloudAccountResource) {
        this.cloudAccountResource = cloudAccountResource;
        return this;
    }
    public GetCloudAccountResourceResponseBodyCloudAccountResource getCloudAccountResource() {
        return this.cloudAccountResource;
    }

    public GetCloudAccountResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta extends TeaModel {
        /**
         * <p>The Tencent Cloud CAM policy document in JSON format. This parameter is returned only for Tencent Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[]}</p>
         */
        @NameInMap("CamPolicyDocument")
        public String camPolicyDocument;

        /**
         * <p>The Tencent Cloud CAM policy type. Valid values: qcs and local. This parameter is returned only for Tencent Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>qcs</p>
         */
        @NameInMap("CamPolicyType")
        public String camPolicyType;

        /**
         * <p>The AWS IAM policy document in JSON format. This parameter is returned only for AWS cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;2012-10-17&quot;,&quot;Statement&quot;:[]}</p>
         */
        @NameInMap("IamPolicyDocument")
        public String iamPolicyDocument;

        /**
         * <p>The AWS IAM policy type. Valid values: aws and local. This parameter is returned only for AWS cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>aws</p>
         */
        @NameInMap("IamPolicyType")
        public String iamPolicyType;

        /**
         * <p>The RAM policy document in JSON format. This parameter is returned only by the Get operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[]}</p>
         */
        @NameInMap("RamPolicyDocument")
        public String ramPolicyDocument;

        /**
         * <p>The RAM policy type. Valid values: system and custom.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        @NameInMap("RamPolicyType")
        public String ramPolicyType;

        public static GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta self = new GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta();
            return TeaModel.build(map, self);
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta setCamPolicyDocument(String camPolicyDocument) {
            this.camPolicyDocument = camPolicyDocument;
            return this;
        }
        public String getCamPolicyDocument() {
            return this.camPolicyDocument;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta setCamPolicyType(String camPolicyType) {
            this.camPolicyType = camPolicyType;
            return this;
        }
        public String getCamPolicyType() {
            return this.camPolicyType;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta setIamPolicyDocument(String iamPolicyDocument) {
            this.iamPolicyDocument = iamPolicyDocument;
            return this;
        }
        public String getIamPolicyDocument() {
            return this.iamPolicyDocument;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta setIamPolicyType(String iamPolicyType) {
            this.iamPolicyType = iamPolicyType;
            return this;
        }
        public String getIamPolicyType() {
            return this.iamPolicyType;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta setRamPolicyDocument(String ramPolicyDocument) {
            this.ramPolicyDocument = ramPolicyDocument;
            return this;
        }
        public String getRamPolicyDocument() {
            return this.ramPolicyDocument;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta setRamPolicyType(String ramPolicyType) {
            this.ramPolicyType = ramPolicyType;
            return this;
        }
        public String getRamPolicyType() {
            return this.ramPolicyType;
        }

    }

    public static class GetCloudAccountResourceResponseBodyCloudAccountResource extends TeaModel {
        /**
         * <p>The cloud account ID.</p>
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
         * <p>System:AliyunIntelligentcockpitReadOnlyAccess</p>
         */
        @NameInMap("CloudAccountResourceEntityId")
        public String cloudAccountResourceEntityId;

        /**
         * <p>The resource entity type. Valid values: ram_policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ram_policy</p>
         */
        @NameInMap("CloudAccountResourceEntityType")
        public String cloudAccountResourceEntityType;

        /**
         * <p>The cloud account resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>car_xxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        @NameInMap("CloudAccountResourceId")
        public String cloudAccountResourceId;

        /**
         * <p>The resource metadata information.</p>
         */
        @NameInMap("CloudAccountResourceMeta")
        public GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta cloudAccountResourceMeta;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam-sso-role</p>
         */
        @NameInMap("CloudAccountResourceName")
        public String cloudAccountResourceName;

        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
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
         * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649916625000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static GetCloudAccountResourceResponseBodyCloudAccountResource build(java.util.Map<String, ?> map) throws Exception {
            GetCloudAccountResourceResponseBodyCloudAccountResource self = new GetCloudAccountResourceResponseBodyCloudAccountResource();
            return TeaModel.build(map, self);
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResource setCloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }
        public String getCloudAccountId() {
            return this.cloudAccountId;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResource setCloudAccountResourceEntityId(String cloudAccountResourceEntityId) {
            this.cloudAccountResourceEntityId = cloudAccountResourceEntityId;
            return this;
        }
        public String getCloudAccountResourceEntityId() {
            return this.cloudAccountResourceEntityId;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResource setCloudAccountResourceEntityType(String cloudAccountResourceEntityType) {
            this.cloudAccountResourceEntityType = cloudAccountResourceEntityType;
            return this;
        }
        public String getCloudAccountResourceEntityType() {
            return this.cloudAccountResourceEntityType;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResource setCloudAccountResourceId(String cloudAccountResourceId) {
            this.cloudAccountResourceId = cloudAccountResourceId;
            return this;
        }
        public String getCloudAccountResourceId() {
            return this.cloudAccountResourceId;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResource setCloudAccountResourceMeta(GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta cloudAccountResourceMeta) {
            this.cloudAccountResourceMeta = cloudAccountResourceMeta;
            return this;
        }
        public GetCloudAccountResourceResponseBodyCloudAccountResourceCloudAccountResourceMeta getCloudAccountResourceMeta() {
            return this.cloudAccountResourceMeta;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResource setCloudAccountResourceName(String cloudAccountResourceName) {
            this.cloudAccountResourceName = cloudAccountResourceName;
            return this;
        }
        public String getCloudAccountResourceName() {
            return this.cloudAccountResourceName;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResource setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResource setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCloudAccountResourceResponseBodyCloudAccountResource setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
