// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainFeeCalculateRefundRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("distribute_order_id")
    public String distributeOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("order_id")
    public String orderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("refund_train_infos")
    public java.util.List<TrainFeeCalculateRefundRequestRefundTrainInfos> refundTrainInfos;

    public static TrainFeeCalculateRefundRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainFeeCalculateRefundRequest self = new TrainFeeCalculateRefundRequest();
        return TeaModel.build(map, self);
    }

    public TrainFeeCalculateRefundRequest setDistributeOrderId(String distributeOrderId) {
        this.distributeOrderId = distributeOrderId;
        return this;
    }
    public String getDistributeOrderId() {
        return this.distributeOrderId;
    }

    public TrainFeeCalculateRefundRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainFeeCalculateRefundRequest setRefundTrainInfos(java.util.List<TrainFeeCalculateRefundRequestRefundTrainInfos> refundTrainInfos) {
        this.refundTrainInfos = refundTrainInfos;
        return this;
    }
    public java.util.List<TrainFeeCalculateRefundRequestRefundTrainInfos> getRefundTrainInfos() {
        return this.refundTrainInfos;
    }

    public static class TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("passenger_name")
        public String passengerName;

        public static TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos self = new TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos setPassengerCertNo(String passengerCertNo) {
            this.passengerCertNo = passengerCertNo;
            return this;
        }
        public String getPassengerCertNo() {
            return this.passengerCertNo;
        }

        public TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos setPassengerCertType(String passengerCertType) {
            this.passengerCertType = passengerCertType;
            return this;
        }
        public String getPassengerCertType() {
            return this.passengerCertType;
        }

        public TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

    }

    public static class TrainFeeCalculateRefundRequestRefundTrainInfos extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("arr_station_code")
        public String arrStationCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("dep_station_code")
        public String depStationCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("refund_passenger_infos")
        public java.util.List<TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos> refundPassengerInfos;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        public static TrainFeeCalculateRefundRequestRefundTrainInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainFeeCalculateRefundRequestRefundTrainInfos self = new TrainFeeCalculateRefundRequestRefundTrainInfos();
            return TeaModel.build(map, self);
        }

        public TrainFeeCalculateRefundRequestRefundTrainInfos setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainFeeCalculateRefundRequestRefundTrainInfos setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainFeeCalculateRefundRequestRefundTrainInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainFeeCalculateRefundRequestRefundTrainInfos setRefundPassengerInfos(java.util.List<TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos> refundPassengerInfos) {
            this.refundPassengerInfos = refundPassengerInfos;
            return this;
        }
        public java.util.List<TrainFeeCalculateRefundRequestRefundTrainInfosRefundPassengerInfos> getRefundPassengerInfos() {
            return this.refundPassengerInfos;
        }

        public TrainFeeCalculateRefundRequestRefundTrainInfos setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

}
