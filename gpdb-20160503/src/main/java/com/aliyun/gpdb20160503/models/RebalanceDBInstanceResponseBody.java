// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RebalanceDBInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RebalanceDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebalanceDBInstanceResponseBody self = new RebalanceDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RebalanceDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
