// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ApplyIPResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ApplyIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyIPResponseBody self = new ApplyIPResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
