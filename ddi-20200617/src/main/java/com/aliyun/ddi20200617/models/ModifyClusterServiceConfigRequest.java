// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ModifyClusterServiceConfigRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("ConfigParams")
    public String configParams;

    @NameInMap("CustomConfigParams")
    public String customConfigParams;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("HostInstanceId")
    public String hostInstanceId;

    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("RefreshHostConfig")
    public Boolean refreshHostConfig;

    @NameInMap("GatewayClusterIdList")
    public java.util.List<String> gatewayClusterIdList;

    public static ModifyClusterServiceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterServiceConfigRequest self = new ModifyClusterServiceConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterServiceConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyClusterServiceConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyClusterServiceConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterServiceConfigRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ModifyClusterServiceConfigRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ModifyClusterServiceConfigRequest setConfigParams(String configParams) {
        this.configParams = configParams;
        return this;
    }
    public String getConfigParams() {
        return this.configParams;
    }

    public ModifyClusterServiceConfigRequest setCustomConfigParams(String customConfigParams) {
        this.customConfigParams = customConfigParams;
        return this;
    }
    public String getCustomConfigParams() {
        return this.customConfigParams;
    }

    public ModifyClusterServiceConfigRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyClusterServiceConfigRequest setHostInstanceId(String hostInstanceId) {
        this.hostInstanceId = hostInstanceId;
        return this;
    }
    public String getHostInstanceId() {
        return this.hostInstanceId;
    }

    public ModifyClusterServiceConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ModifyClusterServiceConfigRequest setRefreshHostConfig(Boolean refreshHostConfig) {
        this.refreshHostConfig = refreshHostConfig;
        return this;
    }
    public Boolean getRefreshHostConfig() {
        return this.refreshHostConfig;
    }

    public ModifyClusterServiceConfigRequest setGatewayClusterIdList(java.util.List<String> gatewayClusterIdList) {
        this.gatewayClusterIdList = gatewayClusterIdList;
        return this;
    }
    public java.util.List<String> getGatewayClusterIdList() {
        return this.gatewayClusterIdList;
    }

}
