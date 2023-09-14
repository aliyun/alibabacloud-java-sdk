// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRegistrationPoliciesForUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserGroups")
    public java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroups> userGroups;

    public static ListRegistrationPoliciesForUserGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegistrationPoliciesForUserGroupResponseBody self = new ListRegistrationPoliciesForUserGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegistrationPoliciesForUserGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRegistrationPoliciesForUserGroupResponseBody setUserGroups(java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroups> userGroups) {
        this.userGroups = userGroups;
        return this;
    }
    public java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static class ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount extends TeaModel {
        @NameInMap("All")
        public String all;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("PC")
        public String PC;

        public static ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount build(java.util.Map<String, ?> map) throws Exception {
            ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount self = new ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount();
            return TeaModel.build(map, self);
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount setAll(String all) {
            this.all = all;
            return this;
        }
        public String getAll() {
            return this.all;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount setPC(String PC) {
            this.PC = PC;
            return this;
        }
        public String getPC() {
            return this.PC;
        }

    }

    public static class ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail extends TeaModel {
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        @NameInMap("LimitCount")
        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount limitCount;

        @NameInMap("LimitType")
        public String limitType;

        public static ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail build(java.util.Map<String, ?> map) throws Exception {
            ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail self = new ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail();
            return TeaModel.build(map, self);
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail setDeviceBelong(String deviceBelong) {
            this.deviceBelong = deviceBelong;
            return this;
        }
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail setLimitCount(ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount limitCount) {
            this.limitCount = limitCount;
            return this;
        }
        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount getLimitCount() {
            return this.limitCount;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

    }

    public static class ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("LimitDetail")
        public java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail> limitDetail;

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

        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies build(java.util.Map<String, ?> map) throws Exception {
            ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies self = new ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies();
            return TeaModel.build(map, self);
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies setLimitDetail(java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail> limitDetail) {
            this.limitDetail = limitDetail;
            return this;
        }
        public java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail> getLimitDetail() {
            return this.limitDetail;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

    public static class ListRegistrationPoliciesForUserGroupResponseBodyUserGroups extends TeaModel {
        @NameInMap("Policies")
        public java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies> policies;

        @NameInMap("UserGroupId")
        public String userGroupId;

        public static ListRegistrationPoliciesForUserGroupResponseBodyUserGroups build(java.util.Map<String, ?> map) throws Exception {
            ListRegistrationPoliciesForUserGroupResponseBodyUserGroups self = new ListRegistrationPoliciesForUserGroupResponseBodyUserGroups();
            return TeaModel.build(map, self);
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroups setPolicies(java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies> getPolicies() {
            return this.policies;
        }

        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroups setUserGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            return this;
        }
        public String getUserGroupId() {
            return this.userGroupId;
        }

    }

}
