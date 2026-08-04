// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRegistrationPoliciesForUserGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of user groups.</p>
     */
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
         * <p>The total number of allowed device registrations. This field is valid only when LimitType is set to <strong>LimitAll</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("All")
        public String all;

        /**
         * <p>The number of allowed mobile logons. This field is valid only when LimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>The number of allowed PC logons. This field is valid only when LimitType is set to <strong>LimitDiff</strong>.</p>
         * 
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
         * <p>Device ownership. Valid values:</p>
         * <ul>
         * <li><p><strong>Company</strong>: Company-owned device.</p>
         * </li>
         * <li><p><strong>Personal</strong>: Personal device.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        /**
         * <p>The number of allowed device registrations.</p>
         */
        @NameInMap("LimitCount")
        public ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetailLimitCount limitCount;

        /**
         * <p>The device registration limit type. Valid values:</p>
         * <ul>
         * <li><p><strong>Unlimited</strong>: No limit.</p>
         * </li>
         * <li><p><strong>LimitAll</strong>: Limit by total count.</p>
         * </li>
         * <li><p><strong>LimitDiff</strong>: Limit by device category.</p>
         * </li>
         * </ul>
         * 
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
         * <p>The time when the device registration policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the device registration policy.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条设备注册策略。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of device registration policy limit details.</p>
         */
        @NameInMap("LimitDetail")
        public java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPoliciesLimitDetail> limitDetail;

        /**
         * <p>The target type for policy matching. Valid values:</p>
         * <ul>
         * <li><p><strong>UserGroupAll</strong>: Associate with all users.</p>
         * </li>
         * <li><p><strong>UserGroupNormal</strong>: Associate with specific user groups.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        @NameInMap("MatchMode")
        public String matchMode;

        /**
         * <p>The name of the device registration policy.</p>
         * 
         * <strong>example:</strong>
         * <p>registration_policy_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the device registration policy.</p>
         * 
         * <strong>example:</strong>
         * <p>reg-policy-dcbfd33cb004****</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <p>The policy priority. The number 0 indicates the highest priority. The number 99 indicates the lowest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>The status of the device registration policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of users on the device registration policy whitelist.</p>
         */
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
        /**
         * <p>The collection of device registration policies.</p>
         */
        @NameInMap("Policies")
        public java.util.List<ListRegistrationPoliciesForUserGroupResponseBodyUserGroupsPolicies> policies;

        /**
         * <p>The user group ID.</p>
         * 
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
