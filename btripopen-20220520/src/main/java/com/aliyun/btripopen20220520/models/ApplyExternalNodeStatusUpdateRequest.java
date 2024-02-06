// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyExternalNodeStatusUpdateRequest extends TeaModel {
    @NameInMap("node_id")
    public String nodeId;

    @NameInMap("operation_records")
    public java.util.List<ApplyExternalNodeStatusUpdateRequestOperationRecords> operationRecords;

    @NameInMap("process_action_result")
    public String processActionResult;

    public static ApplyExternalNodeStatusUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyExternalNodeStatusUpdateRequest self = new ApplyExternalNodeStatusUpdateRequest();
        return TeaModel.build(map, self);
    }

    public ApplyExternalNodeStatusUpdateRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public ApplyExternalNodeStatusUpdateRequest setOperationRecords(java.util.List<ApplyExternalNodeStatusUpdateRequestOperationRecords> operationRecords) {
        this.operationRecords = operationRecords;
        return this;
    }
    public java.util.List<ApplyExternalNodeStatusUpdateRequestOperationRecords> getOperationRecords() {
        return this.operationRecords;
    }

    public ApplyExternalNodeStatusUpdateRequest setProcessActionResult(String processActionResult) {
        this.processActionResult = processActionResult;
        return this;
    }
    public String getProcessActionResult() {
        return this.processActionResult;
    }

    public static class ApplyExternalNodeStatusUpdateRequestOperationRecords extends TeaModel {
        @NameInMap("comment")
        public String comment;

        @NameInMap("operate_time")
        public String operateTime;

        @NameInMap("operator_name")
        public String operatorName;

        @NameInMap("result")
        public String result;

        @NameInMap("type")
        public String type;

        public static ApplyExternalNodeStatusUpdateRequestOperationRecords build(java.util.Map<String, ?> map) throws Exception {
            ApplyExternalNodeStatusUpdateRequestOperationRecords self = new ApplyExternalNodeStatusUpdateRequestOperationRecords();
            return TeaModel.build(map, self);
        }

        public ApplyExternalNodeStatusUpdateRequestOperationRecords setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ApplyExternalNodeStatusUpdateRequestOperationRecords setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public ApplyExternalNodeStatusUpdateRequestOperationRecords setOperatorName(String operatorName) {
            this.operatorName = operatorName;
            return this;
        }
        public String getOperatorName() {
            return this.operatorName;
        }

        public ApplyExternalNodeStatusUpdateRequestOperationRecords setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ApplyExternalNodeStatusUpdateRequestOperationRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
