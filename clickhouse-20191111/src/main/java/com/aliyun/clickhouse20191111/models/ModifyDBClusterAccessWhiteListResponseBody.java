// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDBClusterAccessWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhiteListResponseBody self = new ModifyDBClusterAccessWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAccessWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
