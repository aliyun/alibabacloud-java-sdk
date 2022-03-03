// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyClickHouseClusterServerGRPCResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyClickHouseClusterServerGRPCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClickHouseClusterServerGRPCResponseBody self = new ModifyClickHouseClusterServerGRPCResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClickHouseClusterServerGRPCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyClickHouseClusterServerGRPCResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
