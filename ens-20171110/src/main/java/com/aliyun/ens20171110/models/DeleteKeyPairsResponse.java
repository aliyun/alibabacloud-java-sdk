// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteKeyPairsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteKeyPairsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyPairsResponse self = new DeleteKeyPairsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKeyPairsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
