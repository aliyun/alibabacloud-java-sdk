// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CreateVirtualWareHouseResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateVirtualWareHouseResponseBodyData data;

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

    public static class CheckCreateVirtualWareHouseResponseBodyData extends TeaModel {
        // 预期变更后的实例状态
        @NameInMap("ExpectedDBClusterStatus")
        public String expectedDBClusterStatus;

        // 预期变更完成需要的时间 秒
        @NameInMap("ExpectedOrderFinishSeconds")
        public Long expectedOrderFinishSeconds;

        // 预期变更后的计算组状态
        @NameInMap("ExpectedTargetVirtualWareHouseStatus")
        public String expectedTargetVirtualWareHouseStatus;

        public static CheckCreateVirtualWareHouseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckCreateVirtualWareHouseResponseBodyData self = new CheckCreateVirtualWareHouseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckCreateVirtualWareHouseResponseBodyData setExpectedDBClusterStatus(String expectedDBClusterStatus) {
            this.expectedDBClusterStatus = expectedDBClusterStatus;
            return this;
        }
        public String getExpectedDBClusterStatus() {
            return this.expectedDBClusterStatus;
        }

        public CheckCreateVirtualWareHouseResponseBodyData setExpectedOrderFinishSeconds(Long expectedOrderFinishSeconds) {
            this.expectedOrderFinishSeconds = expectedOrderFinishSeconds;
            return this;
        }
        public Long getExpectedOrderFinishSeconds() {
            return this.expectedOrderFinishSeconds;
        }

        public CheckCreateVirtualWareHouseResponseBodyData setExpectedTargetVirtualWareHouseStatus(String expectedTargetVirtualWareHouseStatus) {
            this.expectedTargetVirtualWareHouseStatus = expectedTargetVirtualWareHouseStatus;
            return this;
        }
        public String getExpectedTargetVirtualWareHouseStatus() {
            return this.expectedTargetVirtualWareHouseStatus;
        }

    }

    public static class CreateVirtualWareHouseResponseBodyData extends TeaModel {
        @NameInMap("OrderId")
        public Long orderId;

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
