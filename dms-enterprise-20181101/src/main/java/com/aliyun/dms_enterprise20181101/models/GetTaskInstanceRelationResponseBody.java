// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskInstanceRelationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("NodeList")
    public GetTaskInstanceRelationResponseBodyNodeList nodeList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BusinessTime")
        public String businessTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ExecuteTime")
        public Long executeTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Message")
        public String message;

        @NameInMap("NodeId")
        public Long nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("NodeType")
        public Integer nodeType;

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
