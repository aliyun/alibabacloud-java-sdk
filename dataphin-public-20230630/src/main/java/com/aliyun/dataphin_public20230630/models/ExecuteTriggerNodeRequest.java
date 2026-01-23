// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteTriggerNodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-06-01</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    /**
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Index")
    public Integer index;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>n_12345678</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10110201</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static ExecuteTriggerNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTriggerNodeRequest self = new ExecuteTriggerNodeRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteTriggerNodeRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public ExecuteTriggerNodeRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ExecuteTriggerNodeRequest setIndex(Integer index) {
        this.index = index;
        return this;
    }
    public Integer getIndex() {
        return this.index;
    }

    public ExecuteTriggerNodeRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ExecuteTriggerNodeRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ExecuteTriggerNodeRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
