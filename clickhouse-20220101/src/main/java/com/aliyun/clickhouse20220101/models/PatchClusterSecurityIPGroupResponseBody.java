// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class PatchClusterSecurityIPGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static PatchClusterSecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PatchClusterSecurityIPGroupResponseBody self = new PatchClusterSecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public PatchClusterSecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
