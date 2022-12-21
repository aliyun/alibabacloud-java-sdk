// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskInstanceRelationResponseBody extends TeaModel {
    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned if the request fails.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The information about the nodes in the execution record of the task flow.
    @NameInMap("NodeList")
    public GetTaskInstanceRelationResponseBodyNodeList nodeList;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // *   **true**: The request is successful.
    // *   **false**: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static GetTaskInstanceRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInstanceRelationResponseBody self = new GetTaskInstanceRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskInstanceRelationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTaskInstanceRelationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTaskInstanceRelationResponseBody setNodeList(GetTaskInstanceRelationResponseBodyNodeList nodeList) {
        this.nodeList = nodeList;
        return this;
    }
    public GetTaskInstanceRelationResponseBodyNodeList getNodeList() {
        return this.nodeList;
    }

    public GetTaskInstanceRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskInstanceRelationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTaskInstanceRelationResponseBodyNodeListNode extends TeaModel {
        // The business time of the node.
        @NameInMap("BusinessTime")
        public String businessTime;

        // The time when the execution of the task flow was complete. The time is displayed in the yyyy-MM-DD HH:mm:ss format.
        @NameInMap("EndTime")
        public String endTime;

        // The amount of time consumed for running the node. Unit: milliseconds.
        @NameInMap("ExecuteTime")
        public Long executeTime;

        // The ID of the execution record of the task flow.
        @NameInMap("Id")
        public Long id;

        // The description of the task.
        @NameInMap("Message")
        public String message;

        // The ID of the node.
        @NameInMap("NodeId")
        public Long nodeId;

        // The name of the node.
        @NameInMap("NodeName")
        public String nodeName;

        // The type of the node. For more information about the valid values for this parameter, see [NodeType parameter](~~424705~~).
        @NameInMap("NodeType")
        public Integer nodeType;

        // The status of the node. Valid values:
        // 
        // *   **0**: The node is waiting to be scheduled.
        // *   **1**: The node is running.
        // *   **2**: The node is suspended.
        // *   **3**: The node failed to run.
        // *   **4**: The node is run.
        // *   **5**: The node is complete.
        @NameInMap("Status")
        public Integer status;

        public static GetTaskInstanceRelationResponseBodyNodeListNode build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceRelationResponseBodyNodeListNode self = new GetTaskInstanceRelationResponseBodyNodeListNode();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceRelationResponseBodyNodeListNode setBusinessTime(String businessTime) {
            this.businessTime = businessTime;
            return this;
        }
        public String getBusinessTime() {
            return this.businessTime;
        }

        public GetTaskInstanceRelationResponseBodyNodeListNode setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetTaskInstanceRelationResponseBodyNodeListNode setExecuteTime(Long executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public Long getExecuteTime() {
            return this.executeTime;
        }

        public GetTaskInstanceRelationResponseBodyNodeListNode setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTaskInstanceRelationResponseBodyNodeListNode setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetTaskInstanceRelationResponseBodyNodeListNode setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetTaskInstanceRelationResponseBodyNodeListNode setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetTaskInstanceRelationResponseBodyNodeListNode setNodeType(Integer nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public Integer getNodeType() {
            return this.nodeType;
        }

        public GetTaskInstanceRelationResponseBodyNodeListNode setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetTaskInstanceRelationResponseBodyNodeList extends TeaModel {
        @NameInMap("Node")
        public java.util.List<GetTaskInstanceRelationResponseBodyNodeListNode> node;

        public static GetTaskInstanceRelationResponseBodyNodeList build(java.util.Map<String, ?> map) throws Exception {
            GetTaskInstanceRelationResponseBodyNodeList self = new GetTaskInstanceRelationResponseBodyNodeList();
            return TeaModel.build(map, self);
        }

        public GetTaskInstanceRelationResponseBodyNodeList setNode(java.util.List<GetTaskInstanceRelationResponseBodyNodeListNode> node) {
            this.node = node;
            return this;
        }
        public java.util.List<GetTaskInstanceRelationResponseBodyNodeListNode> getNode() {
            return this.node;
        }

    }

}
