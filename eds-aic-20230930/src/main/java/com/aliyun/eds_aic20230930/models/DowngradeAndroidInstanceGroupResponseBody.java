// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DowngradeAndroidInstanceGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>22326560487****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>3AF82CE1-2801-52CE-BF64-B491DD7C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DowngradeAndroidInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DowngradeAndroidInstanceGroupResponseBody self = new DowngradeAndroidInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DowngradeAndroidInstanceGroupResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DowngradeAndroidInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
