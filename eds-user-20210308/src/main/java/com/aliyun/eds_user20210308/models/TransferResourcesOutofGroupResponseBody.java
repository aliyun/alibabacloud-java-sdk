// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class TransferResourcesOutofGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D2B1DF9E-576B-5B91-BAF6-2C3DD1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TransferResourcesOutofGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TransferResourcesOutofGroupResponseBody self = new TransferResourcesOutofGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public TransferResourcesOutofGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
