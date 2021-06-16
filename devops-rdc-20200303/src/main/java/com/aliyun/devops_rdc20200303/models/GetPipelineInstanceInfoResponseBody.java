// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceInfoResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public GetPipelineInstanceInfoResponseBodyObject object;

    public static GetPipelineInstanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceInfoResponseBody self = new GetPipelineInstanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineInstanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineInstanceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPipelineInstanceInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineInstanceInfoResponseBody setObject(GetPipelineInstanceInfoResponseBodyObject object) {
        this.object = object;
        return this;
    }
    public GetPipelineInstanceInfoResponseBodyObject getObject() {
        return this.object;
    }

    public static class GetPipelineInstanceInfoResponseBodyObject extends TeaModel {
        @NameInMap("EmployeeId")
        public String employeeId;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Sources")
        public String sources;

        @NameInMap("DockerImages")
        public java.util.List<String> dockerImages;

        @NameInMap("PackageDownloadUrls")
        public java.util.List<String> packageDownloadUrls;

        public static GetPipelineInstanceInfoResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetPipelineInstanceInfoResponseBodyObject self = new GetPipelineInstanceInfoResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetPipelineInstanceInfoResponseBodyObject setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        public String getEmployeeId() {
            return this.employeeId;
        }

        public GetPipelineInstanceInfoResponseBodyObject setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetPipelineInstanceInfoResponseBodyObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPipelineInstanceInfoResponseBodyObject setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetPipelineInstanceInfoResponseBodyObject setSources(String sources) {
            this.sources = sources;
            return this;
        }
        public String getSources() {
            return this.sources;
        }

        public GetPipelineInstanceInfoResponseBodyObject setDockerImages(java.util.List<String> dockerImages) {
            this.dockerImages = dockerImages;
            return this;
        }
        public java.util.List<String> getDockerImages() {
            return this.dockerImages;
        }

        public GetPipelineInstanceInfoResponseBodyObject setPackageDownloadUrls(java.util.List<String> packageDownloadUrls) {
            this.packageDownloadUrls = packageDownloadUrls;
            return this;
        }
        public java.util.List<String> getPackageDownloadUrls() {
            return this.packageDownloadUrls;
        }

    }

}
