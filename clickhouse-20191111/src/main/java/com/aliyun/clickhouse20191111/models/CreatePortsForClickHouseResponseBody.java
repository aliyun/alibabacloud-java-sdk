// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreatePortsForClickHouseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePortsForClickHouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePortsForClickHouseResponseBody self = new CreatePortsForClickHouseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePortsForClickHouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
