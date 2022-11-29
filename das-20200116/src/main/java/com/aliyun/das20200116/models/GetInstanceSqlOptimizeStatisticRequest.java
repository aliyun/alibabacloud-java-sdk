// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceSqlOptimizeStatisticRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("FilterEnable")
    public String filterEnable;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Threshold")
    public String threshold;

    @NameInMap("UseMerging")
    public String useMerging;

    public static GetInstanceSqlOptimizeStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSqlOptimizeStatisticRequest self = new GetInstanceSqlOptimizeStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceSqlOptimizeStatisticRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetInstanceSqlOptimizeStatisticRequest setFilterEnable(String filterEnable) {
        this.filterEnable = filterEnable;
        return this;
    }
    public String getFilterEnable() {
        return this.filterEnable;
    }

    public GetInstanceSqlOptimizeStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceSqlOptimizeStatisticRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetInstanceSqlOptimizeStatisticRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetInstanceSqlOptimizeStatisticRequest setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }
    public String getThreshold() {
        return this.threshold;
    }

    public GetInstanceSqlOptimizeStatisticRequest setUseMerging(String useMerging) {
        this.useMerging = useMerging;
        return this;
    }
    public String getUseMerging() {
        return this.useMerging;
    }

}
