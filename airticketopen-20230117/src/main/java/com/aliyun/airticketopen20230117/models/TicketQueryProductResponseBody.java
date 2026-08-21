// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryProductResponseBody extends TeaModel {
    @NameInMap("Data")
    public TicketQueryProductResponseBodyData data;

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

    public static TicketQueryProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryProductResponseBody self = new TicketQueryProductResponseBody();
        return TeaModel.build(map, self);
    }

    public TicketQueryProductResponseBody setData(TicketQueryProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TicketQueryProductResponseBodyData getData() {
        return this.data;
    }

    public TicketQueryProductResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TicketQueryProductResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public TicketQueryProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TicketQueryProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule self = new TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule self = new TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule setCertificate(Boolean certificate) {
            this.certificate = certificate;
            return this;
        }
        public Boolean getCertificate() {
            return this.certificate;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule setCertificateTypes(java.util.List<Integer> certificateTypes) {
            this.certificateTypes = certificateTypes;
            return this;
        }
        public java.util.List<Integer> getCertificateTypes() {
            return this.certificateTypes;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule setDialingCode(Boolean dialingCode) {
            this.dialingCode = dialingCode;
            return this;
        }
        public Boolean getDialingCode() {
            return this.dialingCode;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule setEmail(Boolean email) {
            this.email = email;
            return this;
        }
        public Boolean getEmail() {
            return this.email;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule setFirstName(Boolean firstName) {
            this.firstName = firstName;
            return this;
        }
        public Boolean getFirstName() {
            return this.firstName;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule setLastName(Boolean lastName) {
            this.lastName = lastName;
            return this;
        }
        public Boolean getLastName() {
            return this.lastName;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule setMobile(Boolean mobile) {
            this.mobile = mobile;
            return this;
        }
        public Boolean getMobile() {
            return this.mobile;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule setName(Boolean name) {
            this.name = name;
            return this;
        }
        public Boolean getName() {
            return this.name;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductBuyRuleContactRule extends TeaModel {
        @NameInMap("ContactFieldRule")
        public TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule contactFieldRule;

        public static TicketQueryProductResponseBodyDataProductBuyRuleContactRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductBuyRuleContactRule self = new TicketQueryProductResponseBodyDataProductBuyRuleContactRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleContactRule setContactFieldRule(TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule contactFieldRule) {
            this.contactFieldRule = contactFieldRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductBuyRuleContactRuleContactFieldRule getContactFieldRule() {
            return this.contactFieldRule;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules self = new TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules setLimitDayType(Integer limitDayType) {
            this.limitDayType = limitDayType;
            return this;
        }
        public Integer getLimitDayType() {
            return this.limitDayType;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules setLimitDays(Integer limitDays) {
            this.limitDays = limitDays;
            return this;
        }
        public Integer getLimitDays() {
            return this.limitDays;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules setLimitPeriod(Integer limitPeriod) {
            this.limitPeriod = limitPeriod;
            return this;
        }
        public Integer getLimitPeriod() {
            return this.limitPeriod;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules setLimitQuantityType(Integer limitQuantityType) {
            this.limitQuantityType = limitQuantityType;
            return this;
        }
        public Integer getLimitQuantityType() {
            return this.limitQuantityType;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules setLimitType(Integer limitType) {
            this.limitType = limitType;
            return this;
        }
        public Integer getLimitType() {
            return this.limitType;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules setMaxBuyQuantity(Integer maxBuyQuantity) {
            this.maxBuyQuantity = maxBuyQuantity;
            return this;
        }
        public Integer getMaxBuyQuantity() {
            return this.maxBuyQuantity;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductBuyRulePerOrderBuyQuantityLimitRule extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductBuyRulePerOrderBuyQuantityLimitRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductBuyRulePerOrderBuyQuantityLimitRule self = new TicketQueryProductResponseBodyDataProductBuyRulePerOrderBuyQuantityLimitRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductBuyRulePerOrderBuyQuantityLimitRule setMaxBuyQuantity(Integer maxBuyQuantity) {
            this.maxBuyQuantity = maxBuyQuantity;
            return this;
        }
        public Integer getMaxBuyQuantity() {
            return this.maxBuyQuantity;
        }

        public TicketQueryProductResponseBodyDataProductBuyRulePerOrderBuyQuantityLimitRule setMinBuyQuantity(Integer minBuyQuantity) {
            this.minBuyQuantity = minBuyQuantity;
            return this;
        }
        public Integer getMinBuyQuantity() {
            return this.minBuyQuantity;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules self = new TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules setAgeBaseTimeType(Integer ageBaseTimeType) {
            this.ageBaseTimeType = ageBaseTimeType;
            return this;
        }
        public Integer getAgeBaseTimeType() {
            return this.ageBaseTimeType;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules setAgeCalculateType(Integer ageCalculateType) {
            this.ageCalculateType = ageCalculateType;
            return this;
        }
        public Integer getAgeCalculateType() {
            return this.ageCalculateType;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules setAgeMax(Integer ageMax) {
            this.ageMax = ageMax;
            return this;
        }
        public Integer getAgeMax() {
            return this.ageMax;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules setAgeMin(Integer ageMin) {
            this.ageMin = ageMin;
            return this;
        }
        public Integer getAgeMin() {
            return this.ageMin;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdQuantityLimits extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdQuantityLimits build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdQuantityLimits self = new TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdQuantityLimits();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdQuantityLimits setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdQuantityLimits setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule self = new TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setBirthday(Boolean birthday) {
            this.birthday = birthday;
            return this;
        }
        public Boolean getBirthday() {
            return this.birthday;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setCertificate(Boolean certificate) {
            this.certificate = certificate;
            return this;
        }
        public Boolean getCertificate() {
            return this.certificate;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setCertificateTypes(java.util.List<Integer> certificateTypes) {
            this.certificateTypes = certificateTypes;
            return this;
        }
        public java.util.List<Integer> getCertificateTypes() {
            return this.certificateTypes;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setDialingCode(Boolean dialingCode) {
            this.dialingCode = dialingCode;
            return this;
        }
        public Boolean getDialingCode() {
            return this.dialingCode;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setEmail(Boolean email) {
            this.email = email;
            return this;
        }
        public Boolean getEmail() {
            return this.email;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setFirstName(Boolean firstName) {
            this.firstName = firstName;
            return this;
        }
        public Boolean getFirstName() {
            return this.firstName;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setGender(Boolean gender) {
            this.gender = gender;
            return this;
        }
        public Boolean getGender() {
            return this.gender;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setLastName(Boolean lastName) {
            this.lastName = lastName;
            return this;
        }
        public Boolean getLastName() {
            return this.lastName;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setMobile(Boolean mobile) {
            this.mobile = mobile;
            return this;
        }
        public Boolean getMobile() {
            return this.mobile;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setName(Boolean name) {
            this.name = name;
            return this;
        }
        public Boolean getName() {
            return this.name;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule setNationality(Boolean nationality) {
            this.nationality = nationality;
            return this;
        }
        public Boolean getNationality() {
            return this.nationality;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule extends TeaModel {
        @NameInMap("CrowdLimitRules")
        public java.util.List<TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules> crowdLimitRules;

        @NameInMap("CrowdQuantityLimits")
        public java.util.List<TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdQuantityLimits> crowdQuantityLimits;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("NeedFillTraveler")
        public Boolean needFillTraveler;

        @NameInMap("TravelerFieldRule")
        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule travelerFieldRule;

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

        public static TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule self = new TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule setCrowdLimitRules(java.util.List<TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules> crowdLimitRules) {
            this.crowdLimitRules = crowdLimitRules;
            return this;
        }
        public java.util.List<TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdLimitRules> getCrowdLimitRules() {
            return this.crowdLimitRules;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule setCrowdQuantityLimits(java.util.List<TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdQuantityLimits> crowdQuantityLimits) {
            this.crowdQuantityLimits = crowdQuantityLimits;
            return this;
        }
        public java.util.List<TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleCrowdQuantityLimits> getCrowdQuantityLimits() {
            return this.crowdQuantityLimits;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule setNeedFillTraveler(Boolean needFillTraveler) {
            this.needFillTraveler = needFillTraveler;
            return this;
        }
        public Boolean getNeedFillTraveler() {
            return this.needFillTraveler;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule setTravelerFieldRule(TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule travelerFieldRule) {
            this.travelerFieldRule = travelerFieldRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRuleTravelerFieldRule getTravelerFieldRule() {
            return this.travelerFieldRule;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule setTravelerFillDimension(Integer travelerFillDimension) {
            this.travelerFillDimension = travelerFillDimension;
            return this;
        }
        public Integer getTravelerFillDimension() {
            return this.travelerFillDimension;
        }

        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule setTravelerQuantity(Integer travelerQuantity) {
            this.travelerQuantity = travelerQuantity;
            return this;
        }
        public Integer getTravelerQuantity() {
            return this.travelerQuantity;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductBuyRule extends TeaModel {
        @NameInMap("AheadBuyTimePointRule")
        public TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule aheadBuyTimePointRule;

        @NameInMap("ContactRule")
        public TicketQueryProductResponseBodyDataProductBuyRuleContactRule contactRule;

        @NameInMap("CrossOrderBuyQuantityLimitRules")
        public java.util.List<TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules> crossOrderBuyQuantityLimitRules;

        @NameInMap("PerOrderBuyQuantityLimitRule")
        public TicketQueryProductResponseBodyDataProductBuyRulePerOrderBuyQuantityLimitRule perOrderBuyQuantityLimitRule;

        @NameInMap("TravelerRule")
        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule travelerRule;

        public static TicketQueryProductResponseBodyDataProductBuyRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductBuyRule self = new TicketQueryProductResponseBodyDataProductBuyRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductBuyRule setAheadBuyTimePointRule(TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule aheadBuyTimePointRule) {
            this.aheadBuyTimePointRule = aheadBuyTimePointRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductBuyRuleAheadBuyTimePointRule getAheadBuyTimePointRule() {
            return this.aheadBuyTimePointRule;
        }

        public TicketQueryProductResponseBodyDataProductBuyRule setContactRule(TicketQueryProductResponseBodyDataProductBuyRuleContactRule contactRule) {
            this.contactRule = contactRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductBuyRuleContactRule getContactRule() {
            return this.contactRule;
        }

        public TicketQueryProductResponseBodyDataProductBuyRule setCrossOrderBuyQuantityLimitRules(java.util.List<TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules> crossOrderBuyQuantityLimitRules) {
            this.crossOrderBuyQuantityLimitRules = crossOrderBuyQuantityLimitRules;
            return this;
        }
        public java.util.List<TicketQueryProductResponseBodyDataProductBuyRuleCrossOrderBuyQuantityLimitRules> getCrossOrderBuyQuantityLimitRules() {
            return this.crossOrderBuyQuantityLimitRules;
        }

        public TicketQueryProductResponseBodyDataProductBuyRule setPerOrderBuyQuantityLimitRule(TicketQueryProductResponseBodyDataProductBuyRulePerOrderBuyQuantityLimitRule perOrderBuyQuantityLimitRule) {
            this.perOrderBuyQuantityLimitRule = perOrderBuyQuantityLimitRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductBuyRulePerOrderBuyQuantityLimitRule getPerOrderBuyQuantityLimitRule() {
            return this.perOrderBuyQuantityLimitRule;
        }

        public TicketQueryProductResponseBodyDataProductBuyRule setTravelerRule(TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule travelerRule) {
            this.travelerRule = travelerRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductBuyRuleTravelerRule getTravelerRule() {
            return this.travelerRule;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom self = new TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo self = new TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules extends TeaModel {
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
        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom from;

        @NameInMap("To")
        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo to;

        public static TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules self = new TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules setFee(Double fee) {
            this.fee = fee;
            return this;
        }
        public Double getFee() {
            return this.fee;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules setFeeBase(Integer feeBase) {
            this.feeBase = feeBase;
            return this;
        }
        public Integer getFeeBase() {
            return this.feeBase;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules setFeeType(Integer feeType) {
            this.feeType = feeType;
            return this;
        }
        public Integer getFeeType() {
            return this.feeType;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules setFrom(TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom from) {
            this.from = from;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesFrom getFrom() {
            return this.from;
        }

        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules setTo(TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo to) {
            this.to = to;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRulesTo getTo() {
            return this.to;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductRefundRule extends TeaModel {
        @NameInMap("RefundStageRules")
        public java.util.List<TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules> refundStageRules;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RefundType")
        public Integer refundType;

        public static TicketQueryProductResponseBodyDataProductRefundRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductRefundRule self = new TicketQueryProductResponseBodyDataProductRefundRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductRefundRule setRefundStageRules(java.util.List<TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules> refundStageRules) {
            this.refundStageRules = refundStageRules;
            return this;
        }
        public java.util.List<TicketQueryProductResponseBodyDataProductRefundRuleRefundStageRules> getRefundStageRules() {
            return this.refundStageRules;
        }

        public TicketQueryProductResponseBodyDataProductRefundRule setRefundType(Integer refundType) {
            this.refundType = refundType;
            return this;
        }
        public Integer getRefundType() {
            return this.refundType;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductRegion extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>普通区</p>
         */
        @NameInMap("Name")
        public String name;

        public static TicketQueryProductResponseBodyDataProductRegion build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductRegion self = new TicketQueryProductResponseBodyDataProductRegion();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductRegion setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductSession extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductSession build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductSession self = new TicketQueryProductResponseBodyDataProductSession();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductSession setSessionEndTime(String sessionEndTime) {
            this.sessionEndTime = sessionEndTime;
            return this;
        }
        public String getSessionEndTime() {
            return this.sessionEndTime;
        }

        public TicketQueryProductResponseBodyDataProductSession setSessionName(String sessionName) {
            this.sessionName = sessionName;
            return this;
        }
        public String getSessionName() {
            return this.sessionName;
        }

        public TicketQueryProductResponseBodyDataProductSession setSessionStartTime(String sessionStartTime) {
            this.sessionStartTime = sessionStartTime;
            return this;
        }
        public String getSessionStartTime() {
            return this.sessionStartTime;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductSpu extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductSpu build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductSpu self = new TicketQueryProductResponseBodyDataProductSpu();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductSpu setPrimaryTypeName(String primaryTypeName) {
            this.primaryTypeName = primaryTypeName;
            return this;
        }
        public String getPrimaryTypeName() {
            return this.primaryTypeName;
        }

        public TicketQueryProductResponseBodyDataProductSpu setReserveDetail(String reserveDetail) {
            this.reserveDetail = reserveDetail;
            return this;
        }
        public String getReserveDetail() {
            return this.reserveDetail;
        }

        public TicketQueryProductResponseBodyDataProductSpu setReserveTitle(String reserveTitle) {
            this.reserveTitle = reserveTitle;
            return this;
        }
        public String getReserveTitle() {
            return this.reserveTitle;
        }

        public TicketQueryProductResponseBodyDataProductSpu setSecondaryTypeName(String secondaryTypeName) {
            this.secondaryTypeName = secondaryTypeName;
            return this;
        }
        public String getSecondaryTypeName() {
            return this.secondaryTypeName;
        }

        public TicketQueryProductResponseBodyDataProductSpu setSpuId(Long spuId) {
            this.spuId = spuId;
            return this;
        }
        public Long getSpuId() {
            return this.spuId;
        }

        public TicketQueryProductResponseBodyDataProductSpu setSpuName(String spuName) {
            this.spuName = spuName;
            return this;
        }
        public String getSpuName() {
            return this.spuName;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductTicketKind extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductTicketKind build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductTicketKind self = new TicketQueryProductResponseBodyDataProductTicketKind();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductTicketKind setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public TicketQueryProductResponseBodyDataProductTicketKind setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public TicketQueryProductResponseBodyDataProductTicketKind setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule self = new TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductUseRuleEntryTimePeriods extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductUseRuleEntryTimePeriods build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductUseRuleEntryTimePeriods self = new TicketQueryProductResponseBodyDataProductUseRuleEntryTimePeriods();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductUseRuleEntryTimePeriods setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleEntryTimePeriods setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductUseRuleEntryWithVoucherRule extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductUseRuleEntryWithVoucherRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductUseRuleEntryWithVoucherRule self = new TicketQueryProductResponseBodyDataProductUseRuleEntryWithVoucherRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductUseRuleEntryWithVoucherRule setVoucherRemark(String voucherRemark) {
            this.voucherRemark = voucherRemark;
            return this;
        }
        public String getVoucherRemark() {
            return this.voucherRemark;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleEntryWithVoucherRule setVoucherTypes(java.util.List<Integer> voucherTypes) {
            this.voucherTypes = voucherTypes;
            return this;
        }
        public java.util.List<Integer> getVoucherTypes() {
            return this.voucherTypes;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductUseRulePickupsRule extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductUseRulePickupsRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductUseRulePickupsRule self = new TicketQueryProductResponseBodyDataProductUseRulePickupsRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductUseRulePickupsRule setPickupsAddress(String pickupsAddress) {
            this.pickupsAddress = pickupsAddress;
            return this;
        }
        public String getPickupsAddress() {
            return this.pickupsAddress;
        }

        public TicketQueryProductResponseBodyDataProductUseRulePickupsRule setVoucherRemark(String voucherRemark) {
            this.voucherRemark = voucherRemark;
            return this;
        }
        public String getVoucherRemark() {
            return this.voucherRemark;
        }

        public TicketQueryProductResponseBodyDataProductUseRulePickupsRule setVoucherTypes(java.util.List<Integer> voucherTypes) {
            this.voucherTypes = voucherTypes;
            return this;
        }
        public java.util.List<Integer> getVoucherTypes() {
            return this.voucherTypes;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom self = new TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo extends TeaModel {
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

        public static TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo self = new TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo setAnchor(Integer anchor) {
            this.anchor = anchor;
            return this;
        }
        public Integer getAnchor() {
            return this.anchor;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo setFixedTime(String fixedTime) {
            this.fixedTime = fixedTime;
            return this;
        }
        public String getFixedTime() {
            return this.fixedTime;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo setOffsetDayOfTime(String offsetDayOfTime) {
            this.offsetDayOfTime = offsetDayOfTime;
            return this;
        }
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo setOffsetUnit(Integer offsetUnit) {
            this.offsetUnit = offsetUnit;
            return this;
        }
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo setOffsetValue(Integer offsetValue) {
            this.offsetValue = offsetValue;
            return this;
        }
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[1, 2, 3, 4, 5, 6, 7]</p>
         */
        @NameInMap("AvailableWeeks")
        public java.util.List<Integer> availableWeeks;

        @NameInMap("From")
        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom from;

        @NameInMap("To")
        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo to;

        /**
         * <strong>example:</strong>
         * <p>[&quot;2026-01-01&quot;]</p>
         */
        @NameInMap("UnavailableDates")
        public java.util.List<String> unavailableDates;

        public static TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule self = new TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule setAvailableWeeks(java.util.List<Integer> availableWeeks) {
            this.availableWeeks = availableWeeks;
            return this;
        }
        public java.util.List<Integer> getAvailableWeeks() {
            return this.availableWeeks;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule setFrom(TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom from) {
            this.from = from;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleFrom getFrom() {
            return this.from;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule setTo(TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo to) {
            this.to = to;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRuleTo getTo() {
            return this.to;
        }

        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule setUnavailableDates(java.util.List<String> unavailableDates) {
            this.unavailableDates = unavailableDates;
            return this;
        }
        public java.util.List<String> getUnavailableDates() {
            return this.unavailableDates;
        }

    }

    public static class TicketQueryProductResponseBodyDataProductUseRule extends TeaModel {
        @NameInMap("EffectTimePointRule")
        public TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule effectTimePointRule;

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
        public java.util.List<TicketQueryProductResponseBodyDataProductUseRuleEntryTimePeriods> entryTimePeriods;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EntryType")
        public Integer entryType;

        @NameInMap("EntryWithVoucherRule")
        public TicketQueryProductResponseBodyDataProductUseRuleEntryWithVoucherRule entryWithVoucherRule;

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
        public TicketQueryProductResponseBodyDataProductUseRulePickupsRule pickupsRule;

        @NameInMap("ValidityPeriodRule")
        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule validityPeriodRule;

        public static TicketQueryProductResponseBodyDataProductUseRule build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProductUseRule self = new TicketQueryProductResponseBodyDataProductUseRule();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProductUseRule setEffectTimePointRule(TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule effectTimePointRule) {
            this.effectTimePointRule = effectTimePointRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductUseRuleEffectTimePointRule getEffectTimePointRule() {
            return this.effectTimePointRule;
        }

        public TicketQueryProductResponseBodyDataProductUseRule setEntryAddress(String entryAddress) {
            this.entryAddress = entryAddress;
            return this;
        }
        public String getEntryAddress() {
            return this.entryAddress;
        }

        public TicketQueryProductResponseBodyDataProductUseRule setEntryRemark(String entryRemark) {
            this.entryRemark = entryRemark;
            return this;
        }
        public String getEntryRemark() {
            return this.entryRemark;
        }

        public TicketQueryProductResponseBodyDataProductUseRule setEntryTimePeriods(java.util.List<TicketQueryProductResponseBodyDataProductUseRuleEntryTimePeriods> entryTimePeriods) {
            this.entryTimePeriods = entryTimePeriods;
            return this;
        }
        public java.util.List<TicketQueryProductResponseBodyDataProductUseRuleEntryTimePeriods> getEntryTimePeriods() {
            return this.entryTimePeriods;
        }

        public TicketQueryProductResponseBodyDataProductUseRule setEntryType(Integer entryType) {
            this.entryType = entryType;
            return this;
        }
        public Integer getEntryType() {
            return this.entryType;
        }

        public TicketQueryProductResponseBodyDataProductUseRule setEntryWithVoucherRule(TicketQueryProductResponseBodyDataProductUseRuleEntryWithVoucherRule entryWithVoucherRule) {
            this.entryWithVoucherRule = entryWithVoucherRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductUseRuleEntryWithVoucherRule getEntryWithVoucherRule() {
            return this.entryWithVoucherRule;
        }

        public TicketQueryProductResponseBodyDataProductUseRule setNeedAssemble(Boolean needAssemble) {
            this.needAssemble = needAssemble;
            return this;
        }
        public Boolean getNeedAssemble() {
            return this.needAssemble;
        }

        public TicketQueryProductResponseBodyDataProductUseRule setNeedPrebook(Boolean needPrebook) {
            this.needPrebook = needPrebook;
            return this;
        }
        public Boolean getNeedPrebook() {
            return this.needPrebook;
        }

        public TicketQueryProductResponseBodyDataProductUseRule setOtherNote(String otherNote) {
            this.otherNote = otherNote;
            return this;
        }
        public String getOtherNote() {
            return this.otherNote;
        }

        public TicketQueryProductResponseBodyDataProductUseRule setPickupsRule(TicketQueryProductResponseBodyDataProductUseRulePickupsRule pickupsRule) {
            this.pickupsRule = pickupsRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductUseRulePickupsRule getPickupsRule() {
            return this.pickupsRule;
        }

        public TicketQueryProductResponseBodyDataProductUseRule setValidityPeriodRule(TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule validityPeriodRule) {
            this.validityPeriodRule = validityPeriodRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductUseRuleValidityPeriodRule getValidityPeriodRule() {
            return this.validityPeriodRule;
        }

    }

    public static class TicketQueryProductResponseBodyDataProduct extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BookingType")
        public Integer bookingType;

        @NameInMap("BuyRule")
        public TicketQueryProductResponseBodyDataProductBuyRule buyRule;

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
        public TicketQueryProductResponseBodyDataProductRefundRule refundRule;

        @NameInMap("Region")
        public TicketQueryProductResponseBodyDataProductRegion region;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ScenicId")
        public Long scenicId;

        @NameInMap("Session")
        public TicketQueryProductResponseBodyDataProductSession session;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SettlePriceCalculateType")
        public Integer settlePriceCalculateType;

        @NameInMap("Spu")
        public TicketQueryProductResponseBodyDataProductSpu spu;

        /**
         * <strong>example:</strong>
         * <p>飞猪景区乐园旗舰店</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        @NameInMap("TicketKind")
        public TicketQueryProductResponseBodyDataProductTicketKind ticketKind;

        @NameInMap("UseRule")
        public TicketQueryProductResponseBodyDataProductUseRule useRule;

        public static TicketQueryProductResponseBodyDataProduct build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyDataProduct self = new TicketQueryProductResponseBodyDataProduct();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyDataProduct setBookingType(Integer bookingType) {
            this.bookingType = bookingType;
            return this;
        }
        public Integer getBookingType() {
            return this.bookingType;
        }

        public TicketQueryProductResponseBodyDataProduct setBuyRule(TicketQueryProductResponseBodyDataProductBuyRule buyRule) {
            this.buyRule = buyRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductBuyRule getBuyRule() {
            return this.buyRule;
        }

        public TicketQueryProductResponseBodyDataProduct setCostIncludeRemark(String costIncludeRemark) {
            this.costIncludeRemark = costIncludeRemark;
            return this;
        }
        public String getCostIncludeRemark() {
            return this.costIncludeRemark;
        }

        public TicketQueryProductResponseBodyDataProduct setDeliverGuaranteeMinutes(Integer deliverGuaranteeMinutes) {
            this.deliverGuaranteeMinutes = deliverGuaranteeMinutes;
            return this;
        }
        public Integer getDeliverGuaranteeMinutes() {
            return this.deliverGuaranteeMinutes;
        }

        public TicketQueryProductResponseBodyDataProduct setImages(java.util.List<String> images) {
            this.images = images;
            return this;
        }
        public java.util.List<String> getImages() {
            return this.images;
        }

        public TicketQueryProductResponseBodyDataProduct setInvoiceIssuerType(Integer invoiceIssuerType) {
            this.invoiceIssuerType = invoiceIssuerType;
            return this;
        }
        public Integer getInvoiceIssuerType() {
            return this.invoiceIssuerType;
        }

        public TicketQueryProductResponseBodyDataProduct setPaymentLimitMinutes(Integer paymentLimitMinutes) {
            this.paymentLimitMinutes = paymentLimitMinutes;
            return this;
        }
        public Integer getPaymentLimitMinutes() {
            return this.paymentLimitMinutes;
        }

        public TicketQueryProductResponseBodyDataProduct setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public TicketQueryProductResponseBodyDataProduct setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public TicketQueryProductResponseBodyDataProduct setRefundRule(TicketQueryProductResponseBodyDataProductRefundRule refundRule) {
            this.refundRule = refundRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductRefundRule getRefundRule() {
            return this.refundRule;
        }

        public TicketQueryProductResponseBodyDataProduct setRegion(TicketQueryProductResponseBodyDataProductRegion region) {
            this.region = region;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductRegion getRegion() {
            return this.region;
        }

        public TicketQueryProductResponseBodyDataProduct setScenicId(Long scenicId) {
            this.scenicId = scenicId;
            return this;
        }
        public Long getScenicId() {
            return this.scenicId;
        }

        public TicketQueryProductResponseBodyDataProduct setSession(TicketQueryProductResponseBodyDataProductSession session) {
            this.session = session;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductSession getSession() {
            return this.session;
        }

        public TicketQueryProductResponseBodyDataProduct setSettlePriceCalculateType(Integer settlePriceCalculateType) {
            this.settlePriceCalculateType = settlePriceCalculateType;
            return this;
        }
        public Integer getSettlePriceCalculateType() {
            return this.settlePriceCalculateType;
        }

        public TicketQueryProductResponseBodyDataProduct setSpu(TicketQueryProductResponseBodyDataProductSpu spu) {
            this.spu = spu;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductSpu getSpu() {
            return this.spu;
        }

        public TicketQueryProductResponseBodyDataProduct setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public TicketQueryProductResponseBodyDataProduct setTicketKind(TicketQueryProductResponseBodyDataProductTicketKind ticketKind) {
            this.ticketKind = ticketKind;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductTicketKind getTicketKind() {
            return this.ticketKind;
        }

        public TicketQueryProductResponseBodyDataProduct setUseRule(TicketQueryProductResponseBodyDataProductUseRule useRule) {
            this.useRule = useRule;
            return this;
        }
        public TicketQueryProductResponseBodyDataProductUseRule getUseRule() {
            return this.useRule;
        }

    }

    public static class TicketQueryProductResponseBodyData extends TeaModel {
        @NameInMap("Product")
        public TicketQueryProductResponseBodyDataProduct product;

        public static TicketQueryProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TicketQueryProductResponseBodyData self = new TicketQueryProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TicketQueryProductResponseBodyData setProduct(TicketQueryProductResponseBodyDataProduct product) {
            this.product = product;
            return this;
        }
        public TicketQueryProductResponseBodyDataProduct getProduct() {
            return this.product;
        }

    }

}
