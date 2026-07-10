// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationFederatedCredentialsForProviderResponseBody extends TeaModel {
    /**
     * <p>The list of application federated credentials.</p>
     */
    @NameInMap("ApplicationFederatedCredentials")
    public java.util.List<ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials> applicationFederatedCredentials;

    /**
     * <p>The maximum number of entries returned per page in a paged query. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token returned by this call.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The pagination token returned by this call.</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <p>The request ID.</p>
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
    public Integer totalCount;

    public static ListApplicationFederatedCredentialsForProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationFederatedCredentialsForProviderResponseBody self = new ListApplicationFederatedCredentialsForProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setApplicationFederatedCredentials(java.util.List<ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials> applicationFederatedCredentials) {
        this.applicationFederatedCredentials = applicationFederatedCredentials;
        return this;
    }
    public java.util.List<ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials> getApplicationFederatedCredentials() {
        return this.applicationFederatedCredentials;
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationFederatedCredentialsForProviderResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig extends TeaModel {
        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("SubscriptionId")
        public String subscriptionId;

        @NameInMap("VmNames")
        public java.util.List<String> vmNames;

        public static ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig self = new ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig setVmNames(java.util.List<String> vmNames) {
            this.vmNames = vmNames;
            return this;
        }
        public java.util.List<String> getVmNames() {
            return this.vmNames;
        }

    }

    public static class ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig extends TeaModel {
        /**
         * <p>The list of VM instance IDs. A maximum of 10 IDs are supported.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The sub claim that corresponds to the service account.</p>
         */
        @NameInMap("ServiceAccountId")
        public String serviceAccountId;

        public static ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig self = new ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig setServiceAccountId(String serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }
        public String getServiceAccountId() {
            return this.serviceAccountId;
        }

    }

    public static class ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig extends TeaModel {
        @NameInMap("Subject")
        public String subject;

        public static ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig self = new ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig extends TeaModel {
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

        public static ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig self = new ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig setPodNamePrefix(String podNamePrefix) {
            this.podNamePrefix = podNamePrefix;
            return this;
        }
        public String getPodNamePrefix() {
            return this.podNamePrefix;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig setServiceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }
        public String getServiceAccountName() {
            return this.serviceAccountName;
        }

    }

    public static class ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig extends TeaModel {
        /**
         * <p>The Azure VM scenario configuration.</p>
         */
        @NameInMap("AzureVmConfig")
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig azureVmConfig;

        /**
         * <p>The GCP VM scenario configuration.</p>
         */
        @NameInMap("GcpVmConfig")
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig gcpVmConfig;

        @NameInMap("GenericConfig")
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig genericConfig;

        /**
         * <p>The Kubernetes scenario configuration.</p>
         */
        @NameInMap("KubernetesConfig")
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig kubernetesConfig;

        /**
         * <p>The OIDC scenario profile. Valid values: generic, kubernetes, gcp_vm, and azure_vm.</p>
         */
        @NameInMap("Profile")
        public String profile;

        public static ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig self = new ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig setAzureVmConfig(ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig azureVmConfig) {
            this.azureVmConfig = azureVmConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig getAzureVmConfig() {
            return this.azureVmConfig;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig setGcpVmConfig(ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig gcpVmConfig) {
            this.gcpVmConfig = gcpVmConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig getGcpVmConfig() {
            return this.gcpVmConfig;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig setGenericConfig(ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig genericConfig) {
            this.genericConfig = genericConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig getGenericConfig() {
            return this.genericConfig;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig setKubernetesConfig(ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

    public static class ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig extends TeaModel {
        /**
         * <p>The list of allowed instance IDs. A maximum of 10 IDs are supported.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        public static ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig self = new ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

    }

    public static class ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials extends TeaModel {
        /**
         * <p>The application federated credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afc_dads12sadxxxxx</p>
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
         * <p>app_asda1dsadxxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

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
         * <p>fcp_adasd12dxxxxx</p>
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
         * <p>The OIDC structured configuration. This applies to structured mode with the OIDC type.</p>
         */
        @NameInMap("OidcVerificationConfig")
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig oidcVerificationConfig;

        /**
         * <p>The PKCS#7 structured configuration. This applies to structured mode with the PKCS#7 type.</p>
         */
        @NameInMap("Pkcs7VerificationConfig")
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig pkcs7VerificationConfig;

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
         * <p>The verification condition. In freedom mode, this is a manually entered value. In structured mode, this is the final compiled value.</p>
         */
        @NameInMap("VerificationCondition")
        public String verificationCondition;

        /**
         * <p>The verification mode. Valid values: freedom and structured.</p>
         */
        @NameInMap("VerificationMode")
        public String verificationMode;

        public static ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials self = new ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
            this.applicationFederatedCredentialId = applicationFederatedCredentialId;
            return this;
        }
        public String getApplicationFederatedCredentialId() {
            return this.applicationFederatedCredentialId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialName(String applicationFederatedCredentialName) {
            this.applicationFederatedCredentialName = applicationFederatedCredentialName;
            return this;
        }
        public String getApplicationFederatedCredentialName() {
            return this.applicationFederatedCredentialName;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialType(String applicationFederatedCredentialType) {
            this.applicationFederatedCredentialType = applicationFederatedCredentialType;
            return this;
        }
        public String getApplicationFederatedCredentialType() {
            return this.applicationFederatedCredentialType;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setFederatedCredentialProviderId(String federatedCredentialProviderId) {
            this.federatedCredentialProviderId = federatedCredentialProviderId;
            return this;
        }
        public String getFederatedCredentialProviderId() {
            return this.federatedCredentialProviderId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setOidcVerificationConfig(ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig oidcVerificationConfig) {
            this.oidcVerificationConfig = oidcVerificationConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsOidcVerificationConfig getOidcVerificationConfig() {
            return this.oidcVerificationConfig;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setPkcs7VerificationConfig(ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig pkcs7VerificationConfig) {
            this.pkcs7VerificationConfig = pkcs7VerificationConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig getPkcs7VerificationConfig() {
            return this.pkcs7VerificationConfig;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setVerificationCondition(String verificationCondition) {
            this.verificationCondition = verificationCondition;
            return this;
        }
        public String getVerificationCondition() {
            return this.verificationCondition;
        }

        public ListApplicationFederatedCredentialsForProviderResponseBodyApplicationFederatedCredentials setVerificationMode(String verificationMode) {
            this.verificationMode = verificationMode;
            return this;
        }
        public String getVerificationMode() {
            return this.verificationMode;
        }

    }

}
