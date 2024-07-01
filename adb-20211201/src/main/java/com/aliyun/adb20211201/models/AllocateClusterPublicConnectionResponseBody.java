// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AllocateClusterPublicConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>868EF07F-D0B2-5043-B092-0C14CD00B65A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateClusterPublicConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateClusterPublicConnectionResponseBody self = new AllocateClusterPublicConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateClusterPublicConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
