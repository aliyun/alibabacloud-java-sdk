// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateEndpointResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointResponseBody self = new CreateEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
