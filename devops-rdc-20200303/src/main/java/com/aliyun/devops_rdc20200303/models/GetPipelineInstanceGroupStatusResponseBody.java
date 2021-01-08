// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceGroupStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Object")
    public GetPipelineInstanceGroupStatusResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetPipelineInstanceGroupStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceGroupStatusResponseBody self = new GetPipelineInstanceGroupStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceGroupStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineInstanceGroupStatusResponseBody setObject(GetPipelineInstanceGroupStatusResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetPipelineInstanceGroupStatusResponseBodyObject getObject() {
        return this.object;
    }

    public GetPipelineInstanceGroupStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineInstanceGroupStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineInstanceGroupStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStagesComponents extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Name")
        public String name;

        public static GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStagesComponents build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStagesComponents self = new GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStagesComponents();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStagesComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStagesComponents setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStagesComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStages extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Components")
        public java.util.List<GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStagesComponents> components;

        public static GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStages build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStages self = new GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStages();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStages setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStages setComponents(java.util.List<GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStagesComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStagesComponents> getComponents() {
            return this.components;
        }

    }

    public static class GetPipelineInstanceGroupStatusResponseBodyObjectGroups extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Stages")
        public java.util.List<GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStages> stages;

        @NameInMap("Name")
        public String name;

        public static GetPipelineInstanceGroupStatusResponseBodyObjectGroups build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstanceGroupStatusResponseBodyObjectGroups self = new GetPipelineInstanceGroupStatusResponseBodyObjectGroups();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstanceGroupStatusResponseBodyObjectGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstanceGroupStatusResponseBodyObjectGroups setStages(java.util.List<GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<GetPipelineInstanceGroupStatusResponseBodyObjectGroupsStages> getStages() {
            return this.stages;
        }

        public GetPipelineInstanceGroupStatusResponseBodyObjectGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPipelineInstanceGroupStatusResponseBodyObject extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Groups")
        public java.util.List<GetPipelineInstanceGroupStatusResponseBodyObjectGroups> groups;

        public static GetPipelineInstanceGroupStatusResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstanceGroupStatusResponseBodyObject self = new GetPipelineInstanceGroupStatusResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstanceGroupStatusResponseBodyObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstanceGroupStatusResponseBodyObject setGroups(java.util.List<GetPipelineInstanceGroupStatusResponseBodyObjectGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<GetPipelineInstanceGroupStatusResponseBodyObjectGroups> getGroups() {
            return this.groups;
        }

    }

}
