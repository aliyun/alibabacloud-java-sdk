// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DeleteVirtualNodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVirtualNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualNodeResponseBody self = new DeleteVirtualNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
