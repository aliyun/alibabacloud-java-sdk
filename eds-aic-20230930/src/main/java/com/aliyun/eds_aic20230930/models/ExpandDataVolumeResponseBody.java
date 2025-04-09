// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ExpandDataVolumeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>22326560487****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>5C5CEF0A-D6E1-58D3-8750-67DB4F82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExpandDataVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExpandDataVolumeResponseBody self = new ExpandDataVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public ExpandDataVolumeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExpandDataVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
