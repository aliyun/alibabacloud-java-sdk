// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckCreateVirtualWareHouseResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckCreateVirtualWareHouseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>9A23C87D-87DF-4DA0-A50E-CB13F4F7923D</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>ResourceChanging</p>
         */
        @NameInMap("ExpectedDBClusterStatus")
        public String expectedDBClusterStatus;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("ExpectedOrderFinishSeconds")
        public Long expectedOrderFinishSeconds;

        /**
         * <strong>example:</strong>
         * <p>Creating</p>
         */
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
