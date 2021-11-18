// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentEventsRequest extends TeaModel {
    @NameInMap("Event")
    public java.util.List<String> event;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RamId")
    public java.util.List<String> ramId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StopTime")
    public Long stopTime;

    public static ListAgentEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentEventsRequest self = new ListAgentEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentEventsRequest setEvent(java.util.List<String> event) {
        this.event = event;
        return this;
    }
    public java.util.List<String> getEvent() {
        return this.event;
    }

    public ListAgentEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentEventsRequest setRamId(java.util.List<String> ramId) {
        this.ramId = ramId;
        return this;
    }
    public java.util.List<String> getRamId() {
        return this.ramId;
    }

    public ListAgentEventsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListAgentEventsRequest setStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Long getStopTime() {
        return this.stopTime;
    }

}
