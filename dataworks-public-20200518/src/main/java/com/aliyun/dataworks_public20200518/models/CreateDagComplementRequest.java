// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateDagComplementRequest extends TeaModel {
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    public String projectEnv;

    @NameInMap("StartBizDate")
    @Validation(required = true)
    public String startBizDate;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("RootNodeId")
    @Validation(required = true)
    public Long rootNodeId;

    @NameInMap("IncludeNodeIds")
    @Validation(required = true)
    public String includeNodeIds;

    @NameInMap("ExcludeNodeIds")
    public String excludeNodeIds;

    @NameInMap("BizBeginTime")
    public String bizBeginTime;

    @NameInMap("BizEndTime")
    public String bizEndTime;

    @NameInMap("Parallelism")
    @Validation(required = true)
    public Boolean parallelism;

    @NameInMap("EndBizDate")
    @Validation(required = true)
    public String endBizDate;

    @NameInMap("NodeParams")
    public String nodeParams;

    public static CreateDagComplementRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDagComplementRequest self = new CreateDagComplementRequest();
        return TeaModel.build(map, self);
    }

    public CreateDagComplementRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public CreateDagComplementRequest setStartBizDate(String startBizDate) {
        this.startBizDate = startBizDate;
        return this;
    }
    public String getStartBizDate() {
        return this.startBizDate;
    }

    public CreateDagComplementRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDagComplementRequest setRootNodeId(Long rootNodeId) {
        this.rootNodeId = rootNodeId;
        return this;
    }
    public Long getRootNodeId() {
        return this.rootNodeId;
    }

    public CreateDagComplementRequest setIncludeNodeIds(String includeNodeIds) {
        this.includeNodeIds = includeNodeIds;
        return this;
    }
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    public CreateDagComplementRequest setExcludeNodeIds(String excludeNodeIds) {
        this.excludeNodeIds = excludeNodeIds;
        return this;
    }
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
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

    public CreateDagComplementRequest setParallelism(Boolean parallelism) {
        this.parallelism = parallelism;
        return this;
    }
    public Boolean getParallelism() {
        return this.parallelism;
    }

    public CreateDagComplementRequest setEndBizDate(String endBizDate) {
        this.endBizDate = endBizDate;
        return this;
    }
    public String getEndBizDate() {
        return this.endBizDate;
    }

    public CreateDagComplementRequest setNodeParams(String nodeParams) {
        this.nodeParams = nodeParams;
        return this;
    }
    public String getNodeParams() {
        return this.nodeParams;
    }

}
