// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeTopHotKeysRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The end time must be later than the start time.</p>
     * </li>
     * <li><p>Only data within the last four days can be queried.</p>
     * </li>
     * <li><p>The maximum interval between the <strong>start time</strong> and the** end time** is 3 hours.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993001</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the ApsaraDB for Redis instance. You can call the <a href="https://help.aliyun.com/document_detail/60933.html">DescribeInstances</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp18ff4a195d****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard on the ApsaraDB for Redis instance. You can call the <a href="https://help.aliyun.com/document_detail/190794.html">DescribeRoleZoneInfo</a> operation to query the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>r-****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1596177993000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeTopHotKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopHotKeysRequest self = new DescribeTopHotKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTopHotKeysRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public DescribeTopHotKeysRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTopHotKeysRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeTopHotKeysRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeTopHotKeysRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
