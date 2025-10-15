// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationFederatedCredentialResponseBody extends TeaModel {
    @NameInMap("ApplicationFederatedCredential")
    public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential applicationFederatedCredential;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationFederatedCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationFederatedCredentialResponseBody self = new GetApplicationFederatedCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationFederatedCredentialResponseBody setApplicationFederatedCredential(GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential applicationFederatedCredential) {
        this.applicationFederatedCredential = applicationFederatedCredential;
        return this;
    }
    public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential getApplicationFederatedCredential() {
        return this.applicationFederatedCredential;
    }

    public GetApplicationFederatedCredentialResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialAttributeMappings extends TeaModel {
        /**
         * <p>源值表达式</p>
         * 
         * <strong>example:</strong>
         * <p>Append(client.applicationFederatedCredentialId, &quot;:&quot;, cert.subject.CN, &quot;:&quot;, cert.serialNumber)</p>
         */
        @NameInMap("SourceValueExpression")
        public String sourceValueExpression;

        /**
         * <p>目标字段</p>
         * 
         * <strong>example:</strong>
         * <p>client.activeSubjectUrn</p>
         */
        @NameInMap("TargetField")
        public String targetField;

        public static GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialAttributeMappings build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialAttributeMappings self = new GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialAttributeMappings();
            return TeaModel.build(map, self);
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialAttributeMappings setSourceValueExpression(String sourceValueExpression) {
            this.sourceValueExpression = sourceValueExpression;
            return this;
        }
        public String getSourceValueExpression() {
            return this.sourceValueExpression;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialAttributeMappings setTargetField(String targetField) {
            this.targetField = targetField;
            return this;
        }
        public String getTargetField() {
            return this.targetField;
        }

    }

    public static class GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential extends TeaModel {
        /**
         * <p>应用联邦凭证ID</p>
         * 
         * <strong>example:</strong>
         * <p>afc_aaaaa1111</p>
         */
        @NameInMap("ApplicationFederatedCredentialId")
        public String applicationFederatedCredentialId;

        /**
         * <p>应用联邦凭证名称</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApplicationFederatedCredentialName")
        public String applicationFederatedCredentialName;

        /**
         * <p>应用联邦凭证类型</p>
         * 
         * <strong>example:</strong>
         * <p>oidc</p>
         */
        @NameInMap("ApplicationFederatedCredentialType")
        public String applicationFederatedCredentialType;

        /**
         * <p>应用ID</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>属性映射</p>
         */
        @NameInMap("AttributeMappings")
        public java.util.List<GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialAttributeMappings> attributeMappings;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>应用联邦凭证描述</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>应用联邦凭证提供者ID</p>
         * 
         * <strong>example:</strong>
         * <p>fcp_asda1dasdxxxx</p>
         */
        @NameInMap("FederatedCredentialProviderId")
        public String federatedCredentialProviderId;

        /**
         * <p>EAIM 实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>最近使用时间</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>应用联邦凭证状态</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>验证条件</p>
         * 
         * <strong>example:</strong>
         * <p>Equals(cert.subject.CN, &quot;test&quot;)</p>
         */
        @NameInMap("VerificationCondition")
        public String verificationCondition;

        public static GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential self = new GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential();
            return TeaModel.build(map, self);
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
            this.applicationFederatedCredentialId = applicationFederatedCredentialId;
            return this;
        }
        public String getApplicationFederatedCredentialId() {
            return this.applicationFederatedCredentialId;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setApplicationFederatedCredentialName(String applicationFederatedCredentialName) {
            this.applicationFederatedCredentialName = applicationFederatedCredentialName;
            return this;
        }
        public String getApplicationFederatedCredentialName() {
            return this.applicationFederatedCredentialName;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setApplicationFederatedCredentialType(String applicationFederatedCredentialType) {
            this.applicationFederatedCredentialType = applicationFederatedCredentialType;
            return this;
        }
        public String getApplicationFederatedCredentialType() {
            return this.applicationFederatedCredentialType;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setAttributeMappings(java.util.List<GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialAttributeMappings> attributeMappings) {
            this.attributeMappings = attributeMappings;
            return this;
        }
        public java.util.List<GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialAttributeMappings> getAttributeMappings() {
            return this.attributeMappings;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setFederatedCredentialProviderId(String federatedCredentialProviderId) {
            this.federatedCredentialProviderId = federatedCredentialProviderId;
            return this;
        }
        public String getFederatedCredentialProviderId() {
            return this.federatedCredentialProviderId;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setVerificationCondition(String verificationCondition) {
            this.verificationCondition = verificationCondition;
            return this;
        }
        public String getVerificationCondition() {
            return this.verificationCondition;
        }

    }

}
