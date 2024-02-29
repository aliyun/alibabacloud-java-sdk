// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunCycleDagNodesRequest extends TeaModel {
    @NameInMap("AlertNoticeType")
    public String alertNoticeType;

    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The time when the node started to run. This parameter is required only for auto triggered nodes that are scheduled by hour. Specify the value in the HH:mm:ss format. Valid values: 00:00:00 to 23:59:59.</p>
     */
    @NameInMap("BizBeginTime")
    public String bizBeginTime;

    /**
     * <p>The time when the node stopped running. This parameter is required only for auto triggered nodes that are scheduled by hour. Specify the value in the HH:mm:ss format. Valid values: 00:00:00 to 23:59:59.</p>
     */
    @NameInMap("BizEndTime")
    public String bizEndTime;

    @NameInMap("ConcurrentRuns")
    public Integer concurrentRuns;

    /**
     * <p>The data timestamp at which data is no longer backfilled. Specify the value in the yyyy-MM-dd 00:00:00 format.</p>
     */
    @NameInMap("EndBizDate")
    public String endBizDate;

    /**
     * <p>The IDs of the nodes for which no data needs to be backfilled. The system generates dry-run instances for all these nodes. After these dry-run instances are scheduled, the statuses of these instances are directly set to successful, but the script is not run.</p>
     */
    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    /**
     * <p>The ID of the node for which you want to backfill data. If you want to backfill data for multiple nodes, separate the IDs of the nodes with commas (,). You can call the [ListNodes](~~173979~~) operation to query the ID.</p>
     */
    @NameInMap("IncludeNodeIds")
    public String includeNodeIds;

    /**
     * <p>The name of the workflow.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The parameters that need to be configured for the node. Set this parameter to a JSON string. The key indicates the ID of the node, and the value indicates the actual values of the parameters.</p>
     */
    @NameInMap("NodeParams")
    public String nodeParams;

    /**
     * <p>Specifies whether data can be backfilled for multiple nodes at the same time.</p>
     */
    @NameInMap("Parallelism")
    public Boolean parallelism;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment, and the value DEV indicates the development environment.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the node for which data is first backfilled. You can call the [ListNodes](~~173979~~) operation to query the ID.</p>
     */
    @NameInMap("RootNodeId")
    public Long rootNodeId;

    /**
     * <p>The data timestamp at which data starts to be backfilled. Specify the value in the yyyy-MM-dd 00:00:00 format.</p>
     */
    @NameInMap("StartBizDate")
    public String startBizDate;

    /**
     * <p>Specifies whether to immediately run an instance that is scheduled to run in the future. If you set this parameter to true, the instance that is scheduled to run in the future is run immediately. Otherwise, the instance is run as scheduled.</p>
     */
    @NameInMap("StartFutureInstanceImmediately")
    public Boolean startFutureInstanceImmediately;

    public static RunCycleDagNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCycleDagNodesRequest self = new RunCycleDagNodesRequest();
        return TeaModel.build(map, self);
    }

    public RunCycleDagNodesRequest setAlertNoticeType(String alertNoticeType) {
        this.alertNoticeType = alertNoticeType;
        return this;
    }
    public String getAlertNoticeType() {
        return this.alertNoticeType;
    }

    public RunCycleDagNodesRequest setAlertType(String alertType) {
        this.alertType = alertType;
        return this;
    }
    public String getAlertType() {
        return this.alertType;
    }

    public RunCycleDagNodesRequest setBizBeginTime(String bizBeginTime) {
        this.bizBeginTime = bizBeginTime;
        return this;
    }
    public String getBizBeginTime() {
        return this.bizBeginTime;
    }

    public RunCycleDagNodesRequest setBizEndTime(String bizEndTime) {
        this.bizEndTime = bizEndTime;
        return this;
    }
    public String getBizEndTime() {
        return this.bizEndTime;
    }

    public RunCycleDagNodesRequest setConcurrentRuns(Integer concurrentRuns) {
        this.concurrentRuns = concurrentRuns;
        return this;
    }
    public Integer getConcurrentRuns() {
        return this.concurrentRuns;
    }

    public RunCycleDagNodesRequest setEndBizDate(String endBizDate) {
        this.endBizDate = endBizDate;
        return this;
    }
    public String getEndBizDate() {
        return this.endBizDate;
    }

    public RunCycleDagNodesRequest setExcludeNodeIds(String excludeNodeIds) {
        this.excludeNodeIds = excludeNodeIds;
        return this;
    }
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    public RunCycleDagNodesRequest setIncludeNodeIds(String includeNodeIds) {
        this.includeNodeIds = includeNodeIds;
        return this;
    }
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    public RunCycleDagNodesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunCycleDagNodesRequest setNodeParams(String nodeParams) {
        this.nodeParams = nodeParams;
        return this;
    }
    public String getNodeParams() {
        return this.nodeParams;
    }

    public RunCycleDagNodesRequest setParallelism(Boolean parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Boolean getParallelism() {
        return this.parallelism;
    }

    public RunCycleDagNodesRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public RunCycleDagNodesRequest setRootNodeId(Long rootNodeId) {
        this.rootNodeId = rootNodeId;
        return this;
    }
    public Long getRootNodeId() {
        return this.rootNodeId;
    }

    public RunCycleDagNodesRequest setStartBizDate(String startBizDate) {
        this.startBizDate = startBizDate;
        return this;
    }
    public String getStartBizDate() {
        return this.startBizDate;
    }

    public RunCycleDagNodesRequest setStartFutureInstanceImmediately(Boolean startFutureInstanceImmediately) {
        this.startFutureInstanceImmediately = startFutureInstanceImmediately;
        return this;
    }
    public Boolean getStartFutureInstanceImmediately() {
        return this.startFutureInstanceImmediately;
    }

}
