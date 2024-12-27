// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetCreateTableSQLResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>109462AF-B5FA-3D5A-9377-B27E5B******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>create table (
     *  id varchar(32)
     * );</p>
     */
    @NameInMap("SQL")
    public String SQL;

    public static GetCreateTableSQLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCreateTableSQLResponseBody self = new GetCreateTableSQLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCreateTableSQLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCreateTableSQLResponseBody setSQL(String SQL) {
        this.SQL = SQL;
        return this;
    }
    public String getSQL() {
        return this.SQL;
    }

}
