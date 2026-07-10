// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationFederatedCredentialRequest extends TeaModel {
    /**
     * <p>The name of the application federated identity credential.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example_name</p>
     */
    @NameInMap("ApplicationFederatedCredentialName")
    public String applicationFederatedCredentialName;

    /**
     * <p>The type of the application federated identity credential.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oidc</p>
     */
    @NameInMap("ApplicationFederatedCredentialType")
    public String applicationFederatedCredentialType;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The attribute mappings.</p>
     */
    @NameInMap("AttributeMappings")
    public java.util.List<CreateApplicationFederatedCredentialRequestAttributeMappings> attributeMappings;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>description_text</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The federated credential provider ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fcp_adasd</p>
     */
    @NameInMap("FederatedCredentialProviderId")
    public String federatedCredentialProviderId;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The OIDC structured configuration. This parameter applies when the verification mode is structured and the credential type is oidc.</p>
     */
    @NameInMap("OidcVerificationConfig")
    public CreateApplicationFederatedCredentialRequestOidcVerificationConfig oidcVerificationConfig;

    /**
     * <p>The PKCS#7 structured configuration. This parameter applies when the verification mode is structured and the credential type is pkcs7.</p>
     */
    @NameInMap("Pkcs7VerificationConfig")
    public CreateApplicationFederatedCredentialRequestPkcs7VerificationConfig pkcs7VerificationConfig;

    /**
     * <p>The verification condition.</p>
     * 
     * <strong>example:</strong>
     * <p>IsNullOrEmpty(&quot;jwt.issuer&quot;)</p>
     */
    @NameInMap("VerificationCondition")
    public String verificationCondition;

    /**
     * <p>The verification mode. Valid values:</p>
     * <ul>
     * <li>freedom (default)</li>
     * <li>structured</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>freedom</p>
     */
    @NameInMap("VerificationMode")
    public String verificationMode;

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

    public CreateApplicationFederatedCredentialRequest setOidcVerificationConfig(CreateApplicationFederatedCredentialRequestOidcVerificationConfig oidcVerificationConfig) {
        this.oidcVerificationConfig = oidcVerificationConfig;
        return this;
    }
    public CreateApplicationFederatedCredentialRequestOidcVerificationConfig getOidcVerificationConfig() {
        return this.oidcVerificationConfig;
    }

    public CreateApplicationFederatedCredentialRequest setPkcs7VerificationConfig(CreateApplicationFederatedCredentialRequestPkcs7VerificationConfig pkcs7VerificationConfig) {
        this.pkcs7VerificationConfig = pkcs7VerificationConfig;
        return this;
    }
    public CreateApplicationFederatedCredentialRequestPkcs7VerificationConfig getPkcs7VerificationConfig() {
        return this.pkcs7VerificationConfig;
    }

    public CreateApplicationFederatedCredentialRequest setVerificationCondition(String verificationCondition) {
        this.verificationCondition = verificationCondition;
        return this;
    }
    public String getVerificationCondition() {
        return this.verificationCondition;
    }

    public CreateApplicationFederatedCredentialRequest setVerificationMode(String verificationMode) {
        this.verificationMode = verificationMode;
        return this;
    }
    public String getVerificationMode() {
        return this.verificationMode;
    }

    public static class CreateApplicationFederatedCredentialRequestAttributeMappings extends TeaModel {
        /**
         * <p>The source value expression.</p>
         * 
         * <strong>example:</strong>
         * <p>Append(client.applicationFederatedCredentialId, &quot;:&quot;, cert.subject.CN, &quot;:&quot;, cert.serialNumber)</p>
         */
        @NameInMap("SourceValueExpression")
        public String sourceValueExpression;

        /**
         * <p>The target field.</p>
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

    public static class CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig extends TeaModel {
        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("SubscriptionId")
        public String subscriptionId;

        @NameInMap("VmNames")
        public java.util.List<String> vmNames;

        public static CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig self = new CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig setVmNames(java.util.List<String> vmNames) {
            this.vmNames = vmNames;
            return this;
        }
        public java.util.List<String> getVmNames() {
            return this.vmNames;
        }

    }

    public static class CreateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig extends TeaModel {
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The sub claim that corresponds to the service account.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("ServiceAccountId")
        public String serviceAccountId;

        public static CreateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig self = new CreateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig setServiceAccountId(String serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }
        public String getServiceAccountId() {
            return this.serviceAccountId;
        }

    }

    public static class CreateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig extends TeaModel {
        @NameInMap("Subject")
        public String subject;

        public static CreateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig self = new CreateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class CreateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig extends TeaModel {
        /**
         * <p>The Kubernetes namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The pod name prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>my-pod-</p>
         */
        @NameInMap("PodNamePrefix")
        public String podNamePrefix;

        /**
         * <p>The Kubernetes service account name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-sa</p>
         */
        @NameInMap("ServiceAccountName")
        public String serviceAccountName;

        public static CreateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig self = new CreateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig setPodNamePrefix(String podNamePrefix) {
            this.podNamePrefix = podNamePrefix;
            return this;
        }
        public String getPodNamePrefix() {
            return this.podNamePrefix;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig setServiceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }
        public String getServiceAccountName() {
            return this.serviceAccountName;
        }

    }

    public static class CreateApplicationFederatedCredentialRequestOidcVerificationConfig extends TeaModel {
        /**
         * <p>The Azure VM scenario configuration.</p>
         */
        @NameInMap("AzureVmConfig")
        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig azureVmConfig;

        /**
         * <p>The GCP VM scenario configuration.</p>
         */
        @NameInMap("GcpVmConfig")
        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig gcpVmConfig;

        @NameInMap("GenericConfig")
        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig genericConfig;

        /**
         * <p>The Kubernetes scenario configuration.</p>
         */
        @NameInMap("KubernetesConfig")
        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig kubernetesConfig;

        /**
         * <p>The OIDC scenario profile. Valid values:</p>
         * <ul>
         * <li>generic</li>
         * <li>kubernetes</li>
         * <li>gcp_vm</li>
         * <li>azure_vm</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>kubernetes</p>
         */
        @NameInMap("Profile")
        public String profile;

        public static CreateApplicationFederatedCredentialRequestOidcVerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationFederatedCredentialRequestOidcVerificationConfig self = new CreateApplicationFederatedCredentialRequestOidcVerificationConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfig setAzureVmConfig(CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig azureVmConfig) {
            this.azureVmConfig = azureVmConfig;
            return this;
        }
        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig getAzureVmConfig() {
            return this.azureVmConfig;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfig setGcpVmConfig(CreateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig gcpVmConfig) {
            this.gcpVmConfig = gcpVmConfig;
            return this;
        }
        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig getGcpVmConfig() {
            return this.gcpVmConfig;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfig setGenericConfig(CreateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig genericConfig) {
            this.genericConfig = genericConfig;
            return this;
        }
        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig getGenericConfig() {
            return this.genericConfig;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfig setKubernetesConfig(CreateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }
        public CreateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        public CreateApplicationFederatedCredentialRequestOidcVerificationConfig setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

    public static class CreateApplicationFederatedCredentialRequestPkcs7VerificationConfig extends TeaModel {
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        public static CreateApplicationFederatedCredentialRequestPkcs7VerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationFederatedCredentialRequestPkcs7VerificationConfig self = new CreateApplicationFederatedCredentialRequestPkcs7VerificationConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationFederatedCredentialRequestPkcs7VerificationConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

    }

}
