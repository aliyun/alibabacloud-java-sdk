// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteDBClusterResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterResponseBody self = new DeleteDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
