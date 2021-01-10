// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CreateShadowSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateShadowSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateShadowSchemaResponseBody self = new CreateShadowSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateShadowSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
