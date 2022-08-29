// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetProjectStatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<GetProjectStatsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetProjectStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectStatsResponseBody self = new GetProjectStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectStatsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetProjectStatsResponseBody setData(java.util.List<GetProjectStatsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetProjectStatsResponseBodyData> getData() {
        return this.data;
    }

    public GetProjectStatsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProjectStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectStatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectStatsResponseBodyData extends TeaModel {
        @NameInMap("FailedCount")
        public Integer failedCount;

        @NameInMap("ProcessCount")
        public Integer processCount;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("SecCount")
        public Integer secCount;

        public static GetProjectStatsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectStatsResponseBodyData self = new GetProjectStatsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectStatsResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public GetProjectStatsResponseBodyData setProcessCount(Integer processCount) {
            this.processCount = processCount;
            return this;
        }
        public Integer getProcessCount() {
            return this.processCount;
        }

        public GetProjectStatsResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetProjectStatsResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetProjectStatsResponseBodyData setSecCount(Integer secCount) {
            this.secCount = secCount;
            return this;
        }
        public Integer getSecCount() {
            return this.secCount;
        }

    }

}
