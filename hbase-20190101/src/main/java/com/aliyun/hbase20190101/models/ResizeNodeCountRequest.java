// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ResizeNodeCountRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("NodeCount")
    public Integer nodeCount;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static ResizeNodeCountRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeNodeCountRequest self = new ResizeNodeCountRequest();
        return TeaModel.build(map, self);
    }

    public ResizeNodeCountRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeNodeCountRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public ResizeNodeCountRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public ResizeNodeCountRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
