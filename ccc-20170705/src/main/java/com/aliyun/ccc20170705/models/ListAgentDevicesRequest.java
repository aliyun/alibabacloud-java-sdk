// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentDevicesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RamIds")
    public String ramIds;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StopTime")
    public Long stopTime;

    public static ListAgentDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentDevicesRequest self = new ListAgentDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentDevicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentDevicesRequest setRamIds(String ramIds) {
        this.ramIds = ramIds;
        return this;
    }
    public String getRamIds() {
        return this.ramIds;
    }

    public ListAgentDevicesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListAgentDevicesRequest setStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Long getStopTime() {
        return this.stopTime;
    }

}
