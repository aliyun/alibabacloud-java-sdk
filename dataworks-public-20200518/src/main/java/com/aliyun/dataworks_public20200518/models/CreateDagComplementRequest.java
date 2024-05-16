// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDagComplementRequest extends TeaModel {
    @NameInMap("BizBeginTime")
    public String bizBeginTime;

    @NameInMap("BizEndTime")
    public String bizEndTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndBizDate")
    public String endBizDate;

    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IncludeNodeIds")
    public String includeNodeIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NodeParams")
    public String nodeParams;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Parallelism")
    public Boolean parallelism;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RootNodeId")
    public Long rootNodeId;

    /**
     * <p>This parameter is required.</p>
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
