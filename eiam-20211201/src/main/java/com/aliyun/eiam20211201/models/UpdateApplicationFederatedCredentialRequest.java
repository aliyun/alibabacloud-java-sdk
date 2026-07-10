// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateApplicationFederatedCredentialRequest extends TeaModel {
    /**
     * <p>The application federated credential ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>afc_aaaaa1111</p>
     */
    @NameInMap("ApplicationFederatedCredentialId")
    public String applicationFederatedCredentialId;

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
    public java.util.List<UpdateApplicationFederatedCredentialRequestAttributeMappings> attributeMappings;

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
     * <p>The OIDC structured configuration (structured mode + oidc type).</p>
     */
    @NameInMap("OidcVerificationConfig")
    public UpdateApplicationFederatedCredentialRequestOidcVerificationConfig oidcVerificationConfig;

    /**
     * <p>The PKCS#7 structured configuration (structured mode + pkcs7 type).</p>
     */
    @NameInMap("Pkcs7VerificationConfig")
    public UpdateApplicationFederatedCredentialRequestPkcs7VerificationConfig pkcs7VerificationConfig;

    /**
     * <p>The verification condition.</p>
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

    public UpdateApplicationFederatedCredentialRequest setOidcVerificationConfig(UpdateApplicationFederatedCredentialRequestOidcVerificationConfig oidcVerificationConfig) {
        this.oidcVerificationConfig = oidcVerificationConfig;
        return this;
    }
    public UpdateApplicationFederatedCredentialRequestOidcVerificationConfig getOidcVerificationConfig() {
        return this.oidcVerificationConfig;
    }

    public UpdateApplicationFederatedCredentialRequest setPkcs7VerificationConfig(UpdateApplicationFederatedCredentialRequestPkcs7VerificationConfig pkcs7VerificationConfig) {
        this.pkcs7VerificationConfig = pkcs7VerificationConfig;
        return this;
    }
    public UpdateApplicationFederatedCredentialRequestPkcs7VerificationConfig getPkcs7VerificationConfig() {
        return this.pkcs7VerificationConfig;
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

    public static class UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig extends TeaModel {
        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("SubscriptionId")
        public String subscriptionId;

        @NameInMap("VmNames")
        public java.util.List<String> vmNames;

        public static UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig self = new UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig setVmNames(java.util.List<String> vmNames) {
            this.vmNames = vmNames;
            return this;
        }
        public java.util.List<String> getVmNames() {
            return this.vmNames;
        }

    }

    public static class UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig extends TeaModel {
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The sub value corresponding to the service account.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("ServiceAccountId")
        public String serviceAccountId;

        public static UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig self = new UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig setServiceAccountId(String serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }
        public String getServiceAccountId() {
            return this.serviceAccountId;
        }

    }

    public static class UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig extends TeaModel {
        @NameInMap("Subject")
        public String subject;

        public static UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig self = new UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class UpdateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig extends TeaModel {
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

        public static UpdateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig self = new UpdateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig setPodNamePrefix(String podNamePrefix) {
            this.podNamePrefix = podNamePrefix;
            return this;
        }
        public String getPodNamePrefix() {
            return this.podNamePrefix;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig setServiceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }
        public String getServiceAccountName() {
            return this.serviceAccountName;
        }

    }

    public static class UpdateApplicationFederatedCredentialRequestOidcVerificationConfig extends TeaModel {
        /**
         * <p>The Azure VM scenario configuration.</p>
         */
        @NameInMap("AzureVmConfig")
        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig azureVmConfig;

        /**
         * <p>The GCP VM scenario configuration.</p>
         */
        @NameInMap("GcpVmConfig")
        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig gcpVmConfig;

        @NameInMap("GenericConfig")
        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig genericConfig;

        /**
         * <p>The Kubernetes scenario configuration.</p>
         */
        @NameInMap("KubernetesConfig")
        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig kubernetesConfig;

        /**
         * <p>The OIDC scenario profile. Valid values: generic, kubernetes, gcp_vm, and azure_vm.</p>
         * 
         * <strong>example:</strong>
         * <p>kubernetes</p>
         */
        @NameInMap("Profile")
        public String profile;

        public static UpdateApplicationFederatedCredentialRequestOidcVerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationFederatedCredentialRequestOidcVerificationConfig self = new UpdateApplicationFederatedCredentialRequestOidcVerificationConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfig setAzureVmConfig(UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig azureVmConfig) {
            this.azureVmConfig = azureVmConfig;
            return this;
        }
        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigAzureVmConfig getAzureVmConfig() {
            return this.azureVmConfig;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfig setGcpVmConfig(UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig gcpVmConfig) {
            this.gcpVmConfig = gcpVmConfig;
            return this;
        }
        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGcpVmConfig getGcpVmConfig() {
            return this.gcpVmConfig;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfig setGenericConfig(UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig genericConfig) {
            this.genericConfig = genericConfig;
            return this;
        }
        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigGenericConfig getGenericConfig() {
            return this.genericConfig;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfig setKubernetesConfig(UpdateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }
        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfigKubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        public UpdateApplicationFederatedCredentialRequestOidcVerificationConfig setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

    public static class UpdateApplicationFederatedCredentialRequestPkcs7VerificationConfig extends TeaModel {
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        public static UpdateApplicationFederatedCredentialRequestPkcs7VerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationFederatedCredentialRequestPkcs7VerificationConfig self = new UpdateApplicationFederatedCredentialRequestPkcs7VerificationConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationFederatedCredentialRequestPkcs7VerificationConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

    }

}
