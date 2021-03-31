// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeParentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Data")
    public GetNodeParentsResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetNodeParentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNodeParentsResponseBody self = new GetNodeParentsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNodeParentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeParentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeParentsResponseBody setData(GetNodeParentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetNodeParentsResponseBodyData getData() {
        return this.data;
    }

    public GetNodeParentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeParentsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodeParentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNodeParentsResponseBodyDataNodes extends TeaModel {
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

        public static GetNodeParentsResponseBodyDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetNodeParentsResponseBodyDataNodes self = new GetNodeParentsResponseBodyDataNodes();
            return TeaModel.build(map, self);
        }

        public GetNodeParentsResponseBodyDataNodes setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public GetNodeParentsResponseBodyDataNodes setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

        public GetNodeParentsResponseBodyDataNodes setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public GetNodeParentsResponseBodyDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetNodeParentsResponseBodyDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetNodeParentsResponseBodyDataNodes setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public GetNodeParentsResponseBodyDataNodes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetNodeParentsResponseBodyDataNodes setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetNodeParentsResponseBodyDataNodes setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetNodeParentsResponseBodyDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

    public static class GetNodeParentsResponseBodyData extends TeaModel {
        @NameInMap("Nodes")
        public java.util.List<GetNodeParentsResponseBodyDataNodes> nodes;

        public static GetNodeParentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeParentsResponseBodyData self = new GetNodeParentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNodeParentsResponseBodyData setNodes(java.util.List<GetNodeParentsResponseBodyDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetNodeParentsResponseBodyDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
