// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMaintainTimeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterMaintainTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMaintainTimeResponse self = new ModifyDBClusterMaintainTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterMaintainTimeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
