// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightRefundPreCalRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dis_order_id")
    public String disOrderId;

    @NameInMap("is_voluntary")
    public String isVoluntary;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_segment_info_list")
    public java.util.List<FlightRefundPreCalRequestPassengerSegmentInfoList> passengerSegmentInfoList;

    public static FlightRefundPreCalRequest build(java.util.Map<String, ?> map) throws Exception {
        FlightRefundPreCalRequest self = new FlightRefundPreCalRequest();
        return TeaModel.build(map, self);
    }

    public FlightRefundPreCalRequest setDisOrderId(String disOrderId) {
        this.disOrderId = disOrderId;
        return this;
    }
    public String getDisOrderId() {
        return this.disOrderId;
    }

    public FlightRefundPreCalRequest setIsVoluntary(String isVoluntary) {
        this.isVoluntary = isVoluntary;
        return this;
    }
    public String getIsVoluntary() {
        return this.isVoluntary;
    }

    public FlightRefundPreCalRequest setPassengerSegmentInfoList(java.util.List<FlightRefundPreCalRequestPassengerSegmentInfoList> passengerSegmentInfoList) {
        this.passengerSegmentInfoList = passengerSegmentInfoList;
        return this;
    }
    public java.util.List<FlightRefundPreCalRequestPassengerSegmentInfoList> getPassengerSegmentInfoList() {
        return this.passengerSegmentInfoList;
    }

    public static class FlightRefundPreCalRequestPassengerSegmentInfoList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static FlightRefundPreCalRequestPassengerSegmentInfoList build(java.util.Map<String, ?> map) throws Exception {
            FlightRefundPreCalRequestPassengerSegmentInfoList self = new FlightRefundPreCalRequestPassengerSegmentInfoList();
            return TeaModel.build(map, self);
        }

        public FlightRefundPreCalRequestPassengerSegmentInfoList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightRefundPreCalRequestPassengerSegmentInfoList setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public FlightRefundPreCalRequestPassengerSegmentInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
