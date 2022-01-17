// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeLicenseRequest extends TeaModel {
    @NameInMap("LicenseCode")
    public String licenseCode;

    public static DescribeLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLicenseRequest self = new DescribeLicenseRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLicenseRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

}
