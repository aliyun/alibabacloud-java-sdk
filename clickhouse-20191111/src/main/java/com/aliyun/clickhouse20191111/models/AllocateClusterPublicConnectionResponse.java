// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class AllocateClusterPublicConnectionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AllocateClusterPublicConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateClusterPublicConnectionResponse self = new AllocateClusterPublicConnectionResponse();
        return TeaModel.build(map, self);
    }

    public AllocateClusterPublicConnectionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
