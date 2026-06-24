// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyAppInstanceGroupAttributeShrinkRequest extends TeaModel {
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
    public String networkShrink;

    /**
     * <p>The resource group object.</p>
     */
    @NameInMap("NodePool")
    public String nodePoolShrink;

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
    public String securityPolicyShrink;

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

    public ModifyAppInstanceGroupAttributeShrinkRequest setNetworkShrink(String networkShrink) {
        this.networkShrink = networkShrink;
        return this;
    }
    public String getNetworkShrink() {
        return this.networkShrink;
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setNodePoolShrink(String nodePoolShrink) {
        this.nodePoolShrink = nodePoolShrink;
        return this;
    }
    public String getNodePoolShrink() {
        return this.nodePoolShrink;
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setPerSessionPerApp(Boolean perSessionPerApp) {
        this.perSessionPerApp = perSessionPerApp;
        return this;
    }
    public Boolean getPerSessionPerApp() {
        return this.perSessionPerApp;
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setPreOpenAppId(String preOpenAppId) {
        this.preOpenAppId = preOpenAppId;
        return this;
    }
    public String getPreOpenAppId() {
        return this.preOpenAppId;
    }

    public ModifyAppInstanceGroupAttributeShrinkRequest setPreOpenMode(String preOpenMode) {
        this.preOpenMode = preOpenMode;
        return this;
    }
    public String getPreOpenMode() {
        return this.preOpenMode;
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
