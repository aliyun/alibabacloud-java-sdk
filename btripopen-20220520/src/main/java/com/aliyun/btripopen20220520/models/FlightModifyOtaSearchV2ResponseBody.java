// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightModifyOtaSearchV2ResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public FlightModifyOtaSearchV2ResponseBodyModule module;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightModifyOtaSearchV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightModifyOtaSearchV2ResponseBody self = new FlightModifyOtaSearchV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightModifyOtaSearchV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightModifyOtaSearchV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightModifyOtaSearchV2ResponseBody setModule(FlightModifyOtaSearchV2ResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightModifyOtaSearchV2ResponseBodyModule getModule() {
        return this.module;
    }

    public FlightModifyOtaSearchV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightModifyOtaSearchV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightModifyOtaSearchV2ResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo extends TeaModel {
        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("class_name")
        public String className;

        /**
         * <p>inner_cabin_class</p>
         */
        @NameInMap("inner_cabin_class")
        public Integer innerCabinClass;

        @NameInMap("quantity")
        public String quantity;

        public static FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo self = new FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo setInnerCabinClass(Integer innerCabinClass) {
            this.innerCabinClass = innerCabinClass;
            return this;
        }
        public Integer getInnerCabinClass() {
            return this.innerCabinClass;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO extends TeaModel {
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

        public static FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO self = new FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO setReShopAdultChangeFee(Integer reShopAdultChangeFee) {
            this.reShopAdultChangeFee = reShopAdultChangeFee;
            return this;
        }
        public Integer getReShopAdultChangeFee() {
            return this.reShopAdultChangeFee;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO setReShopAdultPrice(Integer reShopAdultPrice) {
            this.reShopAdultPrice = reShopAdultPrice;
            return this;
        }
        public Integer getReShopAdultPrice() {
            return this.reShopAdultPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO setReShopAdultPriceGap(Integer reShopAdultPriceGap) {
            this.reShopAdultPriceGap = reShopAdultPriceGap;
            return this;
        }
        public Integer getReShopAdultPriceGap() {
            return this.reShopAdultPriceGap;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO setReShopChildChangeFee(Integer reShopChildChangeFee) {
            this.reShopChildChangeFee = reShopChildChangeFee;
            return this;
        }
        public Integer getReShopChildChangeFee() {
            return this.reShopChildChangeFee;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO setReShopChildPrice(Integer reShopChildPrice) {
            this.reShopChildPrice = reShopChildPrice;
            return this;
        }
        public Integer getReShopChildPrice() {
            return this.reShopChildPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO setReShopChildPriceGap(Integer reShopChildPriceGap) {
            this.reShopChildPriceGap = reShopChildPriceGap;
            return this;
        }
        public Integer getReShopChildPriceGap() {
            return this.reShopChildPriceGap;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO setReShopInfChangeFee(Integer reShopInfChangeFee) {
            this.reShopInfChangeFee = reShopInfChangeFee;
            return this;
        }
        public Integer getReShopInfChangeFee() {
            return this.reShopInfChangeFee;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO setReShopInfPrice(Integer reShopInfPrice) {
            this.reShopInfPrice = reShopInfPrice;
            return this;
        }
        public Integer getReShopInfPrice() {
            return this.reShopInfPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO setReShopInfPriceGap(Integer reShopInfPriceGap) {
            this.reShopInfPriceGap = reShopInfPriceGap;
            return this;
        }
        public Integer getReShopInfPriceGap() {
            return this.reShopInfPriceGap;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO extends TeaModel {
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
        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO reShopPriceInfoDTO;

        public static FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO self = new FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setAdultPrice(Integer adultPrice) {
            this.adultPrice = adultPrice;
            return this;
        }
        public Integer getAdultPrice() {
            return this.adultPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setAdultTax(Integer adultTax) {
            this.adultTax = adultTax;
            return this;
        }
        public Integer getAdultTax() {
            return this.adultTax;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setAdultTotalPrice(Integer adultTotalPrice) {
            this.adultTotalPrice = adultTotalPrice;
            return this;
        }
        public Integer getAdultTotalPrice() {
            return this.adultTotalPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setBeforeControlPrice(Integer beforeControlPrice) {
            this.beforeControlPrice = beforeControlPrice;
            return this;
        }
        public Integer getBeforeControlPrice() {
            return this.beforeControlPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setChildPrice(Integer childPrice) {
            this.childPrice = childPrice;
            return this;
        }
        public Integer getChildPrice() {
            return this.childPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setChildTax(Integer childTax) {
            this.childTax = childTax;
            return this;
        }
        public Integer getChildTax() {
            return this.childTax;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setChildTotalPrice(Integer childTotalPrice) {
            this.childTotalPrice = childTotalPrice;
            return this;
        }
        public Integer getChildTotalPrice() {
            return this.childTotalPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setInfantPrice(Integer infantPrice) {
            this.infantPrice = infantPrice;
            return this;
        }
        public Integer getInfantPrice() {
            return this.infantPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setInfantTax(Integer infantTax) {
            this.infantTax = infantTax;
            return this;
        }
        public Integer getInfantTax() {
            return this.infantTax;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setInfantTotalPrice(Integer infantTotalPrice) {
            this.infantTotalPrice = infantTotalPrice;
            return this;
        }
        public Integer getInfantTotalPrice() {
            return this.infantTotalPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setOriginalAdultPrice(Integer originalAdultPrice) {
            this.originalAdultPrice = originalAdultPrice;
            return this;
        }
        public Integer getOriginalAdultPrice() {
            return this.originalAdultPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setOriginalAdultTotalPrice(Integer originalAdultTotalPrice) {
            this.originalAdultTotalPrice = originalAdultTotalPrice;
            return this;
        }
        public Integer getOriginalAdultTotalPrice() {
            return this.originalAdultTotalPrice;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO setReShopPriceInfoDTO(FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO reShopPriceInfoDTO) {
            this.reShopPriceInfoDTO = reShopPriceInfoDTO;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTOReShopPriceInfoDTO getReShopPriceInfoDTO() {
            return this.reShopPriceInfoDTO;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo extends TeaModel {
        @NameInMap("attribute_show_info_map")
        public java.util.Map<String, java.util.List<ModuleAgentInfoAttributeShowInfoMapValue>> attributeShowInfoMap;

        @NameInMap("best_discount")
        public Double bestDiscount;

        @NameInMap("cabin_class_info")
        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo cabinClassInfo;

        @NameInMap("cabin_code")
        public Integer cabinCode;

        @NameInMap("cabin_name")
        public String cabinName;

        /**
         * <p>item_id</p>
         */
        @NameInMap("item_id")
        public String itemId;

        @NameInMap("modify_type_desc")
        public String modifyTypeDesc;

        @NameInMap("modify_type_name")
        public String modifyTypeName;

        @NameInMap("price_info_d_t_o")
        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO priceInfoDTO;

        @NameInMap("quantity")
        public Integer quantity;

        @NameInMap("support_child_ticket")
        public Boolean supportChildTicket;

        public static FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo self = new FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setAttributeShowInfoMap(java.util.Map<String, java.util.List<ModuleAgentInfoAttributeShowInfoMapValue>> attributeShowInfoMap) {
            this.attributeShowInfoMap = attributeShowInfoMap;
            return this;
        }
        public java.util.Map<String, java.util.List<ModuleAgentInfoAttributeShowInfoMapValue>> getAttributeShowInfoMap() {
            return this.attributeShowInfoMap;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setBestDiscount(Double bestDiscount) {
            this.bestDiscount = bestDiscount;
            return this;
        }
        public Double getBestDiscount() {
            return this.bestDiscount;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setCabinClassInfo(FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo cabinClassInfo) {
            this.cabinClassInfo = cabinClassInfo;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoCabinClassInfo getCabinClassInfo() {
            return this.cabinClassInfo;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setCabinCode(Integer cabinCode) {
            this.cabinCode = cabinCode;
            return this;
        }
        public Integer getCabinCode() {
            return this.cabinCode;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setCabinName(String cabinName) {
            this.cabinName = cabinName;
            return this;
        }
        public String getCabinName() {
            return this.cabinName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setModifyTypeDesc(String modifyTypeDesc) {
            this.modifyTypeDesc = modifyTypeDesc;
            return this;
        }
        public String getModifyTypeDesc() {
            return this.modifyTypeDesc;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setModifyTypeName(String modifyTypeName) {
            this.modifyTypeName = modifyTypeName;
            return this;
        }
        public String getModifyTypeName() {
            return this.modifyTypeName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setPriceInfoDTO(FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO priceInfoDTO) {
            this.priceInfoDTO = priceInfoDTO;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfoPriceInfoDTO getPriceInfoDTO() {
            return this.priceInfoDTO;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo setSupportChildTicket(Boolean supportChildTicket) {
            this.supportChildTicket = supportChildTicket;
            return this;
        }
        public Boolean getSupportChildTicket() {
            return this.supportChildTicket;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo self = new FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo extends TeaModel {
        @NameInMap("airport_code")
        public String airportCode;

        @NameInMap("airport_name")
        public String airportName;

        @NameInMap("airport_short_name")
        public String airportShortName;

        @NameInMap("terminal")
        public String terminal;

        public static FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo self = new FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo setAirportCode(String airportCode) {
            this.airportCode = airportCode;
            return this;
        }
        public String getAirportCode() {
            return this.airportCode;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo setAirportName(String airportName) {
            this.airportName = airportName;
            return this;
        }
        public String getAirportName() {
            return this.airportName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo setAirportShortName(String airportShortName) {
            this.airportShortName = airportShortName;
            return this;
        }
        public String getAirportShortName() {
            return this.airportShortName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo setTerminal(String terminal) {
            this.terminal = terminal;
            return this;
        }
        public String getTerminal() {
            return this.terminal;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        @NameInMap("airline_icon")
        public String airlineIcon;

        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo self = new FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo extends TeaModel {
        @NameInMap("airline_code")
        public String airlineCode;

        @NameInMap("airline_chinese_name")
        public String airlineChineseName;

        @NameInMap("airline_chinese_short_name")
        public String airlineChineseShortName;

        @NameInMap("airline_icon")
        public String airlineIcon;

        @NameInMap("cheap_flight")
        public Boolean cheapFlight;

        public static FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo self = new FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo setAirlineCode(String airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }
        public String getAirlineCode() {
            return this.airlineCode;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo setAirlineChineseName(String airlineChineseName) {
            this.airlineChineseName = airlineChineseName;
            return this;
        }
        public String getAirlineChineseName() {
            return this.airlineChineseName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo setAirlineChineseShortName(String airlineChineseShortName) {
            this.airlineChineseShortName = airlineChineseShortName;
            return this;
        }
        public String getAirlineChineseShortName() {
            return this.airlineChineseShortName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo setAirlineIcon(String airlineIcon) {
            this.airlineIcon = airlineIcon;
            return this;
        }
        public String getAirlineIcon() {
            return this.airlineIcon;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo setCheapFlight(Boolean cheapFlight) {
            this.cheapFlight = cheapFlight;
            return this;
        }
        public Boolean getCheapFlight() {
            return this.cheapFlight;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfo extends TeaModel {
        @NameInMap("operating_flight_no")
        public String operatingFlightNo;

        @NameInMap("operating_airline_info")
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo operatingAirlineInfo;

        public static FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfo self = new FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfo setOperatingFlightNo(String operatingFlightNo) {
            this.operatingFlightNo = operatingFlightNo;
            return this;
        }
        public String getOperatingFlightNo() {
            return this.operatingFlightNo;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfo setOperatingAirlineInfo(FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo operatingAirlineInfo) {
            this.operatingAirlineInfo = operatingAirlineInfo;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfoOperatingAirlineInfo getOperatingAirlineInfo() {
            return this.operatingAirlineInfo;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo extends TeaModel {
        @NameInMap("stop_city_name")
        public String stopCityName;

        @NameInMap("stop_arr_time")
        public String stopArrTime;

        @NameInMap("stop_dep_time")
        public String stopDepTime;

        @NameInMap("stop_city_code")
        public String stopCityCode;

        @NameInMap("stop_airport")
        public String stopAirport;

        @NameInMap("stop_arr_term")
        public String stopArrTerm;

        @NameInMap("stop_dep_term")
        public String stopDepTerm;

        public static FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo self = new FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo setStopCityName(String stopCityName) {
            this.stopCityName = stopCityName;
            return this;
        }
        public String getStopCityName() {
            return this.stopCityName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo setStopArrTime(String stopArrTime) {
            this.stopArrTime = stopArrTime;
            return this;
        }
        public String getStopArrTime() {
            return this.stopArrTime;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo setStopDepTime(String stopDepTime) {
            this.stopDepTime = stopDepTime;
            return this;
        }
        public String getStopDepTime() {
            return this.stopDepTime;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo setStopCityCode(String stopCityCode) {
            this.stopCityCode = stopCityCode;
            return this;
        }
        public String getStopCityCode() {
            return this.stopCityCode;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo setStopAirport(String stopAirport) {
            this.stopAirport = stopAirport;
            return this;
        }
        public String getStopAirport() {
            return this.stopAirport;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo setStopArrTerm(String stopArrTerm) {
            this.stopArrTerm = stopArrTerm;
            return this;
        }
        public String getStopArrTerm() {
            return this.stopArrTerm;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo setStopDepTerm(String stopDepTerm) {
            this.stopDepTerm = stopDepTerm;
            return this;
        }
        public String getStopDepTerm() {
            return this.stopDepTerm;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos extends TeaModel {
        @NameInMap("journey_seq")
        public Integer journeySeq;

        @NameInMap("segment_seq")
        public Integer segmentSeq;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("arr_city_name")
        public String arrCityName;

        @NameInMap("dep_airport_info")
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo depAirportInfo;

        @NameInMap("arr_airport_info")
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo arrAirportInfo;

        @NameInMap("dep_time")
        public String depTime;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("airline_info")
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo airlineInfo;

        @NameInMap("share")
        public Boolean share;

        @NameInMap("flight_shared_info")
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfo flightSharedInfo;

        @NameInMap("stop")
        public Boolean stop;

        @NameInMap("flight_stop_info")
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo flightStopInfo;

        @NameInMap("transfer_time")
        public Integer transferTime;

        @NameInMap("duration")
        public Integer duration;

        @NameInMap("manufacturer")
        public String manufacturer;

        @NameInMap("flight_type")
        public String flightType;

        @NameInMap("flight_size")
        public String flightSize;

        @NameInMap("meal_desc")
        public String mealDesc;

        @NameInMap("on_time_rate")
        public String onTimeRate;

        public static FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos self = new FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setJourneySeq(Integer journeySeq) {
            this.journeySeq = journeySeq;
            return this;
        }
        public Integer getJourneySeq() {
            return this.journeySeq;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setSegmentSeq(Integer segmentSeq) {
            this.segmentSeq = segmentSeq;
            return this;
        }
        public Integer getSegmentSeq() {
            return this.segmentSeq;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setDepAirportInfo(FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo depAirportInfo) {
            this.depAirportInfo = depAirportInfo;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosDepAirportInfo getDepAirportInfo() {
            return this.depAirportInfo;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setArrAirportInfo(FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo arrAirportInfo) {
            this.arrAirportInfo = arrAirportInfo;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosArrAirportInfo getArrAirportInfo() {
            return this.arrAirportInfo;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setDepTime(String depTime) {
            this.depTime = depTime;
            return this;
        }
        public String getDepTime() {
            return this.depTime;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setAirlineInfo(FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo airlineInfo) {
            this.airlineInfo = airlineInfo;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosAirlineInfo getAirlineInfo() {
            return this.airlineInfo;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setShare(Boolean share) {
            this.share = share;
            return this;
        }
        public Boolean getShare() {
            return this.share;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setFlightSharedInfo(FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfo flightSharedInfo) {
            this.flightSharedInfo = flightSharedInfo;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightSharedInfo getFlightSharedInfo() {
            return this.flightSharedInfo;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setFlightStopInfo(FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo flightStopInfo) {
            this.flightStopInfo = flightStopInfo;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfosFlightStopInfo getFlightStopInfo() {
            return this.flightStopInfo;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setTransferTime(Integer transferTime) {
            this.transferTime = transferTime;
            return this;
        }
        public Integer getTransferTime() {
            return this.transferTime;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        public String getManufacturer() {
            return this.manufacturer;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setFlightType(String flightType) {
            this.flightType = flightType;
            return this;
        }
        public String getFlightType() {
            return this.flightType;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setFlightSize(String flightSize) {
            this.flightSize = flightSize;
            return this;
        }
        public String getFlightSize() {
            return this.flightSize;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setMealDesc(String mealDesc) {
            this.mealDesc = mealDesc;
            return this;
        }
        public String getMealDesc() {
            return this.mealDesc;
        }

        public FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos setOnTimeRate(String onTimeRate) {
            this.onTimeRate = onTimeRate;
            return this;
        }
        public String getOnTimeRate() {
            return this.onTimeRate;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModulePassengerCount extends TeaModel {
        @NameInMap("adult_passenger_num")
        public Integer adultPassengerNum;

        @NameInMap("child_passenger_num")
        public Integer childPassengerNum;

        @NameInMap("infant_passenger_num")
        public Integer infantPassengerNum;

        public static FlightModifyOtaSearchV2ResponseBodyModulePassengerCount build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModulePassengerCount self = new FlightModifyOtaSearchV2ResponseBodyModulePassengerCount();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModulePassengerCount setAdultPassengerNum(Integer adultPassengerNum) {
            this.adultPassengerNum = adultPassengerNum;
            return this;
        }
        public Integer getAdultPassengerNum() {
            return this.adultPassengerNum;
        }

        public FlightModifyOtaSearchV2ResponseBodyModulePassengerCount setChildPassengerNum(Integer childPassengerNum) {
            this.childPassengerNum = childPassengerNum;
            return this;
        }
        public Integer getChildPassengerNum() {
            return this.childPassengerNum;
        }

        public FlightModifyOtaSearchV2ResponseBodyModulePassengerCount setInfantPassengerNum(Integer infantPassengerNum) {
            this.infantPassengerNum = infantPassengerNum;
            return this;
        }
        public Integer getInfantPassengerNum() {
            return this.infantPassengerNum;
        }

    }

    public static class FlightModifyOtaSearchV2ResponseBodyModule extends TeaModel {
        @NameInMap("agent_info")
        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo agentInfo;

        @NameInMap("cache_key")
        public String cacheKey;

        @NameInMap("flight_segment_infos")
        public java.util.List<java.util.List<FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos>> flightSegmentInfos;

        @NameInMap("passenger_count")
        public FlightModifyOtaSearchV2ResponseBodyModulePassengerCount passengerCount;

        @NameInMap("session_id")
        public String sessionId;

        public static FlightModifyOtaSearchV2ResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightModifyOtaSearchV2ResponseBodyModule self = new FlightModifyOtaSearchV2ResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightModifyOtaSearchV2ResponseBodyModule setAgentInfo(FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo agentInfo) {
            this.agentInfo = agentInfo;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModuleAgentInfo getAgentInfo() {
            return this.agentInfo;
        }

        public FlightModifyOtaSearchV2ResponseBodyModule setCacheKey(String cacheKey) {
            this.cacheKey = cacheKey;
            return this;
        }
        public String getCacheKey() {
            return this.cacheKey;
        }

        public FlightModifyOtaSearchV2ResponseBodyModule setFlightSegmentInfos(java.util.List<java.util.List<FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos>> flightSegmentInfos) {
            this.flightSegmentInfos = flightSegmentInfos;
            return this;
        }
        public java.util.List<java.util.List<FlightModifyOtaSearchV2ResponseBodyModuleFlightSegmentInfos>> getFlightSegmentInfos() {
            return this.flightSegmentInfos;
        }

        public FlightModifyOtaSearchV2ResponseBodyModule setPassengerCount(FlightModifyOtaSearchV2ResponseBodyModulePassengerCount passengerCount) {
            this.passengerCount = passengerCount;
            return this;
        }
        public FlightModifyOtaSearchV2ResponseBodyModulePassengerCount getPassengerCount() {
            return this.passengerCount;
        }

        public FlightModifyOtaSearchV2ResponseBodyModule setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
