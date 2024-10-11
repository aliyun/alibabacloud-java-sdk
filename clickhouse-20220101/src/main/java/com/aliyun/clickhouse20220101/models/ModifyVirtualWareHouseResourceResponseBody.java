// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyVirtualWareHouseResourceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyVirtualWareHouseResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualWareHouseResourceResponseBody self = new ModifyVirtualWareHouseResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualWareHouseResourceResponseBody setData(ModifyVirtualWareHouseResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyVirtualWareHouseResourceResponseBodyData getData() {
        return this.data;
    }

    public ModifyVirtualWareHouseResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyVirtualWareHouseResourceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>21152548723****</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static ModifyVirtualWareHouseResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyVirtualWareHouseResourceResponseBodyData self = new ModifyVirtualWareHouseResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyVirtualWareHouseResourceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
