// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeTraceLicenseKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>b590lhguqs@3a75d95f218****</p>
     */
    @NameInMap("LicenseKey")
    public String licenseKey;

    /**
     * <strong>example:</strong>
     * <p>29053944-6FE5-4240-8927-10095ECE****</p>
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
