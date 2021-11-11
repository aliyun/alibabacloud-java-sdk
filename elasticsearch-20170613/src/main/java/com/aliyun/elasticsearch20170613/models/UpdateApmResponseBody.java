// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateApmResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static UpdateApmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApmResponseBody self = new UpdateApmResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
