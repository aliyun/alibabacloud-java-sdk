// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteCenResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5903EE99-D542-4E14-BC65-AAC1CB2D3D03</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCenResponseBody self = new DeleteCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
