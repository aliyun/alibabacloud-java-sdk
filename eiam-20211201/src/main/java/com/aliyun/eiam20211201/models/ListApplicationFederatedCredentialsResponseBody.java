// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationFederatedCredentialsResponseBody extends TeaModel {
    /**
     * <p>The list of application federated credentials.</p>
     */
    @NameInMap("ApplicationFederatedCredentials")
    public java.util.List<ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials> applicationFederatedCredentials;

    /**
     * <p>The number of entries per page in a paged query. This parameter is used for paging.</p>
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
    public Long totalCount;

    public static ListApplicationFederatedCredentialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationFederatedCredentialsResponseBody self = new ListApplicationFederatedCredentialsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationFederatedCredentialsResponseBody setApplicationFederatedCredentials(java.util.List<ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials> applicationFederatedCredentials) {
        this.applicationFederatedCredentials = applicationFederatedCredentials;
        return this;
    }
    public java.util.List<ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials> getApplicationFederatedCredentials() {
        return this.applicationFederatedCredentials;
    }

    public ListApplicationFederatedCredentialsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationFederatedCredentialsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationFederatedCredentialsResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListApplicationFederatedCredentialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationFederatedCredentialsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig extends TeaModel {
        @NameInMap("PrincipalId")
        public String principalId;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("SubscriptionId")
        public String subscriptionId;

        @NameInMap("VmNames")
        public java.util.List<String> vmNames;

        public static ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig self = new ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig setSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public String getSubscriptionId() {
            return this.subscriptionId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig setVmNames(java.util.List<String> vmNames) {
            this.vmNames = vmNames;
            return this;
        }
        public java.util.List<String> getVmNames() {
            return this.vmNames;
        }

    }

    public static class ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig extends TeaModel {
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

        public static ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig self = new ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig setServiceAccountId(String serviceAccountId) {
            this.serviceAccountId = serviceAccountId;
            return this;
        }
        public String getServiceAccountId() {
            return this.serviceAccountId;
        }

    }

    public static class ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig extends TeaModel {
        @NameInMap("Subject")
        public String subject;

        public static ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig self = new ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig extends TeaModel {
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

        public static ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig self = new ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig setPodNamePrefix(String podNamePrefix) {
            this.podNamePrefix = podNamePrefix;
            return this;
        }
        public String getPodNamePrefix() {
            return this.podNamePrefix;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig setServiceAccountName(String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }
        public String getServiceAccountName() {
            return this.serviceAccountName;
        }

    }

    public static class ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig extends TeaModel {
        /**
         * <p>The Azure VM scenario configuration.</p>
         */
        @NameInMap("AzureVmConfig")
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig azureVmConfig;

        /**
         * <p>The GCP VM scenario configuration.</p>
         */
        @NameInMap("GcpVmConfig")
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig gcpVmConfig;

        @NameInMap("GenericConfig")
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig genericConfig;

        /**
         * <p>The Kubernetes scenario configuration.</p>
         */
        @NameInMap("KubernetesConfig")
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig kubernetesConfig;

        /**
         * <p>The OIDC scenario profile. Valid values: generic, kubernetes, gcp_vm, and azure_vm.</p>
         */
        @NameInMap("Profile")
        public String profile;

        public static ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig self = new ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig setAzureVmConfig(ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig azureVmConfig) {
            this.azureVmConfig = azureVmConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigAzureVmConfig getAzureVmConfig() {
            return this.azureVmConfig;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig setGcpVmConfig(ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig gcpVmConfig) {
            this.gcpVmConfig = gcpVmConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGcpVmConfig getGcpVmConfig() {
            return this.gcpVmConfig;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig setGenericConfig(ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig genericConfig) {
            this.genericConfig = genericConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigGenericConfig getGenericConfig() {
            return this.genericConfig;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig setKubernetesConfig(ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig kubernetesConfig) {
            this.kubernetesConfig = kubernetesConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfigKubernetesConfig getKubernetesConfig() {
            return this.kubernetesConfig;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

    public static class ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig extends TeaModel {
        /**
         * <p>The list of allowed instance IDs. A maximum of 10 IDs are supported.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        public static ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig self = new ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

    }

    public static class ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials extends TeaModel {
        /**
         * <p>The application federated credential ID.</p>
         * 
         * <strong>example:</strong>
         * <p>afc_adsa1sdaxxxxx</p>
         */
        @NameInMap("ApplicationFederatedCredentialId")
        public String applicationFederatedCredentialId;

        /**
         * <p>The name of the application federated credential.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApplicationFederatedCredentialName")
        public String applicationFederatedCredentialName;

        /**
         * <p>The type of the application federated credential.</p>
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
         * <p>app_xxxasda1</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The time when the application federated credential was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The description of the application federated credential.</p>
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
         * <p>fcp_das1asda1xxxx</p>
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
         * <p>The time when the application federated credential was last used.</p>
         * 
         * <strong>example:</strong>
         * <p>1758785994982</p>
         */
        @NameInMap("LastUsedTime")
        public Long lastUsedTime;

        /**
         * <p>The OIDC structured configuration. This parameter applies to the structured mode with the OIDC type.</p>
         */
        @NameInMap("OidcVerificationConfig")
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig oidcVerificationConfig;

        /**
         * <p>The PKCS#7 structured configuration. This parameter applies to the structured mode with the PKCS#7 type.</p>
         */
        @NameInMap("Pkcs7VerificationConfig")
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig pkcs7VerificationConfig;

        /**
         * <p>The status of the application federated credential.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the application federated credential was last updated.</p>
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

        public static ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials self = new ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials();
            return TeaModel.build(map, self);
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialId(String applicationFederatedCredentialId) {
            this.applicationFederatedCredentialId = applicationFederatedCredentialId;
            return this;
        }
        public String getApplicationFederatedCredentialId() {
            return this.applicationFederatedCredentialId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialName(String applicationFederatedCredentialName) {
            this.applicationFederatedCredentialName = applicationFederatedCredentialName;
            return this;
        }
        public String getApplicationFederatedCredentialName() {
            return this.applicationFederatedCredentialName;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setApplicationFederatedCredentialType(String applicationFederatedCredentialType) {
            this.applicationFederatedCredentialType = applicationFederatedCredentialType;
            return this;
        }
        public String getApplicationFederatedCredentialType() {
            return this.applicationFederatedCredentialType;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setFederatedCredentialProviderId(String federatedCredentialProviderId) {
            this.federatedCredentialProviderId = federatedCredentialProviderId;
            return this;
        }
        public String getFederatedCredentialProviderId() {
            return this.federatedCredentialProviderId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setLastUsedTime(Long lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setOidcVerificationConfig(ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig oidcVerificationConfig) {
            this.oidcVerificationConfig = oidcVerificationConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsOidcVerificationConfig getOidcVerificationConfig() {
            return this.oidcVerificationConfig;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setPkcs7VerificationConfig(ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig pkcs7VerificationConfig) {
            this.pkcs7VerificationConfig = pkcs7VerificationConfig;
            return this;
        }
        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentialsPkcs7VerificationConfig getPkcs7VerificationConfig() {
            return this.pkcs7VerificationConfig;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setVerificationCondition(String verificationCondition) {
            this.verificationCondition = verificationCondition;
            return this;
        }
        public String getVerificationCondition() {
            return this.verificationCondition;
        }

        public ListApplicationFederatedCredentialsResponseBodyApplicationFederatedCredentials setVerificationMode(String verificationMode) {
            this.verificationMode = verificationMode;
            return this;
        }
        public String getVerificationMode() {
            return this.verificationMode;
        }

    }

}
