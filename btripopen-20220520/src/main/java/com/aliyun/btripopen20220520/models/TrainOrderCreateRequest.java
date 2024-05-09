// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderCreateRequest extends TeaModel {
    @NameInMap("accept_no_seat")
    public String acceptNoSeat;

    @NameInMap("book_train_infos")
    public java.util.List<TrainOrderCreateRequestBookTrainInfos> bookTrainInfos;

    @NameInMap("btrip_user_id")
    public String btripUserId;

    @NameInMap("btrip_user_name")
    public String btripUserName;

    @NameInMap("business_info")
    public TrainOrderCreateRequestBusinessInfo businessInfo;

    @NameInMap("contact_info")
    public TrainOrderCreateRequestContactInfo contactInfo;

    @NameInMap("force_match")
    public String forceMatch;

    @NameInMap("is_pay_now")
    public Boolean isPayNow;

    @NameInMap("out_order_id")
    public String outOrderId;

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
        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("seat_type")
        public String seatType;

        @NameInMap("ticket_price")
        public Long ticketPrice;

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
        @NameInMap("arr_station_code")
        public String arrStationCode;

        @NameInMap("book_ticket_infos")
        public java.util.List<TrainOrderCreateRequestBookTrainInfosBookTicketInfos> bookTicketInfos;

        @NameInMap("choose_beds")
        public String chooseBeds;

        @NameInMap("choose_seats")
        public String chooseSeats;

        @NameInMap("dep_station_code")
        public String depStationCode;

        @NameInMap("dep_time")
        public String depTime;

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
        @NameInMap("customer_apply_id")
        public String customerApplyId;

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
        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("passenger_mobile")
        public String passengerMobile;

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

        @NameInMap("cost_center_id")
        public String costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        @NameInMap("cost_center_no")
        public String costCenterNo;

        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        @NameInMap("invoice_id")
        public String invoiceId;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

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

        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class TrainOrderCreateRequestPassengerOpenInfoS extends TeaModel {
        @NameInMap("cost_center_info")
        public TrainOrderCreateRequestPassengerOpenInfoSCostCenterInfo costCenterInfo;

        @NameInMap("country_code")
        public String countryCode;

        @NameInMap("passenger_cert_no")
        public String passengerCertNo;

        @NameInMap("passenger_cert_type")
        public String passengerCertType;

        @NameInMap("passenger_id")
        public String passengerId;

        @NameInMap("passenger_mobile")
        public String passengerMobile;

        @NameInMap("passenger_name")
        public String passengerName;

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
