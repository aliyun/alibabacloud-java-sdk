// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeTrafficControlsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("TrafficControls")
    public DescribeTrafficControlsResponseBodyTrafficControls trafficControls;

    public static DescribeTrafficControlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficControlsResponseBody self = new DescribeTrafficControlsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficControlsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTrafficControlsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTrafficControlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTrafficControlsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeTrafficControlsResponseBody setTrafficControls(DescribeTrafficControlsResponseBodyTrafficControls trafficControls) {
        this.trafficControls = trafficControls;
        return this;
    }
    public DescribeTrafficControlsResponseBodyTrafficControls getTrafficControls() {
        return this.trafficControls;
    }

    public static class DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecialsSpecial extends TeaModel {
        @NameInMap("SpecialKey")
        public String specialKey;

        @NameInMap("TrafficValue")
        public Integer trafficValue;

        public static DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecialsSpecial build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecialsSpecial self = new DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecialsSpecial();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecialsSpecial setSpecialKey(String specialKey) {
            this.specialKey = specialKey;
            return this;
        }
        public String getSpecialKey() {
            return this.specialKey;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecialsSpecial setTrafficValue(Integer trafficValue) {
            this.trafficValue = trafficValue;
            return this;
        }
        public Integer getTrafficValue() {
            return this.trafficValue;
        }

    }

    public static class DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecials extends TeaModel {
        @NameInMap("Special")
        public java.util.List<DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecialsSpecial> special;

        public static DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecials build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecials self = new DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecials();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecials setSpecial(java.util.List<DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecialsSpecial> special) {
            this.special = special;
            return this;
        }
        public java.util.List<DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecialsSpecial> getSpecial() {
            return this.special;
        }

    }

    public static class DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicy extends TeaModel {
        @NameInMap("SpecialType")
        public String specialType;

        @NameInMap("Specials")
        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecials specials;

        public static DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicy build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicy self = new DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicy();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicy setSpecialType(String specialType) {
            this.specialType = specialType;
            return this;
        }
        public String getSpecialType() {
            return this.specialType;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicy setSpecials(DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecials specials) {
            this.specials = specials;
            return this;
        }
        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicySpecials getSpecials() {
            return this.specials;
        }

    }

    public static class DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPolicies extends TeaModel {
        @NameInMap("SpecialPolicy")
        public java.util.List<DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicy> specialPolicy;

        public static DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPolicies self = new DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPolicies setSpecialPolicy(java.util.List<DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicy> specialPolicy) {
            this.specialPolicy = specialPolicy;
            return this;
        }
        public java.util.List<DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPoliciesSpecialPolicy> getSpecialPolicy() {
            return this.specialPolicy;
        }

    }

    public static class DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl extends TeaModel {
        @NameInMap("ApiDefault")
        public Integer apiDefault;

        @NameInMap("AppDefault")
        public Integer appDefault;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("SpecialPolicies")
        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPolicies specialPolicies;

        @NameInMap("TrafficControlId")
        public String trafficControlId;

        @NameInMap("TrafficControlName")
        public String trafficControlName;

        @NameInMap("TrafficControlUnit")
        public String trafficControlUnit;

        @NameInMap("UserDefault")
        public Integer userDefault;

        public static DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl self = new DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl setApiDefault(Integer apiDefault) {
            this.apiDefault = apiDefault;
            return this;
        }
        public Integer getApiDefault() {
            return this.apiDefault;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl setAppDefault(Integer appDefault) {
            this.appDefault = appDefault;
            return this;
        }
        public Integer getAppDefault() {
            return this.appDefault;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl setSpecialPolicies(DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPolicies specialPolicies) {
            this.specialPolicies = specialPolicies;
            return this;
        }
        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControlSpecialPolicies getSpecialPolicies() {
            return this.specialPolicies;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl setTrafficControlId(String trafficControlId) {
            this.trafficControlId = trafficControlId;
            return this;
        }
        public String getTrafficControlId() {
            return this.trafficControlId;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl setTrafficControlName(String trafficControlName) {
            this.trafficControlName = trafficControlName;
            return this;
        }
        public String getTrafficControlName() {
            return this.trafficControlName;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl setTrafficControlUnit(String trafficControlUnit) {
            this.trafficControlUnit = trafficControlUnit;
            return this;
        }
        public String getTrafficControlUnit() {
            return this.trafficControlUnit;
        }

        public DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl setUserDefault(Integer userDefault) {
            this.userDefault = userDefault;
            return this;
        }
        public Integer getUserDefault() {
            return this.userDefault;
        }

    }

    public static class DescribeTrafficControlsResponseBodyTrafficControls extends TeaModel {
        @NameInMap("TrafficControl")
        public java.util.List<DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl> trafficControl;

        public static DescribeTrafficControlsResponseBodyTrafficControls build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficControlsResponseBodyTrafficControls self = new DescribeTrafficControlsResponseBodyTrafficControls();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficControlsResponseBodyTrafficControls setTrafficControl(java.util.List<DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl> trafficControl) {
            this.trafficControl = trafficControl;
            return this;
        }
        public java.util.List<DescribeTrafficControlsResponseBodyTrafficControlsTrafficControl> getTrafficControl() {
            return this.trafficControl;
        }

    }

}
