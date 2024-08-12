// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateSQLAccountResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSQLAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSQLAccountResponseBody self = new CreateSQLAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSQLAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
