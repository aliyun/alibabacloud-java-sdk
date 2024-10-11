// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A6A077A-577C-536E-AC13-8E715D7A34C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResetAccountPasswordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordResponseBody self = new ResetAccountPasswordResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
