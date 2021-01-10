// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateSchemaSubscribeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSchemaSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemaSubscribeResponseBody self = new CreateSchemaSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSchemaSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
