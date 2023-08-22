// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyListingSearchV2Request extends TeaModel {
    @NameInMap("cabin_class")
    public java.util.List<Integer> cabinClass;

    @NameInMap("dep_date")
    public java.util.List<String> depDate;

    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_id")
    public Long orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("passenger_segment_relations")
    public java.util.List<FlightModifyListingSearchV2RequestPassengerSegmentRelations> passengerSegmentRelations;

    @NameInMap("search_mode")
    public Integer searchMode;

    @NameInMap("selected_segments")
    public java.util.List<FlightModifyListingSearchV2RequestSelectedSegments> selectedSegments;

    @NameInMap("session_id")
    public String sessionId;

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
        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_date_time")
        public String depDateTime;

        @NameInMap("journey_seq")
        public Integer journeySeq;

        @NameInMap("marketing_flight_no")
        public String marketingFlightNo;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

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
