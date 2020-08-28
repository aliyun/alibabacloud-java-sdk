// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ReleaseClusterPublicConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ReleaseClusterPublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseClusterPublicConnectionResponse self = new ReleaseClusterPublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseClusterPublicConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
