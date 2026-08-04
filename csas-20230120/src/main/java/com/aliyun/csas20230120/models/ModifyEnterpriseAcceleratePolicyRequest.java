// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ModifyEnterpriseAcceleratePolicyRequest extends TeaModel {
    /**
     * <p>The acceleration mode:</p>
     * <ul>
     * <li><strong>whiltelist</strong>: whitelist acceleration</li>
     * <li><strong>global</strong>: global acceleration</li>
     * <li><strong>build-in-list</strong>: built-in system application acceleration</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>whitelist</p>
     */
    @NameInMap("AccelerationType")
    public String accelerationType;

    /**
     * <p>The description of the enterprise acceleration policy.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条内网访问策略</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the enterprise acceleration policy.</p>
     * 
     * <strong>example:</strong>
     * <p>eap-ce153a7165c8feea</p>
     */
    @NameInMap("EapId")
    public String eapId;

    /**
     * <p>The name of the enterprise acceleration policy.</p>
     * 
     * <strong>example:</strong>
     * <p>白名单策略001</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether to enable TLS mode:</p>
     * <ul>
     * <li><strong>0</strong>: disable</li>
     * <li><strong>1</strong>: enable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OnTls")
    public Integer onTls;

    /**
     * <p>The priority.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>Specifies whether to display on the client:</p>
     * <ul>
     * <li><strong>0</strong>: do not display</li>
     * <li><strong>1</strong>: display</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ShowInClient")
    public Integer showInClient;

    /**
     * <p>The address (IP or domain name) of the acceleration instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12.34.56.XX</p>
     */
    @NameInMap("UpstreamHost")
    public String upstreamHost;

    /**
     * <p>The port of the acceleration instance (between 1000 and 60000).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("UpstreamPort")
    public Integer upstreamPort;

    /**
     * <p>The acceleration instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga</p>
     */
    @NameInMap("UpstreamType")
    public String upstreamType;

    /**
     * <p>The acceleration user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>测试用户组</p>
     */
    @NameInMap("UserAttributeGroup")
    public String userAttributeGroup;

    public static ModifyEnterpriseAcceleratePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEnterpriseAcceleratePolicyRequest self = new ModifyEnterpriseAcceleratePolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEnterpriseAcceleratePolicyRequest setAccelerationType(String accelerationType) {
        this.accelerationType = accelerationType;
        return this;
    }
    public String getAccelerationType() {
        return this.accelerationType;
    }

    public ModifyEnterpriseAcceleratePolicyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyEnterpriseAcceleratePolicyRequest setEapId(String eapId) {
        this.eapId = eapId;
        return this;
    }
    public String getEapId() {
        return this.eapId;
    }

    public ModifyEnterpriseAcceleratePolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyEnterpriseAcceleratePolicyRequest setOnTls(Integer onTls) {
        this.onTls = onTls;
        return this;
    }
    public Integer getOnTls() {
        return this.onTls;
    }

    public ModifyEnterpriseAcceleratePolicyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyEnterpriseAcceleratePolicyRequest setShowInClient(Integer showInClient) {
        this.showInClient = showInClient;
        return this;
    }
    public Integer getShowInClient() {
        return this.showInClient;
    }

    public ModifyEnterpriseAcceleratePolicyRequest setUpstreamHost(String upstreamHost) {
        this.upstreamHost = upstreamHost;
        return this;
    }
    public String getUpstreamHost() {
        return this.upstreamHost;
    }

    public ModifyEnterpriseAcceleratePolicyRequest setUpstreamPort(Integer upstreamPort) {
        this.upstreamPort = upstreamPort;
        return this;
    }
    public Integer getUpstreamPort() {
        return this.upstreamPort;
    }

    public ModifyEnterpriseAcceleratePolicyRequest setUpstreamType(String upstreamType) {
        this.upstreamType = upstreamType;
        return this;
    }
    public String getUpstreamType() {
        return this.upstreamType;
    }

    public ModifyEnterpriseAcceleratePolicyRequest setUserAttributeGroup(String userAttributeGroup) {
        this.userAttributeGroup = userAttributeGroup;
        return this;
    }
    public String getUserAttributeGroup() {
        return this.userAttributeGroup;
    }

}
