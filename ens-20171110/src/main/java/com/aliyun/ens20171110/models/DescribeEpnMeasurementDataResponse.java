// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeEpnMeasurementDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MeasurementDatas")
    @Validation(required = true)
    public DescribeEpnMeasurementDataResponseMeasurementDatas measurementDatas;

    public static DescribeEpnMeasurementDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEpnMeasurementDataResponse self = new DescribeEpnMeasurementDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEpnMeasurementDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEpnMeasurementDataResponse setMeasurementDatas(DescribeEpnMeasurementDataResponseMeasurementDatas measurementDatas) {
        this.measurementDatas = measurementDatas;
        return this;
    }
    public DescribeEpnMeasurementDataResponseMeasurementDatas getMeasurementDatas() {
        return this.measurementDatas;
    }

    public static class DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData extends TeaModel {
        @NameInMap("CostVal")
        @Validation(required = true)
        public Integer costVal;

        @NameInMap("CostCode")
        @Validation(required = true)
        public String costCode;

        @NameInMap("CostName")
        @Validation(required = true)
        public String costName;

        @NameInMap("CostType")
        @Validation(required = true)
        public String costType;

        @NameInMap("IspLine")
        @Validation(required = true)
        public String ispLine;

        public static DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData self = new DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData();
            return TeaModel.build(map, self);
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostVal(Integer costVal) {
            this.costVal = costVal;
            return this;
        }
        public Integer getCostVal() {
            return this.costVal;
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostCode(String costCode) {
            this.costCode = costCode;
            return this;
        }
        public String getCostCode() {
            return this.costCode;
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostName(String costName) {
            this.costName = costName;
            return this;
        }
        public String getCostName() {
            return this.costName;
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostType(String costType) {
            this.costType = costType;
            return this;
        }
        public String getCostType() {
            return this.costType;
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setIspLine(String ispLine) {
            this.ispLine = ispLine;
            return this;
        }
        public String getIspLine() {
            return this.ispLine;
        }

    }

    public static class DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas extends TeaModel {
        @NameInMap("BandWidthFeeData")
        @Validation(required = true)
        public java.util.List<DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> bandWidthFeeData;

        public static DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas self = new DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas();
            return TeaModel.build(map, self);
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas setBandWidthFeeData(java.util.List<DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> bandWidthFeeData) {
            this.bandWidthFeeData = bandWidthFeeData;
            return this;
        }
        public java.util.List<DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> getBandWidthFeeData() {
            return this.bandWidthFeeData;
        }

    }

    public static class DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData extends TeaModel {
        @NameInMap("ChargeModel")
        @Validation(required = true)
        public String chargeModel;

        @NameInMap("CostCycle")
        @Validation(required = true)
        public String costCycle;

        @NameInMap("CostStartTime")
        @Validation(required = true)
        public String costStartTime;

        @NameInMap("CostEndTime")
        @Validation(required = true)
        public String costEndTime;

        @NameInMap("BandWidthFeeDatas")
        @Validation(required = true)
        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas bandWidthFeeDatas;

        public static DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData self = new DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData();
            return TeaModel.build(map, self);
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData setChargeModel(String chargeModel) {
            this.chargeModel = chargeModel;
            return this;
        }
        public String getChargeModel() {
            return this.chargeModel;
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData setCostCycle(String costCycle) {
            this.costCycle = costCycle;
            return this;
        }
        public String getCostCycle() {
            return this.costCycle;
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData setCostStartTime(String costStartTime) {
            this.costStartTime = costStartTime;
            return this;
        }
        public String getCostStartTime() {
            return this.costStartTime;
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData setCostEndTime(String costEndTime) {
            this.costEndTime = costEndTime;
            return this;
        }
        public String getCostEndTime() {
            return this.costEndTime;
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData setBandWidthFeeDatas(DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas bandWidthFeeDatas) {
            this.bandWidthFeeDatas = bandWidthFeeDatas;
            return this;
        }
        public DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas getBandWidthFeeDatas() {
            return this.bandWidthFeeDatas;
        }

    }

    public static class DescribeEpnMeasurementDataResponseMeasurementDatas extends TeaModel {
        @NameInMap("MeasurementData")
        @Validation(required = true)
        public java.util.List<DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData> measurementData;

        public static DescribeEpnMeasurementDataResponseMeasurementDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeEpnMeasurementDataResponseMeasurementDatas self = new DescribeEpnMeasurementDataResponseMeasurementDatas();
            return TeaModel.build(map, self);
        }

        public DescribeEpnMeasurementDataResponseMeasurementDatas setMeasurementData(java.util.List<DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData> measurementData) {
            this.measurementData = measurementData;
            return this;
        }
        public java.util.List<DescribeEpnMeasurementDataResponseMeasurementDatasMeasurementData> getMeasurementData() {
            return this.measurementData;
        }

    }

}
