// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTaskInstanceRelationResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The information about the nodes in the execution record of the task flow.</p>
     */
    @NameInMap("NodeList")
    public GetTaskInstanceRelationResponseBodyNodeList nodeList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>028BF827-3801-5869-8548-F4A039256304</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The business time of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-09 14:37:26</p>
         */
        @NameInMap("BusinessTime")
        public String businessTime;

        /**
         * <p>The time when the execution of the task flow was complete. The time is displayed in the yyyy-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-11-11 14:38:57</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The amount of time consumed for running the node. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>170655</p>
         */
        @NameInMap("ExecuteTime")
        public Long executeTime;

        /**
         * <p>The ID of the execution record of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>14059</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The description of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>14059</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Spark SQL-1</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <p>The type of the node. For more information about the valid values for this parameter, see <a href="https://help.aliyun.com/document_detail/424705.html">NodeType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        @NameInMap("NodeType")
        public Integer nodeType;

        /**
         * <p>The status of the node. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The node is waiting to be scheduled.</li>
         * <li><strong>1</strong>: The node is running.</li>
         * <li><strong>2</strong>: The node is suspended.</li>
         * <li><strong>3</strong>: The node failed to run.</li>
         * <li><strong>4</strong>: The node is run.</li>
         * <li><strong>5</strong>: The node is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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
