// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyAddShrinkRequest extends TeaModel {
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
    public String carRuleShrink;

    @NameInMap("corp_name")
    public String corpName;

    @NameInMap("default_standard")
    public String defaultStandardShrink;

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
    public String externalTravelerListShrink;

    @NameInMap("external_traveler_standard")
    public String externalTravelerStandardShrink;

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
    public String hotelShareShrink;

    @NameInMap("international_flight_cabins")
    public String internationalFlightCabins;

    @NameInMap("intl_flight_budget")
    public Long intlFlightBudget;

    @NameInMap("intl_hotel_budget")
    public Long intlHotelBudget;

    @NameInMap("itinerary_list")
    public String itineraryListShrink;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("itinerary_rule")
    public Integer itineraryRule;

    @NameInMap("itinerary_set_list")
    public String itinerarySetListShrink;

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
    public String travelerListShrink;

    @NameInMap("traveler_standard")
    public String travelerStandardShrink;

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

    public static ApplyAddShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAddShrinkRequest self = new ApplyAddShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAddShrinkRequest setBudget(Long budget) {
        this.budget = budget;
        return this;
    }
    public Long getBudget() {
        return this.budget;
    }

    public ApplyAddShrinkRequest setBudgetMerge(Integer budgetMerge) {
        this.budgetMerge = budgetMerge;
        return this;
    }
    public Integer getBudgetMerge() {
        return this.budgetMerge;
    }

    public ApplyAddShrinkRequest setCarRuleShrink(String carRuleShrink) {
        this.carRuleShrink = carRuleShrink;
        return this;
    }
    public String getCarRuleShrink() {
        return this.carRuleShrink;
    }

    public ApplyAddShrinkRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public ApplyAddShrinkRequest setDefaultStandardShrink(String defaultStandardShrink) {
        this.defaultStandardShrink = defaultStandardShrink;
        return this;
    }
    public String getDefaultStandardShrink() {
        return this.defaultStandardShrink;
    }

    public ApplyAddShrinkRequest setDepartId(String departId) {
        this.departId = departId;
        return this;
    }
    public String getDepartId() {
        return this.departId;
    }

    public ApplyAddShrinkRequest setDepartName(String departName) {
        this.departName = departName;
        return this;
    }
    public String getDepartName() {
        return this.departName;
    }

    public ApplyAddShrinkRequest setExtendField(String extendField) {
        this.extendField = extendField;
        return this;
    }
    public String getExtendField() {
        return this.extendField;
    }

    public ApplyAddShrinkRequest setExternalTravelerListShrink(String externalTravelerListShrink) {
        this.externalTravelerListShrink = externalTravelerListShrink;
        return this;
    }
    public String getExternalTravelerListShrink() {
        return this.externalTravelerListShrink;
    }

    public ApplyAddShrinkRequest setExternalTravelerStandardShrink(String externalTravelerStandardShrink) {
        this.externalTravelerStandardShrink = externalTravelerStandardShrink;
        return this;
    }
    public String getExternalTravelerStandardShrink() {
        return this.externalTravelerStandardShrink;
    }

    public ApplyAddShrinkRequest setFlightBudget(Long flightBudget) {
        this.flightBudget = flightBudget;
        return this;
    }
    public Long getFlightBudget() {
        return this.flightBudget;
    }

    public ApplyAddShrinkRequest setHotelBudget(Long hotelBudget) {
        this.hotelBudget = hotelBudget;
        return this;
    }
    public Long getHotelBudget() {
        return this.hotelBudget;
    }

    public ApplyAddShrinkRequest setHotelShareShrink(String hotelShareShrink) {
        this.hotelShareShrink = hotelShareShrink;
        return this;
    }
    public String getHotelShareShrink() {
        return this.hotelShareShrink;
    }

    public ApplyAddShrinkRequest setInternationalFlightCabins(String internationalFlightCabins) {
        this.internationalFlightCabins = internationalFlightCabins;
        return this;
    }
    public String getInternationalFlightCabins() {
        return this.internationalFlightCabins;
    }

    public ApplyAddShrinkRequest setIntlFlightBudget(Long intlFlightBudget) {
        this.intlFlightBudget = intlFlightBudget;
        return this;
    }
    public Long getIntlFlightBudget() {
        return this.intlFlightBudget;
    }

    public ApplyAddShrinkRequest setIntlHotelBudget(Long intlHotelBudget) {
        this.intlHotelBudget = intlHotelBudget;
        return this;
    }
    public Long getIntlHotelBudget() {
        return this.intlHotelBudget;
    }

    public ApplyAddShrinkRequest setItineraryListShrink(String itineraryListShrink) {
        this.itineraryListShrink = itineraryListShrink;
        return this;
    }
    public String getItineraryListShrink() {
        return this.itineraryListShrink;
    }

    public ApplyAddShrinkRequest setItineraryRule(Integer itineraryRule) {
        this.itineraryRule = itineraryRule;
        return this;
    }
    public Integer getItineraryRule() {
        return this.itineraryRule;
    }

    public ApplyAddShrinkRequest setItinerarySetListShrink(String itinerarySetListShrink) {
        this.itinerarySetListShrink = itinerarySetListShrink;
        return this;
    }
    public String getItinerarySetListShrink() {
        return this.itinerarySetListShrink;
    }

    public ApplyAddShrinkRequest setLimitTraveler(Integer limitTraveler) {
        this.limitTraveler = limitTraveler;
        return this;
    }
    public Integer getLimitTraveler() {
        return this.limitTraveler;
    }

    public ApplyAddShrinkRequest setPaymentDepartmentId(String paymentDepartmentId) {
        this.paymentDepartmentId = paymentDepartmentId;
        return this;
    }
    public String getPaymentDepartmentId() {
        return this.paymentDepartmentId;
    }

    public ApplyAddShrinkRequest setPaymentDepartmentName(String paymentDepartmentName) {
        this.paymentDepartmentName = paymentDepartmentName;
        return this;
    }
    public String getPaymentDepartmentName() {
        return this.paymentDepartmentName;
    }

    public ApplyAddShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ApplyAddShrinkRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

    public ApplyAddShrinkRequest setThirdpartApplyId(String thirdpartApplyId) {
        this.thirdpartApplyId = thirdpartApplyId;
        return this;
    }
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    public ApplyAddShrinkRequest setThirdpartBusinessId(String thirdpartBusinessId) {
        this.thirdpartBusinessId = thirdpartBusinessId;
        return this;
    }
    public String getThirdpartBusinessId() {
        return this.thirdpartBusinessId;
    }

    public ApplyAddShrinkRequest setThirdpartDepartId(String thirdpartDepartId) {
        this.thirdpartDepartId = thirdpartDepartId;
        return this;
    }
    public String getThirdpartDepartId() {
        return this.thirdpartDepartId;
    }

    public ApplyAddShrinkRequest setTogetherBookRule(Integer togetherBookRule) {
        this.togetherBookRule = togetherBookRule;
        return this;
    }
    public Integer getTogetherBookRule() {
        return this.togetherBookRule;
    }

    public ApplyAddShrinkRequest setTrainBudget(Long trainBudget) {
        this.trainBudget = trainBudget;
        return this;
    }
    public Long getTrainBudget() {
        return this.trainBudget;
    }

    public ApplyAddShrinkRequest setTravelerListShrink(String travelerListShrink) {
        this.travelerListShrink = travelerListShrink;
        return this;
    }
    public String getTravelerListShrink() {
        return this.travelerListShrink;
    }

    public ApplyAddShrinkRequest setTravelerStandardShrink(String travelerStandardShrink) {
        this.travelerStandardShrink = travelerStandardShrink;
        return this;
    }
    public String getTravelerStandardShrink() {
        return this.travelerStandardShrink;
    }

    public ApplyAddShrinkRequest setTripCause(String tripCause) {
        this.tripCause = tripCause;
        return this;
    }
    public String getTripCause() {
        return this.tripCause;
    }

    public ApplyAddShrinkRequest setTripDay(Integer tripDay) {
        this.tripDay = tripDay;
        return this;
    }
    public Integer getTripDay() {
        return this.tripDay;
    }

    public ApplyAddShrinkRequest setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle;
        return this;
    }
    public String getTripTitle() {
        return this.tripTitle;
    }

    public ApplyAddShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ApplyAddShrinkRequest setUnionNo(String unionNo) {
        this.unionNo = unionNo;
        return this;
    }
    public String getUnionNo() {
        return this.unionNo;
    }

    public ApplyAddShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ApplyAddShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ApplyAddShrinkRequest setVehicleBudget(Long vehicleBudget) {
        this.vehicleBudget = vehicleBudget;
        return this;
    }
    public Long getVehicleBudget() {
        return this.vehicleBudget;
    }

}
