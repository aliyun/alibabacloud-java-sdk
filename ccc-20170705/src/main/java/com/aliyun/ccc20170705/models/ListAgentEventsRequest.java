// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListAgentEventsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StopTime")
    public Long stopTime;

    @NameInMap("RamId")
    public java.util.List<String> ramId;

    @NameInMap("Event")
    public java.util.List<String> event;

    public static ListAgentEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentEventsRequest self = new ListAgentEventsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentEventsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public ListAgentEventsRequest setRamId(java.util.List<String> ramId) {
        this.ramId = ramId;
        return this;
    }
    public java.util.List<String> getRamId() {
        return this.ramId;
    }

    public ListAgentEventsRequest setEvent(java.util.List<String> event) {
        this.event = event;
        return this;
    }
    public java.util.List<String> getEvent() {
        return this.event;
    }

}
