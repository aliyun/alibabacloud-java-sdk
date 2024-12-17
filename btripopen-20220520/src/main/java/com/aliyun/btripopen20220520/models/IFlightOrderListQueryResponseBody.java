// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IFlightOrderListQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<IFlightOrderListQueryResponseBodyModule> module;

    @NameInMap("pageInfo")
    public IFlightOrderListQueryResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-<strong><strong>-</strong></strong>-****-D77369043A5F</p>
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
     * <strong>example:</strong>
     * <p>21041ce********056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IFlightOrderListQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IFlightOrderListQueryResponseBody self = new IFlightOrderListQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public IFlightOrderListQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IFlightOrderListQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IFlightOrderListQueryResponseBody setModule(java.util.List<IFlightOrderListQueryResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<IFlightOrderListQueryResponseBodyModule> getModule() {
        return this.module;
    }

    public IFlightOrderListQueryResponseBody setPageInfo(IFlightOrderListQueryResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public IFlightOrderListQueryResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public IFlightOrderListQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IFlightOrderListQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IFlightOrderListQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("arr_apt")
        public String arrApt;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_apt_code")
        public String arrAptCode;

        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2024-10-28 14:26:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("carrier_airline_code")
        public String carrierAirlineCode;

        @NameInMap("carrier_airline_name")
        public String carrierAirlineName;

        @NameInMap("dep_apt")
        public String depApt;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_apt_code")
        public String depAptCode;

        @NameInMap("dep_city")
        public String depCity;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("dep_terminal")
        public String depTerminal;

        /**
         * <strong>example:</strong>
         * <p>2024-10-25 12:25:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>MU7384</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("share")
        public Boolean share;

        /**
         * <strong>example:</strong>
         * <p>KIX</p>
         */
        @NameInMap("stop_apt_code")
        public String stopAptCode;

        /**
         * <strong>example:</strong>
         * <p>2024-10-26 11:25:00</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city")
        public String stopCity;

        /**
         * <strong>example:</strong>
         * <p>OSA</p>
         */
        @NameInMap("stop_city_code")
        public String stopCityCode;

        /**
         * <strong>example:</strong>
         * <p>2024-10-27 11:26:00</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        public static IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList self = new IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrApt(String arrApt) {
            this.arrApt = arrApt;
            return this;
        }
        public String getArrApt() {
            return this.arrApt;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrAptCode(String arrAptCode) {
            this.arrAptCode = arrAptCode;
            return this;
        }
        public String getArrAptCode() {
            return this.arrAptCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setCarrierAirlineCode(String carrierAirlineCode) {
            this.carrierAirlineCode = carrierAirlineCode;
            return this;
        }
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setCarrierAirlineName(String carrierAirlineName) {
            this.carrierAirlineName = carrierAirlineName;
            return this;
        }
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepApt(String depApt) {
            this.depApt = depApt;
            return this;
        }
        public String getDepApt() {
            return this.depApt;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepAptCode(String depAptCode) {
            this.depAptCode = depAptCode;
            return this;
        }
        public String getDepAptCode() {
            return this.depAptCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setStopAptCode(String stopAptCode) {
            this.stopAptCode = stopAptCode;
            return this;
        }
        public String getStopAptCode() {
            return this.stopAptCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>MU5236</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        public static IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass self = new IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList extends TeaModel {
        @NameInMap("cabin_class")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass> cabinClass;

        /**
         * <strong>example:</strong>
         * <p>MU5236</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>781-6605714721</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <strong>example:</strong>
         * <p>01332</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList self = new IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList setCabinClass(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass> cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass> getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee extends TeaModel {
        @NameInMap("modify_hand_fee")
        public Long modifyHandFee;

        @NameInMap("modify_upgrade_fee")
        public Long modifyUpgradeFee;

        @NameInMap("tax_gap")
        public Long taxGap;

        /**
         * <strong>example:</strong>
         * <p>01332</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee self = new IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee setModifyHandFee(Long modifyHandFee) {
            this.modifyHandFee = modifyHandFee;
            return this;
        }
        public Long getModifyHandFee() {
            return this.modifyHandFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee setModifyUpgradeFee(Long modifyUpgradeFee) {
            this.modifyUpgradeFee = modifyUpgradeFee;
            return this;
        }
        public Long getModifyUpgradeFee() {
            return this.modifyUpgradeFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee setTaxGap(Long taxGap) {
            this.taxGap = taxGap;
            return this;
        }
        public Long getTaxGap() {
            return this.taxGap;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList extends TeaModel {
        @NameInMap("corp_pay_price")
        public Integer corpPayPrice;

        @NameInMap("flight_modify_segment_list")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList> flightModifySegmentList;

        @NameInMap("flight_order_modify_ticket_list")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList> flightOrderModifyTicketList;

        /**
         * <strong>example:</strong>
         * <p>1005200138736000</p>
         */
        @NameInMap("modify_apply_id")
        public Long modifyApplyId;

        @NameInMap("passenger_fee")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee> passengerFee;

        @NameInMap("passenger_list")
        public java.util.List<String> passengerList;

        @NameInMap("person_pay_price")
        public Integer personPayPrice;

        /**
         * <strong>example:</strong>
         * <p>1005200138736028</p>
         */
        @NameInMap("relate_modify_apply_id")
        public Long relateModifyApplyId;

        @NameInMap("service_fee")
        public Long serviceFee;

        @NameInMap("total_fee")
        public Long totalFee;

        public static IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList self = new IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList setCorpPayPrice(Integer corpPayPrice) {
            this.corpPayPrice = corpPayPrice;
            return this;
        }
        public Integer getCorpPayPrice() {
            return this.corpPayPrice;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList setFlightModifySegmentList(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList> flightModifySegmentList) {
            this.flightModifySegmentList = flightModifySegmentList;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList> getFlightModifySegmentList() {
            return this.flightModifySegmentList;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList setFlightOrderModifyTicketList(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList> flightOrderModifyTicketList) {
            this.flightOrderModifyTicketList = flightOrderModifyTicketList;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList> getFlightOrderModifyTicketList() {
            return this.flightOrderModifyTicketList;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList setModifyApplyId(Long modifyApplyId) {
            this.modifyApplyId = modifyApplyId;
            return this;
        }
        public Long getModifyApplyId() {
            return this.modifyApplyId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList setPassengerFee(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee> passengerFee) {
            this.passengerFee = passengerFee;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderListPassengerFee> getPassengerFee() {
            return this.passengerFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList setPassengerList(java.util.List<String> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<String> getPassengerList() {
            return this.passengerList;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList setPersonPayPrice(Integer personPayPrice) {
            this.personPayPrice = personPayPrice;
            return this;
        }
        public Integer getPersonPayPrice() {
            return this.personPayPrice;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList setRelateModifyApplyId(Long relateModifyApplyId) {
            this.relateModifyApplyId = relateModifyApplyId;
            return this;
        }
        public Long getRelateModifyApplyId() {
            return this.relateModifyApplyId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList setTotalFee(Long totalFee) {
            this.totalFee = totalFee;
            return this;
        }
        public Long getTotalFee() {
            return this.totalFee;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>BK3162</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        public static IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass self = new IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList extends TeaModel {
        @NameInMap("cabin_class")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass> cabinClass;

        /**
         * <strong>example:</strong>
         * <p>BK3162</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>999-6605133193</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <strong>example:</strong>
         * <p>01332</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList self = new IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList setCabinClass(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass> cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass> getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("arr_apt")
        public String arrApt;

        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_apt_code")
        public String arrAptCode;

        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2024-10-28 14:26:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("carrier_airline_code")
        public String carrierAirlineCode;

        @NameInMap("carrier_airline_name")
        public String carrierAirlineName;

        @NameInMap("dep_apt")
        public String depApt;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_apt_code")
        public String depAptCode;

        @NameInMap("dep_city")
        public String depCity;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("dep_terminal")
        public String depTerminal;

        /**
         * <strong>example:</strong>
         * <p>2024-10-25 11:24:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>MU5334</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("share")
        public Boolean share;

        /**
         * <strong>example:</strong>
         * <p>KIX</p>
         */
        @NameInMap("stop_apt_code")
        public String stopAptCode;

        /**
         * <strong>example:</strong>
         * <p>2024-10-26 11:25:00</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city")
        public String stopCity;

        /**
         * <strong>example:</strong>
         * <p>OSA</p>
         */
        @NameInMap("stop_city_code")
        public String stopCityCode;

        /**
         * <strong>example:</strong>
         * <p>2024-10-27 11:26:00</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        public static IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList self = new IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrApt(String arrApt) {
            this.arrApt = arrApt;
            return this;
        }
        public String getArrApt() {
            return this.arrApt;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrAptCode(String arrAptCode) {
            this.arrAptCode = arrAptCode;
            return this;
        }
        public String getArrAptCode() {
            return this.arrAptCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setCarrierAirlineCode(String carrierAirlineCode) {
            this.carrierAirlineCode = carrierAirlineCode;
            return this;
        }
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setCarrierAirlineName(String carrierAirlineName) {
            this.carrierAirlineName = carrierAirlineName;
            return this;
        }
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepApt(String depApt) {
            this.depApt = depApt;
            return this;
        }
        public String getDepApt() {
            return this.depApt;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepAptCode(String depAptCode) {
            this.depAptCode = depAptCode;
            return this;
        }
        public String getDepAptCode() {
            return this.depAptCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setStopAptCode(String stopAptCode) {
            this.stopAptCode = stopAptCode;
            return this;
        }
        public String getStopAptCode() {
            return this.stopAptCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee extends TeaModel {
        @NameInMap("no_refund_modify_hand_fee")
        public Long noRefundModifyHandFee;

        @NameInMap("no_refund_modify_upgrade_fee")
        public Long noRefundModifyUpgradeFee;

        @NameInMap("refund_amount")
        public Long refundAmount;

        @NameInMap("refund_hand_fee")
        public Long refundHandFee;

        @NameInMap("refund_modify_amount")
        public Long refundModifyAmount;

        @NameInMap("refund_modify_hand_amount")
        public Long refundModifyHandAmount;

        @NameInMap("refund_modify_upgrade_amount")
        public Long refundModifyUpgradeAmount;

        @NameInMap("refund_tax_hand_fee")
        public Long refundTaxHandFee;

        /**
         * <strong>example:</strong>
         * <p>01332</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee self = new IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee setNoRefundModifyHandFee(Long noRefundModifyHandFee) {
            this.noRefundModifyHandFee = noRefundModifyHandFee;
            return this;
        }
        public Long getNoRefundModifyHandFee() {
            return this.noRefundModifyHandFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee setNoRefundModifyUpgradeFee(Long noRefundModifyUpgradeFee) {
            this.noRefundModifyUpgradeFee = noRefundModifyUpgradeFee;
            return this;
        }
        public Long getNoRefundModifyUpgradeFee() {
            return this.noRefundModifyUpgradeFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee setRefundAmount(Long refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee setRefundHandFee(Long refundHandFee) {
            this.refundHandFee = refundHandFee;
            return this;
        }
        public Long getRefundHandFee() {
            return this.refundHandFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee setRefundModifyAmount(Long refundModifyAmount) {
            this.refundModifyAmount = refundModifyAmount;
            return this;
        }
        public Long getRefundModifyAmount() {
            return this.refundModifyAmount;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee setRefundModifyHandAmount(Long refundModifyHandAmount) {
            this.refundModifyHandAmount = refundModifyHandAmount;
            return this;
        }
        public Long getRefundModifyHandAmount() {
            return this.refundModifyHandAmount;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee setRefundModifyUpgradeAmount(Long refundModifyUpgradeAmount) {
            this.refundModifyUpgradeAmount = refundModifyUpgradeAmount;
            return this;
        }
        public Long getRefundModifyUpgradeAmount() {
            return this.refundModifyUpgradeAmount;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee setRefundTaxHandFee(Long refundTaxHandFee) {
            this.refundTaxHandFee = refundTaxHandFee;
            return this;
        }
        public Long getRefundTaxHandFee() {
            return this.refundTaxHandFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList extends TeaModel {
        @NameInMap("corp_refund_Amount")
        public Integer corpRefundAmount;

        @NameInMap("flight_order_refund_ticket_list")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList> flightOrderRefundTicketList;

        @NameInMap("flight_refund_segment_list")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList> flightRefundSegmentList;

        @NameInMap("passenger_fee")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee> passengerFee;

        @NameInMap("passenger_info")
        public java.util.List<String> passengerInfo;

        @NameInMap("person_refund_Amount")
        public Integer personRefundAmount;

        @NameInMap("refund_Amount")
        public Integer refundAmount;

        /**
         * <strong>example:</strong>
         * <p>1006200138737069</p>
         */
        @NameInMap("refund_apply_id")
        public Long refundApplyId;

        @NameInMap("refund_hand_fee")
        public Integer refundHandFee;

        @NameInMap("service_fee")
        public Long serviceFee;

        public static IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList self = new IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList setCorpRefundAmount(Integer corpRefundAmount) {
            this.corpRefundAmount = corpRefundAmount;
            return this;
        }
        public Integer getCorpRefundAmount() {
            return this.corpRefundAmount;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList setFlightOrderRefundTicketList(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList> flightOrderRefundTicketList) {
            this.flightOrderRefundTicketList = flightOrderRefundTicketList;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList> getFlightOrderRefundTicketList() {
            return this.flightOrderRefundTicketList;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList setFlightRefundSegmentList(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList> flightRefundSegmentList) {
            this.flightRefundSegmentList = flightRefundSegmentList;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList> getFlightRefundSegmentList() {
            return this.flightRefundSegmentList;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList setPassengerFee(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee> passengerFee) {
            this.passengerFee = passengerFee;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderListPassengerFee> getPassengerFee() {
            return this.passengerFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList setPassengerInfo(java.util.List<String> passengerInfo) {
            this.passengerInfo = passengerInfo;
            return this;
        }
        public java.util.List<String> getPassengerInfo() {
            return this.passengerInfo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList setPersonRefundAmount(Integer personRefundAmount) {
            this.personRefundAmount = personRefundAmount;
            return this;
        }
        public Integer getPersonRefundAmount() {
            return this.personRefundAmount;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList setRefundAmount(Integer refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Integer getRefundAmount() {
            return this.refundAmount;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList setRefundApplyId(Long refundApplyId) {
            this.refundApplyId = refundApplyId;
            return this;
        }
        public Long getRefundApplyId() {
            return this.refundApplyId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList setRefundHandFee(Integer refundHandFee) {
            this.refundHandFee = refundHandFee;
            return this;
        }
        public Integer getRefundHandFee() {
            return this.refundHandFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightSaleOrderBookerInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>01323</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static IFlightOrderListQueryResponseBodyModuleFlightSaleOrderBookerInfo build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightSaleOrderBookerInfo self = new IFlightOrderListQueryResponseBodyModuleFlightSaleOrderBookerInfo();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderBookerInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderBookerInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>17060573244016310</p>
         */
        @NameInMap("ins_order_id")
        public String insOrderId;

        @NameInMap("ins_pay_type")
        public String insPayType;

        @NameInMap("ins_total_price")
        public Integer insTotalPrice;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("trade_action")
        public String tradeAction;

        public static IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList self = new IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList setInsPayType(String insPayType) {
            this.insPayType = insPayType;
            return this;
        }
        public String getInsPayType() {
            return this.insPayType;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList setInsTotalPrice(Integer insTotalPrice) {
            this.insTotalPrice = insTotalPrice;
            return this;
        }
        public Integer getInsTotalPrice() {
            return this.insTotalPrice;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList setTradeAction(String tradeAction) {
            this.tradeAction = tradeAction;
            return this;
        }
        public String getTradeAction() {
            return this.tradeAction;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>V</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>MF8765</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        public static IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass self = new IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList extends TeaModel {
        @NameInMap("cabin_class")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass> cabinClass;

        @NameInMap("tax")
        public Integer tax;

        /**
         * <strong>example:</strong>
         * <p>018-6605785754</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("ticket_price")
        public Integer ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>01323</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList self = new IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList setCabinClass(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass> cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass> getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("arr_apt")
        public String arrApt;

        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_apt_code")
        public String arrAptCode;

        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>HKG</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>T2</p>
         */
        @NameInMap("arr_terminal")
        public String arrTerminal;

        /**
         * <strong>example:</strong>
         * <p>2024-10-25 15:26:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("carrier_airline_code")
        public String carrierAirlineCode;

        @NameInMap("carrier_airline_name")
        public String carrierAirlineName;

        @NameInMap("dep_apt")
        public String depApt;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_apt_code")
        public String depAptCode;

        @NameInMap("dep_city")
        public String depCity;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <strong>example:</strong>
         * <p>T1</p>
         */
        @NameInMap("dep_terminal")
        public String depTerminal;

        /**
         * <strong>example:</strong>
         * <p>2024-10-24 15:26:00</p>
         */
        @NameInMap("dep_time")
        public String depTime;

        /**
         * <strong>example:</strong>
         * <p>MU5925</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("journey_index")
        public Integer journeyIndex;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("share")
        public Boolean share;

        /**
         * <strong>example:</strong>
         * <p>KIX</p>
         */
        @NameInMap("stop_apt_code")
        public String stopAptCode;

        /**
         * <strong>example:</strong>
         * <p>2024-10-26 11:25:00</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city")
        public String stopCity;

        /**
         * <strong>example:</strong>
         * <p>OSA</p>
         */
        @NameInMap("stop_city_code")
        public String stopCityCode;

        /**
         * <strong>example:</strong>
         * <p>2024-10-27 11:26:00</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        public static IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList self = new IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrApt(String arrApt) {
            this.arrApt = arrApt;
            return this;
        }
        public String getArrApt() {
            return this.arrApt;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrAptCode(String arrAptCode) {
            this.arrAptCode = arrAptCode;
            return this;
        }
        public String getArrAptCode() {
            return this.arrAptCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setCarrierAirlineCode(String carrierAirlineCode) {
            this.carrierAirlineCode = carrierAirlineCode;
            return this;
        }
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setCarrierAirlineName(String carrierAirlineName) {
            this.carrierAirlineName = carrierAirlineName;
            return this;
        }
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepApt(String depApt) {
            this.depApt = depApt;
            return this;
        }
        public String getDepApt() {
            return this.depApt;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepAptCode(String depAptCode) {
            this.depAptCode = depAptCode;
            return this;
        }
        public String getDepAptCode() {
            return this.depAptCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setStopAptCode(String stopAptCode) {
            this.stopAptCode = stopAptCode;
            return this;
        }
        public String getStopAptCode() {
            return this.stopAptCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0111</p>
         */
        @NameInMap("cost_center_id")
        public String costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>1002</p>
         */
        @NameInMap("department_id")
        public String departmentId;

        @NameInMap("department_name")
        public String departmentName;

        /**
         * <strong>example:</strong>
         * <p>01112</p>
         */
        @NameInMap("invoice_id")
        public String invoiceId;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>100757</p>
         */
        @NameInMap("job_no")
        public String jobNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("passenger_type")
        public Integer passengerType;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        /**
         * <strong>example:</strong>
         * <p>01323</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList self = new IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setCostCenterId(String costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public String getCostCenterId() {
            return this.costCenterId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public String getInvoiceId() {
            return this.invoiceId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModuleFlightSaleOrder extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>82587500</p>
         */
        @NameInMap("apply_id")
        public Long applyId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("book_type")
        public Integer bookType;

        @NameInMap("booker_info")
        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderBookerInfo bookerInfo;

        @NameInMap("corp_pay_price")
        public Long corpPayPrice;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("exceed_apply_id")
        public String exceedApplyId;

        @NameInMap("flight_order_insure_list")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList> flightOrderInsureList;

        @NameInMap("flight_order_ticket_list")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList> flightOrderTicketList;

        @NameInMap("flight_segment_list")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList> flightSegmentList;

        @NameInMap("mix_pay")
        public Boolean mixPay;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("order_create_time")
        public String orderCreateTime;

        /**
         * <strong>example:</strong>
         * <p>1003038200110661039</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>yyyy-MM-dd HH:mm:ss</p>
         */
        @NameInMap("order_pay_time")
        public String orderPayTime;

        @NameInMap("order_reserve_price")
        public Long orderReservePrice;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("order_status_desc")
        public String orderStatusDesc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("order_type")
        public Integer orderType;

        @NameInMap("passenger_list")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList> passengerList;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("pay_type")
        public Integer payType;

        @NameInMap("person_pay_price")
        public Long personPayPrice;

        @NameInMap("service_fee")
        public Long serviceFee;

        /**
         * <strong>example:</strong>
         * <p>business_trip_api_000001</p>
         */
        @NameInMap("third_part_apply_id")
        public String thirdPartApplyId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("trip_type")
        public Integer tripType;

        public static IFlightOrderListQueryResponseBodyModuleFlightSaleOrder build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModuleFlightSaleOrder self = new IFlightOrderListQueryResponseBodyModuleFlightSaleOrder();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setBookType(Integer bookType) {
            this.bookType = bookType;
            return this;
        }
        public Integer getBookType() {
            return this.bookType;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setBookerInfo(IFlightOrderListQueryResponseBodyModuleFlightSaleOrderBookerInfo bookerInfo) {
            this.bookerInfo = bookerInfo;
            return this;
        }
        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrderBookerInfo getBookerInfo() {
            return this.bookerInfo;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setCorpPayPrice(Long corpPayPrice) {
            this.corpPayPrice = corpPayPrice;
            return this;
        }
        public Long getCorpPayPrice() {
            return this.corpPayPrice;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setExceedApplyId(String exceedApplyId) {
            this.exceedApplyId = exceedApplyId;
            return this;
        }
        public String getExceedApplyId() {
            return this.exceedApplyId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setFlightOrderInsureList(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList> flightOrderInsureList) {
            this.flightOrderInsureList = flightOrderInsureList;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList> getFlightOrderInsureList() {
            return this.flightOrderInsureList;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setFlightOrderTicketList(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList> flightOrderTicketList) {
            this.flightOrderTicketList = flightOrderTicketList;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList> getFlightOrderTicketList() {
            return this.flightOrderTicketList;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setFlightSegmentList(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList> flightSegmentList) {
            this.flightSegmentList = flightSegmentList;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderFlightSegmentList> getFlightSegmentList() {
            return this.flightSegmentList;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setMixPay(Boolean mixPay) {
            this.mixPay = mixPay;
            return this;
        }
        public Boolean getMixPay() {
            return this.mixPay;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setOrderCreateTime(String orderCreateTime) {
            this.orderCreateTime = orderCreateTime;
            return this;
        }
        public String getOrderCreateTime() {
            return this.orderCreateTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setOrderPayTime(String orderPayTime) {
            this.orderPayTime = orderPayTime;
            return this;
        }
        public String getOrderPayTime() {
            return this.orderPayTime;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setOrderReservePrice(Long orderReservePrice) {
            this.orderReservePrice = orderReservePrice;
            return this;
        }
        public Long getOrderReservePrice() {
            return this.orderReservePrice;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setPassengerList(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightSaleOrderPassengerList> getPassengerList() {
            return this.passengerList;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setPersonPayPrice(Long personPayPrice) {
            this.personPayPrice = personPayPrice;
            return this;
        }
        public Long getPersonPayPrice() {
            return this.personPayPrice;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setThirdPartApplyId(String thirdPartApplyId) {
            this.thirdPartApplyId = thirdPartApplyId;
            return this;
        }
        public String getThirdPartApplyId() {
            return this.thirdPartApplyId;
        }

        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

    public static class IFlightOrderListQueryResponseBodyModule extends TeaModel {
        @NameInMap("flight_modify_order_list")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList> flightModifyOrderList;

        @NameInMap("flight_refund_order_list")
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList> flightRefundOrderList;

        @NameInMap("flight_sale_order")
        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder flightSaleOrder;

        public static IFlightOrderListQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyModule self = new IFlightOrderListQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyModule setFlightModifyOrderList(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList> flightModifyOrderList) {
            this.flightModifyOrderList = flightModifyOrderList;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightModifyOrderList> getFlightModifyOrderList() {
            return this.flightModifyOrderList;
        }

        public IFlightOrderListQueryResponseBodyModule setFlightRefundOrderList(java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList> flightRefundOrderList) {
            this.flightRefundOrderList = flightRefundOrderList;
            return this;
        }
        public java.util.List<IFlightOrderListQueryResponseBodyModuleFlightRefundOrderList> getFlightRefundOrderList() {
            return this.flightRefundOrderList;
        }

        public IFlightOrderListQueryResponseBodyModule setFlightSaleOrder(IFlightOrderListQueryResponseBodyModuleFlightSaleOrder flightSaleOrder) {
            this.flightSaleOrder = flightSaleOrder;
            return this;
        }
        public IFlightOrderListQueryResponseBodyModuleFlightSaleOrder getFlightSaleOrder() {
            return this.flightSaleOrder;
        }

    }

    public static class IFlightOrderListQueryResponseBodyPageInfo extends TeaModel {
        @NameInMap("number")
        public Integer number;

        /**
         * <strong>example:</strong>
         * <p>CAESBgoEIgIIABgAIhkKFwMSAAAAMUw4ZGViODFlYmM3MYzM4</p>
         */
        @NameInMap("scroll_id")
        public String scrollId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_number")
        public Integer totalNumber;

        public static IFlightOrderListQueryResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderListQueryResponseBodyPageInfo self = new IFlightOrderListQueryResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public IFlightOrderListQueryResponseBodyPageInfo setNumber(Integer number) {
            this.number = number;
            return this;
        }
        public Integer getNumber() {
            return this.number;
        }

        public IFlightOrderListQueryResponseBodyPageInfo setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public IFlightOrderListQueryResponseBodyPageInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

}
