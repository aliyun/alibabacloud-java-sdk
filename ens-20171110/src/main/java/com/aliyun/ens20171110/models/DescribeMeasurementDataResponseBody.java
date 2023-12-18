// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeMeasurementDataResponseBody extends TeaModel {
    /**
     * <p>The metering data returned.</p>
     */
    @NameInMap("MeasurementDatas")
    public DescribeMeasurementDataResponseBodyMeasurementDatas measurementDatas;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeasurementDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeasurementDataResponseBody self = new DescribeMeasurementDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeasurementDataResponseBody setMeasurementDatas(DescribeMeasurementDataResponseBodyMeasurementDatas measurementDatas) {
        this.measurementDatas = measurementDatas;
        return this;
    }
    public DescribeMeasurementDataResponseBodyMeasurementDatas getMeasurementDatas() {
        return this.measurementDatas;
    }

    public DescribeMeasurementDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData extends TeaModel {
        /**
         * <p>The code of the bandwidth plan.</p>
         */
        @NameInMap("CostCode")
        public String costCode;

        /**
         * <p>The name of the bandwidth plan.</p>
         */
        @NameInMap("CostName")
        public String costName;

        /**
         * <p>The bandwidth consumption. Unit: bit/second.</p>
         */
        @NameInMap("CostVal")
        public Integer costVal;

        public static DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData self = new DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostCode(String costCode) {
            this.costCode = costCode;
            return this;
        }
        public String getCostCode() {
            return this.costCode;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostName(String costName) {
            this.costName = costName;
            return this;
        }
        public String getCostName() {
            return this.costName;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData setCostVal(Integer costVal) {
            this.costVal = costVal;
            return this;
        }
        public Integer getCostVal() {
            return this.costVal;
        }

    }

    public static class DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas extends TeaModel {
        @NameInMap("BandWidthFeeData")
        public java.util.List<DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> bandWidthFeeData;

        public static DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas self = new DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas setBandWidthFeeData(java.util.List<DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> bandWidthFeeData) {
            this.bandWidthFeeData = bandWidthFeeData;
            return this;
        }
        public java.util.List<DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatasBandWidthFeeData> getBandWidthFeeData() {
            return this.bandWidthFeeData;
        }

    }

    public static class DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeData extends TeaModel {
        /**
         * <p>The memory size. Unit: GB.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The storage capacity. Unit: GB.</p>
         */
        @NameInMap("Storage")
        public Integer storage;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("Vcpu")
        public Integer vcpu;

        public static DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeData self = new DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeData();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeData setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeData setStorage(Integer storage) {
            this.storage = storage;
            return this;
        }
        public Integer getStorage() {
            return this.storage;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeData setVcpu(Integer vcpu) {
            this.vcpu = vcpu;
            return this;
        }
        public Integer getVcpu() {
            return this.vcpu;
        }

    }

    public static class DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail extends TeaModel {
        /**
         * <p>The code of the resource.</p>
         */
        @NameInMap("CostCode")
        public String costCode;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("CostName")
        public String costName;

        /**
         * <p>The consumption of the resource.</p>
         * <br>
         * <p>*   Memory unit: GB.</p>
         * <p>*   CPU unit: vCPU.</p>
         * <p>*   Storage unit: GB.</p>
         */
        @NameInMap("CostVal")
        public Integer costVal;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail self = new DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail setCostCode(String costCode) {
            this.costCode = costCode;
            return this;
        }
        public String getCostCode() {
            return this.costCode;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail setCostName(String costName) {
            this.costName = costName;
            return this;
        }
        public String getCostName() {
            return this.costName;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail setCostVal(Integer costVal) {
            this.costVal = costVal;
            return this;
        }
        public Integer getCostVal() {
            return this.costVal;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetails extends TeaModel {
        @NameInMap("ResourceFeeDataDetail")
        public java.util.List<DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail> resourceFeeDataDetail;

        public static DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetails self = new DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetails();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetails setResourceFeeDataDetail(java.util.List<DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail> resourceFeeDataDetail) {
            this.resourceFeeDataDetail = resourceFeeDataDetail;
            return this;
        }
        public java.util.List<DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetailsResourceFeeDataDetail> getResourceFeeDataDetail() {
            return this.resourceFeeDataDetail;
        }

    }

    public static class DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData extends TeaModel {
        /**
         * <p>The bandwidth data returned.</p>
         */
        @NameInMap("BandWidthFeeDatas")
        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas bandWidthFeeDatas;

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

        /**
         * <p>The information about computing resources.</p>
         */
        @NameInMap("ResourceFeeData")
        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeData resourceFeeData;

        /**
         * <p>Details of the computing resources.</p>
         */
        @NameInMap("ResourceFeeDataDetails")
        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetails resourceFeeDataDetails;

        public static DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData self = new DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData setBandWidthFeeDatas(DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas bandWidthFeeDatas) {
            this.bandWidthFeeDatas = bandWidthFeeDatas;
            return this;
        }
        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataBandWidthFeeDatas getBandWidthFeeDatas() {
            return this.bandWidthFeeDatas;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData setChargeModel(String chargeModel) {
            this.chargeModel = chargeModel;
            return this;
        }
        public String getChargeModel() {
            return this.chargeModel;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData setCostCycle(String costCycle) {
            this.costCycle = costCycle;
            return this;
        }
        public String getCostCycle() {
            return this.costCycle;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData setCostEndTime(String costEndTime) {
            this.costEndTime = costEndTime;
            return this;
        }
        public String getCostEndTime() {
            return this.costEndTime;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData setCostStartTime(String costStartTime) {
            this.costStartTime = costStartTime;
            return this;
        }
        public String getCostStartTime() {
            return this.costStartTime;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData setResourceFeeData(DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeData resourceFeeData) {
            this.resourceFeeData = resourceFeeData;
            return this;
        }
        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeData getResourceFeeData() {
            return this.resourceFeeData;
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData setResourceFeeDataDetails(DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetails resourceFeeDataDetails) {
            this.resourceFeeDataDetails = resourceFeeDataDetails;
            return this;
        }
        public DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementDataResourceFeeDataDetails getResourceFeeDataDetails() {
            return this.resourceFeeDataDetails;
        }

    }

    public static class DescribeMeasurementDataResponseBodyMeasurementDatas extends TeaModel {
        @NameInMap("MeasurementData")
        public java.util.List<DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData> measurementData;

        public static DescribeMeasurementDataResponseBodyMeasurementDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeasurementDataResponseBodyMeasurementDatas self = new DescribeMeasurementDataResponseBodyMeasurementDatas();
            return TeaModel.build(map, self);
        }

        public DescribeMeasurementDataResponseBodyMeasurementDatas setMeasurementData(java.util.List<DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData> measurementData) {
            this.measurementData = measurementData;
            return this;
        }
        public java.util.List<DescribeMeasurementDataResponseBodyMeasurementDatasMeasurementData> getMeasurementData() {
            return this.measurementData;
        }

    }

}
