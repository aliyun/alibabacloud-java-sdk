// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyOtaSearchV2Request extends TeaModel {
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
    public java.util.List<FlightModifyOtaSearchV2RequestPassengerSegmentRelations> passengerSegmentRelations;

    @NameInMap("selected_segments")
    public java.util.List<FlightModifyOtaSearchV2RequestSelectedSegments> selectedSegments;

    @NameInMap("session_id")
    public String sessionId;

    @NameInMap("voluntary")
    public Boolean voluntary;

    public static FlightModifyOtaSearchV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyOtaSearchV2Request self = new FlightModifyOtaSearchV2Request();
        return TeaModel.build(map, self);
    }

    public FlightModifyOtaSearchV2Request setCabinClass(java.util.List<Integer> cabinClass) {
        this.cabinClass = cabinClass;
        return this;
    }
    public java.util.List<Integer> getCabinClass() {
        return this.cabinClass;
    }

    public FlightModifyOtaSearchV2Request setDepDate(java.util.List<String> depDate) {
        this.depDate = depDate;
        return this;
    }
    public java.util.List<String> getDepDate() {
        return this.depDate;
    }

    public FlightModifyOtaSearchV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightModifyOtaSearchV2Request setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public FlightModifyOtaSearchV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightModifyOtaSearchV2Request setPassengerSegmentRelations(java.util.List<FlightModifyOtaSearchV2RequestPassengerSegmentRelations> passengerSegmentRelations) {
        this.passengerSegmentRelations = passengerSegmentRelations;
        return this;
    }
    public java.util.List<FlightModifyOtaSearchV2RequestPassengerSegmentRelations> getPassengerSegmentRelations() {
        return this.passengerSegmentRelations;
    }

    public FlightModifyOtaSearchV2Request setSelectedSegments(java.util.List<FlightModifyOtaSearchV2RequestSelectedSegments> selectedSegments) {
        this.selectedSegments = selectedSegments;
        return this;
    }
    public java.util.List<FlightModifyOtaSearchV2RequestSelectedSegments> getSelectedSegments() {
        return this.selectedSegments;
    }

    public FlightModifyOtaSearchV2Request setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public FlightModifyOtaSearchV2Request setVoluntary(Boolean voluntary) {
        this.voluntary = voluntary;
        return this;
    }
    public Boolean getVoluntary() {
        return this.voluntary;
    }

    public static class FlightModifyOtaSearchV2RequestPassengerSegmentRelations extends TeaModel {
        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static FlightModifyOtaSearchV2RequestPassengerSegmentRelations build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2RequestPassengerSegmentRelations self = new FlightModifyOtaSearchV2RequestPassengerSegmentRelations();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2RequestPassengerSegmentRelations setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public FlightModifyOtaSearchV2RequestPassengerSegmentRelations setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

    public static class FlightModifyOtaSearchV2RequestSelectedSegments extends TeaModel {
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

        public static FlightModifyOtaSearchV2RequestSelectedSegments build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2RequestSelectedSegments self = new FlightModifyOtaSearchV2RequestSelectedSegments();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2RequestSelectedSegments setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightModifyOtaSearchV2RequestSelectedSegments setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightModifyOtaSearchV2RequestSelectedSegments setDepDateTime(String depDateTime) {
            this.depDateTime = depDateTime;
            return this;
        }
        public String getDepDateTime() {
            return this.depDateTime;
        }

        public FlightModifyOtaSearchV2RequestSelectedSegments setJourneySeq(Integer journeySeq) {
            this.journeySeq = journeySeq;
            return this;
        }
        public Integer getJourneySeq() {
            return this.journeySeq;
        }

        public FlightModifyOtaSearchV2RequestSelectedSegments setMarketingFlightNo(String marketingFlightNo) {
            this.marketingFlightNo = marketingFlightNo;
            return this;
        }
        public String getMarketingFlightNo() {
            return this.marketingFlightNo;
        }

        public FlightModifyOtaSearchV2RequestSelectedSegments setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public FlightModifyOtaSearchV2RequestSelectedSegments setSegmentSeq(Integer segmentSeq) {
            this.segmentSeq = segmentSeq;
            return this;
        }
        public Integer getSegmentSeq() {
            return this.segmentSeq;
        }

    }

}
