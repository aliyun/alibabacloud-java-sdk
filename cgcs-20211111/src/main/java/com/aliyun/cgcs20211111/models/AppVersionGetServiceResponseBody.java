// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionGetServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AppVersionGetServiceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static AppVersionGetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AppVersionGetServiceResponseBody self = new AppVersionGetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public AppVersionGetServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AppVersionGetServiceResponseBody setData(AppVersionGetServiceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AppVersionGetServiceResponseBodyData getData() {
        return this.data;
    }

    public AppVersionGetServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AppVersionGetServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AppVersionGetServiceResponseBodyData extends TeaModel {
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

        @NameInMap("SourceVersionId")
        public String sourceVersionId;

        @NameInMap("TenantId")
        public Long tenantId;

        public static AppVersionGetServiceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AppVersionGetServiceResponseBodyData self = new AppVersionGetServiceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AppVersionGetServiceResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public AppVersionGetServiceResponseBodyData setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public AppVersionGetServiceResponseBodyData setAppVersionName(String appVersionName) {
            this.appVersionName = appVersionName;
            return this;
        }
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public AppVersionGetServiceResponseBodyData setAppVersionStatus(String appVersionStatus) {
            this.appVersionStatus = appVersionStatus;
            return this;
        }
        public String getAppVersionStatus() {
            return this.appVersionStatus;
        }

        public AppVersionGetServiceResponseBodyData setAppVersionStatusMemo(String appVersionStatusMemo) {
            this.appVersionStatusMemo = appVersionStatusMemo;
            return this;
        }
        public String getAppVersionStatusMemo() {
            return this.appVersionStatusMemo;
        }

        public AppVersionGetServiceResponseBodyData setConsumeCu(Double consumeCu) {
            this.consumeCu = consumeCu;
            return this;
        }
        public Double getConsumeCu() {
            return this.consumeCu;
        }

        public AppVersionGetServiceResponseBodyData setFileAddress(String fileAddress) {
            this.fileAddress = fileAddress;
            return this;
        }
        public String getFileAddress() {
            return this.fileAddress;
        }

        public AppVersionGetServiceResponseBodyData setFileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public Long getFileSize() {
            return this.fileSize;
        }

        public AppVersionGetServiceResponseBodyData setFileUploadFinishTime(String fileUploadFinishTime) {
            this.fileUploadFinishTime = fileUploadFinishTime;
            return this;
        }
        public String getFileUploadFinishTime() {
            return this.fileUploadFinishTime;
        }

        public AppVersionGetServiceResponseBodyData setFileUploadType(String fileUploadType) {
            this.fileUploadType = fileUploadType;
            return this;
        }
        public String getFileUploadType() {
            return this.fileUploadType;
        }

        public AppVersionGetServiceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AppVersionGetServiceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public AppVersionGetServiceResponseBodyData setSourceVersionId(String sourceVersionId) {
            this.sourceVersionId = sourceVersionId;
            return this;
        }
        public String getSourceVersionId() {
            return this.sourceVersionId;
        }

        public AppVersionGetServiceResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
