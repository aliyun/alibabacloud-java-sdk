// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateDedicatedLineResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDedicatedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDedicatedLineResponseBody self = new UpdateDedicatedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDedicatedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
