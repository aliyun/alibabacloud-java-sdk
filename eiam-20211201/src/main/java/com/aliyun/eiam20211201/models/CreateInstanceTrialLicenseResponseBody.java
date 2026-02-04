// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateInstanceTrialLicenseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>license_463hfmewi2njxxxx</p>
     */
    @NameInMap("LicenseId")
    public String licenseId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateInstanceTrialLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceTrialLicenseResponseBody self = new CreateInstanceTrialLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceTrialLicenseResponseBody setLicenseId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }
    public String getLicenseId() {
        return this.licenseId;
    }

    public CreateInstanceTrialLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
