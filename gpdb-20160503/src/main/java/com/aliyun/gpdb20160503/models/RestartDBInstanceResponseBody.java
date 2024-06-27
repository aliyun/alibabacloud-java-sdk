// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RestartDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A7356493-7141-4393-8951-CDA8AB5D67EC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartDBInstanceResponseBody self = new RestartDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
