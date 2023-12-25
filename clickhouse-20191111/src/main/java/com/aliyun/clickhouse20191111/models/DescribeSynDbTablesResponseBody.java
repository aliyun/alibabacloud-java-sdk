// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeSynDbTablesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The queried tables.</p>
     */
    @NameInMap("Tables")
    public java.util.List<String> tables;

    public static DescribeSynDbTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynDbTablesResponseBody self = new DescribeSynDbTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynDbTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynDbTablesResponseBody setTables(java.util.List<String> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<String> getTables() {
        return this.tables;
    }

}
