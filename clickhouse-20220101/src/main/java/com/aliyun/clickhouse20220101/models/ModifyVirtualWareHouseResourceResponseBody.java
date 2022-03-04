// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ModifyVirtualWareHouseResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public ModifyVirtualWareHouseResourceResponseBodyData data;

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

    public static class CheckModifyVirtualWareHouseResourceResponseBodyData extends TeaModel {
        // 预期变更后的实例状态
        @NameInMap("ExpectedDBClusterStatus")
        public String expectedDBClusterStatus;

        // 预期变更完成需要的时间 秒
        @NameInMap("ExpectedOrderFinishSeconds")
        public Long expectedOrderFinishSeconds;

        // 预期变更后的计算组状态
        @NameInMap("ExpectedTargetVirtualWareHouseStatus")
        public String expectedTargetVirtualWareHouseStatus;

        public static CheckModifyVirtualWareHouseResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckModifyVirtualWareHouseResourceResponseBodyData self = new CheckModifyVirtualWareHouseResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckModifyVirtualWareHouseResourceResponseBodyData setExpectedDBClusterStatus(String expectedDBClusterStatus) {
            this.expectedDBClusterStatus = expectedDBClusterStatus;
            return this;
        }
        public String getExpectedDBClusterStatus() {
            return this.expectedDBClusterStatus;
        }

        public CheckModifyVirtualWareHouseResourceResponseBodyData setExpectedOrderFinishSeconds(Long expectedOrderFinishSeconds) {
            this.expectedOrderFinishSeconds = expectedOrderFinishSeconds;
            return this;
        }
        public Long getExpectedOrderFinishSeconds() {
            return this.expectedOrderFinishSeconds;
        }

        public CheckModifyVirtualWareHouseResourceResponseBodyData setExpectedTargetVirtualWareHouseStatus(String expectedTargetVirtualWareHouseStatus) {
            this.expectedTargetVirtualWareHouseStatus = expectedTargetVirtualWareHouseStatus;
            return this;
        }
        public String getExpectedTargetVirtualWareHouseStatus() {
            return this.expectedTargetVirtualWareHouseStatus;
        }

    }

    public static class ModifyVirtualWareHouseResourceResponseBodyData extends TeaModel {
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
