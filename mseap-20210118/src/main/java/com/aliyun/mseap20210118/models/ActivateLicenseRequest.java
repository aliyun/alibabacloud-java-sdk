// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class ActivateLicenseRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("LicensePublisher")
    public String licensePublisher;

    @NameInMap("LicenseCode")
    public String licenseCode;

    public static ActivateLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateLicenseRequest self = new ActivateLicenseRequest();
        return TeaModel.build(map, self);
    }

    public ActivateLicenseRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ActivateLicenseRequest setLicensePublisher(String licensePublisher) {
        this.licensePublisher = licensePublisher;
        return this;
    }
    public String getLicensePublisher() {
        return this.licensePublisher;
    }

    public ActivateLicenseRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

}
