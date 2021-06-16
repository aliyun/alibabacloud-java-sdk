// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipleineLatestInstanceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public GetPipleineLatestInstanceStatusResponseBodyObject object;

    public static GetPipleineLatestInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipleineLatestInstanceStatusResponseBody self = new GetPipleineLatestInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipleineLatestInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipleineLatestInstanceStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipleineLatestInstanceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPipleineLatestInstanceStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipleineLatestInstanceStatusResponseBody setObject(GetPipleineLatestInstanceStatusResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetPipleineLatestInstanceStatusResponseBodyObject getObject() {
        return this.object;
    }

    public static class GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStagesComponents extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Name")
        public String name;

        @NameInMap("JobId")
        public Long jobId;

        public static GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStagesComponents build(java.util.Map<String, ?> map) throws Exception {
            GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStagesComponents self = new GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStagesComponents();
            return TeaModel.build(map, self);
        }

        public GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStagesComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStagesComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStagesComponents setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

    }

    public static class GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStages extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Components")
        public java.util.List<GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStagesComponents> components;

        public static GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStages build(java.util.Map<String, ?> map) throws Exception {
            GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStages self = new GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStages();
            return TeaModel.build(map, self);
        }

        public GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStages setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStages setComponents(java.util.List<GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStagesComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStagesComponents> getComponents() {
            return this.components;
        }

    }

    public static class GetPipleineLatestInstanceStatusResponseBodyObjectGroups extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Name")
        public String name;

        @NameInMap("Stages")
        public java.util.List<GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStages> stages;

        public static GetPipleineLatestInstanceStatusResponseBodyObjectGroups build(java.util.Map<String, ?> map) throws Exception {
            GetPipleineLatestInstanceStatusResponseBodyObjectGroups self = new GetPipleineLatestInstanceStatusResponseBodyObjectGroups();
            return TeaModel.build(map, self);
        }

        public GetPipleineLatestInstanceStatusResponseBodyObjectGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipleineLatestInstanceStatusResponseBodyObjectGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPipleineLatestInstanceStatusResponseBodyObjectGroups setStages(java.util.List<GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStages> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<GetPipleineLatestInstanceStatusResponseBodyObjectGroupsStages> getStages() {
            return this.stages;
        }

    }

    public static class GetPipleineLatestInstanceStatusResponseBodyObject extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Groups")
        public java.util.List<GetPipleineLatestInstanceStatusResponseBodyObjectGroups> groups;

        public static GetPipleineLatestInstanceStatusResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetPipleineLatestInstanceStatusResponseBodyObject self = new GetPipleineLatestInstanceStatusResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetPipleineLatestInstanceStatusResponseBodyObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipleineLatestInstanceStatusResponseBodyObject setGroups(java.util.List<GetPipleineLatestInstanceStatusResponseBodyObjectGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<GetPipleineLatestInstanceStatusResponseBodyObjectGroups> getGroups() {
            return this.groups;
        }

    }

}
