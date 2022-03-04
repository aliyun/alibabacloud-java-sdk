// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckCreateVirtualWareHouseResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckCreateVirtualWareHouseResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckCreateVirtualWareHouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateVirtualWareHouseResponseBody self = new CheckCreateVirtualWareHouseResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCreateVirtualWareHouseResponseBody setData(CheckCreateVirtualWareHouseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckCreateVirtualWareHouseResponseBodyData getData() {
        return this.data;
    }

    public CheckCreateVirtualWareHouseResponseBody setRequestId(String requestId) {
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

}
