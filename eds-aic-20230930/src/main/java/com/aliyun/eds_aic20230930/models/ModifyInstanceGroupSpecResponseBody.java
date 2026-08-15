// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyInstanceGroupSpecResponseBody extends TeaModel {
    /**
     * <p>The order information.</p>
     */
    @NameInMap("OrderInfo")
    public java.util.List<ModifyInstanceGroupSpecResponseBodyOrderInfo> orderInfo;

    /**
     * <p>The order task ID that is returned when specifications of more than 10 instance groups are changed in a batch. You can call the <strong>DescribeOrderTasks</strong> operation to query the information about each order.</p>
     * 
     * <strong>example:</strong>
     * <p>t-aycabdsjsbgd****</p>
     */
    @NameInMap("OrderTaskId")
    public String orderTaskId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceGroupSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceGroupSpecResponseBody self = new ModifyInstanceGroupSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceGroupSpecResponseBody setOrderInfo(java.util.List<ModifyInstanceGroupSpecResponseBodyOrderInfo> orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public java.util.List<ModifyInstanceGroupSpecResponseBodyOrderInfo> getOrderInfo() {
        return this.orderInfo;
    }

    public ModifyInstanceGroupSpecResponseBody setOrderTaskId(String orderTaskId) {
        this.orderTaskId = orderTaskId;
        return this;
    }
    public String getOrderTaskId() {
        return this.orderTaskId;
    }

    public ModifyInstanceGroupSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ModifyInstanceGroupSpecResponseBodyOrderInfo extends TeaModel {
        /**
         * <p>The list of instance IDs.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<String> instanceIds;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>296325540190****</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static ModifyInstanceGroupSpecResponseBodyOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceGroupSpecResponseBodyOrderInfo self = new ModifyInstanceGroupSpecResponseBodyOrderInfo();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceGroupSpecResponseBodyOrderInfo setInstanceIds(java.util.List<String> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        public ModifyInstanceGroupSpecResponseBodyOrderInfo setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
