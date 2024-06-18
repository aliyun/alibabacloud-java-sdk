// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRegistrationPoliciesForUserGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("All")
        public String all;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        @NameInMap("LimitCount")
        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount limitCount;

        /**
         * <strong>example:</strong>
         * <p>LimitAll</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("LimitDetail")
        public java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail> limitDetail;

        /**
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <strong>example:</strong>
         * <p>registration_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>reg-policy-dcbfd33cb004****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>usergroup-6f1ef2fc56b6****</p>
         */
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
