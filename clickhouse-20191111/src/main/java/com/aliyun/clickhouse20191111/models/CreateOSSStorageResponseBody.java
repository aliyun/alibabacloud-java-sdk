// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateOSSStorageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOSSStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOSSStorageResponseBody self = new CreateOSSStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOSSStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
