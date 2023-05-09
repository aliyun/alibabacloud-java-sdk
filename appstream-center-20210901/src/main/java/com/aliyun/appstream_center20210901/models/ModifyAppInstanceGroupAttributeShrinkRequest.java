// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupAttributeShrinkRequest extends TeaModel {
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("AppInstanceGroupName")
    public String appInstanceGroupName;

    @NameInMap("NodePool")
    public String nodePoolShrink;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("SecurityPolicy")
    public String securityPolicyShrink;

    @NameInMap("SessionTimeout")
    public Integer sessionTimeout;

    @NameInMap("StoragePolicy")
    public String storagePolicyShrink;

    public static ModifyAppInstanceGroupAttributeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppInstanceGroupAttributeShrinkRequest self = new ModifyAppInstanceGroupAttributeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setAppInstanceGroupName(String appInstanceGroupName) {
        this.appInstanceGroupName = appInstanceGroupName;
        return this;
    }
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setNodePoolShrink(String nodePoolShrink) {
        this.nodePoolShrink = nodePoolShrink;
        return this;
    }
    public String getNodePoolShrink() {
        return this.nodePoolShrink;
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setSecurityPolicyShrink(String securityPolicyShrink) {
        this.securityPolicyShrink = securityPolicyShrink;
        return this;
    }
    public String getSecurityPolicyShrink() {
        return this.securityPolicyShrink;
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setStoragePolicyShrink(String storagePolicyShrink) {
        this.storagePolicyShrink = storagePolicyShrink;
        return this;
    }
    public String getStoragePolicyShrink() {
        return this.storagePolicyShrink;
    }

}
