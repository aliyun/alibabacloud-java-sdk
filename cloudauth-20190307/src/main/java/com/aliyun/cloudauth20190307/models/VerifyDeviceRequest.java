// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VerifyDeviceRequest extends TeaModel {
    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("CertifyData")
    public String certifyData;

    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("DeviceToken")
    public String deviceToken;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("RegionId")
    public String regionId;

    public static VerifyDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDeviceRequest self = new VerifyDeviceRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDeviceRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public VerifyDeviceRequest setCertifyData(String certifyData) {
        this.certifyData = certifyData;
        return this;
    }
    public String getCertifyData() {
        return this.certifyData;
    }

    public VerifyDeviceRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public VerifyDeviceRequest setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
        return this;
    }
    public String getDeviceToken() {
        return this.deviceToken;
    }

    public VerifyDeviceRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public VerifyDeviceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
