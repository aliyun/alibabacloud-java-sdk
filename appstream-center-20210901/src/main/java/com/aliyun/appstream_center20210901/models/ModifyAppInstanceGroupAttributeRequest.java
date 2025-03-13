// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the delivery group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The name of the delivery group.</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The network settings.</p>
     * <blockquote>
     * <p> If you want to use this parameter, submit a ticket.</p>
     * </blockquote>
     */
    @NameInMap("Network")
    public ModifyAppInstanceGroupAttributeRequestNetwork network;

    /**
     * <p>The information about the resource group.</p>
     */
    @NameInMap("NodePool")
    public ModifyAppInstanceGroupAttributeRequestNodePool nodePool;

    /**
     * <p>Specifies whether only one application can be opened in a session.</p>
     * <ul>
     * <li>After you enable this feature, the system assigns a session to each application if you open multiple applications in a delivery group. This consumes a larger number of sessions.</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PerSessionPerApp")
    public Boolean perSessionPerApp;

    /**
     * <p>The application ID of the pre-open application. If you set <code>PreOpenMode</code> to <code>SINGLE_APP</code>, you cannot leave this parameter empty.``</p>
     * 
     * <strong>example:</strong>
     * <p>ca-b2ronxxd****</p>
     */
    @NameInMap("PreOpenAppId")
    public String preOpenAppId;

    /**
     * <p>The pre-open mode.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>SINGLE_APP: enables the pre-open mode for a single application.</li>
     * <li>OFF: disables the pre-open mode. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("PreOpenMode")
    public String preOpenMode;

    /**
     * <p>The product type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The security policy.</p>
     */
    @NameInMap("SecurityPolicy")
    public ModifyAppInstanceGroupAttributeRequestSecurityPolicy securityPolicy;

    /**
     * <p>The duration for which sessions are retained after disconnection. Unit: minutes. After an end user disconnects from a session, the session is closed only after the specified duration elapses. If you want to permanently retain sessions, set this parameter to <code>-1</code>. Valid values:-1 and 3 to 300. Default value: <code>15</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    /**
     * <p>The storage policy.</p>
     */
    @NameInMap("StoragePolicy")
    public ModifyAppInstanceGroupAttributeRequestStoragePolicy storagePolicy;

    public static ModifyAppInstanceGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceGroupAttributeRequest self = new ModifyAppInstanceGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceGroupAttributeRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ModifyAppInstanceGroupAttributeRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ModifyAppInstanceGroupAttributeRequest setNetwork(ModifyAppInstanceGroupAttributeRequestNetwork network) {
        this.network = network;
        return this;
    }
    public ModifyAppInstanceGroupAttributeRequestNetwork getNetwork() {
        return this.network;
    }

    public ModifyAppInstanceGroupAttributeRequest setNodePool(ModifyAppInstanceGroupAttributeRequestNodePool nodePool) {
        this.nodePool = nodePool;
        return this;
    }
    public ModifyAppInstanceGroupAttributeRequestNodePool getNodePool() {
        return this.nodePool;
    }

    public ModifyAppInstanceGroupAttributeRequest setPerSessionPerApp(Boolean perSessionPerApp) {
        this.perSessionPerApp = perSessionPerApp;
        return this;
    }
    public Boolean getPerSessionPerApp() {
        return this.perSessionPerApp;
    }

    public ModifyAppInstanceGroupAttributeRequest setPreOpenAppId(String preOpenAppId) {
        this.preOpenAppId = preOpenAppId;
        return this;
    }
    public String getPreOpenAppId() {
        return this.preOpenAppId;
    }

    public ModifyAppInstanceGroupAttributeRequest setPreOpenMode(String preOpenMode) {
        this.preOpenMode = preOpenMode;
        return this;
    }
    public String getPreOpenMode() {
        return this.preOpenMode;
    }

    public ModifyAppInstanceGroupAttributeRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyAppInstanceGroupAttributeRequest setSecurityPolicy(ModifyAppInstanceGroupAttributeRequestSecurityPolicy securityPolicy) {
        this.securityPolicy = securityPolicy;
        return this;
    }
    public ModifyAppInstanceGroupAttributeRequestSecurityPolicy getSecurityPolicy() {
        return this.securityPolicy;
    }

    public ModifyAppInstanceGroupAttributeRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public ModifyAppInstanceGroupAttributeRequest setStoragePolicy(ModifyAppInstanceGroupAttributeRequestStoragePolicy storagePolicy) {
        this.storagePolicy = storagePolicy;
        return this;
    }
    public ModifyAppInstanceGroupAttributeRequestStoragePolicy getStoragePolicy() {
        return this.storagePolicy;
    }

    public static class ModifyAppInstanceGroupAttributeRequestNetworkDomainRules extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The policy used for the domain name.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>allow</li>
         * <li>block</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Policy")
        public String policy;

        public static ModifyAppInstanceGroupAttributeRequestNetworkDomainRules build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppInstanceGroupAttributeRequestNetworkDomainRules self = new ModifyAppInstanceGroupAttributeRequestNetworkDomainRules();
            return TeaModel.build(map, self);
        }

        public ModifyAppInstanceGroupAttributeRequestNetworkDomainRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ModifyAppInstanceGroupAttributeRequestNetworkDomainRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

    }

    public static class ModifyAppInstanceGroupAttributeRequestNetwork extends TeaModel {
        /**
         * <p>The domain name rules.</p>
         */
        @NameInMap("DomainRules")
        public java.util.List<ModifyAppInstanceGroupAttributeRequestNetworkDomainRules> domainRules;

        public static ModifyAppInstanceGroupAttributeRequestNetwork build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppInstanceGroupAttributeRequestNetwork self = new ModifyAppInstanceGroupAttributeRequestNetwork();
            return TeaModel.build(map, self);
        }

        public ModifyAppInstanceGroupAttributeRequestNetwork setDomainRules(java.util.List<ModifyAppInstanceGroupAttributeRequestNetworkDomainRules> domainRules) {
            this.domainRules = domainRules;
            return this;
        }
        public java.util.List<ModifyAppInstanceGroupAttributeRequestNetworkDomainRules> getDomainRules() {
            return this.domainRules;
        }

    }

    public static class ModifyAppInstanceGroupAttributeRequestNodePool extends TeaModel {
        /**
         * <p>The maximum number of sessions to which a resource can connect at the same time. If a resource connects to a large number of sessions at the same time, user experience can be compromised. The value range varies based on the resource type. The following items describe the value ranges of different resource types:</p>
         * <ul>
         * <li>appstreaming.general.4c8g: 1 to 2</li>
         * <li>appstreaming.general.8c16g: 1 to 4</li>
         * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
         * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
         * <li>appstreaming.vgpu.14c93g.12g: 1 to 6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ew7va2g1wl3vm****</p>
         */
        @NameInMap("NodePoolId")
        public String nodePoolId;

        public static ModifyAppInstanceGroupAttributeRequestNodePool build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppInstanceGroupAttributeRequestNodePool self = new ModifyAppInstanceGroupAttributeRequestNodePool();
            return TeaModel.build(map, self);
        }

        public ModifyAppInstanceGroupAttributeRequestNodePool setNodeCapacity(Integer nodeCapacity) {
            this.nodeCapacity = nodeCapacity;
            return this;
        }
        public Integer getNodeCapacity() {
            return this.nodeCapacity;
        }

        public ModifyAppInstanceGroupAttributeRequestNodePool setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }
        public String getNodePoolId() {
            return this.nodePoolId;
        }

    }

    public static class ModifyAppInstanceGroupAttributeRequestSecurityPolicy extends TeaModel {
        /**
         * <p>Specifies whether to reset after unbinding from a delivery group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResetAfterUnbind")
        public Boolean resetAfterUnbind;

        /**
         * <p>Specifies whether to skip user permission verification.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false: This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SkipUserAuthCheck")
        public Boolean skipUserAuthCheck;

        public static ModifyAppInstanceGroupAttributeRequestSecurityPolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppInstanceGroupAttributeRequestSecurityPolicy self = new ModifyAppInstanceGroupAttributeRequestSecurityPolicy();
            return TeaModel.build(map, self);
        }

        public ModifyAppInstanceGroupAttributeRequestSecurityPolicy setResetAfterUnbind(Boolean resetAfterUnbind) {
            this.resetAfterUnbind = resetAfterUnbind;
            return this;
        }
        public Boolean getResetAfterUnbind() {
            return this.resetAfterUnbind;
        }

        public ModifyAppInstanceGroupAttributeRequestSecurityPolicy setSkipUserAuthCheck(Boolean skipUserAuthCheck) {
            this.skipUserAuthCheck = skipUserAuthCheck;
            return this;
        }
        public Boolean getSkipUserAuthCheck() {
            return this.skipUserAuthCheck;
        }

    }

    public static class ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfile extends TeaModel {
        /**
         * <p>The ID of the File Storage NAS (NAS) file system used to store user data.</p>
         * 
         * <strong>example:</strong>
         * <p>06ae94****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>Specifies whether user data roaming is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UserProfileSwitch")
        public Boolean userProfileSwitch;

        public static ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfile build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfile self = new ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfile();
            return TeaModel.build(map, self);
        }

        public ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfile setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfile setUserProfileSwitch(Boolean userProfileSwitch) {
            this.userProfileSwitch = userProfileSwitch;
            return this;
        }
        public Boolean getUserProfileSwitch() {
            return this.userProfileSwitch;
        }

    }

    public static class ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow extends TeaModel {
        @NameInMap("FileSystemId")
        public String fileSystemId;

        @NameInMap("ProfileFollowSwitch")
        public Boolean profileFollowSwitch;

        public static ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow self = new ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow();
            return TeaModel.build(map, self);
        }

        public ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow setFileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow setProfileFollowSwitch(Boolean profileFollowSwitch) {
            this.profileFollowSwitch = profileFollowSwitch;
            return this;
        }
        public Boolean getProfileFollowSwitch() {
            return this.profileFollowSwitch;
        }

    }

    public static class ModifyAppInstanceGroupAttributeRequestStoragePolicy extends TeaModel {
        /**
         * <p>The storage types.</p>
         */
        @NameInMap("StorageTypeList")
        public java.util.List<String> storageTypeList;

        /**
         * <p>The configurations of user data roaming.</p>
         */
        @NameInMap("UserProfile")
        public ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfile userProfile;

        @NameInMap("UserProfileFollow")
        public ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow userProfileFollow;

        public static ModifyAppInstanceGroupAttributeRequestStoragePolicy build(java.util.Map<String, ?> map) throws Exception {
            ModifyAppInstanceGroupAttributeRequestStoragePolicy self = new ModifyAppInstanceGroupAttributeRequestStoragePolicy();
            return TeaModel.build(map, self);
        }

        public ModifyAppInstanceGroupAttributeRequestStoragePolicy setStorageTypeList(java.util.List<String> storageTypeList) {
            this.storageTypeList = storageTypeList;
            return this;
        }
        public java.util.List<String> getStorageTypeList() {
            return this.storageTypeList;
        }

        public ModifyAppInstanceGroupAttributeRequestStoragePolicy setUserProfile(ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfile userProfile) {
            this.userProfile = userProfile;
            return this;
        }
        public ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfile getUserProfile() {
            return this.userProfile;
        }

        public ModifyAppInstanceGroupAttributeRequestStoragePolicy setUserProfileFollow(ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow userProfileFollow) {
            this.userProfileFollow = userProfileFollow;
            return this;
        }
        public ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow getUserProfileFollow() {
            return this.userProfileFollow;
        }

    }

}
