// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadlockHistogramRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This field is of the Long type. During serialization/deserialization, precision loss may occur. Make sure that the value does not exceed 9007199254740991.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1732069466000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the database instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1u5mas9exx7****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p>Required for PolarDB for MySQL cluster instances</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-bp16v3824rt73****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     * <blockquote>
     * <p>The maximum query window is 7 days.</p>
     * </blockquote>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This field is of the Long type. During serialization/deserialization, precision loss may occur. Make sure that the value does not exceed 9007199254740991.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1731983066000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the analysis task.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetDeadlockHistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeadlockHistogramRequest self = new GetDeadlockHistogramRequest();
        return TeaModel.build(map, self);
    }

    public GetDeadlockHistogramRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetDeadlockHistogramRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDeadlockHistogramRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetDeadlockHistogramRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetDeadlockHistogramRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
