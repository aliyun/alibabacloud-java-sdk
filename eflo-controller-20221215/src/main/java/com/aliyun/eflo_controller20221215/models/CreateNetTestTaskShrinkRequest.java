// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateNetTestTaskShrinkRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i119982311660892626523</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The cluster name.</p>
     * 
     * <strong>example:</strong>
     * <p>Eflo-YJ-Test-Cluster</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>Specify when NetTestType is CommTest.</p>
     */
    @NameInMap("CommTest")
    public String commTestShrink;

    /**
     * <p>Specify when NetTestType is DelayTest.</p>
     */
    @NameInMap("DelayTest")
    public String delayTestShrink;

    /**
     * <p>The type of the network test. Valid values: DelayTest, TrafficTest, and CommTest.</p>
     * 
     * <strong>example:</strong>
     * <p>DelayTest</p>
     */
    @NameInMap("NetTestType")
    public String netTestType;

    /**
     * <p>The network mode.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NetworkMode")
    public String networkMode;

    /**
     * <p>The port number.</p>
     * 
     * <strong>example:</strong>
     * <p>23604</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>If the TrafficModel is Fullmesh, leave this parameter empty.</p>
     */
    @NameInMap("TrafficTest")
    public String trafficTestShrink;

    public static CreateNetTestTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetTestTaskShrinkRequest self = new CreateNetTestTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetTestTaskShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateNetTestTaskShrinkRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateNetTestTaskShrinkRequest setCommTestShrink(String commTestShrink) {
        this.commTestShrink = commTestShrink;
        return this;
    }
    public String getCommTestShrink() {
        return this.commTestShrink;
    }

    public CreateNetTestTaskShrinkRequest setDelayTestShrink(String delayTestShrink) {
        this.delayTestShrink = delayTestShrink;
        return this;
    }
    public String getDelayTestShrink() {
        return this.delayTestShrink;
    }

    public CreateNetTestTaskShrinkRequest setNetTestType(String netTestType) {
        this.netTestType = netTestType;
        return this;
    }
    public String getNetTestType() {
        return this.netTestType;
    }

    public CreateNetTestTaskShrinkRequest setNetworkMode(String networkMode) {
        this.networkMode = networkMode;
        return this;
    }
    public String getNetworkMode() {
        return this.networkMode;
    }

    public CreateNetTestTaskShrinkRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateNetTestTaskShrinkRequest setTrafficTestShrink(String trafficTestShrink) {
        this.trafficTestShrink = trafficTestShrink;
        return this;
    }
    public String getTrafficTestShrink() {
        return this.trafficTestShrink;
    }

}
