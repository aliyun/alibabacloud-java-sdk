// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetLicenseResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLicenseResponseBody self = new GetLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
