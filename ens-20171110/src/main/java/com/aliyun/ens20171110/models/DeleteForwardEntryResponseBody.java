// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteForwardEntryResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteForwardEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardEntryResponseBody self = new DeleteForwardEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteForwardEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
