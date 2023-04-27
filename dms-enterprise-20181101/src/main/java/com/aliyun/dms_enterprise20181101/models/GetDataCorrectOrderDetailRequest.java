// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectOrderDetailRequest extends TeaModel {
    /**
     * <p>The information about the data change ticket.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The status of the precheck. Valid values:</p>
     * <br>
     * <p>*   **WAITING**: The ticket is pending precheck.</p>
     * <p>*   **RUNNING**: The ticket is being prechecked.</p>
     * <p>*   **SUCCESS**: The ticket passes the precheck.</p>
     * <p>*   **FAIL**: The ticket fails the precheck.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataCorrectOrderDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectOrderDetailRequest self = new GetDataCorrectOrderDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectOrderDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataCorrectOrderDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
