// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineLogResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public java.util.List<GetPipelineLogResponseBodyObject> object;

    public static GetPipelineLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineLogResponseBody self = new GetPipelineLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPipelineLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineLogResponseBody setObject(java.util.List<GetPipelineLogResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<GetPipelineLogResponseBodyObject> getObject() {
        return this.object;
    }

    public static class GetPipelineLogResponseBodyObjectBuildProcessNodes extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("NodeIndex")
        public Integer nodeIndex;

        @NameInMap("NodeName")
        public String nodeName;

        public static GetPipelineLogResponseBodyObjectBuildProcessNodes build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineLogResponseBodyObjectBuildProcessNodes self = new GetPipelineLogResponseBodyObjectBuildProcessNodes();
            return TeaModel.build(map, self);
        }

        public GetPipelineLogResponseBodyObjectBuildProcessNodes setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineLogResponseBodyObjectBuildProcessNodes setNodeIndex(Integer nodeIndex) {
            this.nodeIndex = nodeIndex;
            return this;
        }
        public Integer getNodeIndex() {
            return this.nodeIndex;
        }

        public GetPipelineLogResponseBodyObjectBuildProcessNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

    }

    public static class GetPipelineLogResponseBodyObject extends TeaModel {
        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("BuildProcessNodes")
        public java.util.List<GetPipelineLogResponseBodyObjectBuildProcessNodes> buildProcessNodes;

        public static GetPipelineLogResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineLogResponseBodyObject self = new GetPipelineLogResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetPipelineLogResponseBodyObject setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public GetPipelineLogResponseBodyObject setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetPipelineLogResponseBodyObject setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetPipelineLogResponseBodyObject setBuildProcessNodes(java.util.List<GetPipelineLogResponseBodyObjectBuildProcessNodes> buildProcessNodes) {
            this.buildProcessNodes = buildProcessNodes;
            return this;
        }
        public java.util.List<GetPipelineLogResponseBodyObjectBuildProcessNodes> getBuildProcessNodes() {
            return this.buildProcessNodes;
        }

    }

}
