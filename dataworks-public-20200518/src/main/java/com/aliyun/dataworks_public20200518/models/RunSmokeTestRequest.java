// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunSmokeTestRequest extends TeaModel {
    @NameInMap("Bizdate")
    public String bizdate;

    @NameInMap("Name")
    public String name;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("NodeParams")
    public String nodeParams;

    @NameInMap("ProjectEnv")
    public String projectEnv;

    public static RunSmokeTestRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSmokeTestRequest self = new RunSmokeTestRequest();
        return TeaModel.build(map, self);
    }

    public RunSmokeTestRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public RunSmokeTestRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RunSmokeTestRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public RunSmokeTestRequest setNodeParams(String nodeParams) {
        this.nodeParams = nodeParams;
        return this;
    }
    public String getNodeParams() {
        return this.nodeParams;
    }

    public RunSmokeTestRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

}
