// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetViewDDLResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>421794A3-72A5-5D27-9E8B-A75A4C503E17</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE VIEW <code>test</code>.<code>test_view</code> AS SELECT
     *   <code>id</code>
     * , <code>name</code>
     * FROM
     *   <code>test_tbl_adb</code></p>
     */
    @NameInMap("SQL")
    public String SQL;

    public static GetViewDDLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetViewDDLResponseBody self = new GetViewDDLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetViewDDLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetViewDDLResponseBody setSQL(String SQL) {
        this.SQL = SQL;
        return this;
    }
    public String getSQL() {
        return this.SQL;
    }

}
