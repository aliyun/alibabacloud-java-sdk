// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ApproveOperationRequest extends TeaModel {
    /**
     * <p>Node ID</p>
     * 
     * <strong>example:</strong>
     * <p>e01-cn-zvp2tgykr08</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>Operation Type</p>
     * 
     * <strong>example:</strong>
     * <p>RepairMachine</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    public static ApproveOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveOperationRequest self = new ApproveOperationRequest();
        return TeaModel.build(map, self);
    }

    public ApproveOperationRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ApproveOperationRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

}
