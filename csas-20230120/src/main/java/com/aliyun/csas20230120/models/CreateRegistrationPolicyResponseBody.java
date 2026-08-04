// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateRegistrationPolicyResponseBody extends TeaModel {
    /**
     * <p>The device registration policy.</p>
     */
    @NameInMap("Policy")
    public CreateRegistrationPolicyResponseBodyPolicy policy;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FEF1144C-95D1-5F7C-81EF-9DB70EA49FCE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRegistrationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistrationPolicyResponseBody self = new CreateRegistrationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRegistrationPolicyResponseBody setPolicy(CreateRegistrationPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public CreateRegistrationPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public CreateRegistrationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount extends TeaModel {
        /**
         * <p>The total restriction count for device registration. This parameter takes effect only when LimitType is set to <strong>LimitAll</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <p>The restriction count for mobile logins. This parameter takes effect only when LimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
         * <p>The restriction count for PC logins. This parameter takes effect only when LimitType is set to <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PC")
        public Integer PC;

        public static CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount build(java.util.Map<String, ?> map) throws Exception {
            CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount self = new CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount();
            return TeaModel.build(map, self);
        }

        public CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount setAll(Integer all) {
            this.all = all;
            return this;
        }
        public Integer getAll() {
            return this.all;
        }

        public CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount setMobile(Integer mobile) {
            this.mobile = mobile;
            return this;
        }
        public Integer getMobile() {
            return this.mobile;
        }

        public CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount setPC(Integer PC) {
            this.PC = PC;
            return this;
        }
        public Integer getPC() {
            return this.PC;
        }

    }

    public static class CreateRegistrationPolicyResponseBodyPolicyLimitDetail extends TeaModel {
        /**
         * <p>The ownership of the device. Valid values:</p>
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
         * <p>The restriction count for device registration.</p>
         */
        @NameInMap("LimitCount")
        public CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount limitCount;

        /**
         * <p>The restriction type for device registration. Valid values:</p>
         * <ul>
         * <li><p><strong>Unlimited</strong>: No restrictions.</p>
         * </li>
         * <li><p><strong>LimitAll</strong>: Limit by total count.</p>
         * </li>
         * <li><p><strong>LimitDiff</strong>: Limit by device category.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LimitDiff</p>
         */
        @NameInMap("LimitType")
        public String limitType;

        public static CreateRegistrationPolicyResponseBodyPolicyLimitDetail build(java.util.Map<String, ?> map) throws Exception {
            CreateRegistrationPolicyResponseBodyPolicyLimitDetail self = new CreateRegistrationPolicyResponseBodyPolicyLimitDetail();
            return TeaModel.build(map, self);
        }

        public CreateRegistrationPolicyResponseBodyPolicyLimitDetail setDeviceBelong(String deviceBelong) {
            this.deviceBelong = deviceBelong;
            return this;
        }
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        public CreateRegistrationPolicyResponseBodyPolicyLimitDetail setLimitCount(CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount limitCount) {
            this.limitCount = limitCount;
            return this;
        }
        public CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount getLimitCount() {
            return this.limitCount;
        }

        public CreateRegistrationPolicyResponseBodyPolicyLimitDetail setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

    }

    public static class CreateRegistrationPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <p>The time when the device registration policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>A description of the device registration policy.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条设备注册策略</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The list of device registration limits.</p>
         */
        @NameInMap("LimitDetail")
        public java.util.List<CreateRegistrationPolicyResponseBodyPolicyLimitDetail> limitDetail;

        /**
         * <p>The target type for policy matching. Valid values:</p>
         * <ul>
         * <li><p><strong>UserGroupAll</strong>: Apply to all users.</p>
         * </li>
         * <li><p><strong>UserGroupNormal</strong>: Apply to selected user groups.</p>
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
         * <p>The priority of the device registration policy. A value of 0 indicates the highest priority. A value of 99 indicates the lowest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

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
         * <p>The IDs of user groups to which the device registration policy applies. This field has a value only when MatchMode is set to <strong>UserGroupNormal</strong>.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The list of usernames in the whitelist for the device registration policy.</p>
         */
        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static CreateRegistrationPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateRegistrationPolicyResponseBodyPolicy self = new CreateRegistrationPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public CreateRegistrationPolicyResponseBodyPolicy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateRegistrationPolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateRegistrationPolicyResponseBodyPolicy setLimitDetail(java.util.List<CreateRegistrationPolicyResponseBodyPolicyLimitDetail> limitDetail) {
            this.limitDetail = limitDetail;
            return this;
        }
        public java.util.List<CreateRegistrationPolicyResponseBodyPolicyLimitDetail> getLimitDetail() {
            return this.limitDetail;
        }

        public CreateRegistrationPolicyResponseBodyPolicy setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public CreateRegistrationPolicyResponseBodyPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateRegistrationPolicyResponseBodyPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public CreateRegistrationPolicyResponseBodyPolicy setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public CreateRegistrationPolicyResponseBodyPolicy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateRegistrationPolicyResponseBodyPolicy setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public CreateRegistrationPolicyResponseBodyPolicy setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
