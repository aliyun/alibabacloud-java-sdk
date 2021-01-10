// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteSchemaSubscribeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSchemaSubscribeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemaSubscribeResponseBody self = new DeleteSchemaSubscribeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSchemaSubscribeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
