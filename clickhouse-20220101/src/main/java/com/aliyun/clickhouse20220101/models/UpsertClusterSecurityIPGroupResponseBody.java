// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class UpsertClusterSecurityIPGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpsertClusterSecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpsertClusterSecurityIPGroupResponseBody self = new UpsertClusterSecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpsertClusterSecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
