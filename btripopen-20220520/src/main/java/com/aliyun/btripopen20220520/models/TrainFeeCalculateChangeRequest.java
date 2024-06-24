// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainFeeCalculateChangeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("change_train_details")
    public java.util.List<TrainFeeCalculateChangeRequestChangeTrainDetails> changeTrainDetails;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("distribute_order_id")
    public String distributeOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2627694109810885616</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
         */
        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>170d9ac6f8807f9ec603c688f45f78a41</p>
         */
        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
         */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BDC</p>
         */
        @NameInMap("arr_station_code")
        public String arrStationCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BTC</p>
         */
        @NameInMap("dep_station_code")
        public String depStationCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-06 15:19:01</p>
         */
        @NameInMap("original_dep_time")
        public String originalDepTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>K234</p>
         */
        @NameInMap("original_train_no")
        public String originalTrainNo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("passenger_info")
        public TrainFeeCalculateChangeRequestChangeTrainDetailsPassengerInfo passengerInfo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("seat_type")
        public String seatType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>K2345</p>
         */
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
