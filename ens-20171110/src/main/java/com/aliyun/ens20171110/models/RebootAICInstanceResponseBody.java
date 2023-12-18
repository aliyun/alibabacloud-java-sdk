// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RebootAICInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RebootAICInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootAICInstanceResponseBody self = new RebootAICInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootAICInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
