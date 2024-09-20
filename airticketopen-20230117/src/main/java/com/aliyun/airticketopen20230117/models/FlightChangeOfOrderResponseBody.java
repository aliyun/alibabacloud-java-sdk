// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class FlightChangeOfOrderResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<FlightChangeOfOrderResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_data")
    public Object errorData;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>天气</p>
         */
        @NameInMap("change_reason")
        public String changeReason;

        /**
         * <strong>example:</strong>
         * <p>2023-02-01 10:01:00</p>
         */
        @NameInMap("change_time")
        public String changeTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("change_type")
        public Integer changeType;

        /**
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("new_arrival_airport")
        public String newArrivalAirport;

        /**
         * <strong>example:</strong>
         * <p>2023-02-01 15:01:00</p>
         */
        @NameInMap("new_arrival_time")
        public String newArrivalTime;

        /**
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("new_departure_airport")
        public String newDepartureAirport;

        /**
         * <strong>example:</strong>
         * <p>2023-02-01 13:01:00</p>
         */
        @NameInMap("new_departure_time")
        public String newDepartureTime;

        /**
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
        @NameInMap("new_flight_no")
        public String newFlightNo;

        /**
         * <strong>example:</strong>
         * <p>MFM</p>
         */
        @NameInMap("old_arrival_airport")
        public String oldArrivalAirport;

        /**
         * <strong>example:</strong>
         * <p>023-02-01 14:01:00</p>
         */
        @NameInMap("old_arrival_time")
        public String oldArrivalTime;

        /**
         * <strong>example:</strong>
         * <p>PVG</p>
         */
        @NameInMap("old_departure_airport")
        public String oldDepartureAirport;

        /**
         * <strong>example:</strong>
         * <p>2023-02-01 12:01:00</p>
         */
        @NameInMap("old_departure_time")
        public String oldDepartureTime;

        /**
         * <strong>example:</strong>
         * <p>HO1295</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>4966***617111</p>
         */
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
