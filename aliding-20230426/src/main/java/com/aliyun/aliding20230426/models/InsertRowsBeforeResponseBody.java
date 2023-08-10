// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertRowsBeforeResponseBody extends TeaModel {
    @NameInMap("id")
    public String id;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static InsertRowsBeforeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertRowsBeforeResponseBody self = new InsertRowsBeforeResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertRowsBeforeResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public InsertRowsBeforeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
