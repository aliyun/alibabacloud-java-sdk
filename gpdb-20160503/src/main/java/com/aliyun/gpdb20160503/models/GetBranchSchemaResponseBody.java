// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetBranchSchemaResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The schema SQL content.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE TABLE public.example(id int);</p>
     */
    @NameInMap("Sql")
    public String sql;

    public static GetBranchSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBranchSchemaResponseBody self = new GetBranchSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBranchSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBranchSchemaResponseBody setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
