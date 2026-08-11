// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetAiAppNodeDetailRequest extends TeaModel {
    /**
     * <p>The application ID. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>id-xxx</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The end time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-02 16:08:38</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The node ID. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>node-xxx</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The node name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("NodeName")
    public String nodeName;

    /**
     * <p>The node type. This parameter is required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TOOL</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01 16:08:38</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetAiAppNodeDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiAppNodeDetailRequest self = new GetAiAppNodeDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetAiAppNodeDetailRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAiAppNodeDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetAiAppNodeDetailRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetAiAppNodeDetailRequest setNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }
    public String getNodeName() {
        return this.nodeName;
    }

    public GetAiAppNodeDetailRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public GetAiAppNodeDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAiAppNodeDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
