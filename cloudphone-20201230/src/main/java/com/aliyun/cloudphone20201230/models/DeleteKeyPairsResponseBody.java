// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class DeleteKeyPairsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteKeyPairsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteKeyPairsResponseBody self = new DeleteKeyPairsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteKeyPairsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
