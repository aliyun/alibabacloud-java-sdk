// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RebalanceDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5414A4E5-4C36-4461-95FC-************</p>
     */
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
