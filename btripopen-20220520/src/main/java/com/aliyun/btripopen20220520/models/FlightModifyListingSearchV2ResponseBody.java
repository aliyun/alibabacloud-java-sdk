// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyListingSearchV2ResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightModifyListingSearchV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>requestId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightModifyListingSearchV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyListingSearchV2ResponseBody self = new FlightModifyListingSearchV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightModifyListingSearchV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightModifyListingSearchV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightModifyListingSearchV2ResponseBody setModule(FlightModifyListingSearchV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightModifyListingSearchV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightModifyListingSearchV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightModifyListingSearchV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightModifyListingSearchV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_icon")
        public String airlineIcon;

        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_icon")
        public String airlineIcon;

        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfo self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfo setOperatingAirlineInfo(FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo extends TeaModel {
        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_arr_term")
        public String stopArrTerm;

        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city_code")
        public String stopCityCode;

        @NameInMap("stop_city_name")
        public String stopCityName;

        @NameInMap("stop_dep_term")
        public String stopDepTerm;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_icon")
        public String airlineIcon;

        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo extends TeaModel {
        @NameInMap("transfer_airline_info")
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo transferAirlineInfo;

        @NameInMap("transfer_city_code")
        public String transferCityCode;

        @NameInMap("transfer_city_name")
        public String transferCityName;

        @NameInMap("transfer_dep_time")
        public String transferDepTime;

        @NameInMap("transfer_flight_no")
        public String transferFlightNo;

        @NameInMap("transfer_flight_size")
        public String transferFlightSize;

        @NameInMap("transfer_share")
        public Boolean transferShare;

        @NameInMap("transfer_stop_time")
        public Integer transferStopTime;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo setTransferAirlineInfo(FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo transferAirlineInfo) {
            this.transferAirlineInfo = transferAirlineInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfoTransferAirlineInfo getTransferAirlineInfo() {
            return this.transferAirlineInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo setTransferCityCode(String transferCityCode) {
            this.transferCityCode = transferCityCode;
            return this;
        }
        public String getTransferCityCode() {
            return this.transferCityCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo setTransferCityName(String transferCityName) {
            this.transferCityName = transferCityName;
            return this;
        }
        public String getTransferCityName() {
            return this.transferCityName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo setTransferDepTime(String transferDepTime) {
            this.transferDepTime = transferDepTime;
            return this;
        }
        public String getTransferDepTime() {
            return this.transferDepTime;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo setTransferFlightNo(String transferFlightNo) {
            this.transferFlightNo = transferFlightNo;
            return this;
        }
        public String getTransferFlightNo() {
            return this.transferFlightNo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo setTransferFlightSize(String transferFlightSize) {
            this.transferFlightSize = transferFlightSize;
            return this;
        }
        public String getTransferFlightSize() {
            return this.transferFlightSize;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo setTransferShare(Boolean transferShare) {
            this.transferShare = transferShare;
            return this;
        }
        public Boolean getTransferShare() {
            return this.transferShare;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo setTransferStopTime(Integer transferStopTime) {
            this.transferStopTime = transferStopTime;
            return this;
        }
        public Integer getTransferStopTime() {
            return this.transferStopTime;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO extends TeaModel {
        @NameInMap("re_shop_adult_change_fee")
        public Integer reShopAdultChangeFee;

        @NameInMap("re_shop_adult_price")
        public Integer reShopAdultPrice;

        @NameInMap("re_shop_adult_price_gap")
        public Integer reShopAdultPriceGap;

        @NameInMap("re_shop_child_change_fee")
        public Integer reShopChildChangeFee;

        @NameInMap("re_shop_child_price")
        public Integer reShopChildPrice;

        @NameInMap("re_shop_child_price_gap")
        public Integer reShopChildPriceGap;

        @NameInMap("re_shop_inf_change_fee")
        public Integer reShopInfChangeFee;

        @NameInMap("re_shop_inf_price")
        public Integer reShopInfPrice;

        @NameInMap("re_shop_inf_price_gap")
        public Integer reShopInfPriceGap;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO setReShopAdultChangeFee(Integer reShopAdultChangeFee) {
            this.reShopAdultChangeFee = reShopAdultChangeFee;
            return this;
        }
        public Integer getReShopAdultChangeFee() {
            return this.reShopAdultChangeFee;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO setReShopAdultPrice(Integer reShopAdultPrice) {
            this.reShopAdultPrice = reShopAdultPrice;
            return this;
        }
        public Integer getReShopAdultPrice() {
            return this.reShopAdultPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO setReShopAdultPriceGap(Integer reShopAdultPriceGap) {
            this.reShopAdultPriceGap = reShopAdultPriceGap;
            return this;
        }
        public Integer getReShopAdultPriceGap() {
            return this.reShopAdultPriceGap;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO setReShopChildChangeFee(Integer reShopChildChangeFee) {
            this.reShopChildChangeFee = reShopChildChangeFee;
            return this;
        }
        public Integer getReShopChildChangeFee() {
            return this.reShopChildChangeFee;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO setReShopChildPrice(Integer reShopChildPrice) {
            this.reShopChildPrice = reShopChildPrice;
            return this;
        }
        public Integer getReShopChildPrice() {
            return this.reShopChildPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO setReShopChildPriceGap(Integer reShopChildPriceGap) {
            this.reShopChildPriceGap = reShopChildPriceGap;
            return this;
        }
        public Integer getReShopChildPriceGap() {
            return this.reShopChildPriceGap;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO setReShopInfChangeFee(Integer reShopInfChangeFee) {
            this.reShopInfChangeFee = reShopInfChangeFee;
            return this;
        }
        public Integer getReShopInfChangeFee() {
            return this.reShopInfChangeFee;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO setReShopInfPrice(Integer reShopInfPrice) {
            this.reShopInfPrice = reShopInfPrice;
            return this;
        }
        public Integer getReShopInfPrice() {
            return this.reShopInfPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO setReShopInfPriceGap(Integer reShopInfPriceGap) {
            this.reShopInfPriceGap = reShopInfPriceGap;
            return this;
        }
        public Integer getReShopInfPriceGap() {
            return this.reShopInfPriceGap;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO extends TeaModel {
        @NameInMap("adult_price")
        public Integer adultPrice;

        @NameInMap("adult_tax")
        public Integer adultTax;

        @NameInMap("adult_total_price")
        public Integer adultTotalPrice;

        @NameInMap("before_control_price")
        public Integer beforeControlPrice;

        @NameInMap("child_price")
        public Integer childPrice;

        @NameInMap("child_tax")
        public Integer childTax;

        @NameInMap("child_total_price")
        public Integer childTotalPrice;

        @NameInMap("infant_price")
        public Integer infantPrice;

        @NameInMap("infant_tax")
        public Integer infantTax;

        @NameInMap("infant_total_price")
        public Integer infantTotalPrice;

        @NameInMap("original_adult_price")
        public Integer originalAdultPrice;

        @NameInMap("original_adult_total_price")
        public Integer originalAdultTotalPrice;

        @NameInMap("re_shop_price_info_d_t_o")
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO reShopPriceInfoDTO;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setAdultPrice(Integer adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Integer getAdultPrice() {
            return this.adultPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setAdultTax(Integer adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Integer getAdultTax() {
            return this.adultTax;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setAdultTotalPrice(Integer adultTotalPrice) {
            this.adultTotalPrice = adultTotalPrice;
            return this;
        }
        public Integer getAdultTotalPrice() {
            return this.adultTotalPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setBeforeControlPrice(Integer beforeControlPrice) {
            this.beforeControlPrice = beforeControlPrice;
            return this;
        }
        public Integer getBeforeControlPrice() {
            return this.beforeControlPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setChildPrice(Integer childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Integer getChildPrice() {
            return this.childPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setChildTax(Integer childTax) {
            this.childTax = childTax;
            return this;
        }
        public Integer getChildTax() {
            return this.childTax;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setChildTotalPrice(Integer childTotalPrice) {
            this.childTotalPrice = childTotalPrice;
            return this;
        }
        public Integer getChildTotalPrice() {
            return this.childTotalPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setInfantPrice(Integer infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Integer getInfantPrice() {
            return this.infantPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setInfantTax(Integer infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Integer getInfantTax() {
            return this.infantTax;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setInfantTotalPrice(Integer infantTotalPrice) {
            this.infantTotalPrice = infantTotalPrice;
            return this;
        }
        public Integer getInfantTotalPrice() {
            return this.infantTotalPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setOriginalAdultPrice(Integer originalAdultPrice) {
            this.originalAdultPrice = originalAdultPrice;
            return this;
        }
        public Integer getOriginalAdultPrice() {
            return this.originalAdultPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setOriginalAdultTotalPrice(Integer originalAdultTotalPrice) {
            this.originalAdultTotalPrice = originalAdultTotalPrice;
            return this;
        }
        public Integer getOriginalAdultTotalPrice() {
            return this.originalAdultTotalPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO setReShopPriceInfoDTO(FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO reShopPriceInfoDTO) {
            this.reShopPriceInfoDTO = reShopPriceInfoDTO;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTOReShopPriceInfoDTO getReShopPriceInfoDTO() {
            return this.reShopPriceInfoDTO;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList extends TeaModel {
        @NameInMap("airline_info")
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo arrAirportInfo;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("cabinClass")
        public String cabinClass;

        @NameInMap("cabinClassName")
        public String cabinClassName;

        @NameInMap("dep_airport_info")
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("duration")
        public Integer duration;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_share_info")
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info")
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo flightStopInfo;

        @NameInMap("flight_transfer_info")
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo flightTransferInfo;

        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("journey_seq")
        public Integer journeySeq;

        @NameInMap("left_num")
        public String leftNum;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("meal_desc")
        public String mealDesc;

        @NameInMap("price_info_d_t_o")
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO priceInfoDTO;

        @NameInMap("segment_seq")
        public Integer segmentSeq;

        @NameInMap("share")
        public Boolean share;

        @NameInMap("short_flight_size")
        public String shortFlightSize;

        @NameInMap("span_day")
        public String spanDay;

        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("transfer")
        public Boolean transfer;

        public static FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList self = new FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setAirlineInfo(FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setArrAirportInfo(FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setDepAirportInfo(FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setFlightShareInfo(FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setFlightStopInfo(FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo flightStopInfo) {
            this.flightStopInfo = flightStopInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightStopInfo getFlightStopInfo() {
            return this.flightStopInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setFlightTransferInfo(FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo flightTransferInfo) {
            this.flightTransferInfo = flightTransferInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListFlightTransferInfo getFlightTransferInfo() {
            return this.flightTransferInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setJourneySeq(Integer journeySeq) {
            this.journeySeq = journeySeq;
            return this;
        }
        public Integer getJourneySeq() {
            return this.journeySeq;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setLeftNum(String leftNum) {
            this.leftNum = leftNum;
            return this;
        }
        public String getLeftNum() {
            return this.leftNum;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setPriceInfoDTO(FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO priceInfoDTO) {
            this.priceInfoDTO = priceInfoDTO;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightListPriceInfoDTO getPriceInfoDTO() {
            return this.priceInfoDTO;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setSegmentSeq(Integer segmentSeq) {
            this.segmentSeq = segmentSeq;
            return this;
        }
        public Integer getSegmentSeq() {
            return this.segmentSeq;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setSpanDay(String spanDay) {
            this.spanDay = spanDay;
            return this;
        }
        public String getSpanDay() {
            return this.spanDay;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList setTransfer(Boolean transfer) {
            this.transfer = transfer;
            return this;
        }
        public Boolean getTransfer() {
            return this.transfer;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_icon")
        public String airlineIcon;

        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_icon")
        public String airlineIcon;

        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfo extends TeaModel {
        @NameInMap("operating_airline_info")
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo operatingAirlineInfo;

        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfo self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfo setOperatingAirlineInfo(FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo extends TeaModel {
        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_arr_term")
        public String stopArrTerm;

        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_city_code")
        public String stopCityCode;

        @NameInMap("stop_city_name")
        public String stopCityName;

        @NameInMap("stop_dep_term")
        public String stopDepTerm;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo extends TeaModel {
        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_icon")
        public String airlineIcon;

        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo extends TeaModel {
        @NameInMap("transfer_airline_info")
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo transferAirlineInfo;

        @NameInMap("transfer_city_code")
        public String transferCityCode;

        @NameInMap("transfer_city_name")
        public String transferCityName;

        @NameInMap("transfer_dep_time")
        public String transferDepTime;

        @NameInMap("transfer_flight_no")
        public String transferFlightNo;

        @NameInMap("transfer_flight_size")
        public String transferFlightSize;

        @NameInMap("transfer_share")
        public Boolean transferShare;

        @NameInMap("transfer_stop_time")
        public Integer transferStopTime;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo setTransferAirlineInfo(FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo transferAirlineInfo) {
            this.transferAirlineInfo = transferAirlineInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfoTransferAirlineInfo getTransferAirlineInfo() {
            return this.transferAirlineInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo setTransferCityCode(String transferCityCode) {
            this.transferCityCode = transferCityCode;
            return this;
        }
        public String getTransferCityCode() {
            return this.transferCityCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo setTransferCityName(String transferCityName) {
            this.transferCityName = transferCityName;
            return this;
        }
        public String getTransferCityName() {
            return this.transferCityName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo setTransferDepTime(String transferDepTime) {
            this.transferDepTime = transferDepTime;
            return this;
        }
        public String getTransferDepTime() {
            return this.transferDepTime;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo setTransferFlightNo(String transferFlightNo) {
            this.transferFlightNo = transferFlightNo;
            return this;
        }
        public String getTransferFlightNo() {
            return this.transferFlightNo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo setTransferFlightSize(String transferFlightSize) {
            this.transferFlightSize = transferFlightSize;
            return this;
        }
        public String getTransferFlightSize() {
            return this.transferFlightSize;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo setTransferShare(Boolean transferShare) {
            this.transferShare = transferShare;
            return this;
        }
        public Boolean getTransferShare() {
            return this.transferShare;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo setTransferStopTime(Integer transferStopTime) {
            this.transferStopTime = transferStopTime;
            return this;
        }
        public Integer getTransferStopTime() {
            return this.transferStopTime;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO extends TeaModel {
        @NameInMap("re_shop_adult_change_fee")
        public Integer reShopAdultChangeFee;

        @NameInMap("re_shop_adult_price")
        public Integer reShopAdultPrice;

        @NameInMap("re_shop_adult_price_gap")
        public Integer reShopAdultPriceGap;

        @NameInMap("re_shop_child_change_fee")
        public Integer reShopChildChangeFee;

        @NameInMap("re_shop_child_price")
        public Integer reShopChildPrice;

        @NameInMap("re_shop_child_price_gap")
        public Integer reShopChildPriceGap;

        @NameInMap("re_shop_inf_change_fee")
        public Integer reShopInfChangeFee;

        @NameInMap("re_shop_inf_price")
        public Integer reShopInfPrice;

        @NameInMap("re_shop_inf_price_gap")
        public Integer reShopInfPriceGap;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO setReShopAdultChangeFee(Integer reShopAdultChangeFee) {
            this.reShopAdultChangeFee = reShopAdultChangeFee;
            return this;
        }
        public Integer getReShopAdultChangeFee() {
            return this.reShopAdultChangeFee;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO setReShopAdultPrice(Integer reShopAdultPrice) {
            this.reShopAdultPrice = reShopAdultPrice;
            return this;
        }
        public Integer getReShopAdultPrice() {
            return this.reShopAdultPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO setReShopAdultPriceGap(Integer reShopAdultPriceGap) {
            this.reShopAdultPriceGap = reShopAdultPriceGap;
            return this;
        }
        public Integer getReShopAdultPriceGap() {
            return this.reShopAdultPriceGap;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO setReShopChildChangeFee(Integer reShopChildChangeFee) {
            this.reShopChildChangeFee = reShopChildChangeFee;
            return this;
        }
        public Integer getReShopChildChangeFee() {
            return this.reShopChildChangeFee;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO setReShopChildPrice(Integer reShopChildPrice) {
            this.reShopChildPrice = reShopChildPrice;
            return this;
        }
        public Integer getReShopChildPrice() {
            return this.reShopChildPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO setReShopChildPriceGap(Integer reShopChildPriceGap) {
            this.reShopChildPriceGap = reShopChildPriceGap;
            return this;
        }
        public Integer getReShopChildPriceGap() {
            return this.reShopChildPriceGap;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO setReShopInfChangeFee(Integer reShopInfChangeFee) {
            this.reShopInfChangeFee = reShopInfChangeFee;
            return this;
        }
        public Integer getReShopInfChangeFee() {
            return this.reShopInfChangeFee;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO setReShopInfPrice(Integer reShopInfPrice) {
            this.reShopInfPrice = reShopInfPrice;
            return this;
        }
        public Integer getReShopInfPrice() {
            return this.reShopInfPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO setReShopInfPriceGap(Integer reShopInfPriceGap) {
            this.reShopInfPriceGap = reShopInfPriceGap;
            return this;
        }
        public Integer getReShopInfPriceGap() {
            return this.reShopInfPriceGap;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO extends TeaModel {
        @NameInMap("adult_price")
        public Integer adultPrice;

        @NameInMap("adult_tax")
        public Integer adultTax;

        @NameInMap("adult_total_price")
        public Integer adultTotalPrice;

        @NameInMap("before_control_price")
        public Integer beforeControlPrice;

        @NameInMap("child_price")
        public Integer childPrice;

        @NameInMap("child_tax")
        public Integer childTax;

        @NameInMap("child_total_price")
        public Integer childTotalPrice;

        @NameInMap("infant_price")
        public Integer infantPrice;

        @NameInMap("infant_tax")
        public Integer infantTax;

        @NameInMap("infant_total_price")
        public Integer infantTotalPrice;

        @NameInMap("original_adult_price")
        public Integer originalAdultPrice;

        @NameInMap("original_adult_total_price")
        public Integer originalAdultTotalPrice;

        @NameInMap("re_shop_price_info_d_t_o")
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO reShopPriceInfoDTO;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setAdultPrice(Integer adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Integer getAdultPrice() {
            return this.adultPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setAdultTax(Integer adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Integer getAdultTax() {
            return this.adultTax;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setAdultTotalPrice(Integer adultTotalPrice) {
            this.adultTotalPrice = adultTotalPrice;
            return this;
        }
        public Integer getAdultTotalPrice() {
            return this.adultTotalPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setBeforeControlPrice(Integer beforeControlPrice) {
            this.beforeControlPrice = beforeControlPrice;
            return this;
        }
        public Integer getBeforeControlPrice() {
            return this.beforeControlPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setChildPrice(Integer childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Integer getChildPrice() {
            return this.childPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setChildTax(Integer childTax) {
            this.childTax = childTax;
            return this;
        }
        public Integer getChildTax() {
            return this.childTax;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setChildTotalPrice(Integer childTotalPrice) {
            this.childTotalPrice = childTotalPrice;
            return this;
        }
        public Integer getChildTotalPrice() {
            return this.childTotalPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setInfantPrice(Integer infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Integer getInfantPrice() {
            return this.infantPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setInfantTax(Integer infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Integer getInfantTax() {
            return this.infantTax;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setInfantTotalPrice(Integer infantTotalPrice) {
            this.infantTotalPrice = infantTotalPrice;
            return this;
        }
        public Integer getInfantTotalPrice() {
            return this.infantTotalPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setOriginalAdultPrice(Integer originalAdultPrice) {
            this.originalAdultPrice = originalAdultPrice;
            return this;
        }
        public Integer getOriginalAdultPrice() {
            return this.originalAdultPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setOriginalAdultTotalPrice(Integer originalAdultTotalPrice) {
            this.originalAdultTotalPrice = originalAdultTotalPrice;
            return this;
        }
        public Integer getOriginalAdultTotalPrice() {
            return this.originalAdultTotalPrice;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO setReShopPriceInfoDTO(FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO reShopPriceInfoDTO) {
            this.reShopPriceInfoDTO = reShopPriceInfoDTO;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTOReShopPriceInfoDTO getReShopPriceInfoDTO() {
            return this.reShopPriceInfoDTO;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList extends TeaModel {
        @NameInMap("airline_info")
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo airlineInfo;

        @NameInMap("arr_airport_info")
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo arrAirportInfo;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("cabinClass")
        public String cabinClass;

        @NameInMap("cabinClassName")
        public String cabinClassName;

        @NameInMap("dep_airport_info")
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo depAirportInfo;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("duration")
        public Integer duration;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("flight_share_info")
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfo flightShareInfo;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("flight_stop_info")
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo flightStopInfo;

        @NameInMap("flight_transfer_info")
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo flightTransferInfo;

        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("journey_seq")
        public Integer journeySeq;

        @NameInMap("left_num")
        public String leftNum;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("meal_desc")
        public String mealDesc;

        @NameInMap("price_info_d_t_o")
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO priceInfoDTO;

        @NameInMap("segment_seq")
        public Integer segmentSeq;

        @NameInMap("share")
        public Boolean share;

        @NameInMap("short_flight_size")
        public String shortFlightSize;

        @NameInMap("span_day")
        public String spanDay;

        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("transfer")
        public Boolean transfer;

        public static FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList self = new FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setAirlineInfo(FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setArrAirportInfo(FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setDepAirportInfo(FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setFlightShareInfo(FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfo flightShareInfo) {
            this.flightShareInfo = flightShareInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightShareInfo getFlightShareInfo() {
            return this.flightShareInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setFlightStopInfo(FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo flightStopInfo) {
            this.flightStopInfo = flightStopInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightStopInfo getFlightStopInfo() {
            return this.flightStopInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setFlightTransferInfo(FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo flightTransferInfo) {
            this.flightTransferInfo = flightTransferInfo;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListFlightTransferInfo getFlightTransferInfo() {
            return this.flightTransferInfo;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setJourneySeq(Integer journeySeq) {
            this.journeySeq = journeySeq;
            return this;
        }
        public Integer getJourneySeq() {
            return this.journeySeq;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setLeftNum(String leftNum) {
            this.leftNum = leftNum;
            return this;
        }
        public String getLeftNum() {
            return this.leftNum;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setPriceInfoDTO(FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO priceInfoDTO) {
            this.priceInfoDTO = priceInfoDTO;
            return this;
        }
        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightListPriceInfoDTO getPriceInfoDTO() {
            return this.priceInfoDTO;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setSegmentSeq(Integer segmentSeq) {
            this.segmentSeq = segmentSeq;
            return this;
        }
        public Integer getSegmentSeq() {
            return this.segmentSeq;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setShortFlightSize(String shortFlightSize) {
            this.shortFlightSize = shortFlightSize;
            return this;
        }
        public String getShortFlightSize() {
            return this.shortFlightSize;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setSpanDay(String spanDay) {
            this.spanDay = spanDay;
            return this;
        }
        public String getSpanDay() {
            return this.spanDay;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList setTransfer(Boolean transfer) {
            this.transfer = transfer;
            return this;
        }
        public Boolean getTransfer() {
            return this.transfer;
        }

    }

    public static class FlightModifyListingSearchV2ResponseBodyModule extends TeaModel {
        @NameInMap("direct_flight_list")
        public java.util.List<FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList> directFlightList;

        @NameInMap("session_id")
        public String sessionId;

        @NameInMap("transfer_flight_list")
        public java.util.List<FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList> transferFlightList;

        @NameInMap("transfer_title")
        public String transferTitle;

        public static FlightModifyListingSearchV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyListingSearchV2ResponseBodyModule self = new FlightModifyListingSearchV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightModifyListingSearchV2ResponseBodyModule setDirectFlightList(java.util.List<FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList> directFlightList) {
            this.directFlightList = directFlightList;
            return this;
        }
        public java.util.List<FlightModifyListingSearchV2ResponseBodyModuleDirectFlightList> getDirectFlightList() {
            return this.directFlightList;
        }

        public FlightModifyListingSearchV2ResponseBodyModule setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public FlightModifyListingSearchV2ResponseBodyModule setTransferFlightList(java.util.List<FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList> transferFlightList) {
            this.transferFlightList = transferFlightList;
            return this;
        }
        public java.util.List<FlightModifyListingSearchV2ResponseBodyModuleTransferFlightList> getTransferFlightList() {
            return this.transferFlightList;
        }

        public FlightModifyListingSearchV2ResponseBodyModule setTransferTitle(String transferTitle) {
            this.transferTitle = transferTitle;
            return this;
        }
        public String getTransferTitle() {
            return this.transferTitle;
        }

    }

}
