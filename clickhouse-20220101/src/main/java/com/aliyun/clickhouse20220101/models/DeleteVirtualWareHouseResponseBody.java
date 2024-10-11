// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class DeleteVirtualWareHouseResponseBody extends TeaModel {
    @NameInMap("Data")
    public DeleteVirtualWareHouseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVirtualWareHouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVirtualWareHouseResponseBody self = new DeleteVirtualWareHouseResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVirtualWareHouseResponseBody setData(DeleteVirtualWareHouseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteVirtualWareHouseResponseBodyData getData() {
        return this.data;
    }

    public DeleteVirtualWareHouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteVirtualWareHouseResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>21152153510****</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static DeleteVirtualWareHouseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteVirtualWareHouseResponseBodyData self = new DeleteVirtualWareHouseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteVirtualWareHouseResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
