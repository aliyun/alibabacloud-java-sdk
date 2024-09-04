// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeletePersonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePersonResponseBody self = new DeletePersonResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
