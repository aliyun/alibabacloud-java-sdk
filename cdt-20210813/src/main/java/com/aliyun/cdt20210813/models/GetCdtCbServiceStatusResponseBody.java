// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class GetCdtCbServiceStatusResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCdtCbServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCdtCbServiceStatusResponseBody self = new GetCdtCbServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCdtCbServiceStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetCdtCbServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
