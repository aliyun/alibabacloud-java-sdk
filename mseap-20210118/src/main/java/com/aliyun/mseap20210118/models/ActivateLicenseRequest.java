// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class ActivateLicenseRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("LicenseCode")
    public String licenseCode;

    @NameInMap("LicenseNo")
    public String licenseNo;

    @NameInMap("LicensePublisher")
    public String licensePublisher;

    public static ActivateLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateLicenseRequest self = new ActivateLicenseRequest();
        return TeaModel.build(map, self);
    }

    public ActivateLicenseRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ActivateLicenseRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ActivateLicenseRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

    public ActivateLicenseRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

    public ActivateLicenseRequest setLicensePublisher(String licensePublisher) {
        this.licensePublisher = licensePublisher;
        return this;
    }
    public String getLicensePublisher() {
        return this.licensePublisher;
    }

}
