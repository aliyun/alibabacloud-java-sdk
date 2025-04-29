// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyModifyRequest extends TeaModel {
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
    public ApplyModifyRequestCarRule carRule;

    @NameInMap("corp_name")
    public String corpName;

    @NameInMap("default_standard")
    public ApplyModifyRequestDefaultStandard defaultStandard;

    /**
     * <strong>example:</strong>
     * <p>001</p>
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
    public java.util.List<ApplyModifyRequestExternalTravelerList> externalTravelerList;

    @NameInMap("external_traveler_standard")
    public ApplyModifyRequestExternalTravelerStandard externalTravelerStandard;

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
    public ApplyModifyRequestHotelShare hotelShare;

    @NameInMap("intl_flight_budget")
    public Long intlFlightBudget;

    @NameInMap("intl_hotel_budget")
    public Long intlHotelBudget;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("itinerary_list")
    public java.util.List<ApplyModifyRequestItineraryList> itineraryList;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("itinerary_rule")
    public Integer itineraryRule;

    @NameInMap("itinerary_set_list")
    public java.util.List<ApplyModifyRequestItinerarySetList> itinerarySetList;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("limit_traveler")
    public Integer limitTraveler;

    @NameInMap("meal_budget")
    public Long mealBudget;

    @NameInMap("payment_department_id")
    public String paymentDepartmentId;

    @NameInMap("payment_department_name")
    public String paymentDepartmentName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>子企业Id</p>
     * 
     * <strong>example:</strong>
     * <p>btrip123</p>
     */
    @NameInMap("sub_corp_id")
    public String subCorpId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0001A1100000007EX08O</p>
     */
    @NameInMap("thirdpart_apply_id")
    public String thirdpartApplyId;

    /**
     * <strong>example:</strong>
     * <p>202201413141</p>
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
    public java.util.List<ApplyModifyRequestTravelerList> travelerList;

    @NameInMap("traveler_standard")
    public java.util.List<ApplyModifyRequestTravelerStandard> travelerStandard;

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
     * <p>union51415</p>
     */
    @NameInMap("union_no")
    public String unionNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>thirdpart12138</p>
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

    public static ApplyModifyRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyModifyRequest self = new ApplyModifyRequest();
        return TeaModel.build(map, self);
    }

    public ApplyModifyRequest setBudget(Long budget) {
        this.budget = budget;
        return this;
    }
    public Long getBudget() {
        return this.budget;
    }

    public ApplyModifyRequest setBudgetMerge(Integer budgetMerge) {
        this.budgetMerge = budgetMerge;
        return this;
    }
    public Integer getBudgetMerge() {
        return this.budgetMerge;
    }

    public ApplyModifyRequest setCarRule(ApplyModifyRequestCarRule carRule) {
        this.carRule = carRule;
        return this;
    }
    public ApplyModifyRequestCarRule getCarRule() {
        return this.carRule;
    }

    public ApplyModifyRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public ApplyModifyRequest setDefaultStandard(ApplyModifyRequestDefaultStandard defaultStandard) {
        this.defaultStandard = defaultStandard;
        return this;
    }
    public ApplyModifyRequestDefaultStandard getDefaultStandard() {
        return this.defaultStandard;
    }

    public ApplyModifyRequest setDepartId(String departId) {
        this.departId = departId;
        return this;
    }
    public String getDepartId() {
        return this.departId;
    }

    public ApplyModifyRequest setDepartName(String departName) {
        this.departName = departName;
        return this;
    }
    public String getDepartName() {
        return this.departName;
    }

    public ApplyModifyRequest setExtendField(String extendField) {
        this.extendField = extendField;
        return this;
    }
    public String getExtendField() {
        return this.extendField;
    }

    public ApplyModifyRequest setExternalTravelerList(java.util.List<ApplyModifyRequestExternalTravelerList> externalTravelerList) {
        this.externalTravelerList = externalTravelerList;
        return this;
    }
    public java.util.List<ApplyModifyRequestExternalTravelerList> getExternalTravelerList() {
        return this.externalTravelerList;
    }

    public ApplyModifyRequest setExternalTravelerStandard(ApplyModifyRequestExternalTravelerStandard externalTravelerStandard) {
        this.externalTravelerStandard = externalTravelerStandard;
        return this;
    }
    public ApplyModifyRequestExternalTravelerStandard getExternalTravelerStandard() {
        return this.externalTravelerStandard;
    }

    public ApplyModifyRequest setFlightBudget(Long flightBudget) {
        this.flightBudget = flightBudget;
        return this;
    }
    public Long getFlightBudget() {
        return this.flightBudget;
    }

    public ApplyModifyRequest setHotelBudget(Long hotelBudget) {
        this.hotelBudget = hotelBudget;
        return this;
    }
    public Long getHotelBudget() {
        return this.hotelBudget;
    }

    public ApplyModifyRequest setHotelShare(ApplyModifyRequestHotelShare hotelShare) {
        this.hotelShare = hotelShare;
        return this;
    }
    public ApplyModifyRequestHotelShare getHotelShare() {
        return this.hotelShare;
    }

    public ApplyModifyRequest setIntlFlightBudget(Long intlFlightBudget) {
        this.intlFlightBudget = intlFlightBudget;
        return this;
    }
    public Long getIntlFlightBudget() {
        return this.intlFlightBudget;
    }

    public ApplyModifyRequest setIntlHotelBudget(Long intlHotelBudget) {
        this.intlHotelBudget = intlHotelBudget;
        return this;
    }
    public Long getIntlHotelBudget() {
        return this.intlHotelBudget;
    }

    public ApplyModifyRequest setItineraryList(java.util.List<ApplyModifyRequestItineraryList> itineraryList) {
        this.itineraryList = itineraryList;
        return this;
    }
    public java.util.List<ApplyModifyRequestItineraryList> getItineraryList() {
        return this.itineraryList;
    }

    public ApplyModifyRequest setItineraryRule(Integer itineraryRule) {
        this.itineraryRule = itineraryRule;
        return this;
    }
    public Integer getItineraryRule() {
        return this.itineraryRule;
    }

    public ApplyModifyRequest setItinerarySetList(java.util.List<ApplyModifyRequestItinerarySetList> itinerarySetList) {
        this.itinerarySetList = itinerarySetList;
        return this;
    }
    public java.util.List<ApplyModifyRequestItinerarySetList> getItinerarySetList() {
        return this.itinerarySetList;
    }

    public ApplyModifyRequest setLimitTraveler(Integer limitTraveler) {
        this.limitTraveler = limitTraveler;
        return this;
    }
    public Integer getLimitTraveler() {
        return this.limitTraveler;
    }

    public ApplyModifyRequest setMealBudget(Long mealBudget) {
        this.mealBudget = mealBudget;
        return this;
    }
    public Long getMealBudget() {
        return this.mealBudget;
    }

    public ApplyModifyRequest setPaymentDepartmentId(String paymentDepartmentId) {
        this.paymentDepartmentId = paymentDepartmentId;
        return this;
    }
    public String getPaymentDepartmentId() {
        return this.paymentDepartmentId;
    }

    public ApplyModifyRequest setPaymentDepartmentName(String paymentDepartmentName) {
        this.paymentDepartmentName = paymentDepartmentName;
        return this;
    }
    public String getPaymentDepartmentName() {
        return this.paymentDepartmentName;
    }

    public ApplyModifyRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ApplyModifyRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

    public ApplyModifyRequest setThirdpartApplyId(String thirdpartApplyId) {
        this.thirdpartApplyId = thirdpartApplyId;
        return this;
    }
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    public ApplyModifyRequest setThirdpartBusinessId(String thirdpartBusinessId) {
        this.thirdpartBusinessId = thirdpartBusinessId;
        return this;
    }
    public String getThirdpartBusinessId() {
        return this.thirdpartBusinessId;
    }

    public ApplyModifyRequest setThirdpartDepartId(String thirdpartDepartId) {
        this.thirdpartDepartId = thirdpartDepartId;
        return this;
    }
    public String getThirdpartDepartId() {
        return this.thirdpartDepartId;
    }

    public ApplyModifyRequest setTogetherBookRule(Integer togetherBookRule) {
        this.togetherBookRule = togetherBookRule;
        return this;
    }
    public Integer getTogetherBookRule() {
        return this.togetherBookRule;
    }

    public ApplyModifyRequest setTrainBudget(Long trainBudget) {
        this.trainBudget = trainBudget;
        return this;
    }
    public Long getTrainBudget() {
        return this.trainBudget;
    }

    public ApplyModifyRequest setTravelerList(java.util.List<ApplyModifyRequestTravelerList> travelerList) {
        this.travelerList = travelerList;
        return this;
    }
    public java.util.List<ApplyModifyRequestTravelerList> getTravelerList() {
        return this.travelerList;
    }

    public ApplyModifyRequest setTravelerStandard(java.util.List<ApplyModifyRequestTravelerStandard> travelerStandard) {
        this.travelerStandard = travelerStandard;
        return this;
    }
    public java.util.List<ApplyModifyRequestTravelerStandard> getTravelerStandard() {
        return this.travelerStandard;
    }

    public ApplyModifyRequest setTripCause(String tripCause) {
        this.tripCause = tripCause;
        return this;
    }
    public String getTripCause() {
        return this.tripCause;
    }

    public ApplyModifyRequest setTripDay(Integer tripDay) {
        this.tripDay = tripDay;
        return this;
    }
    public Integer getTripDay() {
        return this.tripDay;
    }

    public ApplyModifyRequest setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle;
        return this;
    }
    public String getTripTitle() {
        return this.tripTitle;
    }

    public ApplyModifyRequest setUnionNo(String unionNo) {
        this.unionNo = unionNo;
        return this;
    }
    public String getUnionNo() {
        return this.unionNo;
    }

    public ApplyModifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ApplyModifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ApplyModifyRequest setVehicleBudget(Long vehicleBudget) {
        this.vehicleBudget = vehicleBudget;
        return this;
    }
    public Long getVehicleBudget() {
        return this.vehicleBudget;
    }

    public static class ApplyModifyRequestCarRule extends TeaModel {
        @NameInMap("scenario_template_id")
        public String scenarioTemplateId;

        @NameInMap("scenario_template_name")
        public String scenarioTemplateName;

        public static ApplyModifyRequestCarRule build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestCarRule self = new ApplyModifyRequestCarRule();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestCarRule setScenarioTemplateId(String scenarioTemplateId) {
            this.scenarioTemplateId = scenarioTemplateId;
            return this;
        }
        public String getScenarioTemplateId() {
            return this.scenarioTemplateId;
        }

        public ApplyModifyRequestCarRule setScenarioTemplateName(String scenarioTemplateName) {
            this.scenarioTemplateName = scenarioTemplateName;
            return this;
        }
        public String getScenarioTemplateName() {
            return this.scenarioTemplateName;
        }

    }

    public static class ApplyModifyRequestDefaultStandardHotelCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyModifyRequestDefaultStandardHotelCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestDefaultStandardHotelCitys self = new ApplyModifyRequestDefaultStandardHotelCitys();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestDefaultStandardHotelCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyModifyRequestDefaultStandardHotelCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyModifyRequestDefaultStandardHotelCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyModifyRequestDefaultStandardHotelIntlCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyModifyRequestDefaultStandardHotelIntlCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestDefaultStandardHotelIntlCitys self = new ApplyModifyRequestDefaultStandardHotelIntlCitys();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestDefaultStandardHotelIntlCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyModifyRequestDefaultStandardHotelIntlCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyModifyRequestDefaultStandardHotelIntlCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyModifyRequestDefaultStandard extends TeaModel {
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
        public java.util.List<ApplyModifyRequestDefaultStandardHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyModifyRequestDefaultStandardHotelIntlCitys> hotelIntlCitys;

        @NameInMap("hotel_intl_rule_code")
        public Long hotelIntlRuleCode;

        @NameInMap("hotel_rule_code")
        public Long hotelRuleCode;

        @NameInMap("premium_economy_discount")
        public Integer premiumEconomyDiscount;

        @NameInMap("reserve_type")
        public Integer reserveType;

        @NameInMap("train_rule_code")
        public Long trainRuleCode;

        @NameInMap("train_seats")
        public String trainSeats;

        public static ApplyModifyRequestDefaultStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestDefaultStandard self = new ApplyModifyRequestDefaultStandard();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestDefaultStandard setBusinessDiscount(Integer businessDiscount) {
            this.businessDiscount = businessDiscount;
            return this;
        }
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        public ApplyModifyRequestDefaultStandard setEconomyDiscount(Integer economyDiscount) {
            this.economyDiscount = economyDiscount;
            return this;
        }
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        public ApplyModifyRequestDefaultStandard setFirstDiscount(Integer firstDiscount) {
            this.firstDiscount = firstDiscount;
            return this;
        }
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        public ApplyModifyRequestDefaultStandard setFlightCabins(String flightCabins) {
            this.flightCabins = flightCabins;
            return this;
        }
        public String getFlightCabins() {
            return this.flightCabins;
        }

        public ApplyModifyRequestDefaultStandard setFlightIntlRuleCode(Long flightIntlRuleCode) {
            this.flightIntlRuleCode = flightIntlRuleCode;
            return this;
        }
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        public ApplyModifyRequestDefaultStandard setFlightRuleCode(Long flightRuleCode) {
            this.flightRuleCode = flightRuleCode;
            return this;
        }
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        public ApplyModifyRequestDefaultStandard setHotelCitys(java.util.List<ApplyModifyRequestDefaultStandardHotelCitys> hotelCitys) {
            this.hotelCitys = hotelCitys;
            return this;
        }
        public java.util.List<ApplyModifyRequestDefaultStandardHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        public ApplyModifyRequestDefaultStandard setHotelIntlCitys(java.util.List<ApplyModifyRequestDefaultStandardHotelIntlCitys> hotelIntlCitys) {
            this.hotelIntlCitys = hotelIntlCitys;
            return this;
        }
        public java.util.List<ApplyModifyRequestDefaultStandardHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        public ApplyModifyRequestDefaultStandard setHotelIntlRuleCode(Long hotelIntlRuleCode) {
            this.hotelIntlRuleCode = hotelIntlRuleCode;
            return this;
        }
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        public ApplyModifyRequestDefaultStandard setHotelRuleCode(Long hotelRuleCode) {
            this.hotelRuleCode = hotelRuleCode;
            return this;
        }
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        public ApplyModifyRequestDefaultStandard setPremiumEconomyDiscount(Integer premiumEconomyDiscount) {
            this.premiumEconomyDiscount = premiumEconomyDiscount;
            return this;
        }
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
        }

        public ApplyModifyRequestDefaultStandard setReserveType(Integer reserveType) {
            this.reserveType = reserveType;
            return this;
        }
        public Integer getReserveType() {
            return this.reserveType;
        }

        public ApplyModifyRequestDefaultStandard setTrainRuleCode(Long trainRuleCode) {
            this.trainRuleCode = trainRuleCode;
            return this;
        }
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
        }

        public ApplyModifyRequestDefaultStandard setTrainSeats(String trainSeats) {
            this.trainSeats = trainSeats;
            return this;
        }
        public String getTrainSeats() {
            return this.trainSeats;
        }

    }

    public static class ApplyModifyRequestExternalTravelerList extends TeaModel {
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

        public static ApplyModifyRequestExternalTravelerList build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestExternalTravelerList self = new ApplyModifyRequestExternalTravelerList();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestExternalTravelerList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ApplyModifyRequestExternalTravelerList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public ApplyModifyRequestExternalTravelerList setExternalUserId(String externalUserId) {
            this.externalUserId = externalUserId;
            return this;
        }
        public String getExternalUserId() {
            return this.externalUserId;
        }

        public ApplyModifyRequestExternalTravelerList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public ApplyModifyRequestExternalTravelerList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public ApplyModifyRequestExternalTravelerList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public ApplyModifyRequestExternalTravelerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyModifyRequestExternalTravelerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyModifyRequestExternalTravelerList setThirdPartInvoiceId(String thirdPartInvoiceId) {
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        public ApplyModifyRequestExternalTravelerList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public ApplyModifyRequestExternalTravelerList setThirdpartDepartId(String thirdpartDepartId) {
            this.thirdpartDepartId = thirdpartDepartId;
            return this;
        }
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        public ApplyModifyRequestExternalTravelerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public ApplyModifyRequestExternalTravelerList setUserNameEn(String userNameEn) {
            this.userNameEn = userNameEn;
            return this;
        }
        public String getUserNameEn() {
            return this.userNameEn;
        }

    }

    public static class ApplyModifyRequestExternalTravelerStandardHotelCitys extends TeaModel {
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
         * <p>1001</p>
         */
        @NameInMap("fee")
        public Long fee;

        public static ApplyModifyRequestExternalTravelerStandardHotelCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestExternalTravelerStandardHotelCitys self = new ApplyModifyRequestExternalTravelerStandardHotelCitys();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestExternalTravelerStandardHotelCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyModifyRequestExternalTravelerStandardHotelCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyModifyRequestExternalTravelerStandardHotelCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyModifyRequestExternalTravelerStandardHotelIntlCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyModifyRequestExternalTravelerStandardHotelIntlCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestExternalTravelerStandardHotelIntlCitys self = new ApplyModifyRequestExternalTravelerStandardHotelIntlCitys();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestExternalTravelerStandardHotelIntlCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyModifyRequestExternalTravelerStandardHotelIntlCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyModifyRequestExternalTravelerStandardHotelIntlCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyModifyRequestExternalTravelerStandard extends TeaModel {
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
         * <p>Y</p>
         */
        @NameInMap("flight_cabins")
        public String flightCabins;

        @NameInMap("flight_intl_rule_code")
        public Long flightIntlRuleCode;

        @NameInMap("flight_rule_code")
        public Long flightRuleCode;

        @NameInMap("hotel_citys")
        public java.util.List<ApplyModifyRequestExternalTravelerStandardHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyModifyRequestExternalTravelerStandardHotelIntlCitys> hotelIntlCitys;

        @NameInMap("hotel_intl_rule_code")
        public Long hotelIntlRuleCode;

        @NameInMap("hotel_rule_code")
        public Long hotelRuleCode;

        /**
         * <p>超级经济舱折扣。1到10的整数</p>
         * 
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

        public static ApplyModifyRequestExternalTravelerStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestExternalTravelerStandard self = new ApplyModifyRequestExternalTravelerStandard();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestExternalTravelerStandard setBusinessDiscount(Integer businessDiscount) {
            this.businessDiscount = businessDiscount;
            return this;
        }
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        public ApplyModifyRequestExternalTravelerStandard setEconomyDiscount(Integer economyDiscount) {
            this.economyDiscount = economyDiscount;
            return this;
        }
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        public ApplyModifyRequestExternalTravelerStandard setFirstDiscount(Integer firstDiscount) {
            this.firstDiscount = firstDiscount;
            return this;
        }
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        public ApplyModifyRequestExternalTravelerStandard setFlightCabins(String flightCabins) {
            this.flightCabins = flightCabins;
            return this;
        }
        public String getFlightCabins() {
            return this.flightCabins;
        }

        public ApplyModifyRequestExternalTravelerStandard setFlightIntlRuleCode(Long flightIntlRuleCode) {
            this.flightIntlRuleCode = flightIntlRuleCode;
            return this;
        }
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        public ApplyModifyRequestExternalTravelerStandard setFlightRuleCode(Long flightRuleCode) {
            this.flightRuleCode = flightRuleCode;
            return this;
        }
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        public ApplyModifyRequestExternalTravelerStandard setHotelCitys(java.util.List<ApplyModifyRequestExternalTravelerStandardHotelCitys> hotelCitys) {
            this.hotelCitys = hotelCitys;
            return this;
        }
        public java.util.List<ApplyModifyRequestExternalTravelerStandardHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        public ApplyModifyRequestExternalTravelerStandard setHotelIntlCitys(java.util.List<ApplyModifyRequestExternalTravelerStandardHotelIntlCitys> hotelIntlCitys) {
            this.hotelIntlCitys = hotelIntlCitys;
            return this;
        }
        public java.util.List<ApplyModifyRequestExternalTravelerStandardHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        public ApplyModifyRequestExternalTravelerStandard setHotelIntlRuleCode(Long hotelIntlRuleCode) {
            this.hotelIntlRuleCode = hotelIntlRuleCode;
            return this;
        }
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        public ApplyModifyRequestExternalTravelerStandard setHotelRuleCode(Long hotelRuleCode) {
            this.hotelRuleCode = hotelRuleCode;
            return this;
        }
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        public ApplyModifyRequestExternalTravelerStandard setPremiumEconomyDiscount(Integer premiumEconomyDiscount) {
            this.premiumEconomyDiscount = premiumEconomyDiscount;
            return this;
        }
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
        }

        public ApplyModifyRequestExternalTravelerStandard setReserveType(Integer reserveType) {
            this.reserveType = reserveType;
            return this;
        }
        public Integer getReserveType() {
            return this.reserveType;
        }

        public ApplyModifyRequestExternalTravelerStandard setTrainRuleCode(Long trainRuleCode) {
            this.trainRuleCode = trainRuleCode;
            return this;
        }
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
        }

        public ApplyModifyRequestExternalTravelerStandard setTrainSeats(String trainSeats) {
            this.trainSeats = trainSeats;
            return this;
        }
        public String getTrainSeats() {
            return this.trainSeats;
        }

    }

    public static class ApplyModifyRequestHotelShare extends TeaModel {
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

        public static ApplyModifyRequestHotelShare build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestHotelShare self = new ApplyModifyRequestHotelShare();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestHotelShare setParam(String param) {
            this.param = param;
            return this;
        }
        public String getParam() {
            return this.param;
        }

        public ApplyModifyRequestHotelShare setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ApplyModifyRequestItineraryListItineraryTravelStandard extends TeaModel {
        @NameInMap("hotel_available_nights_per_day")
        public Integer hotelAvailableNightsPerDay;

        public static ApplyModifyRequestItineraryListItineraryTravelStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestItineraryListItineraryTravelStandard self = new ApplyModifyRequestItineraryListItineraryTravelStandard();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestItineraryListItineraryTravelStandard setHotelAvailableNightsPerDay(Integer hotelAvailableNightsPerDay) {
            this.hotelAvailableNightsPerDay = hotelAvailableNightsPerDay;
            return this;
        }
        public Integer getHotelAvailableNightsPerDay() {
            return this.hotelAvailableNightsPerDay;
        }

    }

    public static class ApplyModifyRequestItineraryList extends TeaModel {
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
         * 
         * <strong>example:</strong>
         * <p>2022-07-12 00:00:00</p>
         */
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>2021413</p>
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
         * <p>2022-07-12 00:00:00</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <strong>example:</strong>
         * <p>614141</p>
         */
        @NameInMap("invoice_id")
        public Long invoiceId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000131</p>
         */
        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("itinerary_travel_standard")
        public ApplyModifyRequestItineraryListItineraryTravelStandard itineraryTravelStandard;

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
         * <p>projectone</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        @NameInMap("province_travel_city_adcodes")
        public java.util.List<String> provinceTravelCityAdcodes;

        /**
         * <strong>example:</strong>
         * <p>ZG14131</p>
         */
        @NameInMap("third_part_invoice_id")
        public String thirdPartInvoiceId;

        /**
         * <strong>example:</strong>
         * <p>thirdpart5151</p>
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

        public static ApplyModifyRequestItineraryList build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestItineraryList self = new ApplyModifyRequestItineraryList();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestItineraryList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public ApplyModifyRequestItineraryList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public ApplyModifyRequestItineraryList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public ApplyModifyRequestItineraryList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ApplyModifyRequestItineraryList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public ApplyModifyRequestItineraryList setDepCity(String depCity) {
            this.depCity = depCity;
            return this;
        }
        public String getDepCity() {
            return this.depCity;
        }

        public ApplyModifyRequestItineraryList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public ApplyModifyRequestItineraryList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public ApplyModifyRequestItineraryList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public ApplyModifyRequestItineraryList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public ApplyModifyRequestItineraryList setItineraryTravelStandard(ApplyModifyRequestItineraryListItineraryTravelStandard itineraryTravelStandard) {
            this.itineraryTravelStandard = itineraryTravelStandard;
            return this;
        }
        public ApplyModifyRequestItineraryListItineraryTravelStandard getItineraryTravelStandard() {
            return this.itineraryTravelStandard;
        }

        public ApplyModifyRequestItineraryList setNeedHotel(Boolean needHotel) {
            this.needHotel = needHotel;
            return this;
        }
        public Boolean getNeedHotel() {
            return this.needHotel;
        }

        public ApplyModifyRequestItineraryList setNeedTraffic(Boolean needTraffic) {
            this.needTraffic = needTraffic;
            return this;
        }
        public Boolean getNeedTraffic() {
            return this.needTraffic;
        }

        public ApplyModifyRequestItineraryList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyModifyRequestItineraryList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyModifyRequestItineraryList setProvinceTravelCityAdcodes(java.util.List<String> provinceTravelCityAdcodes) {
            this.provinceTravelCityAdcodes = provinceTravelCityAdcodes;
            return this;
        }
        public java.util.List<String> getProvinceTravelCityAdcodes() {
            return this.provinceTravelCityAdcodes;
        }

        public ApplyModifyRequestItineraryList setThirdPartInvoiceId(String thirdPartInvoiceId) {
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        public ApplyModifyRequestItineraryList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public ApplyModifyRequestItineraryList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
        }

        public ApplyModifyRequestItineraryList setTripWay(Integer tripWay) {
            this.tripWay = tripWay;
            return this;
        }
        public Integer getTripWay() {
            return this.tripWay;
        }

    }

    public static class ApplyModifyRequestItinerarySetListItineraryTravelStandard extends TeaModel {
        @NameInMap("hotel_available_nights_per_day")
        public Integer hotelAvailableNightsPerDay;

        public static ApplyModifyRequestItinerarySetListItineraryTravelStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestItinerarySetListItineraryTravelStandard self = new ApplyModifyRequestItinerarySetListItineraryTravelStandard();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestItinerarySetListItineraryTravelStandard setHotelAvailableNightsPerDay(Integer hotelAvailableNightsPerDay) {
            this.hotelAvailableNightsPerDay = hotelAvailableNightsPerDay;
            return this;
        }
        public Integer getHotelAvailableNightsPerDay() {
            return this.hotelAvailableNightsPerDay;
        }

    }

    public static class ApplyModifyRequestItinerarySetList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2017-01-01 00:00:00</p>
         */
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>BJS,SHA</p>
         */
        @NameInMap("city_code_set")
        public String cityCodeSet;

        @NameInMap("city_set")
        public String citySet;

        /**
         * <strong>example:</strong>
         * <p>123455</p>
         */
        @NameInMap("cost_center_id")
        public Long costCenterId;

        /**
         * <strong>example:</strong>
         * <p>2017-01-01 00:00:00</p>
         */
        @NameInMap("dep_date")
        public String depDate;

        /**
         * <strong>example:</strong>
         * <p>12344</p>
         */
        @NameInMap("invoice_id")
        public Long invoiceId;

        /**
         * <strong>example:</strong>
         * <p>20220722001</p>
         */
        @NameInMap("itinerary_id")
        public String itineraryId;

        @NameInMap("itinerary_travel_standard")
        public ApplyModifyRequestItinerarySetListItineraryTravelStandard itineraryTravelStandard;

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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("traffic_type")
        public Integer trafficType;

        public static ApplyModifyRequestItinerarySetList build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestItinerarySetList self = new ApplyModifyRequestItinerarySetList();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestItinerarySetList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public ApplyModifyRequestItinerarySetList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ApplyModifyRequestItinerarySetList setCityCodeSet(String cityCodeSet) {
            this.cityCodeSet = cityCodeSet;
            return this;
        }
        public String getCityCodeSet() {
            return this.cityCodeSet;
        }

        public ApplyModifyRequestItinerarySetList setCitySet(String citySet) {
            this.citySet = citySet;
            return this;
        }
        public String getCitySet() {
            return this.citySet;
        }

        public ApplyModifyRequestItinerarySetList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public ApplyModifyRequestItinerarySetList setDepDate(String depDate) {
            this.depDate = depDate;
            return this;
        }
        public String getDepDate() {
            return this.depDate;
        }

        public ApplyModifyRequestItinerarySetList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public ApplyModifyRequestItinerarySetList setItineraryId(String itineraryId) {
            this.itineraryId = itineraryId;
            return this;
        }
        public String getItineraryId() {
            return this.itineraryId;
        }

        public ApplyModifyRequestItinerarySetList setItineraryTravelStandard(ApplyModifyRequestItinerarySetListItineraryTravelStandard itineraryTravelStandard) {
            this.itineraryTravelStandard = itineraryTravelStandard;
            return this;
        }
        public ApplyModifyRequestItinerarySetListItineraryTravelStandard getItineraryTravelStandard() {
            return this.itineraryTravelStandard;
        }

        public ApplyModifyRequestItinerarySetList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyModifyRequestItinerarySetList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyModifyRequestItinerarySetList setProvinceTravelCityAdcodes(java.util.List<String> provinceTravelCityAdcodes) {
            this.provinceTravelCityAdcodes = provinceTravelCityAdcodes;
            return this;
        }
        public java.util.List<String> getProvinceTravelCityAdcodes() {
            return this.provinceTravelCityAdcodes;
        }

        public ApplyModifyRequestItinerarySetList setThirdPartInvoiceId(String thirdPartInvoiceId) {
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        public ApplyModifyRequestItinerarySetList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public ApplyModifyRequestItinerarySetList setTrafficType(Integer trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public Integer getTrafficType() {
            return this.trafficType;
        }

    }

    public static class ApplyModifyRequestTravelerList extends TeaModel {
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
         * <p>GS641312</p>
         */
        @NameInMap("user_id")
        public String userId;

        @NameInMap("user_name")
        public String userName;

        public static ApplyModifyRequestTravelerList build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerList self = new ApplyModifyRequestTravelerList();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerList setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public ApplyModifyRequestTravelerList setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public ApplyModifyRequestTravelerList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public ApplyModifyRequestTravelerList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public ApplyModifyRequestTravelerList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public ApplyModifyRequestTravelerList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public ApplyModifyRequestTravelerList setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

        public ApplyModifyRequestTravelerList setThirdPartInvoiceId(String thirdPartInvoiceId) {
            this.thirdPartInvoiceId = thirdPartInvoiceId;
            return this;
        }
        public String getThirdPartInvoiceId() {
            return this.thirdPartInvoiceId;
        }

        public ApplyModifyRequestTravelerList setThirdpartCostCenterId(String thirdpartCostCenterId) {
            this.thirdpartCostCenterId = thirdpartCostCenterId;
            return this;
        }
        public String getThirdpartCostCenterId() {
            return this.thirdpartCostCenterId;
        }

        public ApplyModifyRequestTravelerList setThirdpartDepartId(String thirdpartDepartId) {
            this.thirdpartDepartId = thirdpartDepartId;
            return this;
        }
        public String getThirdpartDepartId() {
            return this.thirdpartDepartId;
        }

        public ApplyModifyRequestTravelerList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ApplyModifyRequestTravelerList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarCitySet extends TeaModel {
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

        public static ApplyModifyRequestTravelerStandardCarCitySet build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarCitySet self = new ApplyModifyRequestTravelerStandardCarCitySet();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarCitySet setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyModifyRequestTravelerStandardCarCitySet setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class ApplyModifyRequestTravelerStandardHotelCitys extends TeaModel {
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
         * <p>1014</p>
         */
        @NameInMap("fee")
        public Long fee;

        public static ApplyModifyRequestTravelerStandardHotelCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardHotelCitys self = new ApplyModifyRequestTravelerStandardHotelCitys();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardHotelCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyModifyRequestTravelerStandardHotelCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyModifyRequestTravelerStandardHotelCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyModifyRequestTravelerStandardHotelIntlCitys extends TeaModel {
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        @NameInMap("fee")
        public Long fee;

        public static ApplyModifyRequestTravelerStandardHotelIntlCitys build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardHotelIntlCitys self = new ApplyModifyRequestTravelerStandardHotelIntlCitys();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardHotelIntlCitys setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyModifyRequestTravelerStandardHotelIntlCitys setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public ApplyModifyRequestTravelerStandardHotelIntlCitys setFee(Long fee) {
            this.fee = fee;
            return this;
        }
        public Long getFee() {
            return this.fee;
        }

    }

    public static class ApplyModifyRequestTravelerStandard extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("business_discount")
        public Integer businessDiscount;

        @NameInMap("car_city_set")
        public java.util.List<ApplyModifyRequestTravelerStandardCarCitySet> carCitySet;

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
        public java.util.List<ApplyModifyRequestTravelerStandardHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyModifyRequestTravelerStandardHotelIntlCitys> hotelIntlCitys;

        @NameInMap("hotel_intl_rule_code")
        public Long hotelIntlRuleCode;

        @NameInMap("hotel_rule_code")
        public Long hotelRuleCode;

        /**
         * <p>超级经济舱折扣。1到10的整数</p>
         * 
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
         * <p>thirdpart12138</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static ApplyModifyRequestTravelerStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandard self = new ApplyModifyRequestTravelerStandard();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandard setBusinessDiscount(Integer businessDiscount) {
            this.businessDiscount = businessDiscount;
            return this;
        }
        public Integer getBusinessDiscount() {
            return this.businessDiscount;
        }

        public ApplyModifyRequestTravelerStandard setCarCitySet(java.util.List<ApplyModifyRequestTravelerStandardCarCitySet> carCitySet) {
            this.carCitySet = carCitySet;
            return this;
        }
        public java.util.List<ApplyModifyRequestTravelerStandardCarCitySet> getCarCitySet() {
            return this.carCitySet;
        }

        public ApplyModifyRequestTravelerStandard setEconomyDiscount(Integer economyDiscount) {
            this.economyDiscount = economyDiscount;
            return this;
        }
        public Integer getEconomyDiscount() {
            return this.economyDiscount;
        }

        public ApplyModifyRequestTravelerStandard setFirstDiscount(Integer firstDiscount) {
            this.firstDiscount = firstDiscount;
            return this;
        }
        public Integer getFirstDiscount() {
            return this.firstDiscount;
        }

        public ApplyModifyRequestTravelerStandard setFlightCabins(String flightCabins) {
            this.flightCabins = flightCabins;
            return this;
        }
        public String getFlightCabins() {
            return this.flightCabins;
        }

        public ApplyModifyRequestTravelerStandard setFlightIntlRuleCode(Long flightIntlRuleCode) {
            this.flightIntlRuleCode = flightIntlRuleCode;
            return this;
        }
        public Long getFlightIntlRuleCode() {
            return this.flightIntlRuleCode;
        }

        public ApplyModifyRequestTravelerStandard setFlightRuleCode(Long flightRuleCode) {
            this.flightRuleCode = flightRuleCode;
            return this;
        }
        public Long getFlightRuleCode() {
            return this.flightRuleCode;
        }

        public ApplyModifyRequestTravelerStandard setHotelCitys(java.util.List<ApplyModifyRequestTravelerStandardHotelCitys> hotelCitys) {
            this.hotelCitys = hotelCitys;
            return this;
        }
        public java.util.List<ApplyModifyRequestTravelerStandardHotelCitys> getHotelCitys() {
            return this.hotelCitys;
        }

        public ApplyModifyRequestTravelerStandard setHotelIntlCitys(java.util.List<ApplyModifyRequestTravelerStandardHotelIntlCitys> hotelIntlCitys) {
            this.hotelIntlCitys = hotelIntlCitys;
            return this;
        }
        public java.util.List<ApplyModifyRequestTravelerStandardHotelIntlCitys> getHotelIntlCitys() {
            return this.hotelIntlCitys;
        }

        public ApplyModifyRequestTravelerStandard setHotelIntlRuleCode(Long hotelIntlRuleCode) {
            this.hotelIntlRuleCode = hotelIntlRuleCode;
            return this;
        }
        public Long getHotelIntlRuleCode() {
            return this.hotelIntlRuleCode;
        }

        public ApplyModifyRequestTravelerStandard setHotelRuleCode(Long hotelRuleCode) {
            this.hotelRuleCode = hotelRuleCode;
            return this;
        }
        public Long getHotelRuleCode() {
            return this.hotelRuleCode;
        }

        public ApplyModifyRequestTravelerStandard setPremiumEconomyDiscount(Integer premiumEconomyDiscount) {
            this.premiumEconomyDiscount = premiumEconomyDiscount;
            return this;
        }
        public Integer getPremiumEconomyDiscount() {
            return this.premiumEconomyDiscount;
        }

        public ApplyModifyRequestTravelerStandard setReserveType(Integer reserveType) {
            this.reserveType = reserveType;
            return this;
        }
        public Integer getReserveType() {
            return this.reserveType;
        }

        public ApplyModifyRequestTravelerStandard setTrainRuleCode(Long trainRuleCode) {
            this.trainRuleCode = trainRuleCode;
            return this;
        }
        public Long getTrainRuleCode() {
            return this.trainRuleCode;
        }

        public ApplyModifyRequestTravelerStandard setTrainSeats(String trainSeats) {
            this.trainSeats = trainSeats;
            return this;
        }
        public String getTrainSeats() {
            return this.trainSeats;
        }

        public ApplyModifyRequestTravelerStandard setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
