// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IFlightOrderDetailQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public IFlightOrderDetailQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
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
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static IFlightOrderDetailQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IFlightOrderDetailQueryResponseBody self = new IFlightOrderDetailQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public IFlightOrderDetailQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IFlightOrderDetailQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IFlightOrderDetailQueryResponseBody setModule(IFlightOrderDetailQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IFlightOrderDetailQueryResponseBodyModule getModule() {
        return this.module;
    }

    public IFlightOrderDetailQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IFlightOrderDetailQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IFlightOrderDetailQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList extends TeaModel {
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

        public static IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList self = new IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrApt(String arrApt) {
            this.arrApt = arrApt;
            return this;
        }
        public String getArrApt() {
            return this.arrApt;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrAptCode(String arrAptCode) {
            this.arrAptCode = arrAptCode;
            return this;
        }
        public String getArrAptCode() {
            return this.arrAptCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setCarrierAirlineCode(String carrierAirlineCode) {
            this.carrierAirlineCode = carrierAirlineCode;
            return this;
        }
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setCarrierAirlineName(String carrierAirlineName) {
            this.carrierAirlineName = carrierAirlineName;
            return this;
        }
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepApt(String depApt) {
            this.depApt = depApt;
            return this;
        }
        public String getDepApt() {
            return this.depApt;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepAptCode(String depAptCode) {
            this.depAptCode = depAptCode;
            return this;
        }
        public String getDepAptCode() {
            return this.depAptCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setStopAptCode(String stopAptCode) {
            this.stopAptCode = stopAptCode;
            return this;
        }
        public String getStopAptCode() {
            return this.stopAptCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass extends TeaModel {
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

        public static IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass self = new IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList extends TeaModel {
        @NameInMap("cabin_class")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass> cabinClass;

        /**
         * <strong>example:</strong>
         * <p>MU5236</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>781-6605285563</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <strong>example:</strong>
         * <p>0132</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList self = new IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList setCabinClass(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass> cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketListCabinClass> getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee extends TeaModel {
        @NameInMap("modify_hand_fee")
        public Long modifyHandFee;

        @NameInMap("modify_upgrade_fee")
        public Long modifyUpgradeFee;

        @NameInMap("tax_gap")
        public Long taxGap;

        /**
         * <strong>example:</strong>
         * <p>0132</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee self = new IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee setModifyHandFee(Long modifyHandFee) {
            this.modifyHandFee = modifyHandFee;
            return this;
        }
        public Long getModifyHandFee() {
            return this.modifyHandFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee setModifyUpgradeFee(Long modifyUpgradeFee) {
            this.modifyUpgradeFee = modifyUpgradeFee;
            return this;
        }
        public Long getModifyUpgradeFee() {
            return this.modifyUpgradeFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee setTaxGap(Long taxGap) {
            this.taxGap = taxGap;
            return this;
        }
        public Long getTaxGap() {
            return this.taxGap;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList extends TeaModel {
        @NameInMap("corp_pay_price")
        public Integer corpPayPrice;

        @NameInMap("flight_modify_segment_list")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList> flightModifySegmentList;

        @NameInMap("flight_order_modify_ticket_list")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList> flightOrderModifyTicketList;

        /**
         * <strong>example:</strong>
         * <p>1005200138736000</p>
         */
        @NameInMap("modify_apply_id")
        public Long modifyApplyId;

        @NameInMap("modify_fee")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee> modifyFee;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("modify_order_status")
        public Integer modifyOrderStatus;

        @NameInMap("modify_total_fee")
        public Integer modifyTotalFee;

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

        /**
         * <strong>example:</strong>
         * <p>2024-10-26 11:25:00</p>
         */
        @NameInMap("submit_modify_time")
        public String submitModifyTime;

        @NameInMap("voluntary")
        public Boolean voluntary;

        public static IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList self = new IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setCorpPayPrice(Integer corpPayPrice) {
            this.corpPayPrice = corpPayPrice;
            return this;
        }
        public Integer getCorpPayPrice() {
            return this.corpPayPrice;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setFlightModifySegmentList(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList> flightModifySegmentList) {
            this.flightModifySegmentList = flightModifySegmentList;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightModifySegmentList> getFlightModifySegmentList() {
            return this.flightModifySegmentList;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setFlightOrderModifyTicketList(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList> flightOrderModifyTicketList) {
            this.flightOrderModifyTicketList = flightOrderModifyTicketList;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListFlightOrderModifyTicketList> getFlightOrderModifyTicketList() {
            return this.flightOrderModifyTicketList;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setModifyApplyId(Long modifyApplyId) {
            this.modifyApplyId = modifyApplyId;
            return this;
        }
        public Long getModifyApplyId() {
            return this.modifyApplyId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setModifyFee(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee> modifyFee) {
            this.modifyFee = modifyFee;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderListModifyFee> getModifyFee() {
            return this.modifyFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setModifyOrderStatus(Integer modifyOrderStatus) {
            this.modifyOrderStatus = modifyOrderStatus;
            return this;
        }
        public Integer getModifyOrderStatus() {
            return this.modifyOrderStatus;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setModifyTotalFee(Integer modifyTotalFee) {
            this.modifyTotalFee = modifyTotalFee;
            return this;
        }
        public Integer getModifyTotalFee() {
            return this.modifyTotalFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setPassengerList(java.util.List<String> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<String> getPassengerList() {
            return this.passengerList;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setPersonPayPrice(Integer personPayPrice) {
            this.personPayPrice = personPayPrice;
            return this;
        }
        public Integer getPersonPayPrice() {
            return this.personPayPrice;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setRelateModifyApplyId(Long relateModifyApplyId) {
            this.relateModifyApplyId = relateModifyApplyId;
            return this;
        }
        public Long getRelateModifyApplyId() {
            return this.relateModifyApplyId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setSubmitModifyTime(String submitModifyTime) {
            this.submitModifyTime = submitModifyTime;
            return this;
        }
        public String getSubmitModifyTime() {
            return this.submitModifyTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList setVoluntary(Boolean voluntary) {
            this.voluntary = voluntary;
            return this;
        }
        public Boolean getVoluntary() {
            return this.voluntary;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass extends TeaModel {
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

        public static IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass self = new IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList extends TeaModel {
        @NameInMap("cabin_class")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass> cabinClass;

        /**
         * <strong>example:</strong>
         * <p>MU5236</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>018-6605785754</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        /**
         * <strong>example:</strong>
         * <p>0132</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList self = new IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList setCabinClass(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass> cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketListCabinClass> getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee extends TeaModel {
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
         * <p>0132</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee self = new IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee setNoRefundModifyHandFee(Long noRefundModifyHandFee) {
            this.noRefundModifyHandFee = noRefundModifyHandFee;
            return this;
        }
        public Long getNoRefundModifyHandFee() {
            return this.noRefundModifyHandFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee setNoRefundModifyUpgradeFee(Long noRefundModifyUpgradeFee) {
            this.noRefundModifyUpgradeFee = noRefundModifyUpgradeFee;
            return this;
        }
        public Long getNoRefundModifyUpgradeFee() {
            return this.noRefundModifyUpgradeFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee setRefundAmount(Long refundAmount) {
            this.refundAmount = refundAmount;
            return this;
        }
        public Long getRefundAmount() {
            return this.refundAmount;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee setRefundHandFee(Long refundHandFee) {
            this.refundHandFee = refundHandFee;
            return this;
        }
        public Long getRefundHandFee() {
            return this.refundHandFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee setRefundModifyAmount(Long refundModifyAmount) {
            this.refundModifyAmount = refundModifyAmount;
            return this;
        }
        public Long getRefundModifyAmount() {
            return this.refundModifyAmount;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee setRefundModifyHandAmount(Long refundModifyHandAmount) {
            this.refundModifyHandAmount = refundModifyHandAmount;
            return this;
        }
        public Long getRefundModifyHandAmount() {
            return this.refundModifyHandAmount;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee setRefundModifyUpgradeAmount(Long refundModifyUpgradeAmount) {
            this.refundModifyUpgradeAmount = refundModifyUpgradeAmount;
            return this;
        }
        public Long getRefundModifyUpgradeAmount() {
            return this.refundModifyUpgradeAmount;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee setRefundTaxHandFee(Long refundTaxHandFee) {
            this.refundTaxHandFee = refundTaxHandFee;
            return this;
        }
        public Long getRefundTaxHandFee() {
            return this.refundTaxHandFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList extends TeaModel {
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

        public static IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList self = new IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrApt(String arrApt) {
            this.arrApt = arrApt;
            return this;
        }
        public String getArrApt() {
            return this.arrApt;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrAptCode(String arrAptCode) {
            this.arrAptCode = arrAptCode;
            return this;
        }
        public String getArrAptCode() {
            return this.arrAptCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setCarrierAirlineCode(String carrierAirlineCode) {
            this.carrierAirlineCode = carrierAirlineCode;
            return this;
        }
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setCarrierAirlineName(String carrierAirlineName) {
            this.carrierAirlineName = carrierAirlineName;
            return this;
        }
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepApt(String depApt) {
            this.depApt = depApt;
            return this;
        }
        public String getDepApt() {
            return this.depApt;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepAptCode(String depAptCode) {
            this.depAptCode = depAptCode;
            return this;
        }
        public String getDepAptCode() {
            return this.depAptCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setStopAptCode(String stopAptCode) {
            this.stopAptCode = stopAptCode;
            return this;
        }
        public String getStopAptCode() {
            return this.stopAptCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList extends TeaModel {
        @NameInMap("corp_refund_Amount")
        public Integer corpRefundAmount;

        @NameInMap("flight_order_refund_ticket_list")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList> flightOrderRefundTicketList;

        @NameInMap("flight_passenger_fee")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee> flightPassengerFee;

        @NameInMap("flight_refund_segment_list")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList> flightRefundSegmentList;

        @NameInMap("passenger_list")
        public java.util.List<String> passengerList;

        @NameInMap("person_refund_Amount")
        public Integer personRefundAmount;

        /**
         * <strong>example:</strong>
         * <p>1006200138737069</p>
         */
        @NameInMap("refund_apply_id")
        public Long refundApplyId;

        @NameInMap("refund_hand_fee")
        public Integer refundHandFee;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("refund_order_status")
        public Integer refundOrderStatus;

        @NameInMap("refund_service_fee")
        public Long refundServiceFee;

        @NameInMap("refund_total_Amount")
        public Integer refundTotalAmount;

        @NameInMap("relate_modify_apply_id")
        public java.util.List<Long> relateModifyApplyId;

        /**
         * <strong>example:</strong>
         * <p>10062001387370</p>
         */
        @NameInMap("relate_refund_apply_id")
        public Long relateRefundApplyId;

        @NameInMap("repeat_refund")
        public Boolean repeatRefund;

        /**
         * <strong>example:</strong>
         * <p>2024-10-26 11:25:00</p>
         */
        @NameInMap("submit_refund_time")
        public String submitRefundTime;

        @NameInMap("voluntary")
        public Boolean voluntary;

        public static IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList self = new IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setCorpRefundAmount(Integer corpRefundAmount) {
            this.corpRefundAmount = corpRefundAmount;
            return this;
        }
        public Integer getCorpRefundAmount() {
            return this.corpRefundAmount;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setFlightOrderRefundTicketList(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList> flightOrderRefundTicketList) {
            this.flightOrderRefundTicketList = flightOrderRefundTicketList;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightOrderRefundTicketList> getFlightOrderRefundTicketList() {
            return this.flightOrderRefundTicketList;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setFlightPassengerFee(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee> flightPassengerFee) {
            this.flightPassengerFee = flightPassengerFee;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightPassengerFee> getFlightPassengerFee() {
            return this.flightPassengerFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setFlightRefundSegmentList(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList> flightRefundSegmentList) {
            this.flightRefundSegmentList = flightRefundSegmentList;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderListFlightRefundSegmentList> getFlightRefundSegmentList() {
            return this.flightRefundSegmentList;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setPassengerList(java.util.List<String> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<String> getPassengerList() {
            return this.passengerList;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setPersonRefundAmount(Integer personRefundAmount) {
            this.personRefundAmount = personRefundAmount;
            return this;
        }
        public Integer getPersonRefundAmount() {
            return this.personRefundAmount;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setRefundApplyId(Long refundApplyId) {
            this.refundApplyId = refundApplyId;
            return this;
        }
        public Long getRefundApplyId() {
            return this.refundApplyId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setRefundHandFee(Integer refundHandFee) {
            this.refundHandFee = refundHandFee;
            return this;
        }
        public Integer getRefundHandFee() {
            return this.refundHandFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setRefundOrderStatus(Integer refundOrderStatus) {
            this.refundOrderStatus = refundOrderStatus;
            return this;
        }
        public Integer getRefundOrderStatus() {
            return this.refundOrderStatus;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setRefundServiceFee(Long refundServiceFee) {
            this.refundServiceFee = refundServiceFee;
            return this;
        }
        public Long getRefundServiceFee() {
            return this.refundServiceFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setRefundTotalAmount(Integer refundTotalAmount) {
            this.refundTotalAmount = refundTotalAmount;
            return this;
        }
        public Integer getRefundTotalAmount() {
            return this.refundTotalAmount;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setRelateModifyApplyId(java.util.List<Long> relateModifyApplyId) {
            this.relateModifyApplyId = relateModifyApplyId;
            return this;
        }
        public java.util.List<Long> getRelateModifyApplyId() {
            return this.relateModifyApplyId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setRelateRefundApplyId(Long relateRefundApplyId) {
            this.relateRefundApplyId = relateRefundApplyId;
            return this;
        }
        public Long getRelateRefundApplyId() {
            return this.relateRefundApplyId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setRepeatRefund(Boolean repeatRefund) {
            this.repeatRefund = repeatRefund;
            return this;
        }
        public Boolean getRepeatRefund() {
            return this.repeatRefund;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setSubmitRefundTime(String submitRefundTime) {
            this.submitRefundTime = submitRefundTime;
            return this;
        }
        public String getSubmitRefundTime() {
            return this.submitRefundTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList setVoluntary(Boolean voluntary) {
            this.voluntary = voluntary;
            return this;
        }
        public Boolean getVoluntary() {
            return this.voluntary;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderBookerInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>01323</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderBookerInfo build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderBookerInfo self = new IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderBookerInfo();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderBookerInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderBookerInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList extends TeaModel {
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

        public static IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList self = new IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList setInsPayType(String insPayType) {
            this.insPayType = insPayType;
            return this;
        }
        public String getInsPayType() {
            return this.insPayType;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList setInsTotalPrice(Integer insTotalPrice) {
            this.insTotalPrice = insTotalPrice;
            return this;
        }
        public Integer getInsTotalPrice() {
            return this.insTotalPrice;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList setTradeAction(String tradeAction) {
            this.tradeAction = tradeAction;
            return this;
        }
        public String getTradeAction() {
            return this.tradeAction;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass extends TeaModel {
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

        public static IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass self = new IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList extends TeaModel {
        @NameInMap("cabin_class")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass> cabinClass;

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

        public static IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList self = new IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList setCabinClass(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass> cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketListCabinClass> getCabinClass() {
            return this.cabinClass;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList extends TeaModel {
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

        public static IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList self = new IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrApt(String arrApt) {
            this.arrApt = arrApt;
            return this;
        }
        public String getArrApt() {
            return this.arrApt;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrAptCode(String arrAptCode) {
            this.arrAptCode = arrAptCode;
            return this;
        }
        public String getArrAptCode() {
            return this.arrAptCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrTerminal(String arrTerminal) {
            this.arrTerminal = arrTerminal;
            return this;
        }
        public String getArrTerminal() {
            return this.arrTerminal;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setCarrierAirlineCode(String carrierAirlineCode) {
            this.carrierAirlineCode = carrierAirlineCode;
            return this;
        }
        public String getCarrierAirlineCode() {
            return this.carrierAirlineCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setCarrierAirlineName(String carrierAirlineName) {
            this.carrierAirlineName = carrierAirlineName;
            return this;
        }
        public String getCarrierAirlineName() {
            return this.carrierAirlineName;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepApt(String depApt) {
            this.depApt = depApt;
            return this;
        }
        public String getDepApt() {
            return this.depApt;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepAptCode(String depAptCode) {
            this.depAptCode = depAptCode;
            return this;
        }
        public String getDepAptCode() {
            return this.depAptCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepTerminal(String depTerminal) {
            this.depTerminal = depTerminal;
            return this;
        }
        public String getDepTerminal() {
            return this.depTerminal;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setStopAptCode(String stopAptCode) {
            this.stopAptCode = stopAptCode;
            return this;
        }
        public String getStopAptCode() {
            return this.stopAptCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList extends TeaModel {
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

        public static IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList self = new IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setCostCenterId(String costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public String getCostCenterId() {
            return this.costCenterId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setInvoiceId(String invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public String getInvoiceId() {
            return this.invoiceId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder extends TeaModel {
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
        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderBookerInfo bookerInfo;

        @NameInMap("corp_pay_price")
        public Long corpPayPrice;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("exceed_apply_id")
        public String exceedApplyId;

        @NameInMap("flight_order_insure_list")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList> flightOrderInsureList;

        @NameInMap("flight_order_ticket_list")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList> flightOrderTicketList;

        @NameInMap("flight_segment_list")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList> flightSegmentList;

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
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList> passengerList;

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

        public static IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder self = new IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setApplyId(Long applyId) {
            this.applyId = applyId;
            return this;
        }
        public Long getApplyId() {
            return this.applyId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setBookType(Integer bookType) {
            this.bookType = bookType;
            return this;
        }
        public Integer getBookType() {
            return this.bookType;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setBookerInfo(IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderBookerInfo bookerInfo) {
            this.bookerInfo = bookerInfo;
            return this;
        }
        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderBookerInfo getBookerInfo() {
            return this.bookerInfo;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setCorpPayPrice(Long corpPayPrice) {
            this.corpPayPrice = corpPayPrice;
            return this;
        }
        public Long getCorpPayPrice() {
            return this.corpPayPrice;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setExceedApplyId(String exceedApplyId) {
            this.exceedApplyId = exceedApplyId;
            return this;
        }
        public String getExceedApplyId() {
            return this.exceedApplyId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setFlightOrderInsureList(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList> flightOrderInsureList) {
            this.flightOrderInsureList = flightOrderInsureList;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderInsureList> getFlightOrderInsureList() {
            return this.flightOrderInsureList;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setFlightOrderTicketList(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList> flightOrderTicketList) {
            this.flightOrderTicketList = flightOrderTicketList;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightOrderTicketList> getFlightOrderTicketList() {
            return this.flightOrderTicketList;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setFlightSegmentList(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList> flightSegmentList) {
            this.flightSegmentList = flightSegmentList;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderFlightSegmentList> getFlightSegmentList() {
            return this.flightSegmentList;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setMixPay(Boolean mixPay) {
            this.mixPay = mixPay;
            return this;
        }
        public Boolean getMixPay() {
            return this.mixPay;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setOrderCreateTime(String orderCreateTime) {
            this.orderCreateTime = orderCreateTime;
            return this;
        }
        public String getOrderCreateTime() {
            return this.orderCreateTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setOrderPayTime(String orderPayTime) {
            this.orderPayTime = orderPayTime;
            return this;
        }
        public String getOrderPayTime() {
            return this.orderPayTime;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setOrderReservePrice(Long orderReservePrice) {
            this.orderReservePrice = orderReservePrice;
            return this;
        }
        public Long getOrderReservePrice() {
            return this.orderReservePrice;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setPassengerList(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrderPassengerList> getPassengerList() {
            return this.passengerList;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setPayType(Integer payType) {
            this.payType = payType;
            return this;
        }
        public Integer getPayType() {
            return this.payType;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setPersonPayPrice(Long personPayPrice) {
            this.personPayPrice = personPayPrice;
            return this;
        }
        public Long getPersonPayPrice() {
            return this.personPayPrice;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setThirdPartApplyId(String thirdPartApplyId) {
            this.thirdPartApplyId = thirdPartApplyId;
            return this;
        }
        public String getThirdPartApplyId() {
            return this.thirdPartApplyId;
        }

        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

    }

    public static class IFlightOrderDetailQueryResponseBodyModule extends TeaModel {
        @NameInMap("flight_modify_order_list")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList> flightModifyOrderList;

        @NameInMap("flight_refund_order_list")
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList> flightRefundOrderList;

        @NameInMap("flight_sale_order")
        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder flightSaleOrder;

        public static IFlightOrderDetailQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IFlightOrderDetailQueryResponseBodyModule self = new IFlightOrderDetailQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IFlightOrderDetailQueryResponseBodyModule setFlightModifyOrderList(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList> flightModifyOrderList) {
            this.flightModifyOrderList = flightModifyOrderList;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightModifyOrderList> getFlightModifyOrderList() {
            return this.flightModifyOrderList;
        }

        public IFlightOrderDetailQueryResponseBodyModule setFlightRefundOrderList(java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList> flightRefundOrderList) {
            this.flightRefundOrderList = flightRefundOrderList;
            return this;
        }
        public java.util.List<IFlightOrderDetailQueryResponseBodyModuleFlightRefundOrderList> getFlightRefundOrderList() {
            return this.flightRefundOrderList;
        }

        public IFlightOrderDetailQueryResponseBodyModule setFlightSaleOrder(IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder flightSaleOrder) {
            this.flightSaleOrder = flightSaleOrder;
            return this;
        }
        public IFlightOrderDetailQueryResponseBodyModuleFlightSaleOrder getFlightSaleOrder() {
            return this.flightSaleOrder;
        }

    }

}
