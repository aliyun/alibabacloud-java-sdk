// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderDetailQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public TrainOrderDetailQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>210bc81a17090871660176894d008c</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>2103a05c16872420814992343d8a09</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainOrderDetailQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderDetailQueryResponseBody self = new TrainOrderDetailQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainOrderDetailQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainOrderDetailQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainOrderDetailQueryResponseBody setModule(TrainOrderDetailQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainOrderDetailQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TrainOrderDetailQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainOrderDetailQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainOrderDetailQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>04</p>
         */
        @NameInMap("coach_no")
        public String coachNo;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("fail_code")
        public String failCode;

        @NameInMap("fail_reason")
        public String failReason;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("real_ticket_price")
        public Long realTicketPrice;

        /**
         * <strong>example:</strong>
         * <p>1A</p>
         */
        @NameInMap("seat_no")
        public String seatNo;

        /**
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("seat_type")
        public String seatType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ticket_entrance")
        public String ticketEntrance;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("ticket_status")
        public Integer ticketStatus;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ticket_type")
        public String ticketType;

        public static TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos self = new TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setCoachNo(String coachNo) {
            this.coachNo = coachNo;
            return this;
        }
        public String getCoachNo() {
            return this.coachNo;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setRealTicketPrice(Long realTicketPrice) {
            this.realTicketPrice = realTicketPrice;
            return this;
        }
        public Long getRealTicketPrice() {
            return this.realTicketPrice;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setSeatNo(String seatNo) {
            this.seatNo = seatNo;
            return this;
        }
        public String getSeatNo() {
            return this.seatNo;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setTicketEntrance(String ticketEntrance) {
            this.ticketEntrance = ticketEntrance;
            return this;
        }
        public String getTicketEntrance() {
            return this.ticketEntrance;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setTicketStatus(Integer ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }
        public Integer getTicketStatus() {
            return this.ticketStatus;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos setTicketType(String ticketType) {
            this.ticketType = ticketType;
            return this;
        }
        public String getTicketType() {
            return this.ticketType;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BTC</p>
         */
        @NameInMap("arr_station_code")
        public String arrStationCode;

        @NameInMap("arr_station_name")
        public String arrStationName;

        /**
         * <strong>example:</strong>
         * <p>2024-05-07 15:19:01</p>
         */
        @NameInMap("arrive_time")
        public String arriveTime;

        @NameInMap("book_ticket_infos")
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos> bookTicketInfos;

        /**
         * <strong>example:</strong>
         * <p>BDC</p>
         */
        @NameInMap("dep_station_code")
        public String depStationCode;

        @NameInMap("dep_station_name")
        public String depStationName;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>D1234</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        public static TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos self = new TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos setArrStationName(String arrStationName) {
            this.arrStationName = arrStationName;
            return this;
        }
        public String getArrStationName() {
            return this.arrStationName;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos setArriveTime(String arriveTime) {
            this.arriveTime = arriveTime;
            return this;
        }
        public String getArriveTime() {
            return this.arriveTime;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos setBookTicketInfos(java.util.List<TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos> bookTicketInfos) {
            this.bookTicketInfos = bookTicketInfos;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfosBookTicketInfos> getBookTicketInfos() {
            return this.bookTicketInfos;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos setDepStationName(String depStationName) {
            this.depStationName = depStationName;
            return this;
        }
        public String getDepStationName() {
            return this.depStationName;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModuleBookInfos extends TeaModel {
        @NameInMap("book_train_infos")
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos> bookTrainInfos;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("fail_code")
        public String failCode;

        @NameInMap("fail_msg")
        public String failMsg;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("last_pay_time")
        public String lastPayTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>GW123456</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        public static TrainOrderDetailQueryResponseBodyModuleBookInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleBookInfos self = new TrainOrderDetailQueryResponseBodyModuleBookInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfos setBookTrainInfos(java.util.List<TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos> bookTrainInfos) {
            this.bookTrainInfos = bookTrainInfos;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleBookInfosBookTrainInfos> getBookTrainInfos() {
            return this.bookTrainInfos;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfos setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfos setFailMsg(String failMsg) {
            this.failMsg = failMsg;
            return this;
        }
        public String getFailMsg() {
            return this.failMsg;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfos setLastPayTime(String lastPayTime) {
            this.lastPayTime = lastPayTime;
            return this;
        }
        public String getLastPayTime() {
            return this.lastPayTime;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfos setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public TrainOrderDetailQueryResponseBodyModuleBookInfos setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("change_cost")
        public Long changeCost;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("change_diff")
        public Long changeDiff;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("change_gap_handing_fee")
        public Long changeGapHandingFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("change_min_ticket_amount_handing_fee")
        public Long changeMinTicketAmountHandingFee;

        /**
         * <strong>example:</strong>
         * <p>04</p>
         */
        @NameInMap("coach_no")
        public String coachNo;

        /**
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("fail_code")
        public String failCode;

        @NameInMap("fail_reason")
        public String failReason;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("real_ticket_price")
        public Long realTicketPrice;

        /**
         * <strong>example:</strong>
         * <p>1A</p>
         */
        @NameInMap("seat_no")
        public String seatNo;

        /**
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("seat_type")
        public String seatType;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ticket_entrance")
        public String ticketEntrance;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("ticket_status")
        public String ticketStatus;

        public static TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos self = new TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setChangeCost(Long changeCost) {
            this.changeCost = changeCost;
            return this;
        }
        public Long getChangeCost() {
            return this.changeCost;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setChangeDiff(Long changeDiff) {
            this.changeDiff = changeDiff;
            return this;
        }
        public Long getChangeDiff() {
            return this.changeDiff;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setChangeGapHandingFee(Long changeGapHandingFee) {
            this.changeGapHandingFee = changeGapHandingFee;
            return this;
        }
        public Long getChangeGapHandingFee() {
            return this.changeGapHandingFee;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setChangeMinTicketAmountHandingFee(Long changeMinTicketAmountHandingFee) {
            this.changeMinTicketAmountHandingFee = changeMinTicketAmountHandingFee;
            return this;
        }
        public Long getChangeMinTicketAmountHandingFee() {
            return this.changeMinTicketAmountHandingFee;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setCoachNo(String coachNo) {
            this.coachNo = coachNo;
            return this;
        }
        public String getCoachNo() {
            return this.coachNo;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setRealTicketPrice(Long realTicketPrice) {
            this.realTicketPrice = realTicketPrice;
            return this;
        }
        public Long getRealTicketPrice() {
            return this.realTicketPrice;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setSeatNo(String seatNo) {
            this.seatNo = seatNo;
            return this;
        }
        public String getSeatNo() {
            return this.seatNo;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setTicketEntrance(String ticketEntrance) {
            this.ticketEntrance = ticketEntrance;
            return this;
        }
        public String getTicketEntrance() {
            return this.ticketEntrance;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos setTicketStatus(String ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }
        public String getTicketStatus() {
            return this.ticketStatus;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>BDC</p>
         */
        @NameInMap("arr_station_code")
        public String arrStationCode;

        @NameInMap("arr_station_name")
        public String arrStationName;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("arrive_time")
        public String arriveTime;

        @NameInMap("change_ticket_infos")
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos> changeTicketInfos;

        /**
         * <strong>example:</strong>
         * <p>BTC</p>
         */
        @NameInMap("dep_station_code")
        public String depStationCode;

        @NameInMap("dep_station_name")
        public String depStationName;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>D1234</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        public static TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos self = new TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos setArrStationName(String arrStationName) {
            this.arrStationName = arrStationName;
            return this;
        }
        public String getArrStationName() {
            return this.arrStationName;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos setArriveTime(String arriveTime) {
            this.arriveTime = arriveTime;
            return this;
        }
        public String getArriveTime() {
            return this.arriveTime;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos setChangeTicketInfos(java.util.List<TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos> changeTicketInfos) {
            this.changeTicketInfos = changeTicketInfos;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfosChangeTicketInfos> getChangeTicketInfos() {
            return this.changeTicketInfos;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos setDepStationName(String depStationName) {
            this.depStationName = depStationName;
            return this;
        }
        public String getDepStationName() {
            return this.depStationName;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModuleChangeInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        @NameInMap("change_apply_id")
        public String changeApplyId;

        @NameInMap("change_train_infos")
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos> changeTrainInfos;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("limit_pay_time")
        public String limitPayTime;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("out_change_apply_id")
        public String outChangeApplyId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public String status;

        public static TrainOrderDetailQueryResponseBodyModuleChangeInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleChangeInfos self = new TrainOrderDetailQueryResponseBodyModuleChangeInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfos setChangeApplyId(String changeApplyId) {
            this.changeApplyId = changeApplyId;
            return this;
        }
        public String getChangeApplyId() {
            return this.changeApplyId;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfos setChangeTrainInfos(java.util.List<TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos> changeTrainInfos) {
            this.changeTrainInfos = changeTrainInfos;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleChangeInfosChangeTrainInfos> getChangeTrainInfos() {
            return this.changeTrainInfos;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfos setLimitPayTime(String limitPayTime) {
            this.limitPayTime = limitPayTime;
            return this;
        }
        public String getLimitPayTime() {
            return this.limitPayTime;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfos setOutChangeApplyId(String outChangeApplyId) {
            this.outChangeApplyId = outChangeApplyId;
            return this;
        }
        public String getOutChangeApplyId() {
            return this.outChangeApplyId;
        }

        public TrainOrderDetailQueryResponseBodyModuleChangeInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetailsOfflineRefundInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("refund_price")
        public Long refundPrice;

        public static TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetailsOfflineRefundInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetailsOfflineRefundInfos self = new TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetailsOfflineRefundInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetailsOfflineRefundInfos setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetailsOfflineRefundInfos setRefundPrice(Long refundPrice) {
            this.refundPrice = refundPrice;
            return this;
        }
        public Long getRefundPrice() {
            return this.refundPrice;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("offline_refund_id")
        public String offlineRefundId;

        @NameInMap("offline_refund_infos")
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetailsOfflineRefundInfos> offlineRefundInfos;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("offline_refund_type")
        public String offlineRefundType;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("refund_total_price")
        public Long refundTotalPrice;

        public static TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails self = new TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails setOfflineRefundId(String offlineRefundId) {
            this.offlineRefundId = offlineRefundId;
            return this;
        }
        public String getOfflineRefundId() {
            return this.offlineRefundId;
        }

        public TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails setOfflineRefundInfos(java.util.List<TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetailsOfflineRefundInfos> offlineRefundInfos) {
            this.offlineRefundInfos = offlineRefundInfos;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetailsOfflineRefundInfos> getOfflineRefundInfos() {
            return this.offlineRefundInfos;
        }

        public TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails setOfflineRefundType(String offlineRefundType) {
            this.offlineRefundType = offlineRefundType;
            return this;
        }
        public String getOfflineRefundType() {
            return this.offlineRefundType;
        }

        public TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails setRefundTotalPrice(Long refundTotalPrice) {
            this.refundTotalPrice = refundTotalPrice;
            return this;
        }
        public Long getRefundTotalPrice() {
            return this.refundTotalPrice;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo extends TeaModel {
        @NameInMap("cascade_dept_name")
        public String cascadeDeptName;

        /**
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("cost_center_id")
        public String costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("cost_center_no")
        public String costCenterNo;

        /**
         * <strong>example:</strong>
         * <p>582000002311</p>
         */
        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        /**
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("invoice_id")
        public String invoiceId;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        public static TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo self = new TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setCascadeDeptName(String cascadeDeptName) {
            this.cascadeDeptName = cascadeDeptName;
            return this;
        }
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setCostCenterId(String costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public String getCostCenterId() {
            return this.costCenterId;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setCostCenterNo(String costCenterNo) {
            this.costCenterNo = costCenterNo;
            return this;
        }
        public String getCostCenterNo() {
            return this.costCenterNo;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public String getInvoiceId() {
            return this.invoiceId;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModulePassengerInfoS extends TeaModel {
        @NameInMap("cost_center_info")
        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo costCenterInfo;

        /**
         * <strong>example:</strong>
         * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
         */
        @NameInMap("country_code")
        public String countryCode;

        /**
         * <strong>example:</strong>
         * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
         */
        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        /**
         * <strong>example:</strong>
         * <p>170d9ac6f8807f9ec603c688f45f78a41</p>
         */
        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <strong>example:</strong>
         * <p>b6a6fc1bdf1ba60e25c2e132b612c8819</p>
         */
        @NameInMap("passenger_mobile")
        public String passengerMobile;

        /**
         * <strong>example:</strong>
         * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
         */
        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>b6a6fc1bdf1ba60e25c2e132b612c8819</p>
         */
        @NameInMap("valid_date_end")
        public String validDateEnd;

        public static TrainOrderDetailQueryResponseBodyModulePassengerInfoS build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModulePassengerInfoS self = new TrainOrderDetailQueryResponseBodyModulePassengerInfoS();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoS setCostCenterInfo(TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo costCenterInfo) {
            this.costCenterInfo = costCenterInfo;
            return this;
        }
        public TrainOrderDetailQueryResponseBodyModulePassengerInfoSCostCenterInfo getCostCenterInfo() {
            return this.costCenterInfo;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoS setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoS setPassengerCertNo(String passengerCertNo) {
            this.passengerCertNo = passengerCertNo;
            return this;
        }
        public String getPassengerCertNo() {
            return this.passengerCertNo;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoS setPassengerCertType(String passengerCertType) {
            this.passengerCertType = passengerCertType;
            return this;
        }
        public String getPassengerCertType() {
            return this.passengerCertType;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoS setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoS setPassengerMobile(String passengerMobile) {
            this.passengerMobile = passengerMobile;
            return this;
        }
        public String getPassengerMobile() {
            return this.passengerMobile;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoS setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public TrainOrderDetailQueryResponseBodyModulePassengerInfoS setValidDateEnd(String validDateEnd) {
            this.validDateEnd = validDateEnd;
            return this;
        }
        public String getValidDateEnd() {
            return this.validDateEnd;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("refund_cost")
        public Long refundCost;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("refund_price")
        public Long refundPrice;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        public static TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos self = new TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos setRefundCost(Long refundCost) {
            this.refundCost = refundCost;
            return this;
        }
        public Long getRefundCost() {
            return this.refundCost;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos setRefundPrice(Long refundPrice) {
            this.refundPrice = refundPrice;
            return this;
        }
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo extends TeaModel {
        @NameInMap("arr_station_name")
        public String arrStationName;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>BTC</p>
         */
        @NameInMap("dep_station_code")
        public String depStationCode;

        @NameInMap("dep_station_name")
        public String depStationName;

        /**
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("refund_ticket_infos")
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos> refundTicketInfos;

        /**
         * <strong>example:</strong>
         * <p>K1234</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        public static TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo self = new TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo setArrStationName(String arrStationName) {
            this.arrStationName = arrStationName;
            return this;
        }
        public String getArrStationName() {
            return this.arrStationName;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo setDepStationName(String depStationName) {
            this.depStationName = depStationName;
            return this;
        }
        public String getDepStationName() {
            return this.depStationName;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo setRefundTicketInfos(java.util.List<TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos> refundTicketInfos) {
            this.refundTicketInfos = refundTicketInfos;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfoRefundTicketInfos> getRefundTicketInfos() {
            return this.refundTicketInfos;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModuleRefundInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("fail_code")
        public String failCode;

        @NameInMap("fail_msg")
        public String failMsg;

        /**
         * <strong>example:</strong>
         * <p>123456778</p>
         */
        @NameInMap("out_refund_id")
        public String outRefundId;

        /**
         * <p>String</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("refund_id")
        public String refundId;

        @NameInMap("refund_train_info")
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo> refundTrainInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public String status;

        public static TrainOrderDetailQueryResponseBodyModuleRefundInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModuleRefundInfos self = new TrainOrderDetailQueryResponseBodyModuleRefundInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfos setFailCode(String failCode) {
            this.failCode = failCode;
            return this;
        }
        public String getFailCode() {
            return this.failCode;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfos setFailMsg(String failMsg) {
            this.failMsg = failMsg;
            return this;
        }
        public String getFailMsg() {
            return this.failMsg;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfos setOutRefundId(String outRefundId) {
            this.outRefundId = outRefundId;
            return this;
        }
        public String getOutRefundId() {
            return this.outRefundId;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfos setRefundId(String refundId) {
            this.refundId = refundId;
            return this;
        }
        public String getRefundId() {
            return this.refundId;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfos setRefundTrainInfo(java.util.List<TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo> refundTrainInfo) {
            this.refundTrainInfo = refundTrainInfo;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleRefundInfosRefundTrainInfo> getRefundTrainInfo() {
            return this.refundTrainInfo;
        }

        public TrainOrderDetailQueryResponseBodyModuleRefundInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class TrainOrderDetailQueryResponseBodyModule extends TeaModel {
        @NameInMap("book_infos")
        public TrainOrderDetailQueryResponseBodyModuleBookInfos bookInfos;

        @NameInMap("change_infos")
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleChangeInfos> changeInfos;

        @NameInMap("offlineRefundDetails")
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails> offlineRefundDetails;

        /**
         * <strong>example:</strong>
         * <p>1017028198411054446</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>3703184209587306496</p>
         */
        @NameInMap("out_order_id")
        public String outOrderId;

        @NameInMap("passenger_info_s")
        public java.util.List<TrainOrderDetailQueryResponseBodyModulePassengerInfoS> passengerInfoS;

        @NameInMap("refund_infos")
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleRefundInfos> refundInfos;

        public static TrainOrderDetailQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderDetailQueryResponseBodyModule self = new TrainOrderDetailQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainOrderDetailQueryResponseBodyModule setBookInfos(TrainOrderDetailQueryResponseBodyModuleBookInfos bookInfos) {
            this.bookInfos = bookInfos;
            return this;
        }
        public TrainOrderDetailQueryResponseBodyModuleBookInfos getBookInfos() {
            return this.bookInfos;
        }

        public TrainOrderDetailQueryResponseBodyModule setChangeInfos(java.util.List<TrainOrderDetailQueryResponseBodyModuleChangeInfos> changeInfos) {
            this.changeInfos = changeInfos;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleChangeInfos> getChangeInfos() {
            return this.changeInfos;
        }

        public TrainOrderDetailQueryResponseBodyModule setOfflineRefundDetails(java.util.List<TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails> offlineRefundDetails) {
            this.offlineRefundDetails = offlineRefundDetails;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleOfflineRefundDetails> getOfflineRefundDetails() {
            return this.offlineRefundDetails;
        }

        public TrainOrderDetailQueryResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public TrainOrderDetailQueryResponseBodyModule setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public TrainOrderDetailQueryResponseBodyModule setPassengerInfoS(java.util.List<TrainOrderDetailQueryResponseBodyModulePassengerInfoS> passengerInfoS) {
            this.passengerInfoS = passengerInfoS;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModulePassengerInfoS> getPassengerInfoS() {
            return this.passengerInfoS;
        }

        public TrainOrderDetailQueryResponseBodyModule setRefundInfos(java.util.List<TrainOrderDetailQueryResponseBodyModuleRefundInfos> refundInfos) {
            this.refundInfos = refundInfos;
            return this;
        }
        public java.util.List<TrainOrderDetailQueryResponseBodyModuleRefundInfos> getRefundInfos() {
            return this.refundInfos;
        }

    }

}
