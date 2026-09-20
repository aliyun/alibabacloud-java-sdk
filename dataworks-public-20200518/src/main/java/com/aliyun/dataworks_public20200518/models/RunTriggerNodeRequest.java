// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunTriggerNodeRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace to which the trigger node belongs. You can call <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> to query the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("AppId")
    public Long appId;

    /**
     * <p>The timestamp of the business date for the trigger node instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1606200230105</p>
     */
    @NameInMap("BizDate")
    public Long bizDate;

    /**
     * <p>The 13-digit millisecond-level timestamp that specifies the scheduled time of the node task corresponding to the trigger node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1606200230105</p>
     */
    @NameInMap("CycleTime")
    public Long cycleTime;

    /**
     * <p>The ID of the trigger node. You can call <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> to obtain the node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000011</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    public static RunTriggerNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RunTriggerNodeRequest self = new RunTriggerNodeRequest();
        return TeaModel.build(map, self);
    }

    public RunTriggerNodeRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public RunTriggerNodeRequest setBizDate(Long bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public Long getBizDate() {
        return this.bizDate;
    }

    public RunTriggerNodeRequest setCycleTime(Long cycleTime) {
        this.cycleTime = cycleTime;
        return this;
    }
    public Long getCycleTime() {
        return this.cycleTime;
    }

    public RunTriggerNodeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

}
