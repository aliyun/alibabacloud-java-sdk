// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPfsSqlSampleRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * <p> The end time must be later than the start time. You can view the data of up to seven days in the previous 30 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1678074351197</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> Only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters are supported</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The node ID.</p>
     * <blockquote>
     * <p> For ApsaraDB RDS for MySQL Cluster Edition instances or PolarDB for MySQL clusters, you must specify the node ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-x****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The SQL ID.</p>
     * 
     * <strong>example:</strong>
     * <p>651b56fe9418d48edb8fdf0980ec****</p>
     */
    @NameInMap("SqlId")
    public String sqlId;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1676511134614</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetPfsSqlSampleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPfsSqlSampleRequest self = new GetPfsSqlSampleRequest();
        return TeaModel.build(map, self);
    }

    public GetPfsSqlSampleRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetPfsSqlSampleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPfsSqlSampleRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetPfsSqlSampleRequest setSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }
    public String getSqlId() {
        return this.sqlId;
    }

    public GetPfsSqlSampleRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
