// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainFeeCalculateChangeRequest extends TeaModel {
    @NameInMap("change_train_details")
    public java.util.List<TrainFeeCalculateChangeRequestChangeTrainDetails> changeTrainDetails;

    @NameInMap("distribute_order_id")
    public String distributeOrderId;

    @NameInMap("order_id")
    public String orderId;

    public static TrainFeeCalculateChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainFeeCalculateChangeRequest self = new TrainFeeCalculateChangeRequest();
        return TeaModel.build(map, self);
    }

    public TrainFeeCalculateChangeRequest setChangeTrainDetails(java.util.List<TrainFeeCalculateChangeRequestChangeTrainDetails> changeTrainDetails) {
        this.changeTrainDetails = changeTrainDetails;
        return this;
    }
    public java.util.List<TrainFeeCalculateChangeRequestChangeTrainDetails> getChangeTrainDetails() {
        return this.changeTrainDetails;
    }

    public TrainFeeCalculateChangeRequest setDistributeOrderId(String distributeOrderId) {
        this.distributeOrderId = distributeOrderId;
        return this;
    }
    public String getDistributeOrderId() {
        return this.distributeOrderId;
    }

    public TrainFeeCalculateChangeRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public static class TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo extends TeaModel {
        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        @NameInMap("passenger_name")
        public String passengerName;

        public static TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo self = new TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo setPassengerCertNo(String passengerCertNo) {
            this.passengerCertNo = passengerCertNo;
            return this;
        }
        public String getPassengerCertNo() {
            return this.passengerCertNo;
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo setPassengerCertType(String passengerCertType) {
            this.passengerCertType = passengerCertType;
            return this;
        }
        public String getPassengerCertType() {
            return this.passengerCertType;
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

    }

    public static class TrainFeeCalculateChangeRequestChangeTrainDetails extends TeaModel {
        @NameInMap("arr_station_code")
        public String arrStationCode;

        @NameInMap("dep_station_code")
        public String depStationCode;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("original_dep_time")
        public String originalDepTime;

        @NameInMap("original_train_no")
        public String originalTrainNo;

        @NameInMap("passenger_info")
        public TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo passengerInfo;

        @NameInMap("seat_type")
        public String seatType;

        @NameInMap("train_no")
        public String trainNo;

        public static TrainFeeCalculateChangeRequestChangeTrainDetails build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateChangeRequestChangeTrainDetails self = new TrainFeeCalculateChangeRequestChangeTrainDetails();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetails setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetails setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetails setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetails setOriginalDepTime(String originalDepTime) {
            this.originalDepTime = originalDepTime;
            return this;
        }
        public String getOriginalDepTime() {
            return this.originalDepTime;
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetails setOriginalTrainNo(String originalTrainNo) {
            this.originalTrainNo = originalTrainNo;
            return this;
        }
        public String getOriginalTrainNo() {
            return this.originalTrainNo;
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetails setPassengerInfo(TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo passengerInfo) {
            this.passengerInfo = passengerInfo;
            return this;
        }
        public TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo getPassengerInfo() {
            return this.passengerInfo;
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetails setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainFeeCalculateChangeRequestChangeTrainDetails setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

}
