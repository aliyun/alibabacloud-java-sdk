// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundPreCalV2Request extends TeaModel {
    @NameInMap("isv_name")
    public String isvName;

    @NameInMap("order_id")
    public String orderId;

    @NameInMap("out_order_id")
    public String outOrderId;

    @NameInMap("passenger_segment_relations")
    public java.util.List<FlightRefundPreCalV2RequestPassengerSegmentRelations> passengerSegmentRelations;

    @NameInMap("pre_cal_type")
    public Integer preCalType;

    @NameInMap("ticket_nos")
    public java.util.List<String> ticketNos;

    @NameInMap("voluntary")
    public Boolean voluntary;

    public static FlightRefundPreCalV2Request build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundPreCalV2Request self = new FlightRefundPreCalV2Request();
        return TeaModel.build(map, self);
    }

    public FlightRefundPreCalV2Request setIsvName(String isvName) {
        this.isvName = isvName;
        return this;
    }
    public String getIsvName() {
        return this.isvName;
    }

    public FlightRefundPreCalV2Request setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public FlightRefundPreCalV2Request setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public FlightRefundPreCalV2Request setPassengerSegmentRelations(java.util.List<FlightRefundPreCalV2RequestPassengerSegmentRelations> passengerSegmentRelations) {
        this.passengerSegmentRelations = passengerSegmentRelations;
        return this;
    }
    public java.util.List<FlightRefundPreCalV2RequestPassengerSegmentRelations> getPassengerSegmentRelations() {
        return this.passengerSegmentRelations;
    }

    public FlightRefundPreCalV2Request setPreCalType(Integer preCalType) {
        this.preCalType = preCalType;
        return this;
    }
    public Integer getPreCalType() {
        return this.preCalType;
    }

    public FlightRefundPreCalV2Request setTicketNos(java.util.List<String> ticketNos) {
        this.ticketNos = ticketNos;
        return this;
    }
    public java.util.List<String> getTicketNos() {
        return this.ticketNos;
    }

    public FlightRefundPreCalV2Request setVoluntary(Boolean voluntary) {
        this.voluntary = voluntary;
        return this;
    }
    public Boolean getVoluntary() {
        return this.voluntary;
    }

    public static class FlightRefundPreCalV2RequestPassengerSegmentRelations extends TeaModel {
        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("segment_id_list")
        public java.util.List<String> segmentIdList;

        public static FlightRefundPreCalV2RequestPassengerSegmentRelations build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundPreCalV2RequestPassengerSegmentRelations self = new FlightRefundPreCalV2RequestPassengerSegmentRelations();
            return TeaModel.build(map, self);
        }

        public FlightRefundPreCalV2RequestPassengerSegmentRelations setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public FlightRefundPreCalV2RequestPassengerSegmentRelations setSegmentIdList(java.util.List<String> segmentIdList) {
            this.segmentIdList = segmentIdList;
            return this;
        }
        public java.util.List<String> getSegmentIdList() {
            return this.segmentIdList;
        }

    }

}
