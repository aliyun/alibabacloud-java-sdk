// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class LoginInstanceRequest extends TeaModel {
    @NameInMap("InstanceLoginInfo")
    public LoginInstanceRequestInstanceLoginInfo instanceLoginInfo;

    @NameInMap("PartnerInfo")
    public LoginInstanceRequestPartnerInfo partnerInfo;

    @NameInMap("UserAccount")
    public LoginInstanceRequestUserAccount userAccount;

    public static LoginInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        LoginInstanceRequest self = new LoginInstanceRequest();
        return TeaModel.build(map, self);
    }

    public LoginInstanceRequest setInstanceLoginInfo(LoginInstanceRequestInstanceLoginInfo instanceLoginInfo) {
        this.instanceLoginInfo = instanceLoginInfo;
        return this;
    }
    public LoginInstanceRequestInstanceLoginInfo getInstanceLoginInfo() {
        return this.instanceLoginInfo;
    }

    public LoginInstanceRequest setPartnerInfo(LoginInstanceRequestPartnerInfo partnerInfo) {
        this.partnerInfo = partnerInfo;
        return this;
    }
    public LoginInstanceRequestPartnerInfo getPartnerInfo() {
        return this.partnerInfo;
    }

    public LoginInstanceRequest setUserAccount(LoginInstanceRequestUserAccount userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public LoginInstanceRequestUserAccount getUserAccount() {
        return this.userAccount;
    }

    public static class LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abcdef</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Deployment")
        public String deployment;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>{&quot;abc&quot;:&quot;def&quot;}</p>
         */
        @NameInMap("Headers")
        public java.util.Map<String, ?> headers;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("PodName")
        public String podName;

        public static LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo self = new LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo();
            return TeaModel.build(map, self);
        }

        public LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo setDeployment(String deployment) {
            this.deployment = deployment;
            return this;
        }
        public String getDeployment() {
            return this.deployment;
        }

        public LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo setHeaders(java.util.Map<String, ?> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, ?> getHeaders() {
            return this.headers;
        }

        public LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

    }

    public static class LoginInstanceRequestInstanceLoginInfoOptions extends TeaModel {
        @NameInMap("AudioMuteSeconds")
        public Integer audioMuteSeconds;

        @NameInMap("ContainerInfo")
        public LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo containerInfo;

        @NameInMap("FixedHeight")
        public Integer fixedHeight;

        @NameInMap("FixedWidth")
        public Integer fixedWidth;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("NotificationEventTypes")
        public String notificationEventTypes;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("NotificationRecipientUrl")
        public String notificationRecipientUrl;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("NotificationRetryIntervalSeconds")
        public Integer notificationRetryIntervalSeconds;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NotificationRetryLimit")
        public Integer notificationRetryLimit;

        @NameInMap("OperationDisableSeconds")
        public Integer operationDisableSeconds;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("SessionControl")
        public String sessionControl;

        @NameInMap("VideoFreezeSeconds")
        public Integer videoFreezeSeconds;

        public static LoginInstanceRequestInstanceLoginInfoOptions build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceRequestInstanceLoginInfoOptions self = new LoginInstanceRequestInstanceLoginInfoOptions();
            return TeaModel.build(map, self);
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setAudioMuteSeconds(Integer audioMuteSeconds) {
            this.audioMuteSeconds = audioMuteSeconds;
            return this;
        }
        public Integer getAudioMuteSeconds() {
            return this.audioMuteSeconds;
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setContainerInfo(LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo containerInfo) {
            this.containerInfo = containerInfo;
            return this;
        }
        public LoginInstanceRequestInstanceLoginInfoOptionsContainerInfo getContainerInfo() {
            return this.containerInfo;
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setFixedHeight(Integer fixedHeight) {
            this.fixedHeight = fixedHeight;
            return this;
        }
        public Integer getFixedHeight() {
            return this.fixedHeight;
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setFixedWidth(Integer fixedWidth) {
            this.fixedWidth = fixedWidth;
            return this;
        }
        public Integer getFixedWidth() {
            return this.fixedWidth;
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setNotificationEventTypes(String notificationEventTypes) {
            this.notificationEventTypes = notificationEventTypes;
            return this;
        }
        public String getNotificationEventTypes() {
            return this.notificationEventTypes;
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setNotificationRecipientUrl(String notificationRecipientUrl) {
            this.notificationRecipientUrl = notificationRecipientUrl;
            return this;
        }
        public String getNotificationRecipientUrl() {
            return this.notificationRecipientUrl;
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setNotificationRetryIntervalSeconds(Integer notificationRetryIntervalSeconds) {
            this.notificationRetryIntervalSeconds = notificationRetryIntervalSeconds;
            return this;
        }
        public Integer getNotificationRetryIntervalSeconds() {
            return this.notificationRetryIntervalSeconds;
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setNotificationRetryLimit(Integer notificationRetryLimit) {
            this.notificationRetryLimit = notificationRetryLimit;
            return this;
        }
        public Integer getNotificationRetryLimit() {
            return this.notificationRetryLimit;
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setOperationDisableSeconds(Integer operationDisableSeconds) {
            this.operationDisableSeconds = operationDisableSeconds;
            return this;
        }
        public Integer getOperationDisableSeconds() {
            return this.operationDisableSeconds;
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setSessionControl(String sessionControl) {
            this.sessionControl = sessionControl;
            return this;
        }
        public String getSessionControl() {
            return this.sessionControl;
        }

        public LoginInstanceRequestInstanceLoginInfoOptions setVideoFreezeSeconds(Integer videoFreezeSeconds) {
            this.videoFreezeSeconds = videoFreezeSeconds;
            return this;
        }
        public Integer getVideoFreezeSeconds() {
            return this.videoFreezeSeconds;
        }

    }

    public static class LoginInstanceRequestInstanceLoginInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>password/certificate</p>
         */
        @NameInMap("AuthenticationType")
        public String authenticationType;

        /**
         * <strong>example:</strong>
         * <p>----begin----
         * ----end----</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("CredentialToken")
        public String credentialToken;

        @NameInMap("DockerContainerName")
        public String dockerContainerName;

        @NameInMap("DockerExec")
        public String dockerExec;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("DurationSeconds")
        public Long durationSeconds;

        /**
         * <strong>example:</strong>
         * <p>2022-11-30 00:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <strong>example:</strong>
         * <p>i-123</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>ecs/eci/ack</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("LoginByInstanceCredential")
        public Boolean loginByInstanceCredential;

        @NameInMap("LoginByInstanceShortcut")
        public Boolean loginByInstanceShortcut;

        /**
         * <strong>example:</strong>
         * <p>vpc/classic</p>
         */
        @NameInMap("NetworkAccessMode")
        public String networkAccessMode;

        @NameInMap("Options")
        public LoginInstanceRequestInstanceLoginInfoOptions options;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("PassPhrase")
        public String passPhrase;

        /**
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        @NameInMap("Password")
        public String password;

        /**
         * <strong>example:</strong>
         * <p>22/3389</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>ssh/rdp/ack</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou/cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ShortcutToken")
        public String shortcutToken;

        /**
         * <strong>example:</strong>
         * <p>root/Administrator</p>
         */
        @NameInMap("Username")
        public String username;

        /**
         * <strong>example:</strong>
         * <p>vpc-abc</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static LoginInstanceRequestInstanceLoginInfo build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceRequestInstanceLoginInfo self = new LoginInstanceRequestInstanceLoginInfo();
            return TeaModel.build(map, self);
        }

        public LoginInstanceRequestInstanceLoginInfo setAuthenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }
        public String getAuthenticationType() {
            return this.authenticationType;
        }

        public LoginInstanceRequestInstanceLoginInfo setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public LoginInstanceRequestInstanceLoginInfo setCredentialToken(String credentialToken) {
            this.credentialToken = credentialToken;
            return this;
        }
        public String getCredentialToken() {
            return this.credentialToken;
        }

        public LoginInstanceRequestInstanceLoginInfo setDockerContainerName(String dockerContainerName) {
            this.dockerContainerName = dockerContainerName;
            return this;
        }
        public String getDockerContainerName() {
            return this.dockerContainerName;
        }

        public LoginInstanceRequestInstanceLoginInfo setDockerExec(String dockerExec) {
            this.dockerExec = dockerExec;
            return this;
        }
        public String getDockerExec() {
            return this.dockerExec;
        }

        public LoginInstanceRequestInstanceLoginInfo setDurationSeconds(Long durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        public Long getDurationSeconds() {
            return this.durationSeconds;
        }

        public LoginInstanceRequestInstanceLoginInfo setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public LoginInstanceRequestInstanceLoginInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public LoginInstanceRequestInstanceLoginInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public LoginInstanceRequestInstanceLoginInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public LoginInstanceRequestInstanceLoginInfo setLoginByInstanceCredential(Boolean loginByInstanceCredential) {
            this.loginByInstanceCredential = loginByInstanceCredential;
            return this;
        }
        public Boolean getLoginByInstanceCredential() {
            return this.loginByInstanceCredential;
        }

        public LoginInstanceRequestInstanceLoginInfo setLoginByInstanceShortcut(Boolean loginByInstanceShortcut) {
            this.loginByInstanceShortcut = loginByInstanceShortcut;
            return this;
        }
        public Boolean getLoginByInstanceShortcut() {
            return this.loginByInstanceShortcut;
        }

        public LoginInstanceRequestInstanceLoginInfo setNetworkAccessMode(String networkAccessMode) {
            this.networkAccessMode = networkAccessMode;
            return this;
        }
        public String getNetworkAccessMode() {
            return this.networkAccessMode;
        }

        public LoginInstanceRequestInstanceLoginInfo setOptions(LoginInstanceRequestInstanceLoginInfoOptions options) {
            this.options = options;
            return this;
        }
        public LoginInstanceRequestInstanceLoginInfoOptions getOptions() {
            return this.options;
        }

        public LoginInstanceRequestInstanceLoginInfo setPassPhrase(String passPhrase) {
            this.passPhrase = passPhrase;
            return this;
        }
        public String getPassPhrase() {
            return this.passPhrase;
        }

        public LoginInstanceRequestInstanceLoginInfo setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public LoginInstanceRequestInstanceLoginInfo setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public LoginInstanceRequestInstanceLoginInfo setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public LoginInstanceRequestInstanceLoginInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public LoginInstanceRequestInstanceLoginInfo setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public LoginInstanceRequestInstanceLoginInfo setShortcutToken(String shortcutToken) {
            this.shortcutToken = shortcutToken;
            return this;
        }
        public String getShortcutToken() {
            return this.shortcutToken;
        }

        public LoginInstanceRequestInstanceLoginInfo setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public LoginInstanceRequestInstanceLoginInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class LoginInstanceRequestPartnerInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("PartnerId")
        public String partnerId;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("PartnerName")
        public String partnerName;

        public static LoginInstanceRequestPartnerInfo build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceRequestPartnerInfo self = new LoginInstanceRequestPartnerInfo();
            return TeaModel.build(map, self);
        }

        public LoginInstanceRequestPartnerInfo setPartnerId(String partnerId) {
            this.partnerId = partnerId;
            return this;
        }
        public String getPartnerId() {
            return this.partnerId;
        }

        public LoginInstanceRequestPartnerInfo setPartnerName(String partnerName) {
            this.partnerName = partnerName;
            return this;
        }
        public String getPartnerName() {
            return this.partnerName;
        }

    }

    public static class LoginInstanceRequestUserAccountOptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LoginLimit")
        public Long loginLimit;

        public static LoginInstanceRequestUserAccountOptions build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceRequestUserAccountOptions self = new LoginInstanceRequestUserAccountOptions();
            return TeaModel.build(map, self);
        }

        public LoginInstanceRequestUserAccountOptions setLoginLimit(Long loginLimit) {
            this.loginLimit = loginLimit;
            return this;
        }
        public Long getLoginLimit() {
            return this.loginLimit;
        }

    }

    public static class LoginInstanceRequestUserAccount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <strong>example:</strong>
         * <p>aas</p>
         */
        @NameInMap("AccountPlatform")
        public String accountPlatform;

        /**
         * <strong>example:</strong>
         * <p>2/3/4</p>
         */
        @NameInMap("AccountStructure")
        public String accountStructure;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DurationSeconds")
        public Long durationSeconds;

        /**
         * <strong>example:</strong>
         * <p>123abc</p>
         */
        @NameInMap("EmpId")
        public String empId;

        /**
         * <strong>example:</strong>
         * <p>2022-11-30 00:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("Options")
        public LoginInstanceRequestUserAccountOptions options;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ParentId")
        public Long parentId;

        public static LoginInstanceRequestUserAccount build(java.util.Map<String, ?> map) throws Exception {
            LoginInstanceRequestUserAccount self = new LoginInstanceRequestUserAccount();
            return TeaModel.build(map, self);
        }

        public LoginInstanceRequestUserAccount setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public LoginInstanceRequestUserAccount setAccountPlatform(String accountPlatform) {
            this.accountPlatform = accountPlatform;
            return this;
        }
        public String getAccountPlatform() {
            return this.accountPlatform;
        }

        public LoginInstanceRequestUserAccount setAccountStructure(String accountStructure) {
            this.accountStructure = accountStructure;
            return this;
        }
        public String getAccountStructure() {
            return this.accountStructure;
        }

        public LoginInstanceRequestUserAccount setDurationSeconds(Long durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        public Long getDurationSeconds() {
            return this.durationSeconds;
        }

        public LoginInstanceRequestUserAccount setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public LoginInstanceRequestUserAccount setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public LoginInstanceRequestUserAccount setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public LoginInstanceRequestUserAccount setOptions(LoginInstanceRequestUserAccountOptions options) {
            this.options = options;
            return this;
        }
        public LoginInstanceRequestUserAccountOptions getOptions() {
            return this.options;
        }

        public LoginInstanceRequestUserAccount setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

}
