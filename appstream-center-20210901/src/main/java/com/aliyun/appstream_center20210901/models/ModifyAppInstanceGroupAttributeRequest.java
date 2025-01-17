// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    @NameInMap("Network")
    public ModifyAppInstanceGroupAttributeRequestNetwork network;

    @NameInMap("NodePool")
    public ModifyAppInstanceGroupAttributeRequestNodePool nodePool;

    @NameInMap("PerSessionPerApp")
    public Boolean perSessionPerApp;

    @NameInMap("PreOpenAppId")
    public String preOpenAppId;

    @NameInMap("PreOpenMode")
    public String preOpenMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SecurityPolicy")
    public ModifyAppInstanceGroupAttributeRequestSecurityPolicy securityPolicy;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

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
        @NameInMap("Domain")
        public String domain;

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
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

        /**
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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResetAfterUnbind")
        public Boolean resetAfterUnbind;

        /**
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
        @NameInMap("StorageTypeList")
        public java.util.List<String> storageTypeList;

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

        public ModifyAppInstanceGroupAttributeRequestStoragePolicy setUserProfileFollow(ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow userProfileFollow) {
            this.userProfileFollow = userProfileFollow;
            return this;
        }
        public ModifyAppInstanceGroupAttributeRequestStoragePolicyUserProfileFollow getUserProfileFollow() {
            return this.userProfileFollow;
        }

    }

}
