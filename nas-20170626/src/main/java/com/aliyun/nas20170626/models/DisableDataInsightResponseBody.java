// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class DisableDataInsightResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5B4511A7-C99E-4071-AA8C-32E2529D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDataInsightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDataInsightResponseBody self = new DisableDataInsightResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDataInsightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
