// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class AncillarySuggestResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public AncillarySuggestResponseBodyData data;

    @NameInMap("error_code")
    public String errorCode;

    @NameInMap("error_data")
    public Object errorData;

    @NameInMap("error_msg")
    public String errorMsg;

    @NameInMap("status")
    public Integer status;

    @NameInMap("success")
    public Boolean success;

    public static AncillarySuggestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AncillarySuggestResponseBody self = new AncillarySuggestResponseBody();
        return TeaModel.build(map, self);
    }

    public AncillarySuggestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AncillarySuggestResponseBody setData(AncillarySuggestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AncillarySuggestResponseBodyData getData() {
        return this.data;
    }

    public AncillarySuggestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AncillarySuggestResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public AncillarySuggestResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public AncillarySuggestResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public AncillarySuggestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary extends TeaModel {
        /**
         * <p>行李件数 取值如：3、2、1、0、-2。 -2 表示计重</p>
         */
        @NameInMap("baggage_amount")
        public Integer baggageAmount;

        /**
         * <p>行李重量，0-50。isAllWeght=true 时，表示所有件数总重量。</p>
         */
        @NameInMap("baggage_weight")
        public Integer baggageWeight;

        /**
         * <p>行李重量单位</p>
         */
        @NameInMap("baggage_weight_unit")
        public String baggageWeightUnit;

        /**
         * <p>是否所有行李重量</p>
         */
        @NameInMap("is_all_weight")
        public Boolean isAllWeight;

        /**
         * <p>总价</p>
         */
        @NameInMap("price")
        public Double price;

        public static AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary build(java.util.Map<String, ?> map) throws Exception {
            AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary self = new AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary();
            return TeaModel.build(map, self);
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary setBaggageAmount(Integer baggageAmount) {
            this.baggageAmount = baggageAmount;
            return this;
        }
        public Integer getBaggageAmount() {
            return this.baggageAmount;
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary setBaggageWeight(Integer baggageWeight) {
            this.baggageWeight = baggageWeight;
            return this;
        }
        public Integer getBaggageWeight() {
            return this.baggageWeight;
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary setBaggageWeightUnit(String baggageWeightUnit) {
            this.baggageWeightUnit = baggageWeightUnit;
            return this;
        }
        public String getBaggageWeightUnit() {
            return this.baggageWeightUnit;
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary setIsAllWeight(Boolean isAllWeight) {
            this.isAllWeight = isAllWeight;
            return this;
        }
        public Boolean getIsAllWeight() {
            return this.isAllWeight;
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

    }

    public static class AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary extends TeaModel {
        @NameInMap("ancillary_id")
        public String ancillaryId;

        @NameInMap("ancillary_type")
        public Integer ancillaryType;

        /**
         * <p>行李辅营详情</p>
         */
        @NameInMap("baggage_ancillary")
        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary baggageAncillary;

        public static AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary build(java.util.Map<String, ?> map) throws Exception {
            AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary self = new AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary();
            return TeaModel.build(map, self);
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary setAncillaryId(String ancillaryId) {
            this.ancillaryId = ancillaryId;
            return this;
        }
        public String getAncillaryId() {
            return this.ancillaryId;
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary setAncillaryType(Integer ancillaryType) {
            this.ancillaryType = ancillaryType;
            return this;
        }
        public Integer getAncillaryType() {
            return this.ancillaryType;
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary setBaggageAncillary(AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary baggageAncillary) {
            this.baggageAncillary = baggageAncillary;
            return this;
        }
        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillaryBaggageAncillary getBaggageAncillary() {
            return this.baggageAncillary;
        }

    }

    public static class AncillarySuggestResponseBodyDataSegAncillaryMapList extends TeaModel {
        @NameInMap("ancillary")
        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary ancillary;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static AncillarySuggestResponseBodyDataSegAncillaryMapList build(java.util.Map<String, ?> map) throws Exception {
            AncillarySuggestResponseBodyDataSegAncillaryMapList self = new AncillarySuggestResponseBodyDataSegAncillaryMapList();
            return TeaModel.build(map, self);
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapList setAncillary(AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary ancillary) {
            this.ancillary = ancillary;
            return this;
        }
        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary getAncillary() {
            return this.ancillary;
        }

        public AncillarySuggestResponseBodyDataSegAncillaryMapList setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class AncillarySuggestResponseBodyData extends TeaModel {
        @NameInMap("seg_ancillary_map_list")
        public java.util.List<AncillarySuggestResponseBodyDataSegAncillaryMapList> segAncillaryMapList;

        @NameInMap("solution_id")
        public String solutionId;

        public static AncillarySuggestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AncillarySuggestResponseBodyData self = new AncillarySuggestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AncillarySuggestResponseBodyData setSegAncillaryMapList(java.util.List<AncillarySuggestResponseBodyDataSegAncillaryMapList> segAncillaryMapList) {
            this.segAncillaryMapList = segAncillaryMapList;
            return this;
        }
        public java.util.List<AncillarySuggestResponseBodyDataSegAncillaryMapList> getSegAncillaryMapList() {
            return this.segAncillaryMapList;
        }

        public AncillarySuggestResponseBodyData setSolutionId(String solutionId) {
            this.solutionId = solutionId;
            return this;
        }
        public String getSolutionId() {
            return this.solutionId;
        }

    }

}
