// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteShadowSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteShadowSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteShadowSchemaResponseBody self = new DeleteShadowSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteShadowSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
