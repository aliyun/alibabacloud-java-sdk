// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DeleteDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>72651AF9-7897-41A7-8B67-6C15C7F26A0A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBInstanceResponseBody self = new DeleteDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
