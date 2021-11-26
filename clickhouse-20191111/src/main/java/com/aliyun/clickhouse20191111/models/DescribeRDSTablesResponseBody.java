// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeRDSTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tables")
    public java.util.List<String> tables;

    public static DescribeRDSTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDSTablesResponseBody self = new DescribeRDSTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRDSTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRDSTablesResponseBody setTables(java.util.List<String> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<String> getTables() {
        return this.tables;
    }

}
