// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class ActivateLicenseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ActivateLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateLicenseResponseBody self = new ActivateLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActivateLicenseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
