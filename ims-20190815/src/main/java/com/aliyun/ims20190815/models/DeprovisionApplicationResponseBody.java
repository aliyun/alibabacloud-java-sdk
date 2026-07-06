// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeprovisionApplicationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4507D1CD-526A-4E2B-A1E2-3AB045D1AE0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeprovisionApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionApplicationResponseBody self = new DeprovisionApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public DeprovisionApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
