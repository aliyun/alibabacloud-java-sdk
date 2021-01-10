// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateShadowSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateShadowSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateShadowSchemaResponseBody self = new UpdateShadowSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateShadowSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
