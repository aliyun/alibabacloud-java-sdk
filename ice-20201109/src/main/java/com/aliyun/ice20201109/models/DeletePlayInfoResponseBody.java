// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeletePlayInfoResponseBody extends TeaModel {
    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePlayInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePlayInfoResponseBody self = new DeletePlayInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePlayInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
