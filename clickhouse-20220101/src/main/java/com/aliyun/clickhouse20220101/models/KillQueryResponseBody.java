// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class KillQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>48CBEEBE-FA07-5A06-8BA4-567B92ADD6A0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static KillQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillQueryResponseBody self = new KillQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public KillQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
