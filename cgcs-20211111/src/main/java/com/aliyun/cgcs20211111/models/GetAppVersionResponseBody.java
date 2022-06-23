// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppVersionResponseBody extends TeaModel {
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

    @NameInMap("Code")
    public String code;

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

    @NameInMap("HttpCode")
    public Integer httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppVersionResponseBody self = new GetAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppVersionResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppVersionResponseBody setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public GetAppVersionResponseBody setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }
    public String getAppVersionName() {
        return this.appVersionName;
    }

    public GetAppVersionResponseBody setAppVersionStatus(String appVersionStatus) {
        this.appVersionStatus = appVersionStatus;
        return this;
    }
    public String getAppVersionStatus() {
        return this.appVersionStatus;
    }

    public GetAppVersionResponseBody setAppVersionStatusMemo(String appVersionStatusMemo) {
        this.appVersionStatusMemo = appVersionStatusMemo;
        return this;
    }
    public String getAppVersionStatusMemo() {
        return this.appVersionStatusMemo;
    }

    public GetAppVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppVersionResponseBody setConsumeCu(Double consumeCu) {
        this.consumeCu = consumeCu;
        return this;
    }
    public Double getConsumeCu() {
        return this.consumeCu;
    }

    public GetAppVersionResponseBody setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
        return this;
    }
    public String getFileAddress() {
        return this.fileAddress;
    }

    public GetAppVersionResponseBody setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public GetAppVersionResponseBody setFileUploadFinishTime(String fileUploadFinishTime) {
        this.fileUploadFinishTime = fileUploadFinishTime;
        return this;
    }
    public String getFileUploadFinishTime() {
        return this.fileUploadFinishTime;
    }

    public GetAppVersionResponseBody setFileUploadType(String fileUploadType) {
        this.fileUploadType = fileUploadType;
        return this;
    }
    public String getFileUploadType() {
        return this.fileUploadType;
    }

    public GetAppVersionResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetAppVersionResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetAppVersionResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetAppVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
