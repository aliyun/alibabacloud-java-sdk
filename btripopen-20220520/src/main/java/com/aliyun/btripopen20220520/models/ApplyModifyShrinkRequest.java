// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyModifyShrinkRequest extends TeaModel {
    @NameInMap("budget")
    public Long budget;

    @NameInMap("budget_merge")
    public Integer budgetMerge;

    @NameInMap("car_rule")
    public String carRuleShrink;

    @NameInMap("corp_name")
    public String corpName;

    @NameInMap("depart_id")
    public String departId;

    @NameInMap("depart_name")
    public String departName;

    /**
     * <p>可将补充描述传入此字段，账单中将会体现此字段的值。可以用于企业的统计和对账</p>
     */
    @NameInMap("extend_field")
    public String extendField;

    @NameInMap("external_traveler_list")
    public String externalTravelerListShrink;

    @NameInMap("external_traveler_standard")
    public String externalTravelerStandardShrink;

    @NameInMap("flight_budget")
    public Long flightBudget;

    @NameInMap("hotel_budget")
    public Long hotelBudget;

    @NameInMap("hotel_share")
    public String hotelShareShrink;

    @NameInMap("itinerary_list")
    public String itineraryListShrink;

    @NameInMap("itinerary_rule")
    public Integer itineraryRule;

    @NameInMap("itinerary_set_list")
    public String itinerarySetListShrink;

    @NameInMap("limit_traveler")
    public Integer limitTraveler;

    @NameInMap("status")
    public Integer status;

    /**
     * <p>子企业Id</p>
     */
    @NameInMap("sub_corp_id")
    public String subCorpId;

    @NameInMap("thirdpart_apply_id")
    public String thirdpartApplyId;

    @NameInMap("thirdpart_business_id")
    public String thirdpartBusinessId;

    @NameInMap("thirdpart_depart_id")
    public String thirdpartDepartId;

    @NameInMap("together_book_rule")
    public Integer togetherBookRule;

    @NameInMap("train_budget")
    public Long trainBudget;

    @NameInMap("traveler_list")
    public String travelerListShrink;

    @NameInMap("traveler_standard")
    public String travelerStandardShrink;

    @NameInMap("trip_cause")
    public String tripCause;

    @NameInMap("trip_day")
    public Integer tripDay;

    @NameInMap("trip_title")
    public String tripTitle;

    @NameInMap("union_no")
    public String unionNo;

    @NameInMap("user_id")
    public String userId;

    @NameInMap("user_name")
    public String userName;

    @NameInMap("vehicle_budget")
    public Long vehicleBudget;

    public static ApplyModifyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyModifyShrinkRequest self = new ApplyModifyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyModifyShrinkRequest setBudget(Long budget) {
        this.budget = budget;
        return this;
    }
    public Long getBudget() {
        return this.budget;
    }

    public ApplyModifyShrinkRequest setBudgetMerge(Integer budgetMerge) {
        this.budgetMerge = budgetMerge;
        return this;
    }
    public Integer getBudgetMerge() {
        return this.budgetMerge;
    }

    public ApplyModifyShrinkRequest setCarRuleShrink(String carRuleShrink) {
        this.carRuleShrink = carRuleShrink;
        return this;
    }
    public String getCarRuleShrink() {
        return this.carRuleShrink;
    }

    public ApplyModifyShrinkRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public ApplyModifyShrinkRequest setDepartId(String departId) {
        this.departId = departId;
        return this;
    }
    public String getDepartId() {
        return this.departId;
    }

    public ApplyModifyShrinkRequest setDepartName(String departName) {
        this.departName = departName;
        return this;
    }
    public String getDepartName() {
        return this.departName;
    }

    public ApplyModifyShrinkRequest setExtendField(String extendField) {
        this.extendField = extendField;
        return this;
    }
    public String getExtendField() {
        return this.extendField;
    }

    public ApplyModifyShrinkRequest setExternalTravelerListShrink(String externalTravelerListShrink) {
        this.externalTravelerListShrink = externalTravelerListShrink;
        return this;
    }
    public String getExternalTravelerListShrink() {
        return this.externalTravelerListShrink;
    }

    public ApplyModifyShrinkRequest setExternalTravelerStandardShrink(String externalTravelerStandardShrink) {
        this.externalTravelerStandardShrink = externalTravelerStandardShrink;
        return this;
    }
    public String getExternalTravelerStandardShrink() {
        return this.externalTravelerStandardShrink;
    }

    public ApplyModifyShrinkRequest setFlightBudget(Long flightBudget) {
        this.flightBudget = flightBudget;
        return this;
    }
    public Long getFlightBudget() {
        return this.flightBudget;
    }

    public ApplyModifyShrinkRequest setHotelBudget(Long hotelBudget) {
        this.hotelBudget = hotelBudget;
        return this;
    }
    public Long getHotelBudget() {
        return this.hotelBudget;
    }

    public ApplyModifyShrinkRequest setHotelShareShrink(String hotelShareShrink) {
        this.hotelShareShrink = hotelShareShrink;
        return this;
    }
    public String getHotelShareShrink() {
        return this.hotelShareShrink;
    }

    public ApplyModifyShrinkRequest setItineraryListShrink(String itineraryListShrink) {
        this.itineraryListShrink = itineraryListShrink;
        return this;
    }
    public String getItineraryListShrink() {
        return this.itineraryListShrink;
    }

    public ApplyModifyShrinkRequest setItineraryRule(Integer itineraryRule) {
        this.itineraryRule = itineraryRule;
        return this;
    }
    public Integer getItineraryRule() {
        return this.itineraryRule;
    }

    public ApplyModifyShrinkRequest setItinerarySetListShrink(String itinerarySetListShrink) {
        this.itinerarySetListShrink = itinerarySetListShrink;
        return this;
    }
    public String getItinerarySetListShrink() {
        return this.itinerarySetListShrink;
    }

    public ApplyModifyShrinkRequest setLimitTraveler(Integer limitTraveler) {
        this.limitTraveler = limitTraveler;
        return this;
    }
    public Integer getLimitTraveler() {
        return this.limitTraveler;
    }

    public ApplyModifyShrinkRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ApplyModifyShrinkRequest setSubCorpId(String subCorpId) {
        this.subCorpId = subCorpId;
        return this;
    }
    public String getSubCorpId() {
        return this.subCorpId;
    }

    public ApplyModifyShrinkRequest setThirdpartApplyId(String thirdpartApplyId) {
        this.thirdpartApplyId = thirdpartApplyId;
        return this;
    }
    public String getThirdpartApplyId() {
        return this.thirdpartApplyId;
    }

    public ApplyModifyShrinkRequest setThirdpartBusinessId(String thirdpartBusinessId) {
        this.thirdpartBusinessId = thirdpartBusinessId;
        return this;
    }
    public String getThirdpartBusinessId() {
        return this.thirdpartBusinessId;
    }

    public ApplyModifyShrinkRequest setThirdpartDepartId(String thirdpartDepartId) {
        this.thirdpartDepartId = thirdpartDepartId;
        return this;
    }
    public String getThirdpartDepartId() {
        return this.thirdpartDepartId;
    }

    public ApplyModifyShrinkRequest setTogetherBookRule(Integer togetherBookRule) {
        this.togetherBookRule = togetherBookRule;
        return this;
    }
    public Integer getTogetherBookRule() {
        return this.togetherBookRule;
    }

    public ApplyModifyShrinkRequest setTrainBudget(Long trainBudget) {
        this.trainBudget = trainBudget;
        return this;
    }
    public Long getTrainBudget() {
        return this.trainBudget;
    }

    public ApplyModifyShrinkRequest setTravelerListShrink(String travelerListShrink) {
        this.travelerListShrink = travelerListShrink;
        return this;
    }
    public String getTravelerListShrink() {
        return this.travelerListShrink;
    }

    public ApplyModifyShrinkRequest setTravelerStandardShrink(String travelerStandardShrink) {
        this.travelerStandardShrink = travelerStandardShrink;
        return this;
    }
    public String getTravelerStandardShrink() {
        return this.travelerStandardShrink;
    }

    public ApplyModifyShrinkRequest setTripCause(String tripCause) {
        this.tripCause = tripCause;
        return this;
    }
    public String getTripCause() {
        return this.tripCause;
    }

    public ApplyModifyShrinkRequest setTripDay(Integer tripDay) {
        this.tripDay = tripDay;
        return this;
    }
    public Integer getTripDay() {
        return this.tripDay;
    }

    public ApplyModifyShrinkRequest setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle;
        return this;
    }
    public String getTripTitle() {
        return this.tripTitle;
    }

    public ApplyModifyShrinkRequest setUnionNo(String unionNo) {
        this.unionNo = unionNo;
        return this;
    }
    public String getUnionNo() {
        return this.unionNo;
    }

    public ApplyModifyShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ApplyModifyShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ApplyModifyShrinkRequest setVehicleBudget(Long vehicleBudget) {
        this.vehicleBudget = vehicleBudget;
        return this;
    }
    public Long getVehicleBudget() {
        return this.vehicleBudget;
    }

}
