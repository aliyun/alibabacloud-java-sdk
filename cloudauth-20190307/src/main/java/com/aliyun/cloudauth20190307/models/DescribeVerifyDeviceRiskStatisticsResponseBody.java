// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeVerifyDeviceRiskStatisticsResponseBody extends TeaModel {
    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>B3193814-AE54-50C5-9070-68B69C07287D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Authentication result.</p>
     */
    @NameInMap("ResultObject")
    public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject resultObject;

    public static DescribeVerifyDeviceRiskStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVerifyDeviceRiskStatisticsResponseBody self = new DescribeVerifyDeviceRiskStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVerifyDeviceRiskStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVerifyDeviceRiskStatisticsResponseBody setResultObject(DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems extends TeaModel {
        /**
         * <p>Daily call count.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("DailyCallCount")
        public Long dailyCallCount;

        /**
         * <p>Date.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-10</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>Abnormal device risk ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DeviceRiskRate")
        public String deviceRiskRate;

        /**
         * <p>Abnormal identity risk ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IdentityRiskRate")
        public String identityRiskRate;

        public static DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems self = new DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems setDailyCallCount(Long dailyCallCount) {
            this.dailyCallCount = dailyCallCount;
            return this;
        }
        public Long getDailyCallCount() {
            return this.dailyCallCount;
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems setDeviceRiskRate(String deviceRiskRate) {
            this.deviceRiskRate = deviceRiskRate;
            return this;
        }
        public String getDeviceRiskRate() {
            return this.deviceRiskRate;
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems setIdentityRiskRate(String identityRiskRate) {
            this.identityRiskRate = identityRiskRate;
            return this;
        }
        public String getIdentityRiskRate() {
            return this.identityRiskRate;
        }

    }

    public static class DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject extends TeaModel {
        /**
         * <p>Suspected fake face percentage: total number of suspected fake faces / total number of risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FaceAttackRate")
        public String faceAttackRate;

        /**
         * <p>Total number of suspected fake identities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IdFakeRate")
        public String idFakeRate;

        /**
         * <p>Data items in the response.</p>
         */
        @NameInMap("Items")
        public java.util.List<DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems> items;

        /**
         * <p>Number of risks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RiskCount")
        public Long riskCount;

        /**
         * <p>Root percentage: total number of root / total number of risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RootRate")
        public String rootRate;

        /**
         * <p>Simulator percentage: total number of simulators / total number of risks.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SimulatorRate")
        public String simulatorRate;

        /**
         * <p>Virtual video percentage: total number of virtual videos / total number of risks.</p>
         * 
         * <strong>example:</strong>
         * <p>23.2</p>
         */
        @NameInMap("VirtualVideoRate")
        public String virtualVideoRate;

        public static DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject self = new DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject setFaceAttackRate(String faceAttackRate) {
            this.faceAttackRate = faceAttackRate;
            return this;
        }
        public String getFaceAttackRate() {
            return this.faceAttackRate;
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject setIdFakeRate(String idFakeRate) {
            this.idFakeRate = idFakeRate;
            return this;
        }
        public String getIdFakeRate() {
            return this.idFakeRate;
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject setItems(java.util.List<DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<DescribeVerifyDeviceRiskStatisticsResponseBodyResultObjectItems> getItems() {
            return this.items;
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject setRiskCount(Long riskCount) {
            this.riskCount = riskCount;
            return this;
        }
        public Long getRiskCount() {
            return this.riskCount;
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject setRootRate(String rootRate) {
            this.rootRate = rootRate;
            return this;
        }
        public String getRootRate() {
            return this.rootRate;
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject setSimulatorRate(String simulatorRate) {
            this.simulatorRate = simulatorRate;
            return this;
        }
        public String getSimulatorRate() {
            return this.simulatorRate;
        }

        public DescribeVerifyDeviceRiskStatisticsResponseBodyResultObject setVirtualVideoRate(String virtualVideoRate) {
            this.virtualVideoRate = virtualVideoRate;
            return this;
        }
        public String getVirtualVideoRate() {
            return this.virtualVideoRate;
        }

    }

}
