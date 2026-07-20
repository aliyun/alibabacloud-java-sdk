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

    /**
     * <strong>example:</strong>
     * <p>阿里巴巴</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>采购部</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("intl_flight_budget")
    public Long intlFlightBudget;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("meal_budget")
    public Long mealBudget;

    /**
     * <strong>example:</strong>
     * <p>141125</p>
     */
    @NameInMap("payment_department_id")
    public String paymentDepartmentId;

    /**
     * <strong>example:</strong>
     * <p>产品部</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>三方部门id</p>
     */
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
     * 
     * <strong>example:</strong>
     * <p>访问客户</p>
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
     * 
     * <strong>example:</strong>
     * <p>访问客户</p>
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

    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("scenario_template_id")
        public String scenarioTemplateId;

        /**
         * <strong>example:</strong>
         * <p>测试场景模板</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>500100</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>510100</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <strong>example:</strong>
         * <p>城市名称</p>
         */
        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("business_discount")
        public Integer businessDiscount;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("economy_discount")
        public Integer economyDiscount;

        /**
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("first_discount")
        public Integer firstDiscount;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("flight_cabins")
        public String flightCabins;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("flight_intl_rule_code")
        public Long flightIntlRuleCode;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("flight_rule_code")
        public Long flightRuleCode;

        @NameInMap("hotel_citys")
        public java.util.List<ApplyModifyRequestDefaultStandardHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyModifyRequestDefaultStandardHotelIntlCitys> hotelIntlCitys;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("hotel_intl_rule_code")
        public Long hotelIntlRuleCode;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
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
         * <p>2</p>
         */
        @NameInMap("premium_economy_discount")
        public Integer premiumEconomyDiscount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("reserve_type")
        public Integer reserveType;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("train_rule_code")
        public Long trainRuleCode;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
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

        public ApplyModifyRequestDefaultStandard setInternationalFlightCabins(String internationalFlightCabins) {
            this.internationalFlightCabins = internationalFlightCabins;
            return this;
        }
        public String getInternationalFlightCabins() {
            return this.internationalFlightCabins;
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
        /**
         * <strong>example:</strong>
         * <p>“{&quot;name&quot;:&quot;张三&quot;}”</p>
         */
        @NameInMap("attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>144224</p>
         */
        @NameInMap("cost_center_id")
        public Long costCenterId;

        /**
         * <strong>example:</strong>
         * <p>371164</p>
         */
        @NameInMap("external_user_id")
        public String externalUserId;

        /**
         * <strong>example:</strong>
         * <p>11411</p>
         */
        @NameInMap("invoice_id")
        public Long invoiceId;

        /**
         * <strong>example:</strong>
         * <p>11422</p>
         */
        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        /**
         * <strong>example:</strong>
         * <p>“一级事业部”</p>
         */
        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        /**
         * <strong>example:</strong>
         * <p>acs</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        /**
         * <strong>example:</strong>
         * <p>“成本项目”</p>
         */
        @NameInMap("project_title")
        public String projectTitle;

        /**
         * <strong>example:</strong>
         * <p>91140100688069283J</p>
         */
        @NameInMap("third_part_invoice_id")
        public String thirdPartInvoiceId;

        /**
         * <strong>example:</strong>
         * <p>HD4451224</p>
         */
        @NameInMap("thirdpart_cost_center_id")
        public String thirdpartCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>6281</p>
         */
        @NameInMap("thirdpart_depart_id")
        public String thirdpartDepartId;

        /**
         * <strong>example:</strong>
         * <p>王武</p>
         */
        @NameInMap("user_name")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>wu/wang</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>北京</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>330100</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>1009</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("flight_intl_rule_code")
        public Long flightIntlRuleCode;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("flight_rule_code")
        public Long flightRuleCode;

        @NameInMap("hotel_citys")
        public java.util.List<ApplyModifyRequestExternalTravelerStandardHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyModifyRequestExternalTravelerStandardHotelIntlCitys> hotelIntlCitys;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("hotel_intl_rule_code")
        public Long hotelIntlRuleCode;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("hotel_rule_code")
        public Long hotelRuleCode;

        /**
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("international_flight_cabins")
        public String internationalFlightCabins;

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

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
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

        public ApplyModifyRequestExternalTravelerStandard setInternationalFlightCabins(String internationalFlightCabins) {
            this.internationalFlightCabins = internationalFlightCabins;
            return this;
        }
        public String getInternationalFlightCabins() {
            return this.internationalFlightCabins;
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
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>杭州</p>
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

        /**
         * <strong>example:</strong>
         * <p>“{&quot;name&quot;:&quot;张三&quot;}”</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>北京</p>
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

        /**
         * <strong>example:</strong>
         * <p>项目1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>“{&quot;name&quot;:&quot;张三&quot;}”</p>
         */
        @NameInMap("attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>BJS,SHA</p>
         */
        @NameInMap("city_code_set")
        public String cityCodeSet;

        /**
         * <strong>example:</strong>
         * <p>北京，上海</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>项目1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>“{&quot;name&quot;:&quot;张三&quot;}”</p>
         */
        @NameInMap("attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>12211</p>
         */
        @NameInMap("cost_center_id")
        public Long costCenterId;

        /**
         * <strong>example:</strong>
         * <p>11412</p>
         */
        @NameInMap("invoice_id")
        public Long invoiceId;

        /**
         * <strong>example:</strong>
         * <p>11633</p>
         */
        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        /**
         * <strong>example:</strong>
         * <p>“一级事业部”</p>
         */
        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        /**
         * <strong>example:</strong>
         * <p>acs</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        /**
         * <strong>example:</strong>
         * <p>“成本项目”</p>
         */
        @NameInMap("project_title")
        public String projectTitle;

        /**
         * <strong>example:</strong>
         * <p>517492</p>
         */
        @NameInMap("third_part_invoice_id")
        public String thirdPartInvoiceId;

        /**
         * <strong>example:</strong>
         * <p>HD424333</p>
         */
        @NameInMap("thirdpart_cost_center_id")
        public String thirdpartCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>1001A11000000000O7YC</p>
         */
        @NameInMap("thirdpart_depart_id")
        public String thirdpartDepartId;

        /**
         * <strong>example:</strong>
         * <p>GS641312</p>
         */
        @NameInMap("user_id")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>李四</p>
         */
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
         * 
         * <strong>example:</strong>
         * <p>110100，330100</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>北京，杭州</p>
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

    public static class ApplyModifyRequestTravelerStandardCarStandardBookAllowInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("book_allow")
        public Boolean bookAllow;

        public static ApplyModifyRequestTravelerStandardCarStandardBookAllowInfo build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardBookAllowInfo self = new ApplyModifyRequestTravelerStandardCarStandardBookAllowInfo();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardBookAllowInfo setBookAllow(Boolean bookAllow) {
            this.bookAllow = bookAllow;
            return this;
        }
        public Boolean getBookAllow() {
            return this.bookAllow;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardCarHelper extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("car_helper_type")
        public String carHelperType;

        public static ApplyModifyRequestTravelerStandardCarStandardCarHelper build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardCarHelper self = new ApplyModifyRequestTravelerStandardCarStandardCarHelper();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardCarHelper setCarHelperType(String carHelperType) {
            this.carHelperType = carHelperType;
            return this;
        }
        public String getCarHelperType() {
            return this.carHelperType;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardCarTimeControlTimeLimit extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("end_time")
        public String endTime;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("start_time")
        public String startTime;

        public static ApplyModifyRequestTravelerStandardCarStandardCarTimeControlTimeLimit build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardCarTimeControlTimeLimit self = new ApplyModifyRequestTravelerStandardCarStandardCarTimeControlTimeLimit();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardCarTimeControlTimeLimit setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCarTimeControlTimeLimit setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardCarTimeControl extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("time_limit")
        public java.util.List<ApplyModifyRequestTravelerStandardCarStandardCarTimeControlTimeLimit> timeLimit;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("time_switch")
        public Boolean timeSwitch;

        public static ApplyModifyRequestTravelerStandardCarStandardCarTimeControl build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardCarTimeControl self = new ApplyModifyRequestTravelerStandardCarStandardCarTimeControl();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardCarTimeControl setTimeLimit(java.util.List<ApplyModifyRequestTravelerStandardCarStandardCarTimeControlTimeLimit> timeLimit) {
            this.timeLimit = timeLimit;
            return this;
        }
        public java.util.List<ApplyModifyRequestTravelerStandardCarStandardCarTimeControlTimeLimit> getTimeLimit() {
            return this.timeLimit;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCarTimeControl setTimeSwitch(Boolean timeSwitch) {
            this.timeSwitch = timeSwitch;
            return this;
        }
        public Boolean getTimeSwitch() {
            return this.timeSwitch;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardCityControlInfoCityInfos extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("adcode")
        public String adcode;

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

        public static ApplyModifyRequestTravelerStandardCarStandardCityControlInfoCityInfos build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardCityControlInfoCityInfos self = new ApplyModifyRequestTravelerStandardCarStandardCityControlInfoCityInfos();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardCityControlInfoCityInfos setAdcode(String adcode) {
            this.adcode = adcode;
            return this;
        }
        public String getAdcode() {
            return this.adcode;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCityControlInfoCityInfos setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCityControlInfoCityInfos setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardCityControlInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("city_control_type")
        public Integer cityControlType;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("city_infos")
        public java.util.List<ApplyModifyRequestTravelerStandardCarStandardCityControlInfoCityInfos> cityInfos;

        public static ApplyModifyRequestTravelerStandardCarStandardCityControlInfo build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardCityControlInfo self = new ApplyModifyRequestTravelerStandardCarStandardCityControlInfo();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardCityControlInfo setCityControlType(Integer cityControlType) {
            this.cityControlType = cityControlType;
            return this;
        }
        public Integer getCityControlType() {
            return this.cityControlType;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCityControlInfo setCityInfos(java.util.List<ApplyModifyRequestTravelerStandardCarStandardCityControlInfoCityInfos> cityInfos) {
            this.cityInfos = cityInfos;
            return this;
        }
        public java.util.List<ApplyModifyRequestTravelerStandardCarStandardCityControlInfoCityInfos> getCityInfos() {
            return this.cityInfos;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("from_adcode")
        public String fromAdcode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("from_city_code")
        public String fromCityCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("from_city_name")
        public String fromCityName;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("to_adcode")
        public String toAdcode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("to_city_code")
        public String toCityCode;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("to_city_name")
        public String toCityName;

        public static ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList self = new ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList setFromAdcode(String fromAdcode) {
            this.fromAdcode = fromAdcode;
            return this;
        }
        public String getFromAdcode() {
            return this.fromAdcode;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList setFromCityCode(String fromCityCode) {
            this.fromCityCode = fromCityCode;
            return this;
        }
        public String getFromCityCode() {
            return this.fromCityCode;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList setFromCityName(String fromCityName) {
            this.fromCityName = fromCityName;
            return this;
        }
        public String getFromCityName() {
            return this.fromCityName;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList setToAdcode(String toAdcode) {
            this.toAdcode = toAdcode;
            return this;
        }
        public String getToAdcode() {
            return this.toAdcode;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList setToCityCode(String toCityCode) {
            this.toCityCode = toCityCode;
            return this;
        }
        public String getToCityCode() {
            return this.toCityCode;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList setToCityName(String toCityName) {
            this.toCityName = toCityName;
            return this;
        }
        public String getToCityName() {
            return this.toCityName;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardCrossCityInfo extends TeaModel {
        @NameInMap("cross_city_list")
        public java.util.List<ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList> crossCityList;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("cross_city_type")
        public Integer crossCityType;

        public static ApplyModifyRequestTravelerStandardCarStandardCrossCityInfo build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardCrossCityInfo self = new ApplyModifyRequestTravelerStandardCarStandardCrossCityInfo();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardCrossCityInfo setCrossCityList(java.util.List<ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList> crossCityList) {
            this.crossCityList = crossCityList;
            return this;
        }
        public java.util.List<ApplyModifyRequestTravelerStandardCarStandardCrossCityInfoCrossCityList> getCrossCityList() {
            return this.crossCityList;
        }

        public ApplyModifyRequestTravelerStandardCarStandardCrossCityInfo setCrossCityType(Integer crossCityType) {
            this.crossCityType = crossCityType;
            return this;
        }
        public Integer getCrossCityType() {
            return this.crossCityType;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("latitude")
        public String latitude;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("longitude")
        public String longitude;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("radius")
        public Integer radius;

        public static ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom self = new ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom setRadius(Integer radius) {
            this.radius = radius;
            return this;
        }
        public Integer getRadius() {
            return this.radius;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("latitude")
        public String latitude;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("longitude")
        public String longitude;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("radius")
        public Integer radius;

        public static ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo self = new ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo setRadius(Integer radius) {
            this.radius = radius;
            return this;
        }
        public Integer getRadius() {
            return this.radius;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("electronic_fence_locations_from")
        public java.util.List<ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom> electronicFenceLocationsFrom;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("electronic_fence_locations_to")
        public java.util.List<ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo> electronicFenceLocationsTo;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("electronic_fence_type")
        public Integer electronicFenceType;

        public static ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfo build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfo self = new ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfo();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfo setElectronicFenceLocationsFrom(java.util.List<ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom> electronicFenceLocationsFrom) {
            this.electronicFenceLocationsFrom = electronicFenceLocationsFrom;
            return this;
        }
        public java.util.List<ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsFrom> getElectronicFenceLocationsFrom() {
            return this.electronicFenceLocationsFrom;
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfo setElectronicFenceLocationsTo(java.util.List<ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo> electronicFenceLocationsTo) {
            this.electronicFenceLocationsTo = electronicFenceLocationsTo;
            return this;
        }
        public java.util.List<ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfoElectronicFenceLocationsTo> getElectronicFenceLocationsTo() {
            return this.electronicFenceLocationsTo;
        }

        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfo setElectronicFenceType(Integer electronicFenceType) {
            this.electronicFenceType = electronicFenceType;
            return this;
        }
        public Integer getElectronicFenceType() {
            return this.electronicFenceType;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandardModifyDestinationInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("modify_destination")
        public Boolean modifyDestination;

        public static ApplyModifyRequestTravelerStandardCarStandardModifyDestinationInfo build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandardModifyDestinationInfo self = new ApplyModifyRequestTravelerStandardCarStandardModifyDestinationInfo();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandardModifyDestinationInfo setModifyDestination(Boolean modifyDestination) {
            this.modifyDestination = modifyDestination;
            return this;
        }
        public Boolean getModifyDestination() {
            return this.modifyDestination;
        }

    }

    public static class ApplyModifyRequestTravelerStandardCarStandard extends TeaModel {
        @NameInMap("book_allow_info")
        public ApplyModifyRequestTravelerStandardCarStandardBookAllowInfo bookAllowInfo;

        @NameInMap("car_helper")
        public ApplyModifyRequestTravelerStandardCarStandardCarHelper carHelper;

        @NameInMap("car_time_control")
        public ApplyModifyRequestTravelerStandardCarStandardCarTimeControl carTimeControl;

        @NameInMap("city_control_info")
        public ApplyModifyRequestTravelerStandardCarStandardCityControlInfo cityControlInfo;

        @NameInMap("cross_city_info")
        public ApplyModifyRequestTravelerStandardCarStandardCrossCityInfo crossCityInfo;

        @NameInMap("electronic_fence_info")
        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfo electronicFenceInfo;

        @NameInMap("level_codes")
        public String levelCodes;

        @NameInMap("modify_destination_info")
        public ApplyModifyRequestTravelerStandardCarStandardModifyDestinationInfo modifyDestinationInfo;

        @NameInMap("times_total")
        public Integer timesTotal;

        @NameInMap("times_type")
        public Integer timesType;

        public static ApplyModifyRequestTravelerStandardCarStandard build(java.util.Map<String, ?> map) throws Exception {
            ApplyModifyRequestTravelerStandardCarStandard self = new ApplyModifyRequestTravelerStandardCarStandard();
            return TeaModel.build(map, self);
        }

        public ApplyModifyRequestTravelerStandardCarStandard setBookAllowInfo(ApplyModifyRequestTravelerStandardCarStandardBookAllowInfo bookAllowInfo) {
            this.bookAllowInfo = bookAllowInfo;
            return this;
        }
        public ApplyModifyRequestTravelerStandardCarStandardBookAllowInfo getBookAllowInfo() {
            return this.bookAllowInfo;
        }

        public ApplyModifyRequestTravelerStandardCarStandard setCarHelper(ApplyModifyRequestTravelerStandardCarStandardCarHelper carHelper) {
            this.carHelper = carHelper;
            return this;
        }
        public ApplyModifyRequestTravelerStandardCarStandardCarHelper getCarHelper() {
            return this.carHelper;
        }

        public ApplyModifyRequestTravelerStandardCarStandard setCarTimeControl(ApplyModifyRequestTravelerStandardCarStandardCarTimeControl carTimeControl) {
            this.carTimeControl = carTimeControl;
            return this;
        }
        public ApplyModifyRequestTravelerStandardCarStandardCarTimeControl getCarTimeControl() {
            return this.carTimeControl;
        }

        public ApplyModifyRequestTravelerStandardCarStandard setCityControlInfo(ApplyModifyRequestTravelerStandardCarStandardCityControlInfo cityControlInfo) {
            this.cityControlInfo = cityControlInfo;
            return this;
        }
        public ApplyModifyRequestTravelerStandardCarStandardCityControlInfo getCityControlInfo() {
            return this.cityControlInfo;
        }

        public ApplyModifyRequestTravelerStandardCarStandard setCrossCityInfo(ApplyModifyRequestTravelerStandardCarStandardCrossCityInfo crossCityInfo) {
            this.crossCityInfo = crossCityInfo;
            return this;
        }
        public ApplyModifyRequestTravelerStandardCarStandardCrossCityInfo getCrossCityInfo() {
            return this.crossCityInfo;
        }

        public ApplyModifyRequestTravelerStandardCarStandard setElectronicFenceInfo(ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfo electronicFenceInfo) {
            this.electronicFenceInfo = electronicFenceInfo;
            return this;
        }
        public ApplyModifyRequestTravelerStandardCarStandardElectronicFenceInfo getElectronicFenceInfo() {
            return this.electronicFenceInfo;
        }

        public ApplyModifyRequestTravelerStandardCarStandard setLevelCodes(String levelCodes) {
            this.levelCodes = levelCodes;
            return this;
        }
        public String getLevelCodes() {
            return this.levelCodes;
        }

        public ApplyModifyRequestTravelerStandardCarStandard setModifyDestinationInfo(ApplyModifyRequestTravelerStandardCarStandardModifyDestinationInfo modifyDestinationInfo) {
            this.modifyDestinationInfo = modifyDestinationInfo;
            return this;
        }
        public ApplyModifyRequestTravelerStandardCarStandardModifyDestinationInfo getModifyDestinationInfo() {
            return this.modifyDestinationInfo;
        }

        public ApplyModifyRequestTravelerStandardCarStandard setTimesTotal(Integer timesTotal) {
            this.timesTotal = timesTotal;
            return this;
        }
        public Integer getTimesTotal() {
            return this.timesTotal;
        }

        public ApplyModifyRequestTravelerStandardCarStandard setTimesType(Integer timesType) {
            this.timesType = timesType;
            return this;
        }
        public Integer getTimesType() {
            return this.timesType;
        }

    }

    public static class ApplyModifyRequestTravelerStandardHotelCitys extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <strong>example:</strong>
         * <p>北京</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>110100</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>1009</p>
         */
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

        @NameInMap("car_standard")
        public ApplyModifyRequestTravelerStandardCarStandard carStandard;

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

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("flight_intl_rule_code")
        public Long flightIntlRuleCode;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("flight_rule_code")
        public Long flightRuleCode;

        @NameInMap("hotel_citys")
        public java.util.List<ApplyModifyRequestTravelerStandardHotelCitys> hotelCitys;

        @NameInMap("hotel_intl_citys")
        public java.util.List<ApplyModifyRequestTravelerStandardHotelIntlCitys> hotelIntlCitys;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("hotel_intl_rule_code")
        public Long hotelIntlRuleCode;

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
        @NameInMap("hotel_rule_code")
        public Long hotelRuleCode;

        /**
         * <strong>example:</strong>
         * <p>F</p>
         */
        @NameInMap("international_flight_cabins")
        public String internationalFlightCabins;

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

        /**
         * <strong>example:</strong>
         * <p>10032</p>
         */
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

        public ApplyModifyRequestTravelerStandard setCarStandard(ApplyModifyRequestTravelerStandardCarStandard carStandard) {
            this.carStandard = carStandard;
            return this;
        }
        public ApplyModifyRequestTravelerStandardCarStandard getCarStandard() {
            return this.carStandard;
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

        public ApplyModifyRequestTravelerStandard setInternationalFlightCabins(String internationalFlightCabins) {
            this.internationalFlightCabins = internationalFlightCabins;
            return this;
        }
        public String getInternationalFlightCabins() {
            return this.internationalFlightCabins;
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
