// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class UpsertClusterSecurityIPGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A6DB2D3E-3E87-5804-9D42-9D51EC7A7D33</p>
     */
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
