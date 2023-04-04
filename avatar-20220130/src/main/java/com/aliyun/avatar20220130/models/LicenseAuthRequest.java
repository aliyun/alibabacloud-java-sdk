// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class LicenseAuthRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("License")
    public String license;

    @NameInMap("TenantId")
    public Long tenantId;

    public static LicenseAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        LicenseAuthRequest self = new LicenseAuthRequest();
        return TeaModel.build(map, self);
    }

    public LicenseAuthRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public LicenseAuthRequest setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public LicenseAuthRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
