// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhiteListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterAccessWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhiteListResponse self = new ModifyDBClusterAccessWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAccessWhiteListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
