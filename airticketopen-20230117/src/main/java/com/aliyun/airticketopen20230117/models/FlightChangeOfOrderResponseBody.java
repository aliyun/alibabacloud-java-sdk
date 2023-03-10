// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class FlightChangeOfOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<FlightChangeOfOrderResponseBodyData> data;

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

    public static FlightChangeOfOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightChangeOfOrderResponseBody self = new FlightChangeOfOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightChangeOfOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightChangeOfOrderResponseBody setData(java.util.List<FlightChangeOfOrderResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FlightChangeOfOrderResponseBodyData> getData() {
        return this.data;
    }

    public FlightChangeOfOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public FlightChangeOfOrderResponseBody setErrorData(Object errorData) {
        this.errorData = errorData;
        return this;
    }
    public Object getErrorData() {
        return this.errorData;
    }

    public FlightChangeOfOrderResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public FlightChangeOfOrderResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public FlightChangeOfOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FlightChangeOfOrderResponseBodyDataFlightChangeDetail extends TeaModel {
        @NameInMap("change_reason")
        public String changeReason;

        @NameInMap("change_time")
        public String changeTime;

        @NameInMap("change_type")
        public Integer changeType;

        @NameInMap("new_arrival_airport")
        public String newArrivalAirport;

        @NameInMap("new_arrival_time")
        public String newArrivalTime;

        @NameInMap("new_departure_airport")
        public String newDepartureAirport;

        @NameInMap("new_departure_time")
        public String newDepartureTime;

        @NameInMap("new_flight_no")
        public String newFlightNo;

        @NameInMap("old_arrival_airport")
        public String oldArrivalAirport;

        @NameInMap("old_arrival_time")
        public String oldArrivalTime;

        @NameInMap("old_departure_airport")
        public String oldDepartureAirport;

        @NameInMap("old_departure_time")
        public String oldDepartureTime;

        @NameInMap("old_flight_no")
        public String oldFlightNo;

        public static FlightChangeOfOrderResponseBodyDataFlightChangeDetail build(java.util.Map<String, ?> map) throws Exception {
            FlightChangeOfOrderResponseBodyDataFlightChangeDetail self = new FlightChangeOfOrderResponseBodyDataFlightChangeDetail();
            return TeaModel.build(map, self);
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setChangeReason(String changeReason) {
            this.changeReason = changeReason;
            return this;
        }
        public String getChangeReason() {
            return this.changeReason;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setChangeTime(String changeTime) {
            this.changeTime = changeTime;
            return this;
        }
        public String getChangeTime() {
            return this.changeTime;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setChangeType(Integer changeType) {
            this.changeType = changeType;
            return this;
        }
        public Integer getChangeType() {
            return this.changeType;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setNewArrivalAirport(String newArrivalAirport) {
            this.newArrivalAirport = newArrivalAirport;
            return this;
        }
        public String getNewArrivalAirport() {
            return this.newArrivalAirport;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setNewArrivalTime(String newArrivalTime) {
            this.newArrivalTime = newArrivalTime;
            return this;
        }
        public String getNewArrivalTime() {
            return this.newArrivalTime;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setNewDepartureAirport(String newDepartureAirport) {
            this.newDepartureAirport = newDepartureAirport;
            return this;
        }
        public String getNewDepartureAirport() {
            return this.newDepartureAirport;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setNewDepartureTime(String newDepartureTime) {
            this.newDepartureTime = newDepartureTime;
            return this;
        }
        public String getNewDepartureTime() {
            return this.newDepartureTime;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setNewFlightNo(String newFlightNo) {
            this.newFlightNo = newFlightNo;
            return this;
        }
        public String getNewFlightNo() {
            return this.newFlightNo;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setOldArrivalAirport(String oldArrivalAirport) {
            this.oldArrivalAirport = oldArrivalAirport;
            return this;
        }
        public String getOldArrivalAirport() {
            return this.oldArrivalAirport;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setOldArrivalTime(String oldArrivalTime) {
            this.oldArrivalTime = oldArrivalTime;
            return this;
        }
        public String getOldArrivalTime() {
            return this.oldArrivalTime;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setOldDepartureAirport(String oldDepartureAirport) {
            this.oldDepartureAirport = oldDepartureAirport;
            return this;
        }
        public String getOldDepartureAirport() {
            return this.oldDepartureAirport;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setOldDepartureTime(String oldDepartureTime) {
            this.oldDepartureTime = oldDepartureTime;
            return this;
        }
        public String getOldDepartureTime() {
            return this.oldDepartureTime;
        }

        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail setOldFlightNo(String oldFlightNo) {
            this.oldFlightNo = oldFlightNo;
            return this;
        }
        public String getOldFlightNo() {
            return this.oldFlightNo;
        }

    }

    public static class FlightChangeOfOrderResponseBodyData extends TeaModel {
        @NameInMap("flight_change_detail")
        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail flightChangeDetail;

        @NameInMap("order_num")
        public Long orderNum;

        public static FlightChangeOfOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FlightChangeOfOrderResponseBodyData self = new FlightChangeOfOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FlightChangeOfOrderResponseBodyData setFlightChangeDetail(FlightChangeOfOrderResponseBodyDataFlightChangeDetail flightChangeDetail) {
            this.flightChangeDetail = flightChangeDetail;
            return this;
        }
        public FlightChangeOfOrderResponseBodyDataFlightChangeDetail getFlightChangeDetail() {
            return this.flightChangeDetail;
        }

        public FlightChangeOfOrderResponseBodyData setOrderNum(Long orderNum) {
            this.orderNum = orderNum;
            return this;
        }
        public Long getOrderNum() {
            return this.orderNum;
        }

    }

}
