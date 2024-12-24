// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20220307.models;

import com.aliyun.tea.*;

public class EndAllCoordinationByOwnerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AD2D0761-1FE5-549D-B169******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EndAllCoordinationByOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EndAllCoordinationByOwnerResponseBody self = new EndAllCoordinationByOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public EndAllCoordinationByOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
