// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartLogstashRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20%</p>
     */
    @NameInMap("batchCount")
    public Double batchCount;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("blueGreenDep")
    public Boolean blueGreenDep;

    @NameInMap("nodeTypes")
    public java.util.List<String> nodeTypes;

    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("restartType")
    public String restartType;

    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("force")
    public Boolean force;

    public static RestartLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartLogstashRequest self = new RestartLogstashRequest();
        return TeaModel.build(map, self);
    }

    public RestartLogstashRequest setBatchCount(Double batchCount) {
        this.batchCount = batchCount;
        return this;
    }
    public Double getBatchCount() {
        return this.batchCount;
    }

    public RestartLogstashRequest setBlueGreenDep(Boolean blueGreenDep) {
        this.blueGreenDep = blueGreenDep;
        return this;
    }
    public Boolean getBlueGreenDep() {
        return this.blueGreenDep;
    }

    public RestartLogstashRequest setNodeTypes(java.util.List<String> nodeTypes) {
        this.nodeTypes = nodeTypes;
        return this;
    }
    public java.util.List<String> getNodeTypes() {
        return this.nodeTypes;
    }

    public RestartLogstashRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public RestartLogstashRequest setRestartType(String restartType) {
        this.restartType = restartType;
        return this;
    }
    public String getRestartType() {
        return this.restartType;
    }

    public RestartLogstashRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RestartLogstashRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

}
