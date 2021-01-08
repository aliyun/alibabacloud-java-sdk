// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceBuildNumberStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Object")
    public GetPipelineInstanceBuildNumberStatusResponseBodyObject object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetPipelineInstanceBuildNumberStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceBuildNumberStatusResponseBody self = new GetPipelineInstanceBuildNumberStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceBuildNumberStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineInstanceBuildNumberStatusResponseBody setObject(GetPipelineInstanceBuildNumberStatusResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetPipelineInstanceBuildNumberStatusResponseBodyObject getObject() {
        return this.object;
    }

    public GetPipelineInstanceBuildNumberStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineInstanceBuildNumberStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineInstanceBuildNumberStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStagesComponents extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("Name")
        public String name;

        public static GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStagesComponents build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStagesComponents self = new GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStagesComponents();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStagesComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStagesComponents setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStagesComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStages extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Components")
        public java.util.List<GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStagesComponents> components;

        public static GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStages build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStages self = new GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStages();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStages setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStages setComponents(java.util.List<GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStagesComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStagesComponents> getComponents() {
            return this.components;
        }

    }

    public static class GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroups extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Stages")
        public java.util.List<GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStages> stages;

        @NameInMap("Name")
        public String name;

        public static GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroups build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroups self = new GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroups();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroups setStages(java.util.List<GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroupsStages> getStages() {
            return this.stages;
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPipelineInstanceBuildNumberStatusResponseBodyObject extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Groups")
        public java.util.List<GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroups> groups;

        public static GetPipelineInstanceBuildNumberStatusResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstanceBuildNumberStatusResponseBodyObject self = new GetPipelineInstanceBuildNumberStatusResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstanceBuildNumberStatusResponseBodyObject setGroups(java.util.List<GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<GetPipelineInstanceBuildNumberStatusResponseBodyObjectGroups> getGroups() {
            return this.groups;
        }

    }

}
