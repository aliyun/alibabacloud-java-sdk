// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetColumnResponseBody extends TeaModel {
    @NameInMap("Column")
    public Column column;

    /**
     * <strong>example:</strong>
     * <p>D1E2E5BC-xxxx-xxxx-xxxx-xxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetColumnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetColumnResponseBody self = new GetColumnResponseBody();
        return TeaModel.build(map, self);
    }

    public GetColumnResponseBody setColumn(Column column) {
        this.column = column;
        return this;
    }
    public Column getColumn() {
        return this.column;
    }

    public GetColumnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetColumnResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
