// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ModifyNodePoolAmountResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyNodePoolAmountResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyNodePoolAmountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyNodePoolAmountResponseBody self = new ModifyNodePoolAmountResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyNodePoolAmountResponseBody setData(ModifyNodePoolAmountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifyNodePoolAmountResponseBodyData getData() {
        return this.data;
    }

    public ModifyNodePoolAmountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyNodePoolAmountResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>23429322113****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static ModifyNodePoolAmountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifyNodePoolAmountResponseBodyData self = new ModifyNodePoolAmountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifyNodePoolAmountResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
