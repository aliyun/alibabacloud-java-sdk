// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DeleteClusterSecurityIPGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteClusterSecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteClusterSecurityIPGroupResponseBody self = new DeleteClusterSecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteClusterSecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
