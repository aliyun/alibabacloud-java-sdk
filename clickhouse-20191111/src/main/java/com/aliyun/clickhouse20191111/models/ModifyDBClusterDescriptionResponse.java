// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDescriptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDescriptionResponse self = new ModifyDBClusterDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterDescriptionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
