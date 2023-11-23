// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_device20200120.models;

import com.aliyun.tea.*;

public class UploadDeviceInfoRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("Flag")
    public String flag;

    @NameInMap("UploadInfos")
    public java.util.List<String> uploadInfos;

    public static UploadDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceInfoRequest self = new UploadDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public UploadDeviceInfoRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public UploadDeviceInfoRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UploadDeviceInfoRequest setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public UploadDeviceInfoRequest setUploadInfos(java.util.List<String> uploadInfos) {
        this.uploadInfos = uploadInfos;
        return this;
    }
    public java.util.List<String> getUploadInfos() {
        return this.uploadInfos;
    }

}
