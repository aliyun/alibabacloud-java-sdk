// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class EnvironmentInfo extends TeaModel {
    @NameInMap("alias")
    public String alias;

    @NameInMap("createTimestamp")
    public Long createTimestamp;

    @NameInMap("default")
    public Boolean _default;

    @NameInMap("description")
    public String description;

    @NameInMap("environmentId")
    public String environmentId;

    @NameInMap("gatewayInfo")
    public GatewayInfo gatewayInfo;

    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>rg-xxxx</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("subDomainInfos")
    public java.util.List<SubDomainInfo> subDomainInfos;

    @NameInMap("updateTimestamp")
    public Long updateTimestamp;

    public static EnvironmentInfo build(java.util.Map<String, ?> map) throws Exception {
        EnvironmentInfo self = new EnvironmentInfo();
        return TeaModel.build(map, self);
    }

    public EnvironmentInfo setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public EnvironmentInfo setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public EnvironmentInfo set_default(Boolean _default) {
        this._default = _default;
        return this;
    }
    public Boolean get_default() {
        return this._default;
    }

    public EnvironmentInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public EnvironmentInfo setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public EnvironmentInfo setGatewayInfo(GatewayInfo gatewayInfo) {
        this.gatewayInfo = gatewayInfo;
        return this;
    }
    public GatewayInfo getGatewayInfo() {
        return this.gatewayInfo;
    }

    public EnvironmentInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EnvironmentInfo setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public EnvironmentInfo setSubDomainInfos(java.util.List<SubDomainInfo> subDomainInfos) {
        this.subDomainInfos = subDomainInfos;
        return this;
    }
    public java.util.List<SubDomainInfo> getSubDomainInfos() {
        return this.subDomainInfos;
    }

    public EnvironmentInfo setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

}
