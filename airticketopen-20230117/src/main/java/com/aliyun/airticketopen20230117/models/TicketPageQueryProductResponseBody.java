// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketPageQueryProductResponseBody extends TeaModel {
    @NameInMap("Data")
    public TicketPageQueryProductResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ScenicIdInvalid</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>ScenicId不合法</p>
     */
    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>51593418-8C73-5E47-8BA8-3F1D4A00CC0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static TicketPageQueryProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketPageQueryProductResponseBody self = new TicketPageQueryProductResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketPageQueryProductResponseBody setData(TicketPageQueryProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketPageQueryProductResponseBodyData getData() {
        return this.data;
    }

    public TicketPageQueryProductResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketPageQueryProductResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketPageQueryProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketPageQueryProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Anchor")
        public Integer anchor;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        @NameInMap("FixedTime")
        public String fixedTime;

        /**
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("OffsetDayOfTime")
        public String offsetDayOfTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetUnit")
        public Integer offsetUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetValue")
        public Integer offsetValue;

        public static TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule self = new TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Certificate")
        public Boolean certificate;

        /**
         * <strong>example:</strong>
         * <p>[1, 2]</p>
         */
        @NameInMap("CertificateTypes")
        public java.util.List<Integer> certificateTypes;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DialingCode")
        public Boolean dialingCode;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Email")
        public Boolean email;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FirstName")
        public Boolean firstName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LastName")
        public Boolean lastName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Mobile")
        public Boolean mobile;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Name")
        public Boolean name;

        public static TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule self = new TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule setCertificate(Boolean certificate) {
            this.certificate = certificate;
            return this;
        }
        public Boolean getCertificate() {
            return this.certificate;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule setCertificateTypes(java.util.List<Integer> certificateTypes) {
            this.certificateTypes = certificateTypes;
            return this;
        }
        public java.util.List<Integer> getCertificateTypes() {
            return this.certificateTypes;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule setDialingCode(Boolean dialingCode) {
            this.dialingCode = dialingCode;
            return this;
        }
        public Boolean getDialingCode() {
            return this.dialingCode;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule setEmail(Boolean email) {
            this.email = email;
            return this;
        }
        public Boolean getEmail() {
            return this.email;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule setFirstName(Boolean firstName) {
            this.firstName = firstName;
            return this;
        }
        public Boolean getFirstName() {
            return this.firstName;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule setLastName(Boolean lastName) {
            this.lastName = lastName;
            return this;
        }
        public Boolean getLastName() {
            return this.lastName;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule setMobile(Boolean mobile) {
            this.mobile = mobile;
            return this;
        }
        public Boolean getMobile() {
            return this.mobile;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule setName(Boolean name) {
            this.name = name;
            return this;
        }
        public Boolean getName() {
            return this.name;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRule extends TeaModel {
        @NameInMap("ContactFieldRule")
        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule contactFieldRule;

        public static TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRule self = new TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRule setContactFieldRule(TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule contactFieldRule) {
            this.contactFieldRule = contactFieldRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRuleContactFieldRule getContactFieldRule() {
            return this.contactFieldRule;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LimitDayType")
        public Integer limitDayType;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("LimitDays")
        public Integer limitDays;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LimitPeriod")
        public Integer limitPeriod;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LimitQuantityType")
        public Integer limitQuantityType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LimitType")
        public Integer limitType;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxBuyQuantity")
        public Integer maxBuyQuantity;

        public static TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules self = new TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules setLimitDayType(Integer limitDayType) {
            this.limitDayType = limitDayType;
            return this;
        }
        public Integer getLimitDayType() {
            return this.limitDayType;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules setLimitDays(Integer limitDays) {
            this.limitDays = limitDays;
            return this;
        }
        public Integer getLimitDays() {
            return this.limitDays;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules setLimitPeriod(Integer limitPeriod) {
            this.limitPeriod = limitPeriod;
            return this;
        }
        public Integer getLimitPeriod() {
            return this.limitPeriod;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules setLimitQuantityType(Integer limitQuantityType) {
            this.limitQuantityType = limitQuantityType;
            return this;
        }
        public Integer getLimitQuantityType() {
            return this.limitQuantityType;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules setLimitType(Integer limitType) {
            this.limitType = limitType;
            return this;
        }
        public Integer getLimitType() {
            return this.limitType;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules setMaxBuyQuantity(Integer maxBuyQuantity) {
            this.maxBuyQuantity = maxBuyQuantity;
            return this;
        }
        public Integer getMaxBuyQuantity() {
            return this.maxBuyQuantity;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsBuyRulePerOrderBuyQuantityLimitRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxBuyQuantity")
        public Integer maxBuyQuantity;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinBuyQuantity")
        public Integer minBuyQuantity;

        public static TicketPageQueryProductResponseBodyDataProductsBuyRulePerOrderBuyQuantityLimitRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsBuyRulePerOrderBuyQuantityLimitRule self = new TicketPageQueryProductResponseBodyDataProductsBuyRulePerOrderBuyQuantityLimitRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRulePerOrderBuyQuantityLimitRule setMaxBuyQuantity(Integer maxBuyQuantity) {
            this.maxBuyQuantity = maxBuyQuantity;
            return this;
        }
        public Integer getMaxBuyQuantity() {
            return this.maxBuyQuantity;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRulePerOrderBuyQuantityLimitRule setMinBuyQuantity(Integer minBuyQuantity) {
            this.minBuyQuantity = minBuyQuantity;
            return this;
        }
        public Integer getMinBuyQuantity() {
            return this.minBuyQuantity;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AgeBaseTimeType")
        public Integer ageBaseTimeType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgeCalculateType")
        public Integer ageCalculateType;

        /**
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("AgeMax")
        public Integer ageMax;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("AgeMin")
        public Integer ageMin;

        /**
         * <strong>example:</strong>
         * <p>成人票</p>
         */
        @NameInMap("Name")
        public String name;

        public static TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules self = new TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules setAgeBaseTimeType(Integer ageBaseTimeType) {
            this.ageBaseTimeType = ageBaseTimeType;
            return this;
        }
        public Integer getAgeBaseTimeType() {
            return this.ageBaseTimeType;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules setAgeCalculateType(Integer ageCalculateType) {
            this.ageCalculateType = ageCalculateType;
            return this;
        }
        public Integer getAgeCalculateType() {
            return this.ageCalculateType;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules setAgeMax(Integer ageMax) {
            this.ageMax = ageMax;
            return this;
        }
        public Integer getAgeMax() {
            return this.ageMax;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules setAgeMin(Integer ageMin) {
            this.ageMin = ageMin;
            return this;
        }
        public Integer getAgeMin() {
            return this.ageMin;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdQuantityLimits extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>成人票</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Quantity")
        public Integer quantity;

        public static TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdQuantityLimits build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdQuantityLimits self = new TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdQuantityLimits();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdQuantityLimits setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdQuantityLimits setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Birthday")
        public Boolean birthday;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Certificate")
        public Boolean certificate;

        /**
         * <strong>example:</strong>
         * <p>[1, 2]</p>
         */
        @NameInMap("CertificateTypes")
        public java.util.List<Integer> certificateTypes;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DialingCode")
        public Boolean dialingCode;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Email")
        public Boolean email;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FirstName")
        public Boolean firstName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Gender")
        public Boolean gender;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("LastName")
        public Boolean lastName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Mobile")
        public Boolean mobile;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Name")
        public Boolean name;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Nationality")
        public Boolean nationality;

        public static TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule self = new TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setBirthday(Boolean birthday) {
            this.birthday = birthday;
            return this;
        }
        public Boolean getBirthday() {
            return this.birthday;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setCertificate(Boolean certificate) {
            this.certificate = certificate;
            return this;
        }
        public Boolean getCertificate() {
            return this.certificate;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setCertificateTypes(java.util.List<Integer> certificateTypes) {
            this.certificateTypes = certificateTypes;
            return this;
        }
        public java.util.List<Integer> getCertificateTypes() {
            return this.certificateTypes;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setDialingCode(Boolean dialingCode) {
            this.dialingCode = dialingCode;
            return this;
        }
        public Boolean getDialingCode() {
            return this.dialingCode;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setEmail(Boolean email) {
            this.email = email;
            return this;
        }
        public Boolean getEmail() {
            return this.email;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setFirstName(Boolean firstName) {
            this.firstName = firstName;
            return this;
        }
        public Boolean getFirstName() {
            return this.firstName;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setGender(Boolean gender) {
            this.gender = gender;
            return this;
        }
        public Boolean getGender() {
            return this.gender;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setLastName(Boolean lastName) {
            this.lastName = lastName;
            return this;
        }
        public Boolean getLastName() {
            return this.lastName;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setMobile(Boolean mobile) {
            this.mobile = mobile;
            return this;
        }
        public Boolean getMobile() {
            return this.mobile;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setName(Boolean name) {
            this.name = name;
            return this;
        }
        public Boolean getName() {
            return this.name;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule setNationality(Boolean nationality) {
            this.nationality = nationality;
            return this;
        }
        public Boolean getNationality() {
            return this.nationality;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule extends TeaModel {
        @NameInMap("CrowdLimitRules")
        public java.util.List<TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules> crowdLimitRules;

        @NameInMap("CrowdQuantityLimits")
        public java.util.List<TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdQuantityLimits> crowdQuantityLimits;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedFillTraveler")
        public Boolean needFillTraveler;

        @NameInMap("TravelerFieldRule")
        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule travelerFieldRule;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TravelerFillDimension")
        public Integer travelerFillDimension;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TravelerQuantity")
        public Integer travelerQuantity;

        public static TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule self = new TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule setCrowdLimitRules(java.util.List<TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules> crowdLimitRules) {
            this.crowdLimitRules = crowdLimitRules;
            return this;
        }
        public java.util.List<TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdLimitRules> getCrowdLimitRules() {
            return this.crowdLimitRules;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule setCrowdQuantityLimits(java.util.List<TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdQuantityLimits> crowdQuantityLimits) {
            this.crowdQuantityLimits = crowdQuantityLimits;
            return this;
        }
        public java.util.List<TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleCrowdQuantityLimits> getCrowdQuantityLimits() {
            return this.crowdQuantityLimits;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule setNeedFillTraveler(Boolean needFillTraveler) {
            this.needFillTraveler = needFillTraveler;
            return this;
        }
        public Boolean getNeedFillTraveler() {
            return this.needFillTraveler;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule setTravelerFieldRule(TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule travelerFieldRule) {
            this.travelerFieldRule = travelerFieldRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRuleTravelerFieldRule getTravelerFieldRule() {
            return this.travelerFieldRule;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule setTravelerFillDimension(Integer travelerFillDimension) {
            this.travelerFillDimension = travelerFillDimension;
            return this;
        }
        public Integer getTravelerFillDimension() {
            return this.travelerFillDimension;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule setTravelerQuantity(Integer travelerQuantity) {
            this.travelerQuantity = travelerQuantity;
            return this;
        }
        public Integer getTravelerQuantity() {
            return this.travelerQuantity;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsBuyRule extends TeaModel {
        @NameInMap("AheadBuyTimePointRule")
        public TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule aheadBuyTimePointRule;

        @NameInMap("ContactRule")
        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRule contactRule;

        @NameInMap("CrossOrderBuyQuantityLimitRules")
        public java.util.List<TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules> crossOrderBuyQuantityLimitRules;

        @NameInMap("PerOrderBuyQuantityLimitRule")
        public TicketPageQueryProductResponseBodyDataProductsBuyRulePerOrderBuyQuantityLimitRule perOrderBuyQuantityLimitRule;

        @NameInMap("TravelerRule")
        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule travelerRule;

        public static TicketPageQueryProductResponseBodyDataProductsBuyRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsBuyRule self = new TicketPageQueryProductResponseBodyDataProductsBuyRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRule setAheadBuyTimePointRule(TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule aheadBuyTimePointRule) {
            this.aheadBuyTimePointRule = aheadBuyTimePointRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsBuyRuleAheadBuyTimePointRule getAheadBuyTimePointRule() {
            return this.aheadBuyTimePointRule;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRule setContactRule(TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRule contactRule) {
            this.contactRule = contactRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsBuyRuleContactRule getContactRule() {
            return this.contactRule;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRule setCrossOrderBuyQuantityLimitRules(java.util.List<TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules> crossOrderBuyQuantityLimitRules) {
            this.crossOrderBuyQuantityLimitRules = crossOrderBuyQuantityLimitRules;
            return this;
        }
        public java.util.List<TicketPageQueryProductResponseBodyDataProductsBuyRuleCrossOrderBuyQuantityLimitRules> getCrossOrderBuyQuantityLimitRules() {
            return this.crossOrderBuyQuantityLimitRules;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRule setPerOrderBuyQuantityLimitRule(TicketPageQueryProductResponseBodyDataProductsBuyRulePerOrderBuyQuantityLimitRule perOrderBuyQuantityLimitRule) {
            this.perOrderBuyQuantityLimitRule = perOrderBuyQuantityLimitRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsBuyRulePerOrderBuyQuantityLimitRule getPerOrderBuyQuantityLimitRule() {
            return this.perOrderBuyQuantityLimitRule;
        }

        public TicketPageQueryProductResponseBodyDataProductsBuyRule setTravelerRule(TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule travelerRule) {
            this.travelerRule = travelerRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsBuyRuleTravelerRule getTravelerRule() {
            return this.travelerRule;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Anchor")
        public Integer anchor;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        @NameInMap("FixedTime")
        public String fixedTime;

        /**
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("OffsetDayOfTime")
        public String offsetDayOfTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetUnit")
        public Integer offsetUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetValue")
        public Integer offsetValue;

        public static TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom self = new TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Anchor")
        public Integer anchor;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        @NameInMap("FixedTime")
        public String fixedTime;

        /**
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("OffsetDayOfTime")
        public String offsetDayOfTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetUnit")
        public Integer offsetUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetValue")
        public Integer offsetValue;

        public static TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo self = new TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.2056</p>
         */
        @NameInMap("Fee")
        public Double fee;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FeeBase")
        public Integer feeBase;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FeeType")
        public Integer feeType;

        @NameInMap("From")
        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom from;

        @NameInMap("To")
        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo to;

        public static TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules self = new TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules setFee(Double fee) {
            this.fee = fee;
            return this;
        }
        public Double getFee() {
            return this.fee;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules setFeeBase(Integer feeBase) {
            this.feeBase = feeBase;
            return this;
        }
        public Integer getFeeBase() {
            return this.feeBase;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules setFeeType(Integer feeType) {
            this.feeType = feeType;
            return this;
        }
        public Integer getFeeType() {
            return this.feeType;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules setFrom(TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom from) {
            this.from = from;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesFrom getFrom() {
            return this.from;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules setTo(TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo to) {
            this.to = to;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRulesTo getTo() {
            return this.to;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsRefundRule extends TeaModel {
        @NameInMap("RefundStageRules")
        public java.util.List<TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules> refundStageRules;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RefundType")
        public Integer refundType;

        public static TicketPageQueryProductResponseBodyDataProductsRefundRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsRefundRule self = new TicketPageQueryProductResponseBodyDataProductsRefundRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRule setRefundStageRules(java.util.List<TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules> refundStageRules) {
            this.refundStageRules = refundStageRules;
            return this;
        }
        public java.util.List<TicketPageQueryProductResponseBodyDataProductsRefundRuleRefundStageRules> getRefundStageRules() {
            return this.refundStageRules;
        }

        public TicketPageQueryProductResponseBodyDataProductsRefundRule setRefundType(Integer refundType) {
            this.refundType = refundType;
            return this;
        }
        public Integer getRefundType() {
            return this.refundType;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsRegion extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>普通区</p>
         */
        @NameInMap("Name")
        public String name;

        public static TicketPageQueryProductResponseBodyDataProductsRegion build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsRegion self = new TicketPageQueryProductResponseBodyDataProductsRegion();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsRegion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsSession extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("SessionEndTime")
        public String sessionEndTime;

        /**
         * <strong>example:</strong>
         * <p>08:00-12:00</p>
         */
        @NameInMap("SessionName")
        public String sessionName;

        /**
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("SessionStartTime")
        public String sessionStartTime;

        public static TicketPageQueryProductResponseBodyDataProductsSession build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsSession self = new TicketPageQueryProductResponseBodyDataProductsSession();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsSession setSessionEndTime(String sessionEndTime) {
            this.sessionEndTime = sessionEndTime;
            return this;
        }
        public String getSessionEndTime() {
            return this.sessionEndTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsSession setSessionName(String sessionName) {
            this.sessionName = sessionName;
            return this;
        }
        public String getSessionName() {
            return this.sessionName;
        }

        public TicketPageQueryProductResponseBodyDataProductsSession setSessionStartTime(String sessionStartTime) {
            this.sessionStartTime = sessionStartTime;
            return this;
        }
        public String getSessionStartTime() {
            return this.sessionStartTime;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsSpu extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>门票</p>
         */
        @NameInMap("PrimaryTypeName")
        public String primaryTypeName;

        /**
         * <strong>example:</strong>
         * <p>门票级别日历详情</p>
         */
        @NameInMap("ReserveDetail")
        public String reserveDetail;

        /**
         * <strong>example:</strong>
         * <p>门票级别日历说明</p>
         */
        @NameInMap("ReserveTitle")
        public String reserveTitle;

        /**
         * <strong>example:</strong>
         * <p>首道门票</p>
         */
        @NameInMap("SecondaryTypeName")
        public String secondaryTypeName;

        /**
         * <strong>example:</strong>
         * <p>3507</p>
         */
        @NameInMap("SpuId")
        public Long spuId;

        /**
         * <strong>example:</strong>
         * <p>1日票</p>
         */
        @NameInMap("SpuName")
        public String spuName;

        public static TicketPageQueryProductResponseBodyDataProductsSpu build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsSpu self = new TicketPageQueryProductResponseBodyDataProductsSpu();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsSpu setPrimaryTypeName(String primaryTypeName) {
            this.primaryTypeName = primaryTypeName;
            return this;
        }
        public String getPrimaryTypeName() {
            return this.primaryTypeName;
        }

        public TicketPageQueryProductResponseBodyDataProductsSpu setReserveDetail(String reserveDetail) {
            this.reserveDetail = reserveDetail;
            return this;
        }
        public String getReserveDetail() {
            return this.reserveDetail;
        }

        public TicketPageQueryProductResponseBodyDataProductsSpu setReserveTitle(String reserveTitle) {
            this.reserveTitle = reserveTitle;
            return this;
        }
        public String getReserveTitle() {
            return this.reserveTitle;
        }

        public TicketPageQueryProductResponseBodyDataProductsSpu setSecondaryTypeName(String secondaryTypeName) {
            this.secondaryTypeName = secondaryTypeName;
            return this;
        }
        public String getSecondaryTypeName() {
            return this.secondaryTypeName;
        }

        public TicketPageQueryProductResponseBodyDataProductsSpu setSpuId(Long spuId) {
            this.spuId = spuId;
            return this;
        }
        public Long getSpuId() {
            return this.spuId;
        }

        public TicketPageQueryProductResponseBodyDataProductsSpu setSpuName(String spuName) {
            this.spuName = spuName;
            return this;
        }
        public String getSpuName() {
            return this.spuName;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsTicketKind extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>适用于18周岁(含)至59周岁(含)的游客</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>60484007</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>成人票</p>
         */
        @NameInMap("Name")
        public String name;

        public static TicketPageQueryProductResponseBodyDataProductsTicketKind build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsTicketKind self = new TicketPageQueryProductResponseBodyDataProductsTicketKind();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsTicketKind setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TicketPageQueryProductResponseBodyDataProductsTicketKind setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TicketPageQueryProductResponseBodyDataProductsTicketKind setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Anchor")
        public Integer anchor;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        @NameInMap("FixedTime")
        public String fixedTime;

        /**
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("OffsetDayOfTime")
        public String offsetDayOfTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetUnit")
        public Integer offsetUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetValue")
        public Integer offsetValue;

        public static TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule self = new TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsUseRuleEntryTimePeriods extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <strong>example:</strong>
         * <p>17:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        public static TicketPageQueryProductResponseBodyDataProductsUseRuleEntryTimePeriods build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsUseRuleEntryTimePeriods self = new TicketPageQueryProductResponseBodyDataProductsUseRuleEntryTimePeriods();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleEntryTimePeriods setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleEntryTimePeriods setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsUseRuleEntryWithVoucherRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>凭二维码入园</p>
         */
        @NameInMap("VoucherRemark")
        public String voucherRemark;

        /**
         * <strong>example:</strong>
         * <p>[1]</p>
         */
        @NameInMap("VoucherTypes")
        public java.util.List<Integer> voucherTypes;

        public static TicketPageQueryProductResponseBodyDataProductsUseRuleEntryWithVoucherRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsUseRuleEntryWithVoucherRule self = new TicketPageQueryProductResponseBodyDataProductsUseRuleEntryWithVoucherRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleEntryWithVoucherRule setVoucherRemark(String voucherRemark) {
            this.voucherRemark = voucherRemark;
            return this;
        }
        public String getVoucherRemark() {
            return this.voucherRemark;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleEntryWithVoucherRule setVoucherTypes(java.util.List<Integer> voucherTypes) {
            this.voucherTypes = voucherTypes;
            return this;
        }
        public java.util.List<Integer> getVoucherTypes() {
            return this.voucherTypes;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsUseRulePickupsRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>景区游客中心</p>
         */
        @NameInMap("PickupsAddress")
        public String pickupsAddress;

        /**
         * <strong>example:</strong>
         * <p>凭短信取票</p>
         */
        @NameInMap("VoucherRemark")
        public String voucherRemark;

        /**
         * <strong>example:</strong>
         * <p>[1]</p>
         */
        @NameInMap("VoucherTypes")
        public java.util.List<Integer> voucherTypes;

        public static TicketPageQueryProductResponseBodyDataProductsUseRulePickupsRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsUseRulePickupsRule self = new TicketPageQueryProductResponseBodyDataProductsUseRulePickupsRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRulePickupsRule setPickupsAddress(String pickupsAddress) {
            this.pickupsAddress = pickupsAddress;
            return this;
        }
        public String getPickupsAddress() {
            return this.pickupsAddress;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRulePickupsRule setVoucherRemark(String voucherRemark) {
            this.voucherRemark = voucherRemark;
            return this;
        }
        public String getVoucherRemark() {
            return this.voucherRemark;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRulePickupsRule setVoucherTypes(java.util.List<Integer> voucherTypes) {
            this.voucherTypes = voucherTypes;
            return this;
        }
        public java.util.List<Integer> getVoucherTypes() {
            return this.voucherTypes;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Anchor")
        public Integer anchor;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        @NameInMap("FixedTime")
        public String fixedTime;

        /**
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("OffsetDayOfTime")
        public String offsetDayOfTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetUnit")
        public Integer offsetUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetValue")
        public Integer offsetValue;

        public static TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom self = new TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Anchor")
        public Integer anchor;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01</p>
         */
        @NameInMap("FixedTime")
        public String fixedTime;

        /**
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("OffsetDayOfTime")
        public String offsetDayOfTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetUnit")
        public Integer offsetUnit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OffsetValue")
        public Integer offsetValue;

        public static TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo self = new TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[1, 2, 3, 4, 5, 6, 7]</p>
         */
        @NameInMap("AvailableWeeks")
        public java.util.List<Integer> availableWeeks;

        @NameInMap("From")
        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom from;

        @NameInMap("To")
        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo to;

        /**
         * <strong>example:</strong>
         * <p>[&quot;2026-01-01&quot;]</p>
         */
        @NameInMap("UnavailableDates")
        public java.util.List<String> unavailableDates;

        public static TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule self = new TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule setAvailableWeeks(java.util.List<Integer> availableWeeks) {
            this.availableWeeks = availableWeeks;
            return this;
        }
        public java.util.List<Integer> getAvailableWeeks() {
            return this.availableWeeks;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule setFrom(TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom from) {
            this.from = from;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleFrom getFrom() {
            return this.from;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule setTo(TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo to) {
            this.to = to;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRuleTo getTo() {
            return this.to;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule setUnavailableDates(java.util.List<String> unavailableDates) {
            this.unavailableDates = unavailableDates;
            return this;
        }
        public java.util.List<String> getUnavailableDates() {
            return this.unavailableDates;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProductsUseRule extends TeaModel {
        @NameInMap("EffectTimePointRule")
        public TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule effectTimePointRule;

        /**
         * <strong>example:</strong>
         * <p>景区正门入口</p>
         */
        @NameInMap("EntryAddress")
        public String entryAddress;

        /**
         * <strong>example:</strong>
         * <p>请于入园前2小时至香港迪士尼度假区售票处旁人工服务站进行取票预约，服务时间上午 10:00 至 晚上 8:30</p>
         */
        @NameInMap("EntryRemark")
        public String entryRemark;

        @NameInMap("EntryTimePeriods")
        public java.util.List<TicketPageQueryProductResponseBodyDataProductsUseRuleEntryTimePeriods> entryTimePeriods;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EntryType")
        public Integer entryType;

        @NameInMap("EntryWithVoucherRule")
        public TicketPageQueryProductResponseBodyDataProductsUseRuleEntryWithVoucherRule entryWithVoucherRule;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedAssemble")
        public Boolean needAssemble;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedPrebook")
        public Boolean needPrebook;

        /**
         * <strong>example:</strong>
         * <p>请携带有效身份证件</p>
         */
        @NameInMap("OtherNote")
        public String otherNote;

        @NameInMap("PickupsRule")
        public TicketPageQueryProductResponseBodyDataProductsUseRulePickupsRule pickupsRule;

        @NameInMap("ValidityPeriodRule")
        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule validityPeriodRule;

        public static TicketPageQueryProductResponseBodyDataProductsUseRule build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProductsUseRule self = new TicketPageQueryProductResponseBodyDataProductsUseRule();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setEffectTimePointRule(TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule effectTimePointRule) {
            this.effectTimePointRule = effectTimePointRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsUseRuleEffectTimePointRule getEffectTimePointRule() {
            return this.effectTimePointRule;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setEntryAddress(String entryAddress) {
            this.entryAddress = entryAddress;
            return this;
        }
        public String getEntryAddress() {
            return this.entryAddress;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setEntryRemark(String entryRemark) {
            this.entryRemark = entryRemark;
            return this;
        }
        public String getEntryRemark() {
            return this.entryRemark;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setEntryTimePeriods(java.util.List<TicketPageQueryProductResponseBodyDataProductsUseRuleEntryTimePeriods> entryTimePeriods) {
            this.entryTimePeriods = entryTimePeriods;
            return this;
        }
        public java.util.List<TicketPageQueryProductResponseBodyDataProductsUseRuleEntryTimePeriods> getEntryTimePeriods() {
            return this.entryTimePeriods;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setEntryType(Integer entryType) {
            this.entryType = entryType;
            return this;
        }
        public Integer getEntryType() {
            return this.entryType;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setEntryWithVoucherRule(TicketPageQueryProductResponseBodyDataProductsUseRuleEntryWithVoucherRule entryWithVoucherRule) {
            this.entryWithVoucherRule = entryWithVoucherRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsUseRuleEntryWithVoucherRule getEntryWithVoucherRule() {
            return this.entryWithVoucherRule;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setNeedAssemble(Boolean needAssemble) {
            this.needAssemble = needAssemble;
            return this;
        }
        public Boolean getNeedAssemble() {
            return this.needAssemble;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setNeedPrebook(Boolean needPrebook) {
            this.needPrebook = needPrebook;
            return this;
        }
        public Boolean getNeedPrebook() {
            return this.needPrebook;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setOtherNote(String otherNote) {
            this.otherNote = otherNote;
            return this;
        }
        public String getOtherNote() {
            return this.otherNote;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setPickupsRule(TicketPageQueryProductResponseBodyDataProductsUseRulePickupsRule pickupsRule) {
            this.pickupsRule = pickupsRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsUseRulePickupsRule getPickupsRule() {
            return this.pickupsRule;
        }

        public TicketPageQueryProductResponseBodyDataProductsUseRule setValidityPeriodRule(TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule validityPeriodRule) {
            this.validityPeriodRule = validityPeriodRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsUseRuleValidityPeriodRule getValidityPeriodRule() {
            return this.validityPeriodRule;
        }

    }

    public static class TicketPageQueryProductResponseBodyDataProducts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BookingType")
        public Integer bookingType;

        @NameInMap("BuyRule")
        public TicketPageQueryProductResponseBodyDataProductsBuyRule buyRule;

        /**
         * <strong>example:</strong>
         * <p>含景区大门票一张</p>
         */
        @NameInMap("CostIncludeRemark")
        public String costIncludeRemark;

        /**
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("DeliverGuaranteeMinutes")
        public Integer deliverGuaranteeMinutes;

        /**
         * <strong>example:</strong>
         * <p>[&quot;<a href="https://example.com/detail1.jpg%22%5D">https://example.com/detail1.jpg&quot;]</a></p>
         */
        @NameInMap("Images")
        public java.util.List<String> images;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InvoiceIssuerType")
        public Integer invoiceIssuerType;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PaymentLimitMinutes")
        public Integer paymentLimitMinutes;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <strong>example:</strong>
         * <p>西湖游船成人票</p>
         */
        @NameInMap("ProductName")
        public String productName;

        @NameInMap("RefundRule")
        public TicketPageQueryProductResponseBodyDataProductsRefundRule refundRule;

        @NameInMap("Region")
        public TicketPageQueryProductResponseBodyDataProductsRegion region;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ScenicId")
        public Long scenicId;

        @NameInMap("Session")
        public TicketPageQueryProductResponseBodyDataProductsSession session;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SettlePriceCalculateType")
        public Integer settlePriceCalculateType;

        @NameInMap("Spu")
        public TicketPageQueryProductResponseBodyDataProductsSpu spu;

        /**
         * <strong>example:</strong>
         * <p>飞猪景区乐园旗舰店</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("TicketKind")
        public TicketPageQueryProductResponseBodyDataProductsTicketKind ticketKind;

        @NameInMap("UseRule")
        public TicketPageQueryProductResponseBodyDataProductsUseRule useRule;

        public static TicketPageQueryProductResponseBodyDataProducts build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyDataProducts self = new TicketPageQueryProductResponseBodyDataProducts();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyDataProducts setBookingType(Integer bookingType) {
            this.bookingType = bookingType;
            return this;
        }
        public Integer getBookingType() {
            return this.bookingType;
        }

        public TicketPageQueryProductResponseBodyDataProducts setBuyRule(TicketPageQueryProductResponseBodyDataProductsBuyRule buyRule) {
            this.buyRule = buyRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsBuyRule getBuyRule() {
            return this.buyRule;
        }

        public TicketPageQueryProductResponseBodyDataProducts setCostIncludeRemark(String costIncludeRemark) {
            this.costIncludeRemark = costIncludeRemark;
            return this;
        }
        public String getCostIncludeRemark() {
            return this.costIncludeRemark;
        }

        public TicketPageQueryProductResponseBodyDataProducts setDeliverGuaranteeMinutes(Integer deliverGuaranteeMinutes) {
            this.deliverGuaranteeMinutes = deliverGuaranteeMinutes;
            return this;
        }
        public Integer getDeliverGuaranteeMinutes() {
            return this.deliverGuaranteeMinutes;
        }

        public TicketPageQueryProductResponseBodyDataProducts setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public TicketPageQueryProductResponseBodyDataProducts setInvoiceIssuerType(Integer invoiceIssuerType) {
            this.invoiceIssuerType = invoiceIssuerType;
            return this;
        }
        public Integer getInvoiceIssuerType() {
            return this.invoiceIssuerType;
        }

        public TicketPageQueryProductResponseBodyDataProducts setPaymentLimitMinutes(Integer paymentLimitMinutes) {
            this.paymentLimitMinutes = paymentLimitMinutes;
            return this;
        }
        public Integer getPaymentLimitMinutes() {
            return this.paymentLimitMinutes;
        }

        public TicketPageQueryProductResponseBodyDataProducts setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public TicketPageQueryProductResponseBodyDataProducts setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public TicketPageQueryProductResponseBodyDataProducts setRefundRule(TicketPageQueryProductResponseBodyDataProductsRefundRule refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsRefundRule getRefundRule() {
            return this.refundRule;
        }

        public TicketPageQueryProductResponseBodyDataProducts setRegion(TicketPageQueryProductResponseBodyDataProductsRegion region) {
            this.region = region;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsRegion getRegion() {
            return this.region;
        }

        public TicketPageQueryProductResponseBodyDataProducts setScenicId(Long scenicId) {
            this.scenicId = scenicId;
            return this;
        }
        public Long getScenicId() {
            return this.scenicId;
        }

        public TicketPageQueryProductResponseBodyDataProducts setSession(TicketPageQueryProductResponseBodyDataProductsSession session) {
            this.session = session;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsSession getSession() {
            return this.session;
        }

        public TicketPageQueryProductResponseBodyDataProducts setSettlePriceCalculateType(Integer settlePriceCalculateType) {
            this.settlePriceCalculateType = settlePriceCalculateType;
            return this;
        }
        public Integer getSettlePriceCalculateType() {
            return this.settlePriceCalculateType;
        }

        public TicketPageQueryProductResponseBodyDataProducts setSpu(TicketPageQueryProductResponseBodyDataProductsSpu spu) {
            this.spu = spu;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsSpu getSpu() {
            return this.spu;
        }

        public TicketPageQueryProductResponseBodyDataProducts setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public TicketPageQueryProductResponseBodyDataProducts setTicketKind(TicketPageQueryProductResponseBodyDataProductsTicketKind ticketKind) {
            this.ticketKind = ticketKind;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsTicketKind getTicketKind() {
            return this.ticketKind;
        }

        public TicketPageQueryProductResponseBodyDataProducts setUseRule(TicketPageQueryProductResponseBodyDataProductsUseRule useRule) {
            this.useRule = useRule;
            return this;
        }
        public TicketPageQueryProductResponseBodyDataProductsUseRule getUseRule() {
            return this.useRule;
        }

    }

    public static class TicketPageQueryProductResponseBodyData extends TeaModel {
        @NameInMap("Products")
        public java.util.List<TicketPageQueryProductResponseBodyDataProducts> products;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static TicketPageQueryProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketPageQueryProductResponseBodyData self = new TicketPageQueryProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketPageQueryProductResponseBodyData setProducts(java.util.List<TicketPageQueryProductResponseBodyDataProducts> products) {
            this.products = products;
            return this;
        }
        public java.util.List<TicketPageQueryProductResponseBodyDataProducts> getProducts() {
            return this.products;
        }

        public TicketPageQueryProductResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
