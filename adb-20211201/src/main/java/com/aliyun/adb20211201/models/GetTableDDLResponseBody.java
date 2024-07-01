// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetTableDDLResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>863D51B7-5321-41D8-A0B6-A088B0******</p>
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

    public static GetTableDDLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableDDLResponseBody self = new GetTableDDLResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableDDLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableDDLResponseBody setSQL(String SQL) {
        this.SQL = SQL;
        return this;
    }
    public String getSQL() {
        return this.SQL;
    }

}
