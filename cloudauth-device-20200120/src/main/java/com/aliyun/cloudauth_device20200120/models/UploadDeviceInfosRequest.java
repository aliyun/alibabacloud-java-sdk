// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_device20200120.models;

import com.aliyun.tea.*;

public class UploadDeviceInfosRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Flag")
    public String flag;

    @NameInMap("UploadInfos")
    public String uploadInfos;

    public static UploadDeviceInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceInfosRequest self = new UploadDeviceInfosRequest();
        return TeaModel.build(map, self);
    }

    public UploadDeviceInfosRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UploadDeviceInfosRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UploadDeviceInfosRequest setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public UploadDeviceInfosRequest setUploadInfos(String uploadInfos) {
        this.uploadInfos = uploadInfos;
        return this;
    }
    public String getUploadInfos() {
        return this.uploadInfos;
    }

}
