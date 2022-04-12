// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppVersionCreateServiceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppVersionName")
    public String appVersionName;

    @NameInMap("FileAddress")
    public String fileAddress;

    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("FileUploadType")
    public String fileUploadType;

    @NameInMap("RequestApp")
    public String requestApp;

    public static AppVersionCreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        AppVersionCreateServiceRequest self = new AppVersionCreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public AppVersionCreateServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AppVersionCreateServiceRequest setAppVersionName(String appVersionName) {
        this.appVersionName = appVersionName;
        return this;
    }
    public String getAppVersionName() {
        return this.appVersionName;
    }

    public AppVersionCreateServiceRequest setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
        return this;
    }
    public String getFileAddress() {
        return this.fileAddress;
    }

    public AppVersionCreateServiceRequest setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public AppVersionCreateServiceRequest setFileUploadType(String fileUploadType) {
        this.fileUploadType = fileUploadType;
        return this;
    }
    public String getFileUploadType() {
        return this.fileUploadType;
    }

    public AppVersionCreateServiceRequest setRequestApp(String requestApp) {
        this.requestApp = requestApp;
        return this;
    }
    public String getRequestApp() {
        return this.requestApp;
    }

}
