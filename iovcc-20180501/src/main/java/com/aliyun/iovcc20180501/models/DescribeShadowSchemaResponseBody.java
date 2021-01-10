// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeShadowSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schema")
    public String schema;

    public static DescribeShadowSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeShadowSchemaResponseBody self = new DescribeShadowSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeShadowSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeShadowSchemaResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
