// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class ActivateLicenseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>129****1111</p>
     */
    @NameInMap("Identification")
    public String identification;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APSEDH8TA5CSGK-********_6CNTACBH9EQPOATFXJQL4B2COE7M43VVQ7GUGKAA</p>
     */
    @NameInMap("LicenseCode")
    public String licenseCode;

    public static ActivateLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateLicenseRequest self = new ActivateLicenseRequest();
        return TeaModel.build(map, self);
    }

    public ActivateLicenseRequest setIdentification(String identification) {
        this.identification = identification;
        return this;
    }
    public String getIdentification() {
        return this.identification;
    }

    public ActivateLicenseRequest setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
    }

}
