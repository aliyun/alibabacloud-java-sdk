// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRegistrationPoliciesResponseBody extends TeaModel {
    @NameInMap("Policies")
    public java.util.List<ListRegistrationPoliciesResponseBodyPolicies> policies;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalNum")
    public String totalNum;

    public static ListRegistrationPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegistrationPoliciesResponseBody self = new ListRegistrationPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegistrationPoliciesResponseBody setPolicies(java.util.List<ListRegistrationPoliciesResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<ListRegistrationPoliciesResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public ListRegistrationPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRegistrationPoliciesResponseBody setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public static class ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount extends TeaModel {
        @NameInMap("All")
        public Integer all;

        @NameInMap("Mobile")
        public Integer mobile;

        @NameInMap("PC")
        public Integer PC;

        public static ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount build(java.util.Map<String, ?> map) throws Exception {
            ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount self = new ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount();
            return TeaModel.build(map, self);
        }

        public ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount setAll(Integer all) {
            this.all = all;
            return this;
        }
        public Integer getAll() {
            return this.all;
        }

        public ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount setMobile(Integer mobile) {
            this.mobile = mobile;
            return this;
        }
        public Integer getMobile() {
            return this.mobile;
        }

        public ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount setPC(Integer PC) {
            this.PC = PC;
            return this;
        }
        public Integer getPC() {
            return this.PC;
        }

    }

    public static class ListRegistrationPoliciesResponseBodyPoliciesLimitDetail extends TeaModel {
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        @NameInMap("LimitCount")
        public ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount limitCount;

        @NameInMap("LimitType")
        public String limitType;

        public static ListRegistrationPoliciesResponseBodyPoliciesLimitDetail build(java.util.Map<String, ?> map) throws Exception {
            ListRegistrationPoliciesResponseBodyPoliciesLimitDetail self = new ListRegistrationPoliciesResponseBodyPoliciesLimitDetail();
            return TeaModel.build(map, self);
        }

        public ListRegistrationPoliciesResponseBodyPoliciesLimitDetail setDeviceBelong(String deviceBelong) {
            this.deviceBelong = deviceBelong;
            return this;
        }
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        public ListRegistrationPoliciesResponseBodyPoliciesLimitDetail setLimitCount(ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount limitCount) {
            this.limitCount = limitCount;
            return this;
        }
        public ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount getLimitCount() {
            return this.limitCount;
        }

        public ListRegistrationPoliciesResponseBodyPoliciesLimitDetail setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

    }

    public static class ListRegistrationPoliciesResponseBodyPolicies extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("LimitDetail")
        public java.util.List<ListRegistrationPoliciesResponseBodyPoliciesLimitDetail> limitDetail;

        @NameInMap("MatchMode")
        public String matchMode;

        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("Priority")
        public Long priority;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static ListRegistrationPoliciesResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListRegistrationPoliciesResponseBodyPolicies self = new ListRegistrationPoliciesResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public ListRegistrationPoliciesResponseBodyPolicies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRegistrationPoliciesResponseBodyPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRegistrationPoliciesResponseBodyPolicies setLimitDetail(java.util.List<ListRegistrationPoliciesResponseBodyPoliciesLimitDetail> limitDetail) {
            this.limitDetail = limitDetail;
            return this;
        }
        public java.util.List<ListRegistrationPoliciesResponseBodyPoliciesLimitDetail> getLimitDetail() {
            return this.limitDetail;
        }

        public ListRegistrationPoliciesResponseBodyPolicies setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public ListRegistrationPoliciesResponseBodyPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRegistrationPoliciesResponseBodyPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListRegistrationPoliciesResponseBodyPolicies setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListRegistrationPoliciesResponseBodyPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRegistrationPoliciesResponseBodyPolicies setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public ListRegistrationPoliciesResponseBodyPolicies setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
