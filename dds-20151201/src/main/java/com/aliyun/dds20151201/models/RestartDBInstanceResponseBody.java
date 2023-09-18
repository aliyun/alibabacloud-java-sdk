// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class RestartDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
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
