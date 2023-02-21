// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetViewDDLResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
