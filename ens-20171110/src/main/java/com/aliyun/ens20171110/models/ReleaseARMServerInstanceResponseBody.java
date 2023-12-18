// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ReleaseARMServerInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseARMServerInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseARMServerInstanceResponseBody self = new ReleaseARMServerInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseARMServerInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
