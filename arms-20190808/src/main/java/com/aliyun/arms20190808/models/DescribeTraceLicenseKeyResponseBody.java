// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeTraceLicenseKeyResponseBody extends TeaModel {
    /**
     * <p>The license key for the application.</p>
     */
    @NameInMap("LicenseKey")
    public String licenseKey;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTraceLicenseKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLicenseKeyResponseBody self = new DescribeTraceLicenseKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTraceLicenseKeyResponseBody setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }
    public String getLicenseKey() {
        return this.licenseKey;
    }

    public DescribeTraceLicenseKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
