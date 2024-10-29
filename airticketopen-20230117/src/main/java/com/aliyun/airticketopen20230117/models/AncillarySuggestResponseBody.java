// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class AncillarySuggestResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Properly processed return data</p>
     */
    @NameInMap("data")
    public AncillarySuggestResponseBodyData data;

    /**
     * <p>error code</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <p>Data carried in error handling</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <p>http request successful, status value is always 200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>true represents success, false represents failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
         * <p>baggage quantity, values such as: 3, 2, 1, 0, -2.     -2 indicates weight-based</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("baggage_amount")
        public Integer baggageAmount;

        /**
         * <p>Baggage weight, 0-50. When isAllWeight=true, it represents the total weight of all baggages.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("baggage_weight")
        public Integer baggageWeight;

        /**
         * <p>Unit of baggage weight</p>
         * 
         * <strong>example:</strong>
         * <p>KG</p>
         */
        @NameInMap("baggage_weight_unit")
        public String baggageWeightUnit;

        /**
         * <p>Whether the weight is for all baggages</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_all_weight")
        public Boolean isAllWeight;

        /**
         * <p>Total price</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
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
        /**
         * <p>Ancillary product ID</p>
         * 
         * <strong>example:</strong>
         * <p>eJwz8DeySEo0NjQ01TU3TU</p>
         */
        @NameInMap("ancillary_id")
        public String ancillaryId;

        /**
         * <p>Ancillary product type. currently supports 4: paid luggage</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ancillary_type")
        public Integer ancillaryType;

        /**
         * <p>Baggage details</p>
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
        /**
         * <p>Ancillary product</p>
         */
        @NameInMap("ancillary")
        public AncillarySuggestResponseBodyDataSegAncillaryMapListAncillary ancillary;

        /**
         * <p>Segment ID list, these segments share the same ancillary</p>
         */
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
        /**
         * <p>ancillary detail list</p>
         */
        @NameInMap("seg_ancillary_map_list")
        public java.util.List<AncillarySuggestResponseBodyDataSegAncillaryMapList> segAncillaryMapList;

        /**
         * <p>solution_id, equals to solution_id in request</p>
         * 
         * <strong>example:</strong>
         * <p>eJwz8DeySEo0NjQ01TU3TU7TNTFINNO1SE5O0jVKM0hKNjEwTElLNYwz0A32cNT1dfPVNTIwMjYwNjRQ8/A3NLI01Q0Ic0cRBwBVFxJJ</p>
         */
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
