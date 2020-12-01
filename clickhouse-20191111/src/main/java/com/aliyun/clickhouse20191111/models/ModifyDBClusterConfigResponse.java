// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterConfigResponse self = new ModifyDBClusterConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
