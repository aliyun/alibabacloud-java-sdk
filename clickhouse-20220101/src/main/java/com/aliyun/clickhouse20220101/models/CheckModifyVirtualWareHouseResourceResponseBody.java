// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class CheckModifyVirtualWareHouseResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckModifyVirtualWareHouseResourceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckModifyVirtualWareHouseResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckModifyVirtualWareHouseResourceResponseBody self = new CheckModifyVirtualWareHouseResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckModifyVirtualWareHouseResourceResponseBody setData(CheckModifyVirtualWareHouseResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckModifyVirtualWareHouseResourceResponseBodyData getData() {
        return this.data;
    }

    public CheckModifyVirtualWareHouseResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckModifyVirtualWareHouseResourceResponseBodyData extends TeaModel {
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
         * <p>ResourceChanging</p>
         */
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

}
