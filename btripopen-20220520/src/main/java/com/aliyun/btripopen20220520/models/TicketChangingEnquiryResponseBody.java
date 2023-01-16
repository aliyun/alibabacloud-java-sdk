// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingEnquiryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TicketChangingEnquiryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static TicketChangingEnquiryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingEnquiryResponseBody self = new TicketChangingEnquiryResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketChangingEnquiryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TicketChangingEnquiryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TicketChangingEnquiryResponseBody setModule(TicketChangingEnquiryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TicketChangingEnquiryResponseBodyModule getModule() {
        return this.module;
    }

    public TicketChangingEnquiryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketChangingEnquiryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TicketChangingEnquiryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("airline_simple_name")
        public String airlineSimpleName;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo setAirlineSimpleName(String airlineSimpleName) {
            this.airlineSimpleName = airlineSimpleName;
            return this;
        }
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("terminal")
        public String terminal;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList extends TeaModel {
        @NameInMap("passenger_type")
        public Integer passengerType;

        @NameInMap("ticket_price")
        public Integer ticketPrice;

        @NameInMap("upgrade_fee")
        public Integer upgradeFee;

        @NameInMap("upgrade_price")
        public Integer upgradePrice;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList setUpgradeFee(Integer upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Integer getUpgradeFee() {
            return this.upgradeFee;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList setUpgradePrice(Integer upgradePrice) {
            this.upgradePrice = upgradePrice;
            return this;
        }
        public Integer getUpgradePrice() {
            return this.upgradePrice;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList extends TeaModel {
        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_desc")
        public String cabinDesc;

        @NameInMap("cabin_discount")
        public Integer cabinDiscount;

        @NameInMap("child_cabin")
        public String childCabin;

        @NameInMap("left_num")
        public String leftNum;

        @NameInMap("modify_price_list")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList> modifyPriceList;

        @NameInMap("ota_itemid")
        public String otaItemid;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setCabinDesc(String cabinDesc) {
            this.cabinDesc = cabinDesc;
            return this;
        }
        public String getCabinDesc() {
            return this.cabinDesc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setCabinDiscount(Integer cabinDiscount) {
            this.cabinDiscount = cabinDiscount;
            return this;
        }
        public Integer getCabinDiscount() {
            return this.cabinDiscount;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setChildCabin(String childCabin) {
            this.childCabin = childCabin;
            return this;
        }
        public String getChildCabin() {
            return this.childCabin;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setLeftNum(String leftNum) {
            this.leftNum = leftNum;
            return this;
        }
        public String getLeftNum() {
            return this.leftNum;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setModifyPriceList(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList> modifyPriceList) {
            this.modifyPriceList = modifyPriceList;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinListModifyPriceList> getModifyPriceList() {
            return this.modifyPriceList;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList setOtaItemid(String otaItemid) {
            this.otaItemid = otaItemid;
            return this;
        }
        public String getOtaItemid() {
            return this.otaItemid;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("terminal")
        public String terminal;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice extends TeaModel {
        @NameInMap("passenger_type")
        public Integer passengerType;

        @NameInMap("ticket_price")
        public Integer ticketPrice;

        @NameInMap("upgrade_fee")
        public Integer upgradeFee;

        @NameInMap("upgrade_price")
        public Integer upgradePrice;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice self = new TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice setUpgradeFee(Integer upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Integer getUpgradeFee() {
            return this.upgradeFee;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice setUpgradePrice(Integer upgradePrice) {
            this.upgradePrice = upgradePrice;
            return this;
        }
        public Integer getUpgradePrice() {
            return this.upgradePrice;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModuleFlightInfoList extends TeaModel {
        @NameInMap("airline_info")
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo arrAirportInfo;

        @NameInMap("cabin_list")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList> cabinList;

        @NameInMap("carrier_airline")
        public String carrierAirline;

        @NameInMap("carrier_no")
        public String carrierNo;

        @NameInMap("dep_airport_info")
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("is_share")
        public Boolean isShare;

        @NameInMap("lowest_cabin")
        public String lowestCabin;

        @NameInMap("lowest_cabin_class")
        public String lowestCabinClass;

        @NameInMap("lowest_cabin_desc")
        public String lowestCabinDesc;

        @NameInMap("lowest_cabin_num")
        public String lowestCabinNum;

        @NameInMap("lowest_cabin_price")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice> lowestCabinPrice;

        @NameInMap("modify_flight_arr_time")
        public String modifyFlightArrTime;

        @NameInMap("modify_flight_dep_date")
        public String modifyFlightDepDate;

        @NameInMap("modify_flight_dep_time")
        public String modifyFlightDepTime;

        @NameInMap("session_id")
        public String sessionId;

        public static TicketChangingEnquiryResponseBodyModuleFlightInfoList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModuleFlightInfoList self = new TicketChangingEnquiryResponseBodyModuleFlightInfoList();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setAirlineInfo(TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setArrAirportInfo(TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setCabinList(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList> cabinList) {
            this.cabinList = cabinList;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListCabinList> getCabinList() {
            return this.cabinList;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setCarrierAirline(String carrierAirline) {
            this.carrierAirline = carrierAirline;
            return this;
        }
        public String getCarrierAirline() {
            return this.carrierAirline;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setCarrierNo(String carrierNo) {
            this.carrierNo = carrierNo;
            return this;
        }
        public String getCarrierNo() {
            return this.carrierNo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setDepAirportInfo(TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public TicketChangingEnquiryResponseBodyModuleFlightInfoListDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setIsShare(Boolean isShare) {
            this.isShare = isShare;
            return this;
        }
        public Boolean getIsShare() {
            return this.isShare;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setLowestCabin(String lowestCabin) {
            this.lowestCabin = lowestCabin;
            return this;
        }
        public String getLowestCabin() {
            return this.lowestCabin;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setLowestCabinClass(String lowestCabinClass) {
            this.lowestCabinClass = lowestCabinClass;
            return this;
        }
        public String getLowestCabinClass() {
            return this.lowestCabinClass;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setLowestCabinDesc(String lowestCabinDesc) {
            this.lowestCabinDesc = lowestCabinDesc;
            return this;
        }
        public String getLowestCabinDesc() {
            return this.lowestCabinDesc;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setLowestCabinNum(String lowestCabinNum) {
            this.lowestCabinNum = lowestCabinNum;
            return this;
        }
        public String getLowestCabinNum() {
            return this.lowestCabinNum;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setLowestCabinPrice(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice> lowestCabinPrice) {
            this.lowestCabinPrice = lowestCabinPrice;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoListLowestCabinPrice> getLowestCabinPrice() {
            return this.lowestCabinPrice;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setModifyFlightArrTime(String modifyFlightArrTime) {
            this.modifyFlightArrTime = modifyFlightArrTime;
            return this;
        }
        public String getModifyFlightArrTime() {
            return this.modifyFlightArrTime;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setModifyFlightDepDate(String modifyFlightDepDate) {
            this.modifyFlightDepDate = modifyFlightDepDate;
            return this;
        }
        public String getModifyFlightDepDate() {
            return this.modifyFlightDepDate;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setModifyFlightDepTime(String modifyFlightDepTime) {
            this.modifyFlightDepTime = modifyFlightDepTime;
            return this;
        }
        public String getModifyFlightDepTime() {
            return this.modifyFlightDepTime;
        }

        public TicketChangingEnquiryResponseBodyModuleFlightInfoList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class TicketChangingEnquiryResponseBodyModule extends TeaModel {
        @NameInMap("flight_info_list")
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoList> flightInfoList;

        public static TicketChangingEnquiryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingEnquiryResponseBodyModule self = new TicketChangingEnquiryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TicketChangingEnquiryResponseBodyModule setFlightInfoList(java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoList> flightInfoList) {
            this.flightInfoList = flightInfoList;
            return this;
        }
        public java.util.List<TicketChangingEnquiryResponseBodyModuleFlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

    }

}
