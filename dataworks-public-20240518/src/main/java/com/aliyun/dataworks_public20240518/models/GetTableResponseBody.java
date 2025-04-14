// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7B3435F4-2D91-XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Table")
    public Table table;

    public static GetTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableResponseBody self = new GetTableResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTableResponseBody setTable(Table table) {
        this.table = table;
        return this;
    }
    public Table getTable() {
        return this.table;
    }

}
