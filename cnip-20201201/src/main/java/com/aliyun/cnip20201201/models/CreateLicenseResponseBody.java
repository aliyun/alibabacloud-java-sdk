// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateLicenseResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CreateLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLicenseResponseBody self = new CreateLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
