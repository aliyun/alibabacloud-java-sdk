// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ListAppVersionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Versions")
    public java.util.List<ListAppVersionResponseBodyVersions> versions;

    public static ListAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppVersionResponseBody self = new ListAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppVersionResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListAppVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAppVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAppVersionResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ListAppVersionResponseBody setVersions(java.util.List<ListAppVersionResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ListAppVersionResponseBodyVersions> getVersions() {
        return this.versions;
    }

    public static class ListAppVersionResponseBodyVersions extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppVersionId")
        public String appVersionId;

        @NameInMap("AppVersionName")
        public String appVersionName;

        @NameInMap("AppVersionStatus")
        public String appVersionStatus;

        @NameInMap("AppVersionStatusMemo")
        public String appVersionStatusMemo;

        @NameInMap("ConsumeCu")
        public Double consumeCu;

        @NameInMap("FileAddress")
        public String fileAddress;

        @NameInMap("FileSize")
        public Long fileSize;

        @NameInMap("FileUploadFinishTime")
        public String fileUploadFinishTime;

        @NameInMap("FileUploadType")
        public String fileUploadType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("TenantId")
        public Long tenantId;

        public static ListAppVersionResponseBodyVersions build(java.util.Map<String, ?> map) throws Exception {
            ListAppVersionResponseBodyVersions self = new ListAppVersionResponseBodyVersions();
            return TeaModel.build(map, self);
        }

        public ListAppVersionResponseBodyVersions setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListAppVersionResponseBodyVersions setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public ListAppVersionResponseBodyVersions setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public ListAppVersionResponseBodyVersions setAppVersionStatus(String appVersionStatus) {
            this.appVersionStatus = appVersionStatus;
            return this;
        }
        public String getAppVersionStatus() {
            return this.appVersionStatus;
        }

        public ListAppVersionResponseBodyVersions setAppVersionStatusMemo(String appVersionStatusMemo) {
            this.appVersionStatusMemo = appVersionStatusMemo;
            return this;
        }
        public String getAppVersionStatusMemo() {
            return this.appVersionStatusMemo;
        }

        public ListAppVersionResponseBodyVersions setConsumeCu(Double consumeCu) {
            this.consumeCu = consumeCu;
            return this;
        }
        public Double getConsumeCu() {
            return this.consumeCu;
        }

        public ListAppVersionResponseBodyVersions setFileAddress(String fileAddress) {
            this.fileAddress = fileAddress;
            return this;
        }
        public String getFileAddress() {
            return this.fileAddress;
        }

        public ListAppVersionResponseBodyVersions setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public ListAppVersionResponseBodyVersions setFileUploadFinishTime(String fileUploadFinishTime) {
            this.fileUploadFinishTime = fileUploadFinishTime;
            return this;
        }
        public String getFileUploadFinishTime() {
            return this.fileUploadFinishTime;
        }

        public ListAppVersionResponseBodyVersions setFileUploadType(String fileUploadType) {
            this.fileUploadType = fileUploadType;
            return this;
        }
        public String getFileUploadType() {
            return this.fileUploadType;
        }

        public ListAppVersionResponseBodyVersions setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAppVersionResponseBodyVersions setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAppVersionResponseBodyVersions setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
