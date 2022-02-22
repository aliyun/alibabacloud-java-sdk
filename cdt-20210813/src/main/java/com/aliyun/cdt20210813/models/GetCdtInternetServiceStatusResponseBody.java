// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class GetCdtInternetServiceStatusResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetCdtInternetServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCdtInternetServiceStatusResponseBody self = new GetCdtInternetServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCdtInternetServiceStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetCdtInternetServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
