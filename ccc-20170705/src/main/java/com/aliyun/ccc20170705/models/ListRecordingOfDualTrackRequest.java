// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListRecordingOfDualTrackRequest extends TeaModel {
    @NameInMap("AgentId")
    public String agentId;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("ConnectId")
    public String connectId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("StopTime")
    public Long stopTime;

    public static ListRecordingOfDualTrackRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRecordingOfDualTrackRequest self = new ListRecordingOfDualTrackRequest();
        return TeaModel.build(map, self);
    }

    public ListRecordingOfDualTrackRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListRecordingOfDualTrackRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public ListRecordingOfDualTrackRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public ListRecordingOfDualTrackRequest setConnectId(String connectId) {
        this.connectId = connectId;
        return this;
    }
    public String getConnectId() {
        return this.connectId;
    }

    public ListRecordingOfDualTrackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRecordingOfDualTrackRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecordingOfDualTrackRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecordingOfDualTrackRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListRecordingOfDualTrackRequest setStopTime(Long stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Long getStopTime() {
        return this.stopTime;
    }

}
