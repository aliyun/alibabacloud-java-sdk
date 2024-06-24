// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderCreateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("accept_no_seat")
    public String acceptNoSeat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("book_train_infos")
    public java.util.List<TrainOrderCreateRequestBookTrainInfos> bookTrainInfos;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12344321</p>
     */
    @NameInMap("btrip_user_id")
    public String btripUserId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("btrip_user_name")
    public String btripUserName;

    @NameInMap("business_info")
    public TrainOrderCreateRequestBusinessInfo businessInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("contact_info")
    public TrainOrderCreateRequestContactInfo contactInfo;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("force_match")
    public String forceMatch;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("is_pay_now")
    public Boolean isPayNow;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("out_order_id")
    public String outOrderId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("passenger_open_info_s")
    public java.util.List<TrainOrderCreateRequestPassengerOpenInfoS> passengerOpenInfoS;

    public static TrainOrderCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderCreateRequest self = new TrainOrderCreateRequest();
        return TeaModel.build(map, self);
    }

    public TrainOrderCreateRequest setAcceptNoSeat(String acceptNoSeat) {
        this.acceptNoSeat = acceptNoSeat;
        return this;
    }
    public String getAcceptNoSeat() {
        return this.acceptNoSeat;
    }

    public TrainOrderCreateRequest setBookTrainInfos(java.util.List<TrainOrderCreateRequestBookTrainInfos> bookTrainInfos) {
        this.bookTrainInfos = bookTrainInfos;
        return this;
    }
    public java.util.List<TrainOrderCreateRequestBookTrainInfos> getBookTrainInfos() {
        return this.bookTrainInfos;
    }

    public TrainOrderCreateRequest setBtripUserId(String btripUserId) {
        this.btripUserId = btripUserId;
        return this;
    }
    public String getBtripUserId() {
        return this.btripUserId;
    }

    public TrainOrderCreateRequest setBtripUserName(String btripUserName) {
        this.btripUserName = btripUserName;
        return this;
    }
    public String getBtripUserName() {
        return this.btripUserName;
    }

    public TrainOrderCreateRequest setBusinessInfo(TrainOrderCreateRequestBusinessInfo businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public TrainOrderCreateRequestBusinessInfo getBusinessInfo() {
        return this.businessInfo;
    }

    public TrainOrderCreateRequest setContactInfo(TrainOrderCreateRequestContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }
    public TrainOrderCreateRequestContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public TrainOrderCreateRequest setForceMatch(String forceMatch) {
        this.forceMatch = forceMatch;
        return this;
    }
    public String getForceMatch() {
        return this.forceMatch;
    }

    public TrainOrderCreateRequest setIsPayNow(Boolean isPayNow) {
        this.isPayNow = isPayNow;
        return this;
    }
    public Boolean getIsPayNow() {
        return this.isPayNow;
    }

    public TrainOrderCreateRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public TrainOrderCreateRequest setPassengerOpenInfoS(java.util.List<TrainOrderCreateRequestPassengerOpenInfoS> passengerOpenInfoS) {
        this.passengerOpenInfoS = passengerOpenInfoS;
        return this;
    }
    public java.util.List<TrainOrderCreateRequestPassengerOpenInfoS> getPassengerOpenInfoS() {
        return this.passengerOpenInfoS;
    }

    public static class TrainOrderCreateRequestBookTrainInfosBookTicketInfos extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

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
         * <p>100</p>
         */
        @NameInMap("ticket_price")
        public Long ticketPrice;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ticket_type")
        public String ticketType;

        public static TrainOrderCreateRequestBookTrainInfosBookTicketInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderCreateRequestBookTrainInfosBookTicketInfos self = new TrainOrderCreateRequestBookTrainInfosBookTicketInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderCreateRequestBookTrainInfosBookTicketInfos setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainOrderCreateRequestBookTrainInfosBookTicketInfos setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainOrderCreateRequestBookTrainInfosBookTicketInfos setTicketPrice(Long ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Long getTicketPrice() {
            return this.ticketPrice;
        }

        public TrainOrderCreateRequestBookTrainInfosBookTicketInfos setTicketType(String ticketType) {
            this.ticketType = ticketType;
            return this;
        }
        public String getTicketType() {
            return this.ticketType;
        }

    }

    public static class TrainOrderCreateRequestBookTrainInfos extends TeaModel {
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
         */
        @NameInMap("book_ticket_infos")
        public java.util.List<TrainOrderCreateRequestBookTrainInfosBookTicketInfos> bookTicketInfos;

        /**
         * <strong>example:</strong>
         * <p>1T</p>
         */
        @NameInMap("choose_beds")
        public String chooseBeds;

        /**
         * <strong>example:</strong>
         * <p>1T</p>
         */
        @NameInMap("choose_seats")
        public String chooseSeats;

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
         * <p>K123456</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        public static TrainOrderCreateRequestBookTrainInfos build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderCreateRequestBookTrainInfos self = new TrainOrderCreateRequestBookTrainInfos();
            return TeaModel.build(map, self);
        }

        public TrainOrderCreateRequestBookTrainInfos setArrStationCode(String arrStationCode) {
            this.arrStationCode = arrStationCode;
            return this;
        }
        public String getArrStationCode() {
            return this.arrStationCode;
        }

        public TrainOrderCreateRequestBookTrainInfos setBookTicketInfos(java.util.List<TrainOrderCreateRequestBookTrainInfosBookTicketInfos> bookTicketInfos) {
            this.bookTicketInfos = bookTicketInfos;
            return this;
        }
        public java.util.List<TrainOrderCreateRequestBookTrainInfosBookTicketInfos> getBookTicketInfos() {
            return this.bookTicketInfos;
        }

        public TrainOrderCreateRequestBookTrainInfos setChooseBeds(String chooseBeds) {
            this.chooseBeds = chooseBeds;
            return this;
        }
        public String getChooseBeds() {
            return this.chooseBeds;
        }

        public TrainOrderCreateRequestBookTrainInfos setChooseSeats(String chooseSeats) {
            this.chooseSeats = chooseSeats;
            return this;
        }
        public String getChooseSeats() {
            return this.chooseSeats;
        }

        public TrainOrderCreateRequestBookTrainInfos setDepStationCode(String depStationCode) {
            this.depStationCode = depStationCode;
            return this;
        }
        public String getDepStationCode() {
            return this.depStationCode;
        }

        public TrainOrderCreateRequestBookTrainInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public TrainOrderCreateRequestBookTrainInfos setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

    }

    public static class TrainOrderCreateRequestBusinessInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4321</p>
         */
        @NameInMap("customer_apply_id")
        public String customerApplyId;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("customer_itinerary_id")
        public String customerItineraryId;

        public static TrainOrderCreateRequestBusinessInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderCreateRequestBusinessInfo self = new TrainOrderCreateRequestBusinessInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderCreateRequestBusinessInfo setCustomerApplyId(String customerApplyId) {
            this.customerApplyId = customerApplyId;
            return this;
        }
        public String getCustomerApplyId() {
            return this.customerApplyId;
        }

        public TrainOrderCreateRequestBusinessInfo setCustomerItineraryId(String customerItineraryId) {
            this.customerItineraryId = customerItineraryId;
            return this;
        }
        public String getCustomerItineraryId() {
            return this.customerItineraryId;
        }

    }

    public static class TrainOrderCreateRequestContactInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("passenger_id")
        public String passengerId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b6a6fc1bdf1ba60e25c2e132b612c8819</p>
         */
        @NameInMap("passenger_mobile")
        public String passengerMobile;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
         */
        @NameInMap("passenger_name")
        public String passengerName;

        public static TrainOrderCreateRequestContactInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderCreateRequestContactInfo self = new TrainOrderCreateRequestContactInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderCreateRequestContactInfo setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainOrderCreateRequestContactInfo setPassengerMobile(String passengerMobile) {
            this.passengerMobile = passengerMobile;
            return this;
        }
        public String getPassengerMobile() {
            return this.passengerMobile;
        }

        public TrainOrderCreateRequestContactInfo setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

    }

    public static class TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo extends TeaModel {
        @NameInMap("cascade_dept_name")
        public String cascadeDeptName;

        /**
         * <strong>example:</strong>
         * <p>123321</p>
         */
        @NameInMap("cost_center_id")
        public String costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>12332112344</p>
         */
        @NameInMap("cost_center_no")
        public String costCenterNo;

        /**
         * <strong>example:</strong>
         * <p>010000009</p>
         */
        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        /**
         * <strong>example:</strong>
         * <p>111111</p>
         */
        @NameInMap("invoice_id")
        public String invoiceId;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>acs</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        public static TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo self = new TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo();
            return TeaModel.build(map, self);
        }

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setCascadeDeptName(String cascadeDeptName) {
            this.cascadeDeptName = cascadeDeptName;
            return this;
        }
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setCostCenterId(String costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public String getCostCenterId() {
            return this.costCenterId;
        }

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setCostCenterNo(String costCenterNo) {
            this.costCenterNo = costCenterNo;
            return this;
        }
        public String getCostCenterNo() {
            return this.costCenterNo;
        }

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public String getInvoiceId() {
            return this.invoiceId;
        }

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

    }

    public static class TrainOrderCreateRequestPassengerOpenInfoS extends TeaModel {
        @NameInMap("cost_center_info")
        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo costCenterInfo;

        /**
         * <strong>example:</strong>
         * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
         */
        @NameInMap("country_code")
        public String countryCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
         */
        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
         */
        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        /**
         * <p>This parameter is required.</p>
         * 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>949c9f34f677a0e5d249dfc94f5e62cc7</p>
         */
        @NameInMap("passenger_name")
        public String passengerName;

        /**
         * <strong>example:</strong>
         * <p>291487e553c5abde3b611aae283e2526f0d733ab55094aadc0b5ba587222a233c</p>
         */
        @NameInMap("valid_date_end")
        public String validDateEnd;

        public static TrainOrderCreateRequestPassengerOpenInfoS build(java.util.Map<String, ?> map) throws Exception {
            TrainOrderCreateRequestPassengerOpenInfoS self = new TrainOrderCreateRequestPassengerOpenInfoS();
            return TeaModel.build(map, self);
        }

        public TrainOrderCreateRequestPassengerOpenInfoS setCostCenterInfo(TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo costCenterInfo) {
            this.costCenterInfo = costCenterInfo;
            return this;
        }
        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo getCostCenterInfo() {
            return this.costCenterInfo;
        }

        public TrainOrderCreateRequestPassengerOpenInfoS setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public TrainOrderCreateRequestPassengerOpenInfoS setPassengerCertNo(String passengerCertNo) {
            this.passengerCertNo = passengerCertNo;
            return this;
        }
        public String getPassengerCertNo() {
            return this.passengerCertNo;
        }

        public TrainOrderCreateRequestPassengerOpenInfoS setPassengerCertType(String passengerCertType) {
            this.passengerCertType = passengerCertType;
            return this;
        }
        public String getPassengerCertType() {
            return this.passengerCertType;
        }

        public TrainOrderCreateRequestPassengerOpenInfoS setPassengerId(String passengerId) {
            this.passengerId = passengerId;
            return this;
        }
        public String getPassengerId() {
            return this.passengerId;
        }

        public TrainOrderCreateRequestPassengerOpenInfoS setPassengerMobile(String passengerMobile) {
            this.passengerMobile = passengerMobile;
            return this;
        }
        public String getPassengerMobile() {
            return this.passengerMobile;
        }

        public TrainOrderCreateRequestPassengerOpenInfoS setPassengerName(String passengerName) {
            this.passengerName = passengerName;
            return this;
        }
        public String getPassengerName() {
            return this.passengerName;
        }

        public TrainOrderCreateRequestPassengerOpenInfoS setValidDateEnd(String validDateEnd) {
            this.validDateEnd = validDateEnd;
            return this;
        }
        public String getValidDateEnd() {
            return this.validDateEnd;
        }

    }

}
