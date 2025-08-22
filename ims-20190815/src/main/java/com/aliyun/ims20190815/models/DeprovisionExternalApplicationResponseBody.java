// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeprovisionExternalApplicationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4507D1CD-526A-4E2B-A1C2-3AB045D1AE0B</p>
     */
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
