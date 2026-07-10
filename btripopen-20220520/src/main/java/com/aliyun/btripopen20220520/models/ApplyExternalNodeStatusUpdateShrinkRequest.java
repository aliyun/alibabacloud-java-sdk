// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyExternalNodeStatusUpdateShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("node_id")
    public String nodeId;

    @NameInMap("operation_records")
    public String operationRecordsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("process_action_result")
    public String processActionResult;

    public static ApplyExternalNodeStatusUpdateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyExternalNodeStatusUpdateShrinkRequest self = new ApplyExternalNodeStatusUpdateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyExternalNodeStatusUpdateShrinkRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ApplyExternalNodeStatusUpdateShrinkRequest setOperationRecordsShrink(String operationRecordsShrink) {
        this.operationRecordsShrink = operationRecordsShrink;
        return this;
    }
    public String getOperationRecordsShrink() {
        return this.operationRecordsShrink;
    }

    public ApplyExternalNodeStatusUpdateShrinkRequest setProcessActionResult(String processActionResult) {
        this.processActionResult = processActionResult;
        return this;
    }
    public String getProcessActionResult() {
        return this.processActionResult;
    }

}
