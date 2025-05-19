// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeStatusListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>InstanceIds is mandatory for this action.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("NodeStatusList")
    public NodeStatusListResponseBodyNodeStatusList nodeStatusList;

    /**
     * <strong>example:</strong>
     * <p>1BB8FE8E-9BBE-490F-82EC-BF70FB849D55</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static NodeStatusListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NodeStatusListResponseBody self = new NodeStatusListResponseBody();
        return TeaModel.build(map, self);
    }

    public NodeStatusListResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public NodeStatusListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public NodeStatusListResponseBody setNodeStatusList(NodeStatusListResponseBodyNodeStatusList nodeStatusList) {
        this.nodeStatusList = nodeStatusList;
        return this;
    }
    public NodeStatusListResponseBodyNodeStatusList getNodeStatusList() {
        return this.nodeStatusList;
    }

    public NodeStatusListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NodeStatusListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class NodeStatusListResponseBodyNodeStatusListNodeStatus extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoInstall")
        public Boolean autoInstall;

        /**
         * <strong>example:</strong>
         * <p>i-abcdefgh123456</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        public static NodeStatusListResponseBodyNodeStatusListNodeStatus build(java.util.Map<String, ?> map) throws Exception {
            NodeStatusListResponseBodyNodeStatusListNodeStatus self = new NodeStatusListResponseBodyNodeStatusListNodeStatus();
            return TeaModel.build(map, self);
        }

        public NodeStatusListResponseBodyNodeStatusListNodeStatus setAutoInstall(Boolean autoInstall) {
            this.autoInstall = autoInstall;
            return this;
        }
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        public NodeStatusListResponseBodyNodeStatusListNodeStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public NodeStatusListResponseBodyNodeStatusListNodeStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class NodeStatusListResponseBodyNodeStatusList extends TeaModel {
        @NameInMap("NodeStatus")
        public java.util.List<NodeStatusListResponseBodyNodeStatusListNodeStatus> nodeStatus;

        public static NodeStatusListResponseBodyNodeStatusList build(java.util.Map<String, ?> map) throws Exception {
            NodeStatusListResponseBodyNodeStatusList self = new NodeStatusListResponseBodyNodeStatusList();
            return TeaModel.build(map, self);
        }

        public NodeStatusListResponseBodyNodeStatusList setNodeStatus(java.util.List<NodeStatusListResponseBodyNodeStatusListNodeStatus> nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }
        public java.util.List<NodeStatusListResponseBodyNodeStatusListNodeStatus> getNodeStatus() {
            return this.nodeStatus;
        }

    }

}
