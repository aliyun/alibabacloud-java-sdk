// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentStateLogsRequest extends TeaModel {
    /**
     * <p>Agent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>End UNIX timestamp. The default value is the current time. The time difference between EndTime and StartTime must not exceed 7 days. The format is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1620273600000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Start UNIX timestamp. The default value is the start time of the current day. The earliest allowed value is 180 days before the current date. The format is a Unix timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1620230400000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListAgentStateLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStateLogsRequest self = new ListAgentStateLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentStateLogsRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public ListAgentStateLogsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListAgentStateLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentStateLogsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
