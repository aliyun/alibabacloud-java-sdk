// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationFederatedCredentialRequest extends TeaModel {
    /**
     * <p>应用联邦凭证名称</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example_name</p>
     */
    @NameInMap("ApplicationFederatedCredentialName")
    public String applicationFederatedCredentialName;

    /**
     * <p>应用联邦凭证类型</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oidc</p>
     */
    @NameInMap("ApplicationFederatedCredentialType")
    public String applicationFederatedCredentialType;

    /**
     * <p>IDaaS的应用资源ID。</p>
     * <p>This parameter is required.</p>
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
    public java.util.List<CreateApplicationFederatedCredentialRequestAttributeMappings> attributeMappings;

    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>联邦凭证提供方ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fcp_adasd</p>
     */
    @NameInMap("FederatedCredentialProviderId")
    public String federatedCredentialProviderId;

    /**
     * <p>IDaaS EIAM实例的ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>校验条件</p>
     * 
     * <strong>example:</strong>
     * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
     */
    @NameInMap("VerificationCondition")
    public String verificationCondition;

    public static CreateApplicationFederatedCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationFederatedCredentialRequest self = new CreateApplicationFederatedCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationFederatedCredentialRequest setApplicationFederatedCredentialName(String applicationFederatedCredentialName) {
        this.applicationFederatedCredentialName = applicationFederatedCredentialName;
        return this;
    }
    public String getApplicationFederatedCredentialName() {
        return this.applicationFederatedCredentialName;
    }

    public CreateApplicationFederatedCredentialRequest setApplicationFederatedCredentialType(String applicationFederatedCredentialType) {
        this.applicationFederatedCredentialType = applicationFederatedCredentialType;
        return this;
    }
    public String getApplicationFederatedCredentialType() {
        return this.applicationFederatedCredentialType;
    }

    public CreateApplicationFederatedCredentialRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationFederatedCredentialRequest setAttributeMappings(java.util.List<CreateApplicationFederatedCredentialRequestAttributeMappings> attributeMappings) {
        this.attributeMappings = attributeMappings;
        return this;
    }
    public java.util.List<CreateApplicationFederatedCredentialRequestAttributeMappings> getAttributeMappings() {
        return this.attributeMappings;
    }

    public CreateApplicationFederatedCredentialRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationFederatedCredentialRequest setFederatedCredentialProviderId(String federatedCredentialProviderId) {
        this.federatedCredentialProviderId = federatedCredentialProviderId;
        return this;
    }
    public String getFederatedCredentialProviderId() {
        return this.federatedCredentialProviderId;
    }

    public CreateApplicationFederatedCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateApplicationFederatedCredentialRequest setVerificationCondition(String verificationCondition) {
        this.verificationCondition = verificationCondition;
        return this;
    }
    public String getVerificationCondition() {
        return this.verificationCondition;
    }

    public static class CreateApplicationFederatedCredentialRequestAttributeMappings extends TeaModel {
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

        public static CreateApplicationFederatedCredentialRequestAttributeMappings build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationFederatedCredentialRequestAttributeMappings self = new CreateApplicationFederatedCredentialRequestAttributeMappings();
            return TeaModel.build(map, self);
        }

        public CreateApplicationFederatedCredentialRequestAttributeMappings setSourceValueExpression(String sourceValueExpression) {
            this.sourceValueExpression = sourceValueExpression;
            return this;
        }
        public String getSourceValueExpression() {
            return this.sourceValueExpression;
        }

        public CreateApplicationFederatedCredentialRequestAttributeMappings setTargetField(String targetField) {
            this.targetField = targetField;
            return this;
        }
        public String getTargetField() {
            return this.targetField;
        }

    }

}
