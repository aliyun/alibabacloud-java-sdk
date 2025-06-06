// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ModifyEnterpriseAcceleratePolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>whiltelist</p>
     */
    @NameInMap("AccelerationType")
    public String accelerationType;

    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>eap-ce153a7165c8feea</p>
     */
    @NameInMap("EapId")
    public String eapId;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OnTls")
    public Integer onTls;

    /**
     * <strong>example:</strong>
     * <p>999</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ShowInClient")
    public Integer showInClient;

    /**
     * <strong>example:</strong>
     * <p>12.34.56.XX</p>
     */
    @NameInMap("UpstreamHost")
    public String upstreamHost;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("UpstreamPort")
    public Integer upstreamPort;

    /**
     * <strong>example:</strong>
     * <p>ga</p>
     */
    @NameInMap("UpstreamType")
    public String upstreamType;

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
