// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateDBInstanceIPArrayResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>API-d971c90f-c801-41bd-b8e5-5b8bd79326c8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBInstanceIPArrayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceIPArrayResponseBody self = new CreateDBInstanceIPArrayResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceIPArrayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
