// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeprovisionExternalApplicationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeprovisionExternalApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionExternalApplicationResponseBody self = new DeprovisionExternalApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeprovisionExternalApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
