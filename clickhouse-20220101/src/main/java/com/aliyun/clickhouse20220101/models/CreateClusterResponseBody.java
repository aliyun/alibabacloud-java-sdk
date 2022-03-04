// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CreateClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateClusterResponseBodyData data;

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

    public static class CheckCreateClusterResponseBodyData extends TeaModel {
        // 预期变更后的实例状态
        @NameInMap("ExpectedDBClusterStatus")
        public String expectedDBClusterStatus;

        // 预期变更完成需要的时间 秒
        @NameInMap("ExpectedOrderFinishSeconds")
        public Long expectedOrderFinishSeconds;

        // 预期变更后的计算组状态
        @NameInMap("ExpectedTargetVirtualWareHouseStatus")
        public String expectedTargetVirtualWareHouseStatus;

        public static CheckCreateClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckCreateClusterResponseBodyData self = new CheckCreateClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckCreateClusterResponseBodyData setExpectedDBClusterStatus(String expectedDBClusterStatus) {
            this.expectedDBClusterStatus = expectedDBClusterStatus;
            return this;
        }
        public String getExpectedDBClusterStatus() {
            return this.expectedDBClusterStatus;
        }

        public CheckCreateClusterResponseBodyData setExpectedOrderFinishSeconds(Long expectedOrderFinishSeconds) {
            this.expectedOrderFinishSeconds = expectedOrderFinishSeconds;
            return this;
        }
        public Long getExpectedOrderFinishSeconds() {
            return this.expectedOrderFinishSeconds;
        }

        public CheckCreateClusterResponseBodyData setExpectedTargetVirtualWareHouseStatus(String expectedTargetVirtualWareHouseStatus) {
            this.expectedTargetVirtualWareHouseStatus = expectedTargetVirtualWareHouseStatus;
            return this;
        }
        public String getExpectedTargetVirtualWareHouseStatus() {
            return this.expectedTargetVirtualWareHouseStatus;
        }

    }

    public static class CreateClusterResponseBodyData extends TeaModel {
        @NameInMap("DBClusterId")
        public String DBClusterId;

        @NameInMap("OrderId")
        public Long orderId;

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
