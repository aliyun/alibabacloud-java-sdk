// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateSchemaSubscribeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSchemaSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemaSubscribeResponseBody self = new UpdateSchemaSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSchemaSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
