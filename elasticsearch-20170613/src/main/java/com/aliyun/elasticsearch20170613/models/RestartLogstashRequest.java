// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class RestartLogstashRequest extends TeaModel {
    /**
     * <p>The concurrency for force restart. This parameter does not need to be set during a blue-green restart because force restart is not supported in that scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>20%</p>
     */
    @NameInMap("batchCount")
    public Double batchCount;

    /**
     * <p>Specifies whether to perform a blue-green restart. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("blueGreenDep")
    public Boolean blueGreenDep;

    /**
     * <p>The type of role node to restart. This parameter is not supported.</p>
     */
    @NameInMap("nodeTypes")
    public java.util.List<String> nodeTypes;

    /**
     * <p>The node information selected when restarting nodes.</p>
     */
    @NameInMap("nodes")
    public java.util.List<String> nodes;

    /**
     * <p>The restart type. Valid values:</p>
     * <ul>
     * <li>instance: restart the instance</li>
     * <li>nodeIp: restart a node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("restartType")
    public String restartType;

    /**
     * <p>A client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to force restart the instance. Valid values:</p>
     * <ul>
     * <li>true: force restart</li>
     * <li>false (default): do not force restart.</li>
     * </ul>
     * 
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
