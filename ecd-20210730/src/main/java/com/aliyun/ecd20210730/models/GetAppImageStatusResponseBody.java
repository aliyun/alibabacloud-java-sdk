// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppImageStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetAppImageStatusResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetAppImageStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppImageStatusResponseBody self = new GetAppImageStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppImageStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppImageStatusResponseBody setData(java.util.List<GetAppImageStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAppImageStatusResponseBodyData> getData() {
        return this.data;
    }

    public GetAppImageStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAppImageStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppImageStatusResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetAppImageStatusResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAppImageStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppImageStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAppImageStatusResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetAppImageStatusResponseBodyData extends TeaModel {
        @NameInMap("AppImage")
        public String appImage;

        @NameInMap("Eds_agent_version")
        public String edsAgentVersion;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Region")
        public String region;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SysImage")
        public String sysImage;

        public static GetAppImageStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppImageStatusResponseBodyData self = new GetAppImageStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppImageStatusResponseBodyData setAppImage(String appImage) {
            this.appImage = appImage;
            return this;
        }
        public String getAppImage() {
            return this.appImage;
        }

        public GetAppImageStatusResponseBodyData setEdsAgentVersion(String edsAgentVersion) {
            this.edsAgentVersion = edsAgentVersion;
            return this;
        }
        public String getEdsAgentVersion() {
            return this.edsAgentVersion;
        }

        public GetAppImageStatusResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetAppImageStatusResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAppImageStatusResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAppImageStatusResponseBodyData setSysImage(String sysImage) {
            this.sysImage = sysImage;
            return this;
        }
        public String getSysImage() {
            return this.sysImage;
        }

    }

}
