// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CreateClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterResponseBody self = new CreateClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClusterResponseBody setData(CreateClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateClusterResponseBodyData getData() {
        return this.data;
    }

    public CreateClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cc-bp123bm6vy801****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <strong>example:</strong>
         * <p>21154955706****</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>vw-uf6a499c0m3w5****</p>
         */
        @NameInMap("VirtualWareHouseId")
        public String virtualWareHouseId;

        public static CreateClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterResponseBodyData self = new CreateClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateClusterResponseBodyData setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public CreateClusterResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public CreateClusterResponseBodyData setVirtualWareHouseId(String virtualWareHouseId) {
            this.virtualWareHouseId = virtualWareHouseId;
            return this;
        }
        public String getVirtualWareHouseId() {
            return this.virtualWareHouseId;
        }

    }

}
