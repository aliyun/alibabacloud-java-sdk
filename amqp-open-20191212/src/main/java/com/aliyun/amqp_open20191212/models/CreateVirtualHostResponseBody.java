// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp_open20191212.models;

import com.aliyun.tea.*;

public class CreateVirtualHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVirtualHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualHostResponseBody self = new CreateVirtualHostResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
