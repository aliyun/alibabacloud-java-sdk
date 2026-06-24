// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupAttributeRequest extends TeaModel {
    /**
     * <p>The delivery group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The delivery group name.</p>
     * 
     * <strong>example:</strong>
     * <p>办公应用</p>
     */
    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    /**
     * <p>The network configuration.</p>
     * <blockquote>
     * <p>To use this parameter, submit a ticket.</p>
     * </blockquote>
     */
    @NameInMap("Network")
    public ModifyAppInstanceGroupAttributeRequestNetwork network;

    /**
     * <p>The resource group object.</p>
     */
    @NameInMap("NodePool")
    public ModifyAppInstanceGroupAttributeRequestNodePool nodePool;

    /**
     * <p>Specifies whether to allow only one application per session.</p>
     * <ul>
     * <li>If enabled, opening multiple applications within a delivery group allocates a separate session for each application, consuming more sessions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PerSessionPerApp")
    public Boolean perSessionPerApp;

    /**
     * <p>The AppId of the pre-open application. If the PreOpenMode parameter is set to <code>SINGLE_APP</code>, PreOpenAppId cannot be an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-b2ronxxd****</p>
     */
    @NameInMap("PreOpenAppId")
    public String preOpenAppId;

    /**
     * <p>The pre-open mode.</p>
     * 
     * <strong>example:</strong>
     * <p>OFF</p>
     */
    @NameInMap("PreOpenMode")
    public String preOpenMode;

    /**
     * <p>The product type.</p>
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
     * <p>The session retention duration after disconnection, in minutes. After an end user session is disconnected, the session is retained for the specified duration before being logged off. Set this parameter to <code>-1</code> to retain the session indefinitely. Valid values: -1 and 3 to 300. Default value: <code>15</code>.</p>
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
         * <p>The policy value.</p>
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
         * <p>The domain name rule configurations.</p>
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
         * <p>The number of concurrent sessions, which is the number of sessions that can be simultaneously connected to a single resource. Too many simultaneous sessions may degrade the application experience. The valid value range varies by resource specification. You can call the ListNodeInstanceType operation to query the valid value range for each resource specification.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

        /**
         * <p>The resource group ID.</p>
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
         * <p>Specifies whether to reset after unbinding.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResetAfterUnbind")
        public Boolean resetAfterUnbind;

        /**
         * <p>Specifies whether to skip user authorization verification.</p>
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
         * <p>The ID of the user data storage system (NAS ID).</p>
         * 
         * <strong>example:</strong>
         * <p>06ae94****</p>
         */
        @NameInMap("FileSystemId")
        public String fileSystemId;

        /**
         * <p>Specifies whether to enable user data roaming.</p>
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
         * <p>The list of storage types.</p>
         */
        @NameInMap("StorageTypeList")
        public java.util.List<String> storageTypeList;

        /**
         * <p>The user data roaming configuration.</p>
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
