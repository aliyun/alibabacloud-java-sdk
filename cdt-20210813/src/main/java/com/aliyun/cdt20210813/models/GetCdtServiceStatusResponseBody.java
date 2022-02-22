// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdt20210813.models;

import com.aliyun.tea.*;

public class GetCdtServiceStatusResponseBody extends TeaModel {
    @NameInMap("Enabled")
    public Boolean enabled;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCdtServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCdtServiceStatusResponseBody self = new GetCdtServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCdtServiceStatusResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetCdtServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
