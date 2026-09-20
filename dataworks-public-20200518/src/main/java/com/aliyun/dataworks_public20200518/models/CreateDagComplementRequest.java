// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDagComplementRequest extends TeaModel {
    /**
     * <p>Optional. The start time of the task. This parameter is required for hourly scheduled tasks.</p>
     * <p>Format: <code>HH:mm:ss</code>. Example: <code>00:00:00</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>00:00:00</p>
     */
    @NameInMap("BizBeginTime")
    public String bizBeginTime;

    /**
     * <p>Optional. The end time of the task. This parameter is required for hourly scheduled tasks.</p>
     * <p>Format: <code>HH:mm:ss</code>. Example: <code>23:00:00</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>23:00:00</p>
     */
    @NameInMap("BizEndTime")
    public String bizEndTime;

    /**
     * <p>The end business date for the data backfill.</p>
     * <p>Format: <code>yyyy-MM-dd HH:mm:ss</code>. Example: <code>2020-05-21 00:00:00</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-21 00:00:00</p>
     */
    @NameInMap("EndBizDate")
    public String endBizDate;

    /**
     * <p>Optional. The list of node IDs to exclude from the data backfill.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    /**
     * <p>The list of included node IDs. If you want to backfill data for only one node, the node must be included in includeNodeIds.</p>
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
     * <p>{74324:&quot;key1=val1 key2=val&quot;}</p>
     */
    @NameInMap("NodeParams")
    public String nodeParams;

    /**
     * <p>Specifies whether tasks can execute concurrently.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Parallelism")
    public Boolean parallelism;

    /**
     * <p>The environment of the workspace. Valid values:</p>
     * <ul>
     * <li>PROD: production environment.</li>
     * <li>DEV: development environment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the root node for the data backfill.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("RootNodeId")
    public Long rootNodeId;

    /**
     * <p>The start business date for the data backfill.</p>
     * <p>Format: <code>yyyy-MM-dd HH:mm:ss</code>. Example: <code>2020-05-20 00:00:00</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-20 00:00:00</p>
     */
    @NameInMap("StartBizDate")
    public String startBizDate;

    public static CreateDagComplementRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDagComplementRequest self = new CreateDagComplementRequest();
        return TeaModel.build(map, self);
    }

    public CreateDagComplementRequest setBizBeginTime(String bizBeginTime) {
        this.bizBeginTime = bizBeginTime;
        return this;
    }
    public String getBizBeginTime() {
        return this.bizBeginTime;
    }

    public CreateDagComplementRequest setBizEndTime(String bizEndTime) {
        this.bizEndTime = bizEndTime;
        return this;
    }
    public String getBizEndTime() {
        return this.bizEndTime;
    }

    public CreateDagComplementRequest setEndBizDate(String endBizDate) {
        this.endBizDate = endBizDate;
        return this;
    }
    public String getEndBizDate() {
        return this.endBizDate;
    }

    public CreateDagComplementRequest setExcludeNodeIds(String excludeNodeIds) {
        this.excludeNodeIds = excludeNodeIds;
        return this;
    }
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    public CreateDagComplementRequest setIncludeNodeIds(String includeNodeIds) {
        this.includeNodeIds = includeNodeIds;
        return this;
    }
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    public CreateDagComplementRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDagComplementRequest setNodeParams(String nodeParams) {
        this.nodeParams = nodeParams;
        return this;
    }
    public String getNodeParams() {
        return this.nodeParams;
    }

    public CreateDagComplementRequest setParallelism(Boolean parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Boolean getParallelism() {
        return this.parallelism;
    }

    public CreateDagComplementRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public CreateDagComplementRequest setRootNodeId(Long rootNodeId) {
        this.rootNodeId = rootNodeId;
        return this;
    }
    public Long getRootNodeId() {
        return this.rootNodeId;
    }

    public CreateDagComplementRequest setStartBizDate(String startBizDate) {
        this.startBizDate = startBizDate;
        return this;
    }
    public String getStartBizDate() {
        return this.startBizDate;
    }

}
