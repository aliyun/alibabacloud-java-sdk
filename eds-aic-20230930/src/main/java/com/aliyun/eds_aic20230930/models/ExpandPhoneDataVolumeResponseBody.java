// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ExpandPhoneDataVolumeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>223684716098****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <strong>example:</strong>
     * <p>DB070C80-45AC-52CA-8101-937C25DA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExpandPhoneDataVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExpandPhoneDataVolumeResponseBody self = new ExpandPhoneDataVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public ExpandPhoneDataVolumeResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public ExpandPhoneDataVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
