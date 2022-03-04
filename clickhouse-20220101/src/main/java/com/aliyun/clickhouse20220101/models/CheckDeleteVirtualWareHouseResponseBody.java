// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckDeleteVirtualWareHouseResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckDeleteVirtualWareHouseResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckDeleteVirtualWareHouseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDeleteVirtualWareHouseResponseBody self = new CheckDeleteVirtualWareHouseResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDeleteVirtualWareHouseResponseBody setData(CheckDeleteVirtualWareHouseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckDeleteVirtualWareHouseResponseBodyData getData() {
        return this.data;
    }

    public CheckDeleteVirtualWareHouseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckDeleteVirtualWareHouseResponseBodyData extends TeaModel {
        // 预期变更后的实例状态
        @NameInMap("ExpectedDBClusterStatus")
        public String expectedDBClusterStatus;

        // 预期变更完成需要的时间 秒
        @NameInMap("ExpectedOrderFinishSeconds")
        public Long expectedOrderFinishSeconds;

        // 预期变更后的计算组状态
        @NameInMap("ExpectedTargetVirtualWareHouseStatus")
        public String expectedTargetVirtualWareHouseStatus;

        public static CheckDeleteVirtualWareHouseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckDeleteVirtualWareHouseResponseBodyData self = new CheckDeleteVirtualWareHouseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckDeleteVirtualWareHouseResponseBodyData setExpectedDBClusterStatus(String expectedDBClusterStatus) {
            this.expectedDBClusterStatus = expectedDBClusterStatus;
            return this;
        }
        public String getExpectedDBClusterStatus() {
            return this.expectedDBClusterStatus;
        }

        public CheckDeleteVirtualWareHouseResponseBodyData setExpectedOrderFinishSeconds(Long expectedOrderFinishSeconds) {
            this.expectedOrderFinishSeconds = expectedOrderFinishSeconds;
            return this;
        }
        public Long getExpectedOrderFinishSeconds() {
            return this.expectedOrderFinishSeconds;
        }

        public CheckDeleteVirtualWareHouseResponseBodyData setExpectedTargetVirtualWareHouseStatus(String expectedTargetVirtualWareHouseStatus) {
            this.expectedTargetVirtualWareHouseStatus = expectedTargetVirtualWareHouseStatus;
            return this;
        }
        public String getExpectedTargetVirtualWareHouseStatus() {
            return this.expectedTargetVirtualWareHouseStatus;
        }

    }

}
