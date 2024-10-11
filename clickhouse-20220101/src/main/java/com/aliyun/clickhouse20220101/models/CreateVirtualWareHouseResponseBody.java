// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CreateVirtualWareHouseResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateVirtualWareHouseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>2FED790E-FB61-4721-8C1C-07C627FA5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateVirtualWareHouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualWareHouseResponseBody self = new CreateVirtualWareHouseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVirtualWareHouseResponseBody setData(CreateVirtualWareHouseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateVirtualWareHouseResponseBodyData getData() {
        return this.data;
    }

    public CreateVirtualWareHouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVirtualWareHouseResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>21155221661****</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>vw-bp1w2728d535t****</p>
         */
        @NameInMap("VirtualWareHouseId")
        public String virtualWareHouseId;

        public static CreateVirtualWareHouseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualWareHouseResponseBodyData self = new CreateVirtualWareHouseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateVirtualWareHouseResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public CreateVirtualWareHouseResponseBodyData setVirtualWareHouseId(String virtualWareHouseId) {
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }
        public String getVirtualWareHouseId() {
            return this.virtualWareHouseId;
        }

    }

}
