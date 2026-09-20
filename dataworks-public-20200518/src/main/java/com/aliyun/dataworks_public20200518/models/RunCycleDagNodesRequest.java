// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunCycleDagNodesRequest extends TeaModel {
    /**
     * <p>The alert notification method. Valid values:</p>
     * <ul>
     * <li>SMS: text message.</li>
     * <li>MAIL: email.</li>
     * <li>SMS_MAIL: text message and email.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SMS</p>
     */
    @NameInMap("AlertNoticeType")
    public String alertNoticeType;

    /**
     * <p>The Alarm Metric. Valid values:</p>
     * <ul>
     * <li>SUCCESS: Alerting on success.</li>
     * <li>FAILURE: Alerting on failed.</li>
     * <li>SUCCESS_FAILURE: Alerting on success or failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FAILURE</p>
     */
    @NameInMap("AlertType")
    public String alertType;

    /**
     * <p>The start time of the node. This parameter is required only for hourly scheduled nodes. Format: HH:mm:ss. Valid values: 00:00:00 to 23:59:59.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:00</p>
     */
    @NameInMap("BizBeginTime")
    public String bizBeginTime;

    /**
     * <p>The end time of the node. This parameter is required only for hourly scheduled nodes. Format: HH:mm:ss. Valid values: 00:00:00 to 23:59:59.</p>
     * 
     * <strong>example:</strong>
     * <p>01:00:00</p>
     */
    @NameInMap("BizEndTime")
    public String bizEndTime;

    /**
     * <p>The number of concurrent nodes. Valid values: 2 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ConcurrentRuns")
    public Integer concurrentRuns;

    /**
     * <p>The end business date for data backfill. Format: yyyy-MM-dd 00:00:00.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-21 00:00:00</p>
     */
    @NameInMap("EndBizDate")
    public String endBizDate;

    /**
     * <p>The list of node IDs that do not require data backfill. Nodes in this list generate dry-run instances. After a dry-run instance is scheduled, it directly succeeds without executing the script content.</p>
     * 
     * <strong>example:</strong>
     * <p>1234,123465</p>
     */
    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    /**
     * <p>The node IDs for data backfill. Separate multiple node IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to obtain node IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>74324,74325</p>
     */
    @NameInMap("IncludeNodeIds")
    public String includeNodeIds;

    /**
     * <p>The name of the workflow.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xm_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>A JSON string in which the key is the node ID and the value is the actual parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;74324&quot;:&quot;a=123 b=456&quot;}</p>
     */
    @NameInMap("NodeParams")
    public String nodeParams;

    /**
     * <p>Specifies whether nodes across multiple business dates can run in parallel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Parallelism")
    public Boolean parallelism;

    /**
     * <p>The environment of the workspace. PROD indicates the production environment. DEV indicates the development environment.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the start node for data backfill. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to obtain the node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("RootNodeId")
    public Long rootNodeId;

    /**
     * <p>The start business date for data backfill. Format: yyyy-MM-dd 00:00:00.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-20 00:00:00</p>
     */
    @NameInMap("StartBizDate")
    public String startBizDate;

    /**
     * <p>Specifies whether to immediately run instances whose scheduling time is in the future. If this parameter is set to true, instances with a scheduling time later than the current time run immediately. Otherwise, the instances wait until the scheduling time.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
