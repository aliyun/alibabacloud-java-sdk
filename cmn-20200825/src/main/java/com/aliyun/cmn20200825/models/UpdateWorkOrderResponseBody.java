// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateWorkOrderResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWorkOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkOrderResponseBody self = new UpdateWorkOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
