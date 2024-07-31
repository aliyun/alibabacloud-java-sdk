// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateNodeRunModeRequest extends TeaModel {
    /**
     * <p>The node ID. You can call the <a href="https://help.aliyun.com/document_detail/173979.html">ListNodes</a> operation to query the node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("NodeId")
    public Long nodeId;

    /**
     * <p>The environment in which the node runs. Valid values: DEV and PROD. The value DEV indicates the development environment, and the value PROD indicates the production environment.</p>
     * <ul>
     * <li>PROD</li>
     * <li>DEV</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The operation that you want to perform on the node. Valid values:</p>
     * <ul>
     * <li>0: indicates that you want to unfreeze the node.</li>
     * <li>2: indicates that you want to freeze the node.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SchedulerType")
    public Integer schedulerType;

    public static UpdateNodeRunModeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeRunModeRequest self = new UpdateNodeRunModeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNodeRunModeRequest setNodeId(Long nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public Long getNodeId() {
        return this.nodeId;
    }

    public UpdateNodeRunModeRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public UpdateNodeRunModeRequest setSchedulerType(Integer schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public Integer getSchedulerType() {
        return this.schedulerType;
    }

}
