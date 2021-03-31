// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeChildrenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public GetNodeChildrenResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetNodeChildrenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeChildrenResponseBody self = new GetNodeChildrenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeChildrenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeChildrenResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeChildrenResponseBody setData(GetNodeChildrenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNodeChildrenResponseBodyData getData() {
        return this.data;
    }

    public GetNodeChildrenResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeChildrenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodeChildrenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNodeChildrenResponseBodyDataNodes extends TeaModel {
        @NameInMap("SchedulerType")
        public String schedulerType;

        @NameInMap("BaselineId")
        public Long baselineId;

        @NameInMap("Repeatability")
        public Boolean repeatability;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProgramType")
        public String programType;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("CronExpress")
        public String cronExpress;

        @NameInMap("NodeId")
        public Long nodeId;

        public static GetNodeChildrenResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetNodeChildrenResponseBodyDataNodes self = new GetNodeChildrenResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetNodeChildrenResponseBodyDataNodes setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public GetNodeChildrenResponseBodyDataNodes setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetNodeChildrenResponseBodyDataNodes setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public GetNodeChildrenResponseBodyDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetNodeChildrenResponseBodyDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetNodeChildrenResponseBodyDataNodes setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public GetNodeChildrenResponseBodyDataNodes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetNodeChildrenResponseBodyDataNodes setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetNodeChildrenResponseBodyDataNodes setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetNodeChildrenResponseBodyDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

    public static class GetNodeChildrenResponseBodyData extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<GetNodeChildrenResponseBodyDataNodes> nodes;

        public static GetNodeChildrenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeChildrenResponseBodyData self = new GetNodeChildrenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNodeChildrenResponseBodyData setNodes(java.util.List<GetNodeChildrenResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetNodeChildrenResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
