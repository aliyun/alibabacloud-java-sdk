// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeMultiZoneClusterNodeCountRequest extends TeaModel {
    @NameInMap("ArbiterVSwitchId")
    public String arbiterVSwitchId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CoreNodeCount")
    public Integer coreNodeCount;

    @NameInMap("LogNodeCount")
    public Integer logNodeCount;

    @NameInMap("PrimaryCoreNodeCount")
    public Integer primaryCoreNodeCount;

    @NameInMap("PrimaryVSwitchId")
    public String primaryVSwitchId;

    @NameInMap("StandbyCoreNodeCount")
    public Integer standbyCoreNodeCount;

    @NameInMap("StandbyVSwitchId")
    public String standbyVSwitchId;

    public static ResizeMultiZoneClusterNodeCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeMultiZoneClusterNodeCountRequest self = new ResizeMultiZoneClusterNodeCountRequest();
        return TeaModel.build(map, self);
    }

    public ResizeMultiZoneClusterNodeCountRequest setArbiterVSwitchId(String arbiterVSwitchId) {
        this.arbiterVSwitchId = arbiterVSwitchId;
        return this;
    }
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    public ResizeMultiZoneClusterNodeCountRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeMultiZoneClusterNodeCountRequest setCoreNodeCount(Integer coreNodeCount) {
        this.coreNodeCount = coreNodeCount;
        return this;
    }
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    public ResizeMultiZoneClusterNodeCountRequest setLogNodeCount(Integer logNodeCount) {
        this.logNodeCount = logNodeCount;
        return this;
    }
    public Integer getLogNodeCount() {
        return this.logNodeCount;
    }

    public ResizeMultiZoneClusterNodeCountRequest setPrimaryCoreNodeCount(Integer primaryCoreNodeCount) {
        this.primaryCoreNodeCount = primaryCoreNodeCount;
        return this;
    }
    public Integer getPrimaryCoreNodeCount() {
        return this.primaryCoreNodeCount;
    }

    public ResizeMultiZoneClusterNodeCountRequest setPrimaryVSwitchId(String primaryVSwitchId) {
        this.primaryVSwitchId = primaryVSwitchId;
        return this;
    }
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    public ResizeMultiZoneClusterNodeCountRequest setStandbyCoreNodeCount(Integer standbyCoreNodeCount) {
        this.standbyCoreNodeCount = standbyCoreNodeCount;
        return this;
    }
    public Integer getStandbyCoreNodeCount() {
        return this.standbyCoreNodeCount;
    }

    public ResizeMultiZoneClusterNodeCountRequest setStandbyVSwitchId(String standbyVSwitchId) {
        this.standbyVSwitchId = standbyVSwitchId;
        return this;
    }
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

}
