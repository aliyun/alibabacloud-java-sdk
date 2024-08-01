// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class MoveGtmResourceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C6F1D541-E7A6-447A-A2B5-9F7A20B2A8FB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MoveGtmResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveGtmResourceGroupResponseBody self = new MoveGtmResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveGtmResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
