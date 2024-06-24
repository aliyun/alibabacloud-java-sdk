// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyListingSearchV2Request extends TeaModel {
    @NameInMap("cabin_class")
    public java.util.List<Integer> cabinClass;

    @NameInMap("dep_date")
    public java.util.List<String> depDate;

    @NameInMap("interface_caller_is_support_retry")
    public Boolean interfaceCallerIsSupportRetry;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("isv_name")
    public String isvName;

    /**
     * <strong>example:</strong>
     * <p>1017002195370467138</p>
     */
    @NameInMap("order_id")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>1017002195370467137</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("passenger_segment_relations")
    public java.util.List<FlightModifyListingSearchV2RequestPassengerSegmentRelations> passengerSegmentRelations;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("search_mode")
    public Integer searchMode;

    @NameInMap("search_retry_token")
    public String searchRetryToken;

    @NameInMap("selected_segments")
    public java.util.List<FlightModifyListingSearchV2RequestSelectedSegments> selectedSegments;

    /**
     * <strong>example:</strong>
     * <p>a2ffebfe733742aab5c491d960ba3d59</p>
     */
    @NameInMap("session_id")
    public String sessionId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("voluntary")
    public Boolean voluntary;

    public static FlightModifyListingSearchV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyListingSearchV2Request self = new FlightModifyListingSearchV2Request();
        return TeaModel.build(map, self);
    }

    public FlightModifyListingSearchV2Request setCabinClass(java.util.List<Integer> cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public java.util.List<Integer> getCabinClass() {
        return this.cabinClass;
    }

    public FlightModifyListingSearchV2Request setDepDate(java.util.List<String> depDate) {
        this.depDate = depDate;
        return this;
    }
    public java.util.List<String> getDepDate() {
        return this.depDate;
    }

    public FlightModifyListingSearchV2Request setInterfaceCallerIsSupportRetry(Boolean interfaceCallerIsSupportRetry) {
        this.interfaceCallerIsSupportRetry = interfaceCallerIsSupportRetry;
        return this;
    }
    public Boolean getInterfaceCallerIsSupportRetry() {
        return this.interfaceCallerIsSupportRetry;
    }

    public FlightModifyListingSearchV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightModifyListingSearchV2Request setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public FlightModifyListingSearchV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightModifyListingSearchV2Request setPassengerSegmentRelations(java.util.List<FlightModifyListingSearchV2RequestPassengerSegmentRelations> passengerSegmentRelations) {
        this.passengerSegmentRelations = passengerSegmentRelations;
        return this;
    }
    public java.util.List<FlightModifyListingSearchV2RequestPassengerSegmentRelations> getPassengerSegmentRelations() {
        return this.passengerSegmentRelations;
    }

    public FlightModifyListingSearchV2Request setSearchMode(Integer searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public Integer getSearchMode() {
        return this.searchMode;
    }

    public FlightModifyListingSearchV2Request setSearchRetryToken(String searchRetryToken) {
        this.searchRetryToken = searchRetryToken;
        return this;
    }
    public String getSearchRetryToken() {
        return this.searchRetryToken;
    }

    public FlightModifyListingSearchV2Request setSelectedSegments(java.util.List<FlightModifyListingSearchV2RequestSelectedSegments> selectedSegments) {
        this.selectedSegments = selectedSegments;
        return this;
    }
    public java.util.List<FlightModifyListingSearchV2RequestSelectedSegments> getSelectedSegments() {
        return this.selectedSegments;
    }

    public FlightModifyListingSearchV2Request setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FlightModifyListingSearchV2Request setVoluntary(Boolean voluntary) {
        this.voluntary = voluntary;
        return this;
    }
    public Boolean getVoluntary() {
        return this.voluntary;
    }

    public static class FlightModifyListingSearchV2RequestPassengerSegmentRelations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3243028</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static FlightModifyListingSearchV2RequestPassengerSegmentRelations build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2RequestPassengerSegmentRelations self = new FlightModifyListingSearchV2RequestPassengerSegmentRelations();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2RequestPassengerSegmentRelations setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public FlightModifyListingSearchV2RequestPassengerSegmentRelations setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class FlightModifyListingSearchV2RequestSelectedSegments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>XIL</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>2023-09-17 18:15:00</p>
         */
        @NameInMap("dep_date_time")
        public String depDateTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_seq")
        public Integer journeySeq;

        /**
         * <strong>example:</strong>
         * <p>CA8625</p>
         */
        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        /**
         * <strong>example:</strong>
         * <p>MU8625</p>
         */
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_seq")
        public Integer segmentSeq;

        public static FlightModifyListingSearchV2RequestSelectedSegments build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2RequestSelectedSegments self = new FlightModifyListingSearchV2RequestSelectedSegments();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2RequestSelectedSegments setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightModifyListingSearchV2RequestSelectedSegments setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightModifyListingSearchV2RequestSelectedSegments setDepDateTime(String depDateTime) {
            this.depDateTime = depDateTime;
            return this;
        }
        public String getDepDateTime() {
            return this.depDateTime;
        }

        public FlightModifyListingSearchV2RequestSelectedSegments setJourneySeq(Integer journeySeq) {
            this.journeySeq = journeySeq;
            return this;
        }
        public Integer getJourneySeq() {
            return this.journeySeq;
        }

        public FlightModifyListingSearchV2RequestSelectedSegments setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public FlightModifyListingSearchV2RequestSelectedSegments setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public FlightModifyListingSearchV2RequestSelectedSegments setSegmentSeq(Integer segmentSeq) {
            this.segmentSeq = segmentSeq;
            return this;
        }
        public Integer getSegmentSeq() {
            return this.segmentSeq;
        }

    }

}
