// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationFederatedCredentialResponseBody extends TeaModel {
    /**
     * <p>The application federated credential object.</p>
     */
    @NameInMap("ApplicationFederatedCredential")
    public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential applicationFederatedCredential;

    /**
     * <p>The request ID.</p>
     * 
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

    public static class GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig extends TeaModel {
        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("SubscriptionId")
        public String subscriptionId;

        @NameInMap("VmNames")
        public java.util.List<String> vmNames;

        public static GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig self = new GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig setVmNames(java.util.List<String> vmNames) {
            this.vmNames = vmNames;
            return this;
        }
        public java.util.List<String> getVmNames() {
            return this.vmNames;
        }

    }

    public static class GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGcpVmConfig extends TeaModel {
        /**
         * <p>The list of VM instance IDs. A maximum of 10 instance IDs are supported.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The service account ID that corresponds to the sub claim.</p>
         */
        @NameInMap("ServiceAccountId")
        public String serviceAccountId;

        public static GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGcpVmConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGcpVmConfig self = new GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGcpVmConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGcpVmConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGcpVmConfig setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGcpVmConfig setServiceAccountId(String serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }
        public String getServiceAccountId() {
            return this.serviceAccountId;
        }

    }

    public static class GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGenericConfig extends TeaModel {
        @NameInMap("Subject")
        public String subject;

        public static GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGenericConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGenericConfig self = new GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGenericConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGenericConfig setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigKubernetesConfig extends TeaModel {
        /**
         * <p>The Kubernetes namespace.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The pod name prefix.</p>
         */
        @NameInMap("PodNamePrefix")
        public String podNamePrefix;

        /**
         * <p>The Kubernetes service account name.</p>
         */
        @NameInMap("ServiceAccountName")
        public String serviceAccountName;

        public static GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigKubernetesConfig self = new GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigKubernetesConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigKubernetesConfig setPodNamePrefix(String podNamePrefix) {
            this.podNamePrefix = podNamePrefix;
            return this;
        }
        public String getPodNamePrefix() {
            return this.podNamePrefix;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigKubernetesConfig setServiceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }
        public String getServiceAccountName() {
            return this.serviceAccountName;
        }

    }

    public static class GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig extends TeaModel {
        /**
         * <p>The Azure VM scenario configuration.</p>
         */
        @NameInMap("AzureVmConfig")
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig azureVmConfig;

        /**
         * <p>The GCP VM scenario configuration.</p>
         */
        @NameInMap("GcpVmConfig")
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGcpVmConfig gcpVmConfig;

        @NameInMap("GenericConfig")
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGenericConfig genericConfig;

        /**
         * <p>The Kubernetes scenario configuration.</p>
         */
        @NameInMap("KubernetesConfig")
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigKubernetesConfig kubernetesConfig;

        /**
         * <p>The OIDC scenario profile. Valid values: generic, kubernetes, gcp_vm, and azure_vm.</p>
         */
        @NameInMap("Profile")
        public String profile;

        public static GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig self = new GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig setAzureVmConfig(GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig azureVmConfig) {
            this.azureVmConfig = azureVmConfig;
            return this;
        }
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigAzureVmConfig getAzureVmConfig() {
            return this.azureVmConfig;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig setGcpVmConfig(GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGcpVmConfig gcpVmConfig) {
            this.gcpVmConfig = gcpVmConfig;
            return this;
        }
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGcpVmConfig getGcpVmConfig() {
            return this.gcpVmConfig;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig setGenericConfig(GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGenericConfig genericConfig) {
            this.genericConfig = genericConfig;
            return this;
        }
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigGenericConfig getGenericConfig() {
            return this.genericConfig;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig setKubernetesConfig(GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigKubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfigKubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

    public static class GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialPkcs7VerificationConfig extends TeaModel {
        /**
         * <p>The list of allowed instance IDs. A maximum of 10 instance IDs are supported.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        public static GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialPkcs7VerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialPkcs7VerificationConfig self = new GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialPkcs7VerificationConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialPkcs7VerificationConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

    }

    public static class GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential extends TeaModel {
        /**
         * <p>The application federated credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afc_aaaaa1111</p>
         */
        @NameInMap("ApplicationFederatedCredentialId")
        public String applicationFederatedCredentialId;

        /**
         * <p>The application federated credential name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApplicationFederatedCredentialName")
        public String applicationFederatedCredentialName;

        /**
         * <p>The application federated credential type.</p>
         * 
         * <strong>example:</strong>
         * <p>oidc</p>
         */
        @NameInMap("ApplicationFederatedCredentialType")
        public String applicationFederatedCredentialType;

        /**
         * <p>The application ID.</p>
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
        public java.util.List<GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialAttributeMappings> attributeMappings;

        /**
         * <p>The time when the credential was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The application federated credential description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The federated trust source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fcp_asda1dasdxxxx</p>
         */
        @NameInMap("FederatedCredentialProviderId")
        public String federatedCredentialProviderId;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the credential was last used.</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>The OIDC structured configuration. This parameter applies when the verification mode is structured and the credential type is oidc.</p>
         */
        @NameInMap("OidcVerificationConfig")
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig oidcVerificationConfig;

        /**
         * <p>The PKCS#7 structured configuration. This parameter applies when the verification mode is structured and the credential type is pkcs7.</p>
         */
        @NameInMap("Pkcs7VerificationConfig")
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialPkcs7VerificationConfig pkcs7VerificationConfig;

        /**
         * <p>The application federated credential status.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the credential was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The verification condition.</p>
         * 
         * <strong>example:</strong>
         * <p>Equals(cert.subject.CN, &quot;test&quot;)</p>
         */
        @NameInMap("VerificationCondition")
        public String verificationCondition;

        /**
         * <p>The verification mode. Valid values: freedom and structured.</p>
         */
        @NameInMap("VerificationMode")
        public String verificationMode;

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

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setOidcVerificationConfig(GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig oidcVerificationConfig) {
            this.oidcVerificationConfig = oidcVerificationConfig;
            return this;
        }
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialOidcVerificationConfig getOidcVerificationConfig() {
            return this.oidcVerificationConfig;
        }

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setPkcs7VerificationConfig(GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialPkcs7VerificationConfig pkcs7VerificationConfig) {
            this.pkcs7VerificationConfig = pkcs7VerificationConfig;
            return this;
        }
        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredentialPkcs7VerificationConfig getPkcs7VerificationConfig() {
            return this.pkcs7VerificationConfig;
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

        public GetApplicationFederatedCredentialResponseBodyApplicationFederatedCredential setVerificationMode(String verificationMode) {
            this.verificationMode = verificationMode;
            return this;
        }
        public String getVerificationMode() {
            return this.verificationMode;
        }

    }

}
