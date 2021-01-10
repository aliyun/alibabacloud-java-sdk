// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateUpstreamAppServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUpstreamAppServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUpstreamAppServerResponseBody self = new UpdateUpstreamAppServerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateUpstreamAppServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
