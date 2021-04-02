// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectDetailResponse extends TeaModel {
    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetProjectDetailResponseData data;

    public static GetProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProjectDetailResponse self = new GetProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetProjectDetailResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProjectDetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetProjectDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectDetailResponse setData(GetProjectDetailResponseData data) {
        this.data = data;
        return this;
    }
    public GetProjectDetailResponseData getData() {
        return this.data;
    }

    public static class GetProjectDetailResponseData extends TeaModel {
        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("DefaultDiResourceGroupIdentifier")
        @Validation(required = true)
        public String defaultDiResourceGroupIdentifier;

        @NameInMap("IsAllowDownload")
        @Validation(required = true)
        public Integer isAllowDownload;

        @NameInMap("SchedulerRetryInterval")
        @Validation(required = true)
        public Integer schedulerRetryInterval;

        @NameInMap("ResidentArea")
        @Validation(required = true)
        public String residentArea;

        @NameInMap("ProjectOwnerBaseId")
        @Validation(required = true)
        public String projectOwnerBaseId;

        @NameInMap("ProjectMode")
        @Validation(required = true)
        public Integer projectMode;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("ProtectedMode")
        @Validation(required = true)
        public Integer protectedMode;

        @NameInMap("TenantId")
        @Validation(required = true)
        public Long tenantId;

        @NameInMap("ProjectDescription")
        @Validation(required = true)
        public String projectDescription;

        @NameInMap("SchedulerMaxRetryTimes")
        @Validation(required = true)
        public Integer schedulerMaxRetryTimes;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("ProjectIdentifier")
        @Validation(required = true)
        public String projectIdentifier;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Integer projectId;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("DevelopmentType")
        @Validation(required = true)
        public Integer developmentType;

        @NameInMap("EnvTypes")
        @Validation(required = true)
        public java.util.List<String> envTypes;

        public static GetProjectDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectDetailResponseData self = new GetProjectDetailResponseData();
            return TeaModel.build(map, self);
        }

        public GetProjectDetailResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetProjectDetailResponseData setDefaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
            this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
            return this;
        }
        public String getDefaultDiResourceGroupIdentifier() {
            return this.defaultDiResourceGroupIdentifier;
        }

        public GetProjectDetailResponseData setIsAllowDownload(Integer isAllowDownload) {
            this.isAllowDownload = isAllowDownload;
            return this;
        }
        public Integer getIsAllowDownload() {
            return this.isAllowDownload;
        }

        public GetProjectDetailResponseData setSchedulerRetryInterval(Integer schedulerRetryInterval) {
            this.schedulerRetryInterval = schedulerRetryInterval;
            return this;
        }
        public Integer getSchedulerRetryInterval() {
            return this.schedulerRetryInterval;
        }

        public GetProjectDetailResponseData setResidentArea(String residentArea) {
            this.residentArea = residentArea;
            return this;
        }
        public String getResidentArea() {
            return this.residentArea;
        }

        public GetProjectDetailResponseData setProjectOwnerBaseId(String projectOwnerBaseId) {
            this.projectOwnerBaseId = projectOwnerBaseId;
            return this;
        }
        public String getProjectOwnerBaseId() {
            return this.projectOwnerBaseId;
        }

        public GetProjectDetailResponseData setProjectMode(Integer projectMode) {
            this.projectMode = projectMode;
            return this;
        }
        public Integer getProjectMode() {
            return this.projectMode;
        }

        public GetProjectDetailResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetProjectDetailResponseData setProtectedMode(Integer protectedMode) {
            this.protectedMode = protectedMode;
            return this;
        }
        public Integer getProtectedMode() {
            return this.protectedMode;
        }

        public GetProjectDetailResponseData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetProjectDetailResponseData setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public GetProjectDetailResponseData setSchedulerMaxRetryTimes(Integer schedulerMaxRetryTimes) {
            this.schedulerMaxRetryTimes = schedulerMaxRetryTimes;
            return this;
        }
        public Integer getSchedulerMaxRetryTimes() {
            return this.schedulerMaxRetryTimes;
        }

        public GetProjectDetailResponseData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetProjectDetailResponseData setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public GetProjectDetailResponseData setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public GetProjectDetailResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetProjectDetailResponseData setDevelopmentType(Integer developmentType) {
            this.developmentType = developmentType;
            return this;
        }
        public Integer getDevelopmentType() {
            return this.developmentType;
        }

        public GetProjectDetailResponseData setEnvTypes(java.util.List<String> envTypes) {
            this.envTypes = envTypes;
            return this;
        }
        public java.util.List<String> getEnvTypes() {
            return this.envTypes;
        }

    }

}
