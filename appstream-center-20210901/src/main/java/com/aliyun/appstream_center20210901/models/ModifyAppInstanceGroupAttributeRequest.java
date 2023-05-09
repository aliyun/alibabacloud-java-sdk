// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupAttributeRequest extends TeaModel {
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    @NameInMap("NodePool")
    public ModifyAppInstanceGroupAttributeRequestNodePool nodePool;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SecurityPolicy")
    public ModifyAppInstanceGroupAttributeRequestSecurityPolicy securityPolicy;

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

    public ModifyAppInstanceGroupAttributeRequest setNodePool(ModifyAppInstanceGroupAttributeRequestNodePool nodePool) {
        this.nodePool = nodePool;
        return this;
    }
    public ModifyAppInstanceGroupAttributeRequestNodePool getNodePool() {
        return this.nodePool;
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

    public static class ModifyAppInstanceGroupAttributeRequestNodePool extends TeaModel {
        @NameInMap("NodeCapacity")
        public Integer nodeCapacity;

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
        @NameInMap("ResetAfterUnbind")
        public Boolean resetAfterUnbind;

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

    public static class ModifyAppInstanceGroupAttributeRequestStoragePolicy extends TeaModel {
        @NameInMap("StorageTypeList")
        public java.util.List<String> storageTypeList;

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

    }

}
