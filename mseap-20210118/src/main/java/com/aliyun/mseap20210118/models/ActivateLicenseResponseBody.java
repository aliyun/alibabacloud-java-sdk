// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class ActivateLicenseResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static ActivateLicenseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateLicenseResponseBody self = new ActivateLicenseResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateLicenseResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public ActivateLicenseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
