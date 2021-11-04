// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class GetLicenseResponseBody extends TeaModel {
    @NameInMap("License")
    public String license;

    @NameInMap("RequestId")
    public String requestId;

    public static GetLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseResponseBody self = new GetLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLicenseResponseBody setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public GetLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
