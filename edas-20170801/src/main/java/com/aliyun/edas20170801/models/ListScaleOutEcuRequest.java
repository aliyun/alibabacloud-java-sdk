// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListScaleOutEcuRequest extends TeaModel {
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("Mem")
    public Integer mem;

    @NameInMap("InstanceNum")
    public Integer instanceNum;

    public static ListScaleOutEcuRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScaleOutEcuRequest self = new ListScaleOutEcuRequest();
        return TeaModel.build(map, self);
    }

    public ListScaleOutEcuRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public ListScaleOutEcuRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListScaleOutEcuRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListScaleOutEcuRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListScaleOutEcuRequest setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public ListScaleOutEcuRequest setMem(Integer mem) {
        this.mem = mem;
        return this;
    }
    public Integer getMem() {
        return this.mem;
    }

    public ListScaleOutEcuRequest setInstanceNum(Integer instanceNum) {
        this.instanceNum = instanceNum;
        return this;
    }
    public Integer getInstanceNum() {
        return this.instanceNum;
    }

}
