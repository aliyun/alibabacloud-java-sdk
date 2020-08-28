// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBConfigResponse self = new ModifyDBConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
