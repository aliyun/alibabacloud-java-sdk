// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetNodeChildrenResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetNodeChildrenResponseData data;

    public static GetNodeChildrenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeChildrenResponse self = new GetNodeChildrenResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeChildrenResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetNodeChildrenResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetNodeChildrenResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNodeChildrenResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetNodeChildrenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNodeChildrenResponse setData(GetNodeChildrenResponseData data) {
        this.data = data;
        return this;
    }
    public GetNodeChildrenResponseData getData() {
        return this.data;
    }

    public static class GetNodeChildrenResponseDataNodes extends TeaModel {
        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        @NameInMap("NodeName")
        @Validation(required = true)
        public String nodeName;

        @NameInMap("CronExpress")
        @Validation(required = true)
        public String cronExpress;

        @NameInMap("SchedulerType")
        @Validation(required = true)
        public String schedulerType;

        @NameInMap("ProgramType")
        @Validation(required = true)
        public String programType;

        @NameInMap("OwnerId")
        @Validation(required = true)
        public String ownerId;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("Repeatability")
        @Validation(required = true)
        public Boolean repeatability;

        @NameInMap("Priority")
        @Validation(required = true)
        public Integer priority;

        @NameInMap("BaselineId")
        @Validation(required = true)
        public Long baselineId;

        public static GetNodeChildrenResponseDataNodes build(java.util.Map<String, ?> map) throws Exception {
            GetNodeChildrenResponseDataNodes self = new GetNodeChildrenResponseDataNodes();
            return TeaModel.build(map, self);
        }

        public GetNodeChildrenResponseDataNodes setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public GetNodeChildrenResponseDataNodes setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public GetNodeChildrenResponseDataNodes setCronExpress(String cronExpress) {
            this.cronExpress = cronExpress;
            return this;
        }
        public String getCronExpress() {
            return this.cronExpress;
        }

        public GetNodeChildrenResponseDataNodes setSchedulerType(String schedulerType) {
            this.schedulerType = schedulerType;
            return this;
        }
        public String getSchedulerType() {
            return this.schedulerType;
        }

        public GetNodeChildrenResponseDataNodes setProgramType(String programType) {
            this.programType = programType;
            return this;
        }
        public String getProgramType() {
            return this.programType;
        }

        public GetNodeChildrenResponseDataNodes setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetNodeChildrenResponseDataNodes setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetNodeChildrenResponseDataNodes setRepeatability(Boolean repeatability) {
            this.repeatability = repeatability;
            return this;
        }
        public Boolean getRepeatability() {
            return this.repeatability;
        }

        public GetNodeChildrenResponseDataNodes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetNodeChildrenResponseDataNodes setBaselineId(Long baselineId) {
            this.baselineId = baselineId;
            return this;
        }
        public Long getBaselineId() {
            return this.baselineId;
        }

    }

    public static class GetNodeChildrenResponseData extends TeaModel {
        @NameInMap("Nodes")
        @Validation(required = true)
        public java.util.List<GetNodeChildrenResponseDataNodes> nodes;

        public static GetNodeChildrenResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetNodeChildrenResponseData self = new GetNodeChildrenResponseData();
            return TeaModel.build(map, self);
        }

        public GetNodeChildrenResponseData setNodes(java.util.List<GetNodeChildrenResponseDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<GetNodeChildrenResponseDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
