// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RestartCasterResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6EBD1AC4-C34D-4AE1-963E-B688A228BE31</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartCasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartCasterResponseBody self = new RestartCasterResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartCasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
