// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachEnsInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AttachEnsInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachEnsInstancesResponse self = new AttachEnsInstancesResponse();
        return TeaModel.build(map, self);
    }

    public AttachEnsInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
