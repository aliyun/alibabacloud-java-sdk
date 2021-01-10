// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateUpstreamAppKeyRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUpstreamAppKeyRelationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUpstreamAppKeyRelationsResponseBody self = new CreateUpstreamAppKeyRelationsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUpstreamAppKeyRelationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
