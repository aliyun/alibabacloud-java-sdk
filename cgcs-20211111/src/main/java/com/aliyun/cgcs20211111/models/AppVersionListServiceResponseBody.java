// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionListServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppVersionListServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AppVersionListServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppVersionListServiceResponseBody self = new AppVersionListServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AppVersionListServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppVersionListServiceResponseBody setData(AppVersionListServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppVersionListServiceResponseBodyData getData() {
        return this.data;
    }

    public AppVersionListServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppVersionListServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppVersionListServiceResponseBodyDataVersions extends TeaModel {
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

        public static AppVersionListServiceResponseBodyDataVersions build(java.util.Map<String, ?> map) throws Exception {
            AppVersionListServiceResponseBodyDataVersions self = new AppVersionListServiceResponseBodyDataVersions();
            return TeaModel.build(map, self);
        }

        public AppVersionListServiceResponseBodyDataVersions setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AppVersionListServiceResponseBodyDataVersions setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public AppVersionListServiceResponseBodyDataVersions setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public AppVersionListServiceResponseBodyDataVersions setAppVersionStatus(String appVersionStatus) {
            this.appVersionStatus = appVersionStatus;
            return this;
        }
        public String getAppVersionStatus() {
            return this.appVersionStatus;
        }

        public AppVersionListServiceResponseBodyDataVersions setAppVersionStatusMemo(String appVersionStatusMemo) {
            this.appVersionStatusMemo = appVersionStatusMemo;
            return this;
        }
        public String getAppVersionStatusMemo() {
            return this.appVersionStatusMemo;
        }

        public AppVersionListServiceResponseBodyDataVersions setConsumeCu(Double consumeCu) {
            this.consumeCu = consumeCu;
            return this;
        }
        public Double getConsumeCu() {
            return this.consumeCu;
        }

        public AppVersionListServiceResponseBodyDataVersions setFileAddress(String fileAddress) {
            this.fileAddress = fileAddress;
            return this;
        }
        public String getFileAddress() {
            return this.fileAddress;
        }

        public AppVersionListServiceResponseBodyDataVersions setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public AppVersionListServiceResponseBodyDataVersions setFileUploadFinishTime(String fileUploadFinishTime) {
            this.fileUploadFinishTime = fileUploadFinishTime;
            return this;
        }
        public String getFileUploadFinishTime() {
            return this.fileUploadFinishTime;
        }

        public AppVersionListServiceResponseBodyDataVersions setFileUploadType(String fileUploadType) {
            this.fileUploadType = fileUploadType;
            return this;
        }
        public String getFileUploadType() {
            return this.fileUploadType;
        }

        public AppVersionListServiceResponseBodyDataVersions setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AppVersionListServiceResponseBodyDataVersions setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public AppVersionListServiceResponseBodyDataVersions setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class AppVersionListServiceResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Long total;

        @NameInMap("Versions")
        public java.util.List<AppVersionListServiceResponseBodyDataVersions> versions;

        public static AppVersionListServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppVersionListServiceResponseBodyData self = new AppVersionListServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppVersionListServiceResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public AppVersionListServiceResponseBodyData setVersions(java.util.List<AppVersionListServiceResponseBodyDataVersions> versions) {
            this.versions = versions;
            return this;
        }
        public java.util.List<AppVersionListServiceResponseBodyDataVersions> getVersions() {
            return this.versions;
        }

    }

}
