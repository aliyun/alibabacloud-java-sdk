// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeMeasurementDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MeasurementDatas")
    @Validation(required = true)
    public DescribeMeasurementDataResponseMeasurementDatas measurementDatas;

    public static DescribeMeasurementDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeasurementDataResponse self = new DescribeMeasurementDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMeasurementDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMeasurementDataResponse setMeasurementDatas(DescribeMeasurementDataResponseMeasurementDatas measurementDatas) {
        this.measurementDatas = measurementDatas;
        return this;
    }
    public DescribeMeasurementDataResponseMeasurementDatas getMeasurementDatas() {
        return this.measurementDatas;
    }

    public static class DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData extends TeaModel {
        @NameInMap("CostVal")
        @Validation(required = true)
        public Integer costVal;

        @NameInMap("CostCode")
        @Validation(required = true)
        public String costCode;

        @NameInMap("CostName")
        @Validation(required = true)
        public String costName;

        public static DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData self = new DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostVal(Integer costVal) {
            this.costVal = costVal;
            return this;
        }
        public Integer getCostVal() {
            return this.costVal;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostCode(String costCode) {
            this.costCode = costCode;
            return this;
        }
        public String getCostCode() {
            return this.costCode;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostName(String costName) {
            this.costName = costName;
            return this;
        }
        public String getCostName() {
            return this.costName;
        }

    }

    public static class DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas extends TeaModel {
        @NameInMap("BandWidthFeeData")
        @Validation(required = true)
        public java.util.List<DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> bandWidthFeeData;

        public static DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas self = new DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas setBandWidthFeeData(java.util.List<DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> bandWidthFeeData) {
            this.bandWidthFeeData = bandWidthFeeData;
            return this;
        }
        public java.util.List<DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> getBandWidthFeeData() {
            return this.bandWidthFeeData;
        }

    }

    public static class DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail extends TeaModel {
        @NameInMap("CostVal")
        @Validation(required = true)
        public Integer costVal;

        @NameInMap("CostCode")
        @Validation(required = true)
        public String costCode;

        @NameInMap("CostName")
        @Validation(required = true)
        public String costName;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        public static DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail self = new DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail setCostVal(Integer costVal) {
            this.costVal = costVal;
            return this;
        }
        public Integer getCostVal() {
            return this.costVal;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail setCostCode(String costCode) {
            this.costCode = costCode;
            return this;
        }
        public String getCostCode() {
            return this.costCode;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail setCostName(String costName) {
            this.costName = costName;
            return this;
        }
        public String getCostName() {
            return this.costName;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetails extends TeaModel {
        @NameInMap("ResourceFeeDataDetail")
        @Validation(required = true)
        public java.util.List<DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail> resourceFeeDataDetail;

        public static DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetails self = new DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetails();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetails setResourceFeeDataDetail(java.util.List<DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail> resourceFeeDataDetail) {
            this.resourceFeeDataDetail = resourceFeeDataDetail;
            return this;
        }
        public java.util.List<DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail> getResourceFeeDataDetail() {
            return this.resourceFeeDataDetail;
        }

    }

    public static class DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeData extends TeaModel {
        @NameInMap("Storage")
        @Validation(required = true)
        public Integer storage;

        @NameInMap("Memory")
        @Validation(required = true)
        public Integer memory;

        @NameInMap("Vcpu")
        @Validation(required = true)
        public Integer vcpu;

        public static DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeData self = new DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeData();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeData setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeData setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeData setVcpu(Integer vcpu) {
            this.vcpu = vcpu;
            return this;
        }
        public Integer getVcpu() {
            return this.vcpu;
        }

    }

    public static class DescribeMeasurementDataResponseMeasurementDatasMeasurementData extends TeaModel {
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
        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas bandWidthFeeDatas;

        @NameInMap("ResourceFeeDataDetails")
        @Validation(required = true)
        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetails resourceFeeDataDetails;

        @NameInMap("ResourceFeeData")
        @Validation(required = true)
        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeData resourceFeeData;

        public static DescribeMeasurementDataResponseMeasurementDatasMeasurementData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseMeasurementDatasMeasurementData self = new DescribeMeasurementDataResponseMeasurementDatasMeasurementData();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementData setChargeModel(String chargeModel) {
            this.chargeModel = chargeModel;
            return this;
        }
        public String getChargeModel() {
            return this.chargeModel;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementData setCostCycle(String costCycle) {
            this.costCycle = costCycle;
            return this;
        }
        public String getCostCycle() {
            return this.costCycle;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementData setCostStartTime(String costStartTime) {
            this.costStartTime = costStartTime;
            return this;
        }
        public String getCostStartTime() {
            return this.costStartTime;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementData setCostEndTime(String costEndTime) {
            this.costEndTime = costEndTime;
            return this;
        }
        public String getCostEndTime() {
            return this.costEndTime;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementData setBandWidthFeeDatas(DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas bandWidthFeeDatas) {
            this.bandWidthFeeDatas = bandWidthFeeDatas;
            return this;
        }
        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataBandWidthFeeDatas getBandWidthFeeDatas() {
            return this.bandWidthFeeDatas;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementData setResourceFeeDataDetails(DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetails resourceFeeDataDetails) {
            this.resourceFeeDataDetails = resourceFeeDataDetails;
            return this;
        }
        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeDataDetails getResourceFeeDataDetails() {
            return this.resourceFeeDataDetails;
        }

        public DescribeMeasurementDataResponseMeasurementDatasMeasurementData setResourceFeeData(DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeData resourceFeeData) {
            this.resourceFeeData = resourceFeeData;
            return this;
        }
        public DescribeMeasurementDataResponseMeasurementDatasMeasurementDataResourceFeeData getResourceFeeData() {
            return this.resourceFeeData;
        }

    }

    public static class DescribeMeasurementDataResponseMeasurementDatas extends TeaModel {
        @NameInMap("MeasurementData")
        @Validation(required = true)
        public java.util.List<DescribeMeasurementDataResponseMeasurementDatasMeasurementData> measurementData;

        public static DescribeMeasurementDataResponseMeasurementDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseMeasurementDatas self = new DescribeMeasurementDataResponseMeasurementDatas();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseMeasurementDatas setMeasurementData(java.util.List<DescribeMeasurementDataResponseMeasurementDatasMeasurementData> measurementData) {
            this.measurementData = measurementData;
            return this;
        }
        public java.util.List<DescribeMeasurementDataResponseMeasurementDatasMeasurementData> getMeasurementData() {
            return this.measurementData;
        }

    }

}
