// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteEnsRouteEntryResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEnsRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnsRouteEntryResponseBody self = new DeleteEnsRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEnsRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
