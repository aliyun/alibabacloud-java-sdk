// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnMeasurementDataResponseBody extends TeaModel {
    /**
     * <p>The metering data returned.</p>
     */
    @NameInMap("MeasurementDatas")
    public DescribeEpnMeasurementDataResponseBodyMeasurementDatas measurementDatas;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEpnMeasurementDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnMeasurementDataResponseBody self = new DescribeEpnMeasurementDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEpnMeasurementDataResponseBody setMeasurementDatas(DescribeEpnMeasurementDataResponseBodyMeasurementDatas measurementDatas) {
        this.measurementDatas = measurementDatas;
        return this;
    }
    public DescribeEpnMeasurementDataResponseBodyMeasurementDatas getMeasurementDatas() {
        return this.measurementDatas;
    }

    public DescribeEpnMeasurementDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData extends TeaModel {
        /**
         * <p>The code of the billable item.</p>
         */
        @NameInMap("CostCode")
        public String costCode;

        /**
         * <p>The name of the billable item.</p>
         */
        @NameInMap("CostName")
        public String costName;

        /**
         * <p>Metering method</p>
         * <br>
         * <p>*   SpeedUp: bandwidth of intelligent acceleration</p>
         * <p>*   IntranetConnection: internal bandwidth</p>
         */
        @NameInMap("CostType")
        public String costType;

        /**
         * <p>The value of the billable item.</p>
         */
        @NameInMap("CostVal")
        public Integer costVal;

        /**
         * <p>This parameter is unavailable.</p>
         */
        @NameInMap("IspLine")
        public String ispLine;

        public static DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData self = new DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData();
            return TeaModel.build(map, self);
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostCode(String costCode) {
            this.costCode = costCode;
            return this;
        }
        public String getCostCode() {
            return this.costCode;
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostName(String costName) {
            this.costName = costName;
            return this;
        }
        public String getCostName() {
            return this.costName;
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostType(String costType) {
            this.costType = costType;
            return this;
        }
        public String getCostType() {
            return this.costType;
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostVal(Integer costVal) {
            this.costVal = costVal;
            return this;
        }
        public Integer getCostVal() {
            return this.costVal;
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setIspLine(String ispLine) {
            this.ispLine = ispLine;
            return this;
        }
        public String getIspLine() {
            return this.ispLine;
        }

    }

    public static class DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas extends TeaModel {
        @NameInMap("BandWidthFeeData")
        public java.util.List<DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> bandWidthFeeData;

        public static DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas self = new DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas();
            return TeaModel.build(map, self);
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas setBandWidthFeeData(java.util.List<DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> bandWidthFeeData) {
            this.bandWidthFeeData = bandWidthFeeData;
            return this;
        }
        public java.util.List<DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> getBandWidthFeeData() {
            return this.bandWidthFeeData;
        }

    }

    public static class DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData extends TeaModel {
        /**
         * <p>The bandwidth data returned.</p>
         */
        @NameInMap("BandWidthFeeDatas")
        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas bandWidthFeeDatas;

        /**
         * <p>The metering method. Valid values:</p>
         * <br>
         * <p>*   ChargeByUnified: unified metering.</p>
         * <p>*   ChargeByGrade: differential metering.</p>
         */
        @NameInMap("ChargeModel")
        public String chargeModel;

        /**
         * <p>The metering cycle.</p>
         */
        @NameInMap("CostCycle")
        public String costCycle;

        /**
         * <p>The end time of the metering cycle.</p>
         */
        @NameInMap("CostEndTime")
        public String costEndTime;

        /**
         * <p>The start time of the metering cycle.</p>
         */
        @NameInMap("CostStartTime")
        public String costStartTime;

        public static DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData self = new DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData();
            return TeaModel.build(map, self);
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData setBandWidthFeeDatas(DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas bandWidthFeeDatas) {
            this.bandWidthFeeDatas = bandWidthFeeDatas;
            return this;
        }
        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas getBandWidthFeeDatas() {
            return this.bandWidthFeeDatas;
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData setChargeModel(String chargeModel) {
            this.chargeModel = chargeModel;
            return this;
        }
        public String getChargeModel() {
            return this.chargeModel;
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData setCostCycle(String costCycle) {
            this.costCycle = costCycle;
            return this;
        }
        public String getCostCycle() {
            return this.costCycle;
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData setCostEndTime(String costEndTime) {
            this.costEndTime = costEndTime;
            return this;
        }
        public String getCostEndTime() {
            return this.costEndTime;
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData setCostStartTime(String costStartTime) {
            this.costStartTime = costStartTime;
            return this;
        }
        public String getCostStartTime() {
            return this.costStartTime;
        }

    }

    public static class DescribeEpnMeasurementDataResponseBodyMeasurementDatas extends TeaModel {
        @NameInMap("MeasurementData")
        public java.util.List<DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData> measurementData;

        public static DescribeEpnMeasurementDataResponseBodyMeasurementDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnMeasurementDataResponseBodyMeasurementDatas self = new DescribeEpnMeasurementDataResponseBodyMeasurementDatas();
            return TeaModel.build(map, self);
        }

        public DescribeEpnMeasurementDataResponseBodyMeasurementDatas setMeasurementData(java.util.List<DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData> measurementData) {
            this.measurementData = measurementData;
            return this;
        }
        public java.util.List<DescribeEpnMeasurementDataResponseBodyMeasurementDatasMeasurementData> getMeasurementData() {
            return this.measurementData;
        }

    }

}
