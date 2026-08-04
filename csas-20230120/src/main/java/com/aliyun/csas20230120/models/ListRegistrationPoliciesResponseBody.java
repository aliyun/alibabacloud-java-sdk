// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRegistrationPoliciesResponseBody extends TeaModel {
    /**
     * <p>The list of device registration policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<ListRegistrationPoliciesResponseBodyPolicies> policies;

    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>7A8FE38A-E29C-5678-B84A-FEDBCB83552F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of device registration policies.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The total number of device registration limits. This field is valid when the device registration limit type is <strong>LimitAll</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <p>The number of mobile client log ons allowed for device registration. This field is valid when the device registration limit type is <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
         * <p>The number of PC client log ons allowed for device registration. This field is valid when the device registration limit type is <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>The device ownership. Valid values:</p>
         * <ul>
         * <li><p><strong>Company</strong>: Company device.</p>
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
         * <p>The number of device registration limits.</p>
         */
        @NameInMap("LimitCount")
        public ListRegistrationPoliciesResponseBodyPoliciesLimitDetailLimitCount limitCount;

        /**
         * <p>The type of device registration limit. Valid values:</p>
         * <ul>
         * <li><p><strong>Unlimited</strong>: No limit.</p>
         * </li>
         * <li><p><strong>LimitAll</strong>: Limit by total number.</p>
         * </li>
         * <li><p><strong>LimitDiff</strong>: Limit by device categorization.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LimitAll</p>
         */
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
        /**
         * <p>The creation time of the device registration policy.</p>
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
        public java.util.List<ListRegistrationPoliciesResponseBodyPoliciesLimitDetail> limitDetail;

        /**
         * <p>The policy matching target type. Valid values:</p>
         * <ul>
         * <li><p><strong>UserGroupAll</strong>: Associate all users.</p>
         * </li>
         * <li><p><strong>UserGroupNormal</strong>: Associate some user groups.</p>
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
         * <p>The policy priority for device registration. A value of 0 indicates the highest priority, and 99 indicates the lowest priority.</p>
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
         * <p>A collection of user group IDs for the device registration policy. This field has a value when the policy matching target type is <strong>UserGroupNormal</strong>.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The whitelist of users for the device registration policy.</p>
         */
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
