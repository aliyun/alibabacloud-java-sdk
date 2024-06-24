// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingFlightListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TicketChangingFlightListResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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

    public static TicketChangingFlightListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingFlightListResponseBody self = new TicketChangingFlightListResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketChangingFlightListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TicketChangingFlightListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TicketChangingFlightListResponseBody setModule(TicketChangingFlightListResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TicketChangingFlightListResponseBodyModule getModule() {
        return this.module;
    }

    public TicketChangingFlightListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketChangingFlightListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TicketChangingFlightListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TicketChangingFlightListResponseBodyModuleFlightInfoListAirlineInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CA</p>
         */
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_name")
        public String airlineName;

        @NameInMap("airline_simple_name")
        public String airlineSimpleName;

        public static TicketChangingFlightListResponseBodyModuleFlightInfoListAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingFlightListResponseBodyModuleFlightInfoListAirlineInfo self = new TicketChangingFlightListResponseBodyModuleFlightInfoListAirlineInfo();
            return TeaModel.build(map, self);
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListAirlineInfo setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }
        public String getAirlineName() {
            return this.airlineName;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListAirlineInfo setAirlineSimpleName(String airlineSimpleName) {
            this.airlineSimpleName = airlineSimpleName;
            return this;
        }
        public String getAirlineSimpleName() {
            return this.airlineSimpleName;
        }

    }

    public static class TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>T4</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo self = new TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("passenger_type")
        public Integer passengerType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ticket_price")
        public Integer ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("upgrade_fee")
        public Integer upgradeFee;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("upgrade_price")
        public Integer upgradePrice;

        public static TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList self = new TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList();
            return TeaModel.build(map, self);
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList setUpgradeFee(Integer upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Integer getUpgradeFee() {
            return this.upgradeFee;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList setUpgradePrice(Integer upgradePrice) {
            this.upgradePrice = upgradePrice;
            return this;
        }
        public Integer getUpgradePrice() {
            return this.upgradePrice;
        }

    }

    public static class TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>G</p>
         */
        @NameInMap("cabin")
        public String cabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_desc")
        public String cabinDesc;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("cabin_discount")
        public Integer cabinDiscount;

        /**
         * <strong>example:</strong>
         * <p>G</p>
         */
        @NameInMap("child_cabin")
        public String childCabin;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("left_num")
        public String leftNum;

        @NameInMap("modify_price_list")
        public java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList> modifyPriceList;

        /**
         * <strong>example:</strong>
         * <p>&quot;360379a11ee84e9aa011baa41b758fe6&quot;</p>
         */
        @NameInMap("ota_itemid")
        public String otaItemid;

        public static TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList self = new TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList();
            return TeaModel.build(map, self);
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList setCabinDesc(String cabinDesc) {
            this.cabinDesc = cabinDesc;
            return this;
        }
        public String getCabinDesc() {
            return this.cabinDesc;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList setCabinDiscount(Integer cabinDiscount) {
            this.cabinDiscount = cabinDiscount;
            return this;
        }
        public Integer getCabinDiscount() {
            return this.cabinDiscount;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList setChildCabin(String childCabin) {
            this.childCabin = childCabin;
            return this;
        }
        public String getChildCabin() {
            return this.childCabin;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList setLeftNum(String leftNum) {
            this.leftNum = leftNum;
            return this;
        }
        public String getLeftNum() {
            return this.leftNum;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList setModifyPriceList(java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList> modifyPriceList) {
            this.modifyPriceList = modifyPriceList;
            return this;
        }
        public java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoListCabinListModifyPriceList> getModifyPriceList() {
            return this.modifyPriceList;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList setOtaItemid(String otaItemid) {
            this.otaItemid = otaItemid;
            return this;
        }
        public String getOtaItemid() {
            return this.otaItemid;
        }

    }

    public static class TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PEK</p>
         */
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>T3</p>
         */
        @NameInMap("terminal")
        public String terminal;

        public static TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo self = new TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("passenger_type")
        public Integer passengerType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ticket_price")
        public Integer ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("upgrade_fee")
        public Integer upgradeFee;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("upgrade_price")
        public Integer upgradePrice;

        public static TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice self = new TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice();
            return TeaModel.build(map, self);
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice setPassengerType(Integer passengerType) {
            this.passengerType = passengerType;
            return this;
        }
        public Integer getPassengerType() {
            return this.passengerType;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice setUpgradeFee(Integer upgradeFee) {
            this.upgradeFee = upgradeFee;
            return this;
        }
        public Integer getUpgradeFee() {
            return this.upgradeFee;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice setUpgradePrice(Integer upgradePrice) {
            this.upgradePrice = upgradePrice;
            return this;
        }
        public Integer getUpgradePrice() {
            return this.upgradePrice;
        }

    }

    public static class TicketChangingFlightListResponseBodyModuleFlightInfoList extends TeaModel {
        @NameInMap("airline_info")
        public TicketChangingFlightListResponseBodyModuleFlightInfoListAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo arrAirportInfo;

        @NameInMap("cabin_list")
        public java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList> cabinList;

        /**
         * <strong>example:</strong>
         * <p>CA1704</p>
         */
        @NameInMap("carrier_airline")
        public String carrierAirline;

        /**
         * <strong>example:</strong>
         * <p>CA1704</p>
         */
        @NameInMap("carrier_no")
        public String carrierNo;

        @NameInMap("dep_airport_info")
        public TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo depAirportInfo;

        /**
         * <strong>example:</strong>
         * <p>CA1704</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_type")
        public String flightType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_protocol")
        public Boolean isProtocol;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_share")
        public Boolean isShare;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("is_stop")
        public Boolean isStop;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("lowest_cabin")
        public String lowestCabin;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("lowest_cabin_class")
        public String lowestCabinClass;

        @NameInMap("lowest_cabin_desc")
        public String lowestCabinDesc;

        @NameInMap("lowest_cabin_num")
        public String lowestCabinNum;

        @NameInMap("lowest_cabin_price")
        public java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice> lowestCabinPrice;

        @NameInMap("meal_desc")
        public String mealDesc;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("modify_flight_arr_time")
        public String modifyFlightArrTime;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("modify_flight_dep_date")
        public String modifyFlightDepDate;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("modify_flight_dep_time")
        public String modifyFlightDepTime;

        /**
         * <strong>example:</strong>
         * <p>d1fb9e0a794f45e1b762d36ff1d17zz</p>
         */
        @NameInMap("session_id")
        public String sessionId;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("stop_arr_time")
        public String stopArrTime;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("stop_city")
        public String stopCity;

        /**
         * <strong>example:</strong>
         * <p>2000-00-00 00:00:00</p>
         */
        @NameInMap("stop_dep_time")
        public String stopDepTime;

        public static TicketChangingFlightListResponseBodyModuleFlightInfoList build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingFlightListResponseBodyModuleFlightInfoList self = new TicketChangingFlightListResponseBodyModuleFlightInfoList();
            return TeaModel.build(map, self);
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setAirlineInfo(TicketChangingFlightListResponseBodyModuleFlightInfoListAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public TicketChangingFlightListResponseBodyModuleFlightInfoListAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setArrAirportInfo(TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public TicketChangingFlightListResponseBodyModuleFlightInfoListArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setCabinList(java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList> cabinList) {
            this.cabinList = cabinList;
            return this;
        }
        public java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoListCabinList> getCabinList() {
            return this.cabinList;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setCarrierAirline(String carrierAirline) {
            this.carrierAirline = carrierAirline;
            return this;
        }
        public String getCarrierAirline() {
            return this.carrierAirline;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setCarrierNo(String carrierNo) {
            this.carrierNo = carrierNo;
            return this;
        }
        public String getCarrierNo() {
            return this.carrierNo;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setDepAirportInfo(TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public TicketChangingFlightListResponseBodyModuleFlightInfoListDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setIsProtocol(Boolean isProtocol) {
            this.isProtocol = isProtocol;
            return this;
        }
        public Boolean getIsProtocol() {
            return this.isProtocol;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setIsShare(Boolean isShare) {
            this.isShare = isShare;
            return this;
        }
        public Boolean getIsShare() {
            return this.isShare;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setIsStop(Boolean isStop) {
            this.isStop = isStop;
            return this;
        }
        public Boolean getIsStop() {
            return this.isStop;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setLowestCabin(String lowestCabin) {
            this.lowestCabin = lowestCabin;
            return this;
        }
        public String getLowestCabin() {
            return this.lowestCabin;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setLowestCabinClass(String lowestCabinClass) {
            this.lowestCabinClass = lowestCabinClass;
            return this;
        }
        public String getLowestCabinClass() {
            return this.lowestCabinClass;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setLowestCabinDesc(String lowestCabinDesc) {
            this.lowestCabinDesc = lowestCabinDesc;
            return this;
        }
        public String getLowestCabinDesc() {
            return this.lowestCabinDesc;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setLowestCabinNum(String lowestCabinNum) {
            this.lowestCabinNum = lowestCabinNum;
            return this;
        }
        public String getLowestCabinNum() {
            return this.lowestCabinNum;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setLowestCabinPrice(java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice> lowestCabinPrice) {
            this.lowestCabinPrice = lowestCabinPrice;
            return this;
        }
        public java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoListLowestCabinPrice> getLowestCabinPrice() {
            return this.lowestCabinPrice;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setModifyFlightArrTime(String modifyFlightArrTime) {
            this.modifyFlightArrTime = modifyFlightArrTime;
            return this;
        }
        public String getModifyFlightArrTime() {
            return this.modifyFlightArrTime;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setModifyFlightDepDate(String modifyFlightDepDate) {
            this.modifyFlightDepDate = modifyFlightDepDate;
            return this;
        }
        public String getModifyFlightDepDate() {
            return this.modifyFlightDepDate;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setModifyFlightDepTime(String modifyFlightDepTime) {
            this.modifyFlightDepTime = modifyFlightDepTime;
            return this;
        }
        public String getModifyFlightDepTime() {
            return this.modifyFlightDepTime;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setStopCity(String stopCity) {
            this.stopCity = stopCity;
            return this;
        }
        public String getStopCity() {
            return this.stopCity;
        }

        public TicketChangingFlightListResponseBodyModuleFlightInfoList setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class TicketChangingFlightListResponseBodyModule extends TeaModel {
        @NameInMap("flight_info_list")
        public java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoList> flightInfoList;

        public static TicketChangingFlightListResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TicketChangingFlightListResponseBodyModule self = new TicketChangingFlightListResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TicketChangingFlightListResponseBodyModule setFlightInfoList(java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoList> flightInfoList) {
            this.flightInfoList = flightInfoList;
            return this;
        }
        public java.util.List<TicketChangingFlightListResponseBodyModuleFlightInfoList> getFlightInfoList() {
            return this.flightInfoList;
        }

    }

}
