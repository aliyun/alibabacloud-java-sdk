// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyAddRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4000</p>
     */
    @NameInMap("budget")
    public Long budget;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("budget_merge")
    public Integer budgetMerge;

    @NameInMap("car_rule")
    public ApplyAddRequestCarRule carRule;

    @NameInMap("corp_name")
    public String corpName;

    @NameInMap("default_standard")
    public ApplyAddRequestDefaultStandard defaultStandard;

    /**
     * <strong>example:</strong>
     * <p>departId01</p>
     */
    @NameInMap("depart_id")
    public String departId;

    @NameInMap("depart_name")
    public String departName;

    /**
     * <p>可将补充描述传入此字段，账单中将会体现此字段的值。可以用于企业的统计和对账</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;cost_center&quot;:&quot;成本中心&quot;}</p>
     */
    @NameInMap("extend_field")
    public String extendField;

    @NameInMap("external_traveler_list")
    public java.util.List<ApplyAddRequestExternalTravelerList> externalTravelerList;

    @NameInMap("external_traveler_standard")
    public ApplyAddRequestExternalTravelerStandard externalTravelerStandard;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("flight_budget")
    public Long flightBudget;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("hotel_budget")
    public Long hotelBudget;

    @NameInMap("hotel_share")
    public ApplyAddRequestHotelShare hotelShare;

    @NameInMap("international_flight_cabins")
    public String internationalFlightCabins;

    @NameInMap("intl_flight_budget")
    public Long intlFlightBudget;

    @NameInMap("intl_hotel_budget")
    public Long intlHotelBudget;

    @NameInMap("itinerary_list")
    public java.util.List<ApplyAddRequestItineraryList> itineraryList;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("itinerary_rule")
    public Integer itineraryRule;

    @NameInMap("itinerary_set_list")
    public java.util.List<ApplyAddRequestItinerarySetList> itinerarySetList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("limit_traveler")
    public Integer limitTraveler;

    @NameInMap("payment_department_id")
    public String paymentDepartmentId;

    @NameInMap("payment_department_name")
    public String paymentDepartmentName;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("status")
    public Integer status;

    @NameInMap("sub_corp_id")
    public String subCorpId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("thirdpart_apply_id")
    public String thirdpartApplyId;

    /**
     * <strong>example:</strong>
     * <p>00714131</p>
     */
    @NameInMap("thirdpart_business_id")
    public String thirdpartBusinessId;

    @NameInMap("thirdpart_depart_id")
    public String thirdpartDepartId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("together_book_rule")
    public Integer togetherBookRule;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("train_budget")
    public Long trainBudget;

    @NameInMap("traveler_list")
    public java.util.List<ApplyAddRequestTravelerList> travelerList;

    @NameInMap("traveler_standard")
    public java.util.List<ApplyAddRequestTravelerStandard> travelerStandard;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("trip_cause")
    public String tripCause;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("trip_day")
    public Integer tripDay;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("trip_title")
    public String tripTitle;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("type")
    public Integer type;

    /**
     * <strong>example:</strong>
     * <p>union001</p>
     */
    @NameInMap("union_no")
    public String unionNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>thridpart12138</p>
     */
    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("vehicle_budget")
    public Long vehicleBudget;

    public static ApplyAddRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAddRequest self = new ApplyAddRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAddRequest setBudget(Long budget) {
        this.budget = budget;
        return this;
    }
    public Long getBudget() {
        return this.budget;
    }

    public ApplyAddRequest setBudgetMerge(Integer budgetMerge) {
        this.budgetMerge = budgetMerge;
        return this;
    }
    public Integer getBudgetMerge() {
        return this.budgetMerge;
    }

    public ApplyAddRequest setCarRule(ApplyAddRequestCarRule carRule) {
        this.carRule = carRule;
        return this;
    }
    public ApplyAddRequestCarRule getCarRule() {
        return this.carRule;
    }

    public ApplyAddRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public ApplyAddRequest setDefaultStandard(ApplyAddRequestDefaultStandard defaultStandard) {
        this.defaultStandard = defaultStandard;
        return this;
    }
    public ApplyAddRequestDefaultStandard getDefaultStandard() {
        return this.defaultStandard;
    }

    public ApplyAddRequest setDepartId(String departId) {
        this.departId = departId;
        return this;
    }
    public String getDepartId() {
        return this.departId;
    }

    public ApplyAddRequest setDepartName(String departName) {
        this.departName = departName;
        return this;
    }
    public String getDepartName() {
        return this.departName;
    }

    public ApplyAddRequest setExtendField(String extendField) {
        this.extendField = extendField;
        return this;
    }
    public String getExtendField() {
        return this.extendField;
    }

    public ApplyAddRequest setExternalTravelerList(java.util.List<ApplyAddRequestExternalTravelerList> externalTravelerList) {
        this.externalTravelerList = externalTravelerList;
        return this;
    }
    public java.util.List<ApplyAddRequestExternalTravelerList> getExternalTravelerList() {
        return this.externalTravelerList;
    }

    public ApplyAddRequest setExternalTravelerStandard(ApplyAddRequestExternalTravelerStandard externalTravelerStandard) {
        this.externalTravelerStandard = externalTravelerStandard;
        return this;
    }
    public ApplyAddRequestExternalTravelerStandard getExternalTravelerStandard() {
        return this.externalTravelerStandard;
    }

    public ApplyAddRequest setFlightBudget(Long flightBudget) {
        this.flightBudget = flightBudget;
        return this;
    }
    public Long getFlightBudget() {
        return this.flightBudget;
    }

    public ApplyAddRequest setHotelBudget(Long hotelBudget) {
        this.hotelBudget = hotelBudget;
        return this;
    }
    public Long getHotelBudget() {
        return this.hotelBudget;
    }

    public ApplyAddRequest setHotelShare(ApplyAddRequestHotelShare hotelShare) {
        this.hotelShare = hotelShare;
        return this;
    }
    public ApplyAddRequestHotelShare getHotelShare() {
        return this.hotelShare;
    }

    public ApplyAddRequest setInternationalFlightCabins(String internationalFlightCabins) {
        this.internationalFlightCabins = internationalFlightCabins;
        return this;
    }
    public String getInternationalFlightCabins() {
        return this.internationalFlightCabins;
    }

    public ApplyAddRequest setIntlFlightBudget(Long intlFlightBudget) {
        this.intlFlightBudget = intlFlightBudget;
        return this;
    }
    public Long getIntlFlightBudget() {
        return this.intlFlightBudget;
    }

    public ApplyAddRequest setIntlHotelBudget(Long intlHotelBudget) {
        this.intlHotelBudget = intlHotelBudget;
        return this;
    }
    public Long getIntlHotelBudget() {
        return this.intlHotelBudget;
    }

    public ApplyAddRequest setItineraryList(java.util.List<ApplyAddRequestItineraryList> itineraryList) {
        this.itineraryList = itineraryList;
        return this;
    }
    public java.util.List<ApplyAddRequestItineraryList> getItineraryList() {
        return this.itineraryList;
    }

    public ApplyAddRequest setItineraryRule(Integer itineraryRule) {
        this.itineraryRule = itineraryRule;
        return this;
    }
    public Integer getItineraryRule() {
        return this.itineraryRule;
    }

    public ApplyAddRequest setItinerarySetList(java.util.List<ApplyAddRequestItinerarySetList> itinerarySetList) {
        this.itinerarySetList = itinerarySetList;
        return this;
    }
    public java.util.List<ApplyAddRequestItinerarySetList> getItinerarySetList() {
        return this.itinerarySetList;
    }

    public ApplyAddRequest setLimitTraveler(Integer limitTraveler) {
        this.limitTraveler = limitTraveler;
        return this;
    }
    public Integer getLimitTraveler() {
        return this.limitTraveler;
    }

    public ApplyAddRequest setPaymentDepartmentId(String paymentDepartmentId) {
        this.paymentDepartmentId = paymentDepartmentId;
        return this;
    }
    public String getPaymentDepartmentId() {
        return this.paymentDepartmentId;
    }

    public ApplyAddRequest setPaymentDepartmentName(String paymentDepartmentName) {
        this.paymentDepartmentName = paymentDepartmentName;
        return this;
    }
    public String getPaymentDepartmentName() {
        return this.paymentDepartmentName;
    }

    public ApplyAddRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ApplyAddRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

    public ApplyAddRequest setThirdpartApplyId(String thirdpartApplyId) {
        this.thirdpartApplyId = thirdpartApplyId;
        return this;
    }
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    public ApplyAddRequest setThirdpartBusinessId(String thirdpartBusinessId) {
        this.thirdpartBusinessId = thirdpartBusinessId;
        return this;
    }
    public String getThirdpartBusinessId() {
        return this.thirdpartBusinessId;
    }

    public ApplyAddRequest setThirdpartDepartId(String thirdpartDepartId) {
        this.thirdpartDepartId = thirdpartDepartId;
        return this;
    }
    public String getThirdpartDepartId() {
        return this.thirdpartDepartId;
    }

    public ApplyAddRequest setTogetherBookRule(Integer togetherBookRule) {
        this.togetherBookRule = togetherBookRule;
        return this;
    }
    public Integer getTogetherBookRule() {
        return this.togetherBookRule;
    }

    public ApplyAddRequest setTrainBudget(Long trainBudget) {
        this.trainBudget = trainBudget;
        return this;
    }
    public Long getTrainBudget() {
        return this.trainBudget;
    }

    public ApplyAddRequest setTravelerList(java.util.List<ApplyAddRequestTravelerList> travelerList) {
        this.travelerList = travelerList;
        return this;
    }
    public java.util.List<ApplyAddRequestTravelerList> getTravelerList() {
        return this.travelerList;
    }

    public ApplyAddRequest setTravelerStandard(java.util.List<ApplyAddRequestTravelerStandard> travelerStandard) {
        this.travelerStandard = travelerStandard;
        return this;
    }
    public java.util.List<ApplyAddRequestTravelerStandard> getTravelerStandard() {
        return this.travelerStandard;
    }

    public ApplyAddRequest setTripCause(String tripCause) {
        this.tripCause = tripCause;
        return this;
    }
    public String getTripCause() {
        return this.tripCause;
    }

    public ApplyAddRequest setTripDay(Integer tripDay) {
        this.tripDay = tripDay;
        return this;
    }
    public Integer getTripDay() {
        return this.tripDay;
    }

    public ApplyAddRequest setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle;
        return this;
    }
    public String getTripTitle() {
        return this.tripTitle;
    }

    public ApplyAddRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ApplyAddRequest setUnionNo(String unionNo) {
        this.unionNo = unionNo;
        return this;
    }
    public String getUnionNo() {
        return this.unionNo;
    }

    public ApplyAddRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ApplyAddRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ApplyAddRequest setVehicleBudget(Long vehicleBudget) {
        this.vehicleBudget = vehicleBudget;
        return this;
    }
    public Long getVehicleBudget() {
        return this.vehicleBudget;
    }

    public static class ApplyAddRequestCarRule extends TeaModel {
        @NameInMap("scenario_template_id")
        public String scenarioTemplateId;

        @NameInMap("scenario_template_name")
        public String scenarioTemplateName;

        public static ApplyAddRequestCarRule build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestCarRule self = new ApplyAddRequestCarRule();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestCarRule setScenarioTemplateId(String scenarioTemplateId) {
            this.scenarioTemplateId = scenarioTemplateId;
            return this;
        }
        public String getScenarioTemplateId() {
            return this.scenarioTemplateId;
        }

        public ApplyAddRequestCarRule setScenarioTemplateName(String scenarioTemplateName) {
            this.scenarioTemplateName = scenarioTemplateName;
            return this;
        }
        public String getScenarioTemplateName() {
            return this.scenarioTemplateName;
        }

    }

    public static class ApplyAddRequestDefaultStandardHotelCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyAddRequestDefaultStandardHotelCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestDefaultStandardHotelCitys self = new ApplyAddRequestDefaultStandardHotelCitys();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestDefaultStandardHotelCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyAddRequestDefaultStandardHotelCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyAddRequestDefaultStandardHotelCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyAddRequestDefaultStandardHotelIntlCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyAddRequestDefaultStandardHotelIntlCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestDefaultStandardHotelIntlCitys self = new ApplyAddRequestDefaultStandardHotelIntlCitys();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestDefaultStandardHotelIntlCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyAddRequestDefaultStandardHotelIntlCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyAddRequestDefaultStandardHotelIntlCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyAddRequestDefaultStandard extends TeaModel {
        @NameInMap("business_discount")
        public Integer businessDiscount;

        @NameInMap("economy_discount")
        public Integer economyDiscount;

        @NameInMap("first_discount")
        public Integer firstDiscount;

        @NameInMap("flight_cabins")
        public String flightCabins;

        @NameInMap("flight_intl_rule_code")
        public Long flightIntlRuleCode;

        @NameInMap("flight_rule_code")
        public Long flightRuleCode;

        @NameInMap("hotel_citys")
        public java.util.List<ApplyAddRequestDefaultStandardHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyAddRequestDefaultStandardHotelIntlCitys> hotelIntlCitys;

        @NameInMap("hotel_intl_rule_code")
        public Long hotelIntlRuleCode;

        @NameInMap("hotel_rule_code")
        public Long hotelRuleCode;

        /**
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("international_flight_cabins")
        public String internationalFlightCabins;

        @NameInMap("premium_economy_discount")
        public Integer premiumEconomyDiscount;

        @NameInMap("reserve_type")
        public Integer reserveType;

        @NameInMap("train_rule_code")
        public Long trainRuleCode;

        @NameInMap("train_seats")
        public String trainSeats;

        public static ApplyAddRequestDefaultStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestDefaultStandard self = new ApplyAddRequestDefaultStandard();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestDefaultStandard setBusinessDiscount(Integer businessDiscount) {
            this.businessDiscount = businessDiscount;
            return this;
        }
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        public ApplyAddRequestDefaultStandard setEconomyDiscount(Integer economyDiscount) {
            this.economyDiscount = economyDiscount;
            return this;
        }
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        public ApplyAddRequestDefaultStandard setFirstDiscount(Integer firstDiscount) {
            this.firstDiscount = firstDiscount;
            return this;
        }
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        public ApplyAddRequestDefaultStandard setFlightCabins(String flightCabins) {
            this.flightCabins = flightCabins;
            return this;
        }
        public String getFlightCabins() {
            return this.flightCabins;
        }

        public ApplyAddRequestDefaultStandard setFlightIntlRuleCode(Long flightIntlRuleCode) {
            this.flightIntlRuleCode = flightIntlRuleCode;
            return this;
        }
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        public ApplyAddRequestDefaultStandard setFlightRuleCode(Long flightRuleCode) {
            this.flightRuleCode = flightRuleCode;
            return this;
        }
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        public ApplyAddRequestDefaultStandard setHotelCitys(java.util.List<ApplyAddRequestDefaultStandardHotelCitys> hotelCitys) {
            this.hotelCitys = hotelCitys;
            return this;
        }
        public java.util.List<ApplyAddRequestDefaultStandardHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        public ApplyAddRequestDefaultStandard setHotelIntlCitys(java.util.List<ApplyAddRequestDefaultStandardHotelIntlCitys> hotelIntlCitys) {
            this.hotelIntlCitys = hotelIntlCitys;
            return this;
        }
        public java.util.List<ApplyAddRequestDefaultStandardHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        public ApplyAddRequestDefaultStandard setHotelIntlRuleCode(Long hotelIntlRuleCode) {
            this.hotelIntlRuleCode = hotelIntlRuleCode;
            return this;
        }
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        public ApplyAddRequestDefaultStandard setHotelRuleCode(Long hotelRuleCode) {
            this.hotelRuleCode = hotelRuleCode;
            return this;
        }
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        public ApplyAddRequestDefaultStandard setInternationalFlightCabins(String internationalFlightCabins) {
            this.internationalFlightCabins = internationalFlightCabins;
            return this;
        }
        public String getInternationalFlightCabins() {
            return this.internationalFlightCabins;
        }

        public ApplyAddRequestDefaultStandard setPremiumEconomyDiscount(Integer premiumEconomyDiscount) {
            this.premiumEconomyDiscount = premiumEconomyDiscount;
            return this;
        }
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
        }

        public ApplyAddRequestDefaultStandard setReserveType(Integer reserveType) {
            this.reserveType = reserveType;
            return this;
        }
        public Integer getReserveType() {
            return this.reserveType;
        }

        public ApplyAddRequestDefaultStandard setTrainRuleCode(Long trainRuleCode) {
            this.trainRuleCode = trainRuleCode;
            return this;
        }
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
        }

        public ApplyAddRequestDefaultStandard setTrainSeats(String trainSeats) {
            this.trainSeats = trainSeats;
            return this;
        }
        public String getTrainSeats() {
            return this.trainSeats;
        }

    }

    public static class ApplyAddRequestExternalTravelerList extends TeaModel {
        @NameInMap("attribute")
        public String attribute;

        @NameInMap("cost_center_id")
        public Long costCenterId;

        @NameInMap("external_user_id")
        public String externalUserId;

        @NameInMap("invoice_id")
        public Long invoiceId;

        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("third_part_invoice_id")
        public String thirdPartInvoiceId;

        @NameInMap("thirdpart_cost_center_id")
        public String thirdpartCostCenterId;

        @NameInMap("thirdpart_depart_id")
        public String thirdpartDepartId;

        @NameInMap("user_name")
        public String userName;

        @NameInMap("user_name_en")
        public String userNameEn;

        public static ApplyAddRequestExternalTravelerList build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestExternalTravelerList self = new ApplyAddRequestExternalTravelerList();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestExternalTravelerList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ApplyAddRequestExternalTravelerList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public ApplyAddRequestExternalTravelerList setExternalUserId(String externalUserId) {
            this.externalUserId = externalUserId;
            return this;
        }
        public String getExternalUserId() {
            return this.externalUserId;
        }

        public ApplyAddRequestExternalTravelerList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public ApplyAddRequestExternalTravelerList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public ApplyAddRequestExternalTravelerList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public ApplyAddRequestExternalTravelerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyAddRequestExternalTravelerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyAddRequestExternalTravelerList setThirdPartInvoiceId(String thirdPartInvoiceId) {
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        public ApplyAddRequestExternalTravelerList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public ApplyAddRequestExternalTravelerList setThirdpartDepartId(String thirdpartDepartId) {
            this.thirdpartDepartId = thirdpartDepartId;
            return this;
        }
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        public ApplyAddRequestExternalTravelerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ApplyAddRequestExternalTravelerList setUserNameEn(String userNameEn) {
            this.userNameEn = userNameEn;
            return this;
        }
        public String getUserNameEn() {
            return this.userNameEn;
        }

    }

    public static class ApplyAddRequestExternalTravelerStandardHotelCitys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>1009</p>
         */
        @NameInMap("fee")
        public Long fee;

        public static ApplyAddRequestExternalTravelerStandardHotelCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestExternalTravelerStandardHotelCitys self = new ApplyAddRequestExternalTravelerStandardHotelCitys();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestExternalTravelerStandardHotelCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyAddRequestExternalTravelerStandardHotelCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyAddRequestExternalTravelerStandardHotelCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyAddRequestExternalTravelerStandardHotelIntlCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyAddRequestExternalTravelerStandardHotelIntlCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestExternalTravelerStandardHotelIntlCitys self = new ApplyAddRequestExternalTravelerStandardHotelIntlCitys();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestExternalTravelerStandardHotelIntlCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyAddRequestExternalTravelerStandardHotelIntlCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyAddRequestExternalTravelerStandardHotelIntlCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyAddRequestExternalTravelerStandard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("business_discount")
        public Integer businessDiscount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("economy_discount")
        public Integer economyDiscount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("first_discount")
        public Integer firstDiscount;

        /**
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("flight_cabins")
        public String flightCabins;

        @NameInMap("flight_intl_rule_code")
        public Long flightIntlRuleCode;

        @NameInMap("flight_rule_code")
        public Long flightRuleCode;

        @NameInMap("hotel_citys")
        public java.util.List<ApplyAddRequestExternalTravelerStandardHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyAddRequestExternalTravelerStandardHotelIntlCitys> hotelIntlCitys;

        @NameInMap("hotel_intl_rule_code")
        public Long hotelIntlRuleCode;

        @NameInMap("hotel_rule_code")
        public Long hotelRuleCode;

        /**
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("international_flight_cabins")
        public String internationalFlightCabins;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("premium_economy_discount")
        public Integer premiumEconomyDiscount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("reserve_type")
        public Integer reserveType;

        @NameInMap("train_rule_code")
        public Long trainRuleCode;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("train_seats")
        public String trainSeats;

        public static ApplyAddRequestExternalTravelerStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestExternalTravelerStandard self = new ApplyAddRequestExternalTravelerStandard();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestExternalTravelerStandard setBusinessDiscount(Integer businessDiscount) {
            this.businessDiscount = businessDiscount;
            return this;
        }
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        public ApplyAddRequestExternalTravelerStandard setEconomyDiscount(Integer economyDiscount) {
            this.economyDiscount = economyDiscount;
            return this;
        }
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        public ApplyAddRequestExternalTravelerStandard setFirstDiscount(Integer firstDiscount) {
            this.firstDiscount = firstDiscount;
            return this;
        }
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        public ApplyAddRequestExternalTravelerStandard setFlightCabins(String flightCabins) {
            this.flightCabins = flightCabins;
            return this;
        }
        public String getFlightCabins() {
            return this.flightCabins;
        }

        public ApplyAddRequestExternalTravelerStandard setFlightIntlRuleCode(Long flightIntlRuleCode) {
            this.flightIntlRuleCode = flightIntlRuleCode;
            return this;
        }
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        public ApplyAddRequestExternalTravelerStandard setFlightRuleCode(Long flightRuleCode) {
            this.flightRuleCode = flightRuleCode;
            return this;
        }
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        public ApplyAddRequestExternalTravelerStandard setHotelCitys(java.util.List<ApplyAddRequestExternalTravelerStandardHotelCitys> hotelCitys) {
            this.hotelCitys = hotelCitys;
            return this;
        }
        public java.util.List<ApplyAddRequestExternalTravelerStandardHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        public ApplyAddRequestExternalTravelerStandard setHotelIntlCitys(java.util.List<ApplyAddRequestExternalTravelerStandardHotelIntlCitys> hotelIntlCitys) {
            this.hotelIntlCitys = hotelIntlCitys;
            return this;
        }
        public java.util.List<ApplyAddRequestExternalTravelerStandardHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        public ApplyAddRequestExternalTravelerStandard setHotelIntlRuleCode(Long hotelIntlRuleCode) {
            this.hotelIntlRuleCode = hotelIntlRuleCode;
            return this;
        }
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        public ApplyAddRequestExternalTravelerStandard setHotelRuleCode(Long hotelRuleCode) {
            this.hotelRuleCode = hotelRuleCode;
            return this;
        }
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        public ApplyAddRequestExternalTravelerStandard setInternationalFlightCabins(String internationalFlightCabins) {
            this.internationalFlightCabins = internationalFlightCabins;
            return this;
        }
        public String getInternationalFlightCabins() {
            return this.internationalFlightCabins;
        }

        public ApplyAddRequestExternalTravelerStandard setPremiumEconomyDiscount(Integer premiumEconomyDiscount) {
            this.premiumEconomyDiscount = premiumEconomyDiscount;
            return this;
        }
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
        }

        public ApplyAddRequestExternalTravelerStandard setReserveType(Integer reserveType) {
            this.reserveType = reserveType;
            return this;
        }
        public Integer getReserveType() {
            return this.reserveType;
        }

        public ApplyAddRequestExternalTravelerStandard setTrainRuleCode(Long trainRuleCode) {
            this.trainRuleCode = trainRuleCode;
            return this;
        }
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
        }

        public ApplyAddRequestExternalTravelerStandard setTrainSeats(String trainSeats) {
            this.trainSeats = trainSeats;
            return this;
        }
        public String getTrainSeats() {
            return this.trainSeats;
        }

    }

    public static class ApplyAddRequestHotelShare extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("param")
        public String param;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("type")
        public String type;

        public static ApplyAddRequestHotelShare build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestHotelShare self = new ApplyAddRequestHotelShare();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestHotelShare setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public ApplyAddRequestHotelShare setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ApplyAddRequestItineraryListItineraryTravelStandard extends TeaModel {
        @NameInMap("hotel_available_nights_per_day")
        public Integer hotelAvailableNightsPerDay;

        public static ApplyAddRequestItineraryListItineraryTravelStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestItineraryListItineraryTravelStandard self = new ApplyAddRequestItineraryListItineraryTravelStandard();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestItineraryListItineraryTravelStandard setHotelAvailableNightsPerDay(Integer hotelAvailableNightsPerDay) {
            this.hotelAvailableNightsPerDay = hotelAvailableNightsPerDay;
            return this;
        }
        public Integer getHotelAvailableNightsPerDay() {
            return this.hotelAvailableNightsPerDay;
        }

    }

    public static class ApplyAddRequestItineraryList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("arr_city")
        public String arrCity;

        /**
         * <strong>example:</strong>
         * <p>HGH</p>
         */
        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>12138</p>
         */
        @NameInMap("cost_center_id")
        public Long costCenterId;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("dep_city")
        public String depCity;

        /**
         * <strong>example:</strong>
         * <p>BJS</p>
         */
        @NameInMap("dep_city_code")
        public String depCityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-01 00:00:00</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <strong>example:</strong>
         * <p>34711</p>
         */
        @NameInMap("invoice_id")
        public Long invoiceId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("itinerary_travel_standard")
        public ApplyAddRequestItineraryListItineraryTravelStandard itineraryTravelStandard;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("need_hotel")
        public Boolean needHotel;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("need_traffic")
        public Boolean needTraffic;

        /**
         * <strong>example:</strong>
         * <p>projecttow</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("province_travel_city_adcodes")
        public java.util.List<String> provinceTravelCityAdcodes;

        /**
         * <strong>example:</strong>
         * <p>thirdpart34711</p>
         */
        @NameInMap("third_part_invoice_id")
        public String thirdPartInvoiceId;

        /**
         * <strong>example:</strong>
         * <p>thridpart12138</p>
         */
        @NameInMap("thirdpart_cost_center_id")
        public String thirdpartCostCenterId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("traffic_type")
        public Integer trafficType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("trip_way")
        public Integer tripWay;

        public static ApplyAddRequestItineraryList build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestItineraryList self = new ApplyAddRequestItineraryList();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestItineraryList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public ApplyAddRequestItineraryList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public ApplyAddRequestItineraryList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public ApplyAddRequestItineraryList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ApplyAddRequestItineraryList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public ApplyAddRequestItineraryList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public ApplyAddRequestItineraryList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public ApplyAddRequestItineraryList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public ApplyAddRequestItineraryList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public ApplyAddRequestItineraryList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public ApplyAddRequestItineraryList setItineraryTravelStandard(ApplyAddRequestItineraryListItineraryTravelStandard itineraryTravelStandard) {
            this.itineraryTravelStandard = itineraryTravelStandard;
            return this;
        }
        public ApplyAddRequestItineraryListItineraryTravelStandard getItineraryTravelStandard() {
            return this.itineraryTravelStandard;
        }

        public ApplyAddRequestItineraryList setNeedHotel(Boolean needHotel) {
            this.needHotel = needHotel;
            return this;
        }
        public Boolean getNeedHotel() {
            return this.needHotel;
        }

        public ApplyAddRequestItineraryList setNeedTraffic(Boolean needTraffic) {
            this.needTraffic = needTraffic;
            return this;
        }
        public Boolean getNeedTraffic() {
            return this.needTraffic;
        }

        public ApplyAddRequestItineraryList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyAddRequestItineraryList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyAddRequestItineraryList setProvinceTravelCityAdcodes(java.util.List<String> provinceTravelCityAdcodes) {
            this.provinceTravelCityAdcodes = provinceTravelCityAdcodes;
            return this;
        }
        public java.util.List<String> getProvinceTravelCityAdcodes() {
            return this.provinceTravelCityAdcodes;
        }

        public ApplyAddRequestItineraryList setThirdPartInvoiceId(String thirdPartInvoiceId) {
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        public ApplyAddRequestItineraryList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public ApplyAddRequestItineraryList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
        }

        public ApplyAddRequestItineraryList setTripWay(Integer tripWay) {
            this.tripWay = tripWay;
            return this;
        }
        public Integer getTripWay() {
            return this.tripWay;
        }

    }

    public static class ApplyAddRequestItinerarySetListItineraryTravelStandard extends TeaModel {
        @NameInMap("hotel_available_nights_per_day")
        public Integer hotelAvailableNightsPerDay;

        public static ApplyAddRequestItinerarySetListItineraryTravelStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestItinerarySetListItineraryTravelStandard self = new ApplyAddRequestItinerarySetListItineraryTravelStandard();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestItinerarySetListItineraryTravelStandard setHotelAvailableNightsPerDay(Integer hotelAvailableNightsPerDay) {
            this.hotelAvailableNightsPerDay = hotelAvailableNightsPerDay;
            return this;
        }
        public Integer getHotelAvailableNightsPerDay() {
            return this.hotelAvailableNightsPerDay;
        }

    }

    public static class ApplyAddRequestItinerarySetList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-01 00:00:00</p>
         */
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("attribute")
        public String attribute;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BJS,HGH</p>
         */
        @NameInMap("city_code_set")
        public String cityCodeSet;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("city_set")
        public String citySet;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("cost_center_id")
        public Long costCenterId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-01 00:00:00</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("invoice_id")
        public Long invoiceId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("itinerary_travel_standard")
        public ApplyAddRequestItinerarySetListItineraryTravelStandard itineraryTravelStandard;

        /**
         * <strong>example:</strong>
         * <p>projecttow</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("province_travel_city_adcodes")
        public java.util.List<String> provinceTravelCityAdcodes;

        /**
         * <strong>example:</strong>
         * <p>thridpart12138</p>
         */
        @NameInMap("third_part_invoice_id")
        public String thirdPartInvoiceId;

        /**
         * <strong>example:</strong>
         * <p>thridpart12138</p>
         */
        @NameInMap("thirdpart_cost_center_id")
        public String thirdpartCostCenterId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("traffic_type")
        public Integer trafficType;

        public static ApplyAddRequestItinerarySetList build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestItinerarySetList self = new ApplyAddRequestItinerarySetList();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestItinerarySetList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public ApplyAddRequestItinerarySetList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ApplyAddRequestItinerarySetList setCityCodeSet(String cityCodeSet) {
            this.cityCodeSet = cityCodeSet;
            return this;
        }
        public String getCityCodeSet() {
            return this.cityCodeSet;
        }

        public ApplyAddRequestItinerarySetList setCitySet(String citySet) {
            this.citySet = citySet;
            return this;
        }
        public String getCitySet() {
            return this.citySet;
        }

        public ApplyAddRequestItinerarySetList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public ApplyAddRequestItinerarySetList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public ApplyAddRequestItinerarySetList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public ApplyAddRequestItinerarySetList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public ApplyAddRequestItinerarySetList setItineraryTravelStandard(ApplyAddRequestItinerarySetListItineraryTravelStandard itineraryTravelStandard) {
            this.itineraryTravelStandard = itineraryTravelStandard;
            return this;
        }
        public ApplyAddRequestItinerarySetListItineraryTravelStandard getItineraryTravelStandard() {
            return this.itineraryTravelStandard;
        }

        public ApplyAddRequestItinerarySetList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyAddRequestItinerarySetList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyAddRequestItinerarySetList setProvinceTravelCityAdcodes(java.util.List<String> provinceTravelCityAdcodes) {
            this.provinceTravelCityAdcodes = provinceTravelCityAdcodes;
            return this;
        }
        public java.util.List<String> getProvinceTravelCityAdcodes() {
            return this.provinceTravelCityAdcodes;
        }

        public ApplyAddRequestItinerarySetList setThirdPartInvoiceId(String thirdPartInvoiceId) {
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        public ApplyAddRequestItinerarySetList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public ApplyAddRequestItinerarySetList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
        }

    }

    public static class ApplyAddRequestTravelerList extends TeaModel {
        @NameInMap("attribute")
        public String attribute;

        @NameInMap("cost_center_id")
        public Long costCenterId;

        @NameInMap("invoice_id")
        public Long invoiceId;

        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("third_part_invoice_id")
        public String thirdPartInvoiceId;

        @NameInMap("thirdpart_cost_center_id")
        public String thirdpartCostCenterId;

        @NameInMap("thirdpart_depart_id")
        public String thirdpartDepartId;

        /**
         * <strong>example:</strong>
         * <p>wu51531</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static ApplyAddRequestTravelerList build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestTravelerList self = new ApplyAddRequestTravelerList();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestTravelerList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ApplyAddRequestTravelerList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public ApplyAddRequestTravelerList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public ApplyAddRequestTravelerList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public ApplyAddRequestTravelerList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public ApplyAddRequestTravelerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyAddRequestTravelerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyAddRequestTravelerList setThirdPartInvoiceId(String thirdPartInvoiceId) {
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        public ApplyAddRequestTravelerList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public ApplyAddRequestTravelerList setThirdpartDepartId(String thirdpartDepartId) {
            this.thirdpartDepartId = thirdpartDepartId;
            return this;
        }
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        public ApplyAddRequestTravelerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ApplyAddRequestTravelerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ApplyAddRequestTravelerStandardCarCitySet extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("city_name")
        public String cityName;

        public static ApplyAddRequestTravelerStandardCarCitySet build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestTravelerStandardCarCitySet self = new ApplyAddRequestTravelerStandardCarCitySet();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestTravelerStandardCarCitySet setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyAddRequestTravelerStandardCarCitySet setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class ApplyAddRequestTravelerStandardHotelCitys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>1009</p>
         */
        @NameInMap("fee")
        public Long fee;

        public static ApplyAddRequestTravelerStandardHotelCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestTravelerStandardHotelCitys self = new ApplyAddRequestTravelerStandardHotelCitys();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestTravelerStandardHotelCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyAddRequestTravelerStandardHotelCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyAddRequestTravelerStandardHotelCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyAddRequestTravelerStandardHotelIntlCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyAddRequestTravelerStandardHotelIntlCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestTravelerStandardHotelIntlCitys self = new ApplyAddRequestTravelerStandardHotelIntlCitys();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestTravelerStandardHotelIntlCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyAddRequestTravelerStandardHotelIntlCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyAddRequestTravelerStandardHotelIntlCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyAddRequestTravelerStandard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("business_discount")
        public Integer businessDiscount;

        @NameInMap("car_city_set")
        public java.util.List<ApplyAddRequestTravelerStandardCarCitySet> carCitySet;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("economy_discount")
        public Integer economyDiscount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("first_discount")
        public Integer firstDiscount;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("flight_cabins")
        public String flightCabins;

        @NameInMap("flight_intl_rule_code")
        public Long flightIntlRuleCode;

        @NameInMap("flight_rule_code")
        public Long flightRuleCode;

        @NameInMap("hotel_citys")
        public java.util.List<ApplyAddRequestTravelerStandardHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyAddRequestTravelerStandardHotelIntlCitys> hotelIntlCitys;

        @NameInMap("hotel_intl_rule_code")
        public Long hotelIntlRuleCode;

        @NameInMap("hotel_rule_code")
        public Long hotelRuleCode;

        /**
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("international_flight_cabins")
        public String internationalFlightCabins;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("premium_economy_discount")
        public Integer premiumEconomyDiscount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("reserve_type")
        public Integer reserveType;

        @NameInMap("train_rule_code")
        public Long trainRuleCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("train_seats")
        public String trainSeats;

        /**
         * <strong>example:</strong>
         * <p>wfffeng</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static ApplyAddRequestTravelerStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyAddRequestTravelerStandard self = new ApplyAddRequestTravelerStandard();
            return TeaModel.build(map, self);
        }

        public ApplyAddRequestTravelerStandard setBusinessDiscount(Integer businessDiscount) {
            this.businessDiscount = businessDiscount;
            return this;
        }
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        public ApplyAddRequestTravelerStandard setCarCitySet(java.util.List<ApplyAddRequestTravelerStandardCarCitySet> carCitySet) {
            this.carCitySet = carCitySet;
            return this;
        }
        public java.util.List<ApplyAddRequestTravelerStandardCarCitySet> getCarCitySet() {
            return this.carCitySet;
        }

        public ApplyAddRequestTravelerStandard setEconomyDiscount(Integer economyDiscount) {
            this.economyDiscount = economyDiscount;
            return this;
        }
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        public ApplyAddRequestTravelerStandard setFirstDiscount(Integer firstDiscount) {
            this.firstDiscount = firstDiscount;
            return this;
        }
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        public ApplyAddRequestTravelerStandard setFlightCabins(String flightCabins) {
            this.flightCabins = flightCabins;
            return this;
        }
        public String getFlightCabins() {
            return this.flightCabins;
        }

        public ApplyAddRequestTravelerStandard setFlightIntlRuleCode(Long flightIntlRuleCode) {
            this.flightIntlRuleCode = flightIntlRuleCode;
            return this;
        }
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        public ApplyAddRequestTravelerStandard setFlightRuleCode(Long flightRuleCode) {
            this.flightRuleCode = flightRuleCode;
            return this;
        }
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        public ApplyAddRequestTravelerStandard setHotelCitys(java.util.List<ApplyAddRequestTravelerStandardHotelCitys> hotelCitys) {
            this.hotelCitys = hotelCitys;
            return this;
        }
        public java.util.List<ApplyAddRequestTravelerStandardHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        public ApplyAddRequestTravelerStandard setHotelIntlCitys(java.util.List<ApplyAddRequestTravelerStandardHotelIntlCitys> hotelIntlCitys) {
            this.hotelIntlCitys = hotelIntlCitys;
            return this;
        }
        public java.util.List<ApplyAddRequestTravelerStandardHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        public ApplyAddRequestTravelerStandard setHotelIntlRuleCode(Long hotelIntlRuleCode) {
            this.hotelIntlRuleCode = hotelIntlRuleCode;
            return this;
        }
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        public ApplyAddRequestTravelerStandard setHotelRuleCode(Long hotelRuleCode) {
            this.hotelRuleCode = hotelRuleCode;
            return this;
        }
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        public ApplyAddRequestTravelerStandard setInternationalFlightCabins(String internationalFlightCabins) {
            this.internationalFlightCabins = internationalFlightCabins;
            return this;
        }
        public String getInternationalFlightCabins() {
            return this.internationalFlightCabins;
        }

        public ApplyAddRequestTravelerStandard setPremiumEconomyDiscount(Integer premiumEconomyDiscount) {
            this.premiumEconomyDiscount = premiumEconomyDiscount;
            return this;
        }
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
        }

        public ApplyAddRequestTravelerStandard setReserveType(Integer reserveType) {
            this.reserveType = reserveType;
            return this;
        }
        public Integer getReserveType() {
            return this.reserveType;
        }

        public ApplyAddRequestTravelerStandard setTrainRuleCode(Long trainRuleCode) {
            this.trainRuleCode = trainRuleCode;
            return this;
        }
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
        }

        public ApplyAddRequestTravelerStandard setTrainSeats(String trainSeats) {
            this.trainSeats = trainSeats;
            return this;
        }
        public String getTrainSeats() {
            return this.trainSeats;
        }

        public ApplyAddRequestTravelerStandard setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
