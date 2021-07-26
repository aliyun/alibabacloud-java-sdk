// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ReleaseIPResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseIPResponseBody self = new ReleaseIPResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
