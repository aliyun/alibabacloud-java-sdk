// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetInstanceSqlOptimizeStatisticRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1662518540764</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to filter instances for which DAS Enterprise Edition is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you set this parameter to <strong>true</strong>, only database instances for which DAS Enterprise Edition is disabled are queried. If you set this parameter to <strong>false</strong>, all database instances are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FilterEnable")
    public String filterEnable;

    /**
     * <p>The database instance ID.</p>
     * <blockquote>
     * <p> The database instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-wz90h9560rvdz****</p>
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
     * <p>pi-bp12v7243x012****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1661308902060</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The duration threshold for automatic SQL optimization events. After this parameter is specified, the system collects statistics on automatic SQL optimization events whose duration does not exceed the specified threshold.</p>
     * <blockquote>
     * <p> This parameter is a reserved parameter and does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Threshold")
    public String threshold;

    /**
     * <p>Specifies whether to merge automatic SQL optimization events. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: merges automatic SQL optimization events.</li>
     * <li><strong>false</strong>: does not merge automatic SQL optimization events.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is a reserved parameter and does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
