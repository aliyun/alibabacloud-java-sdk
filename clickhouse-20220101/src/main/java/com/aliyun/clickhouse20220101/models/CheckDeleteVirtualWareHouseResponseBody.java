// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckDeleteVirtualWareHouseResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckDeleteVirtualWareHouseResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>9A23C87D-87DF-4DA0-A50E-CB13F4F7923D</p>
     */
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
         * <p>Deleting</p>
         */
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
