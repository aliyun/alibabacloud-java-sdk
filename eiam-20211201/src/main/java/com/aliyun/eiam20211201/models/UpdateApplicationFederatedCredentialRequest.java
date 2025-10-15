// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationFederatedCredentialRequest extends TeaModel {
    /**
     * <p>应用联邦凭证Id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>afc_aaaaa1111</p>
     */
    @NameInMap("ApplicationFederatedCredentialId")
    public String applicationFederatedCredentialId;

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
    public java.util.List<UpdateApplicationFederatedCredentialRequestAttributeMappings> attributeMappings;

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
     * <p>IsNullOrEmpty(&quot;&quot;)</p>
     */
    @NameInMap("VerificationCondition")
    public String verificationCondition;

    public static UpdateApplicationFederatedCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationFederatedCredentialRequest self = new UpdateApplicationFederatedCredentialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationFederatedCredentialRequest setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
        this.applicationFederatedCredentialId = applicationFederatedCredentialId;
        return this;
    }
    public String getApplicationFederatedCredentialId() {
        return this.applicationFederatedCredentialId;
    }

    public UpdateApplicationFederatedCredentialRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationFederatedCredentialRequest setAttributeMappings(java.util.List<UpdateApplicationFederatedCredentialRequestAttributeMappings> attributeMappings) {
        this.attributeMappings = attributeMappings;
        return this;
    }
    public java.util.List<UpdateApplicationFederatedCredentialRequestAttributeMappings> getAttributeMappings() {
        return this.attributeMappings;
    }

    public UpdateApplicationFederatedCredentialRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateApplicationFederatedCredentialRequest setVerificationCondition(String verificationCondition) {
        this.verificationCondition = verificationCondition;
        return this;
    }
    public String getVerificationCondition() {
        return this.verificationCondition;
    }

    public static class UpdateApplicationFederatedCredentialRequestAttributeMappings extends TeaModel {
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

        public static UpdateApplicationFederatedCredentialRequestAttributeMappings build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationFederatedCredentialRequestAttributeMappings self = new UpdateApplicationFederatedCredentialRequestAttributeMappings();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationFederatedCredentialRequestAttributeMappings setSourceValueExpression(String sourceValueExpression) {
            this.sourceValueExpression = sourceValueExpression;
            return this;
        }
        public String getSourceValueExpression() {
            return this.sourceValueExpression;
        }

        public UpdateApplicationFederatedCredentialRequestAttributeMappings setTargetField(String targetField) {
            this.targetField = targetField;
            return this;
        }
        public String getTargetField() {
            return this.targetField;
        }

    }

}
