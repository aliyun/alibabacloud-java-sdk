// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDefaultSchemaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schema")
    public String schema;

    public static DescribeDefaultSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultSchemaResponseBody self = new DescribeDefaultSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDefaultSchemaResponseBody setSchema(String schema) {
        this.schema = schema;
        return this;
    }
    public String getSchema() {
        return this.schema;
    }

}
