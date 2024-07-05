// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaCoverResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0DC39B9E-13D4-40BA-AE76-CFF9BD64239D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaCoverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaCoverResponseBody self = new UpdateMediaCoverResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaCoverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
