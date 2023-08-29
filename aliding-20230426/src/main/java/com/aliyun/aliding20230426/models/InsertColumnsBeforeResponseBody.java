// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertColumnsBeforeResponseBody extends TeaModel {
    @NameInMap("id")
    public String id;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static InsertColumnsBeforeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertColumnsBeforeResponseBody self = new InsertColumnsBeforeResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertColumnsBeforeResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public InsertColumnsBeforeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
