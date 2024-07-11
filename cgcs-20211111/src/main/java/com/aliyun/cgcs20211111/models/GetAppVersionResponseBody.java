// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4384****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>1432****</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    /**
     * <strong>example:</strong>
     * <p>exampleVersion</p>
     */
    @NameInMap("AppVersionName")
    public String appVersionName;

    /**
     * <strong>example:</strong>
     * <p>file_uploading</p>
     */
    @NameInMap("AppVersionStatus")
    public String appVersionStatus;

    @NameInMap("AppVersionStatusMemo")
    public String appVersionStatusMemo;

    /**
     * <strong>example:</strong>
     * <p>0.31</p>
     */
    @NameInMap("ConsumeCu")
    public Double consumeCu;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.example.com/exampleFile.tar">https://www.example.com/exampleFile.tar</a></p>
     */
    @NameInMap("FileAddress")
    public String fileAddress;

    /**
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("FileSize")
    public Long fileSize;

    /**
     * <strong>example:</strong>
     * <p>2022-04-06 02:00:00</p>
     */
    @NameInMap("FileUploadFinishTime")
    public String fileUploadFinishTime;

    /**
     * <strong>example:</strong>
     * <p>local_file_upload</p>
     */
    @NameInMap("FileUploadType")
    public String fileUploadType;

    /**
     * <strong>example:</strong>
     * <p>2022-04-06 02:00:00</p>
     */
    @NameInMap("GmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2022-04-06 02:00:00</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>46329898-489C-4E63-9BA1-C1DA5C5D0986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public GetAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
