// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateConnectionPoolResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ConnectionPoolId")
    public String connectionPoolId;

    public static CreateConnectionPoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionPoolResponseBody self = new CreateConnectionPoolResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConnectionPoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConnectionPoolResponseBody setConnectionPoolId(String connectionPoolId) {
        this.connectionPoolId = connectionPoolId;
        return this;
    }
    public String getConnectionPoolId() {
        return this.connectionPoolId;
    }

}
