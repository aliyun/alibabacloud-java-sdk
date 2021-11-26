// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeRDSschemasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schemas")
    public java.util.List<String> schemas;

    public static DescribeRDSschemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSschemasResponseBody self = new DescribeRDSschemasResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRDSschemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRDSschemasResponseBody setSchemas(java.util.List<String> schemas) {
        this.schemas = schemas;
        return this;
    }
    public java.util.List<String> getSchemas() {
        return this.schemas;
    }

}
