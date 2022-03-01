// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryUserIdByLicenseKeyRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("LicenseKey")
    public String licenseKey;

    // 0 表示 只用了mse switch，1 表示 只用了mse sentinel，2表示用了mse switch跟mse sentinel
    @NameInMap("Mode")
    public String mode;

    @NameInMap("RegionId")
    public String regionId;

    public static QueryUserIdByLicenseKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryUserIdByLicenseKeyRequest self = new QueryUserIdByLicenseKeyRequest();
        return TeaModel.build(map, self);
    }

    public QueryUserIdByLicenseKeyRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public QueryUserIdByLicenseKeyRequest setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }
    public String getLicenseKey() {
        return this.licenseKey;
    }

    public QueryUserIdByLicenseKeyRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public QueryUserIdByLicenseKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
