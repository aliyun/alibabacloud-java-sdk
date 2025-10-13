// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metaspace20221014.models;

import com.aliyun.tea.*;

public class CancelCoordinationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AD2D0761-1FE5-549D-B169******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelCoordinationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelCoordinationResponseBody self = new CancelCoordinationResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelCoordinationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
