// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetRegistrationPolicyResponseBody extends TeaModel {
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
     * <p>The list of limit details of the device registration policy.</p>
     */
    @NameInMap("LimitDetail")
    public java.util.List<GetRegistrationPolicyResponseBodyLimitDetail> limitDetail;

    /**
     * <p>The match mode of the policy. Valid values:</p>
     * <ul>
     * <li><strong>UserGroupAll</strong>: associated with all users.</li>
     * <li><strong>UserGroupNormal</strong>: associated with specific user groups.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UserGroupAll</p>
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
     * <p>The priority of the device registration policy. The value 0 indicates the highest priority, and the value 99 indicates the lowest priority.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("Priority")
    public Long priority;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>47363C2B-1AAA-5954-8847-0E50FCC54117</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the device registration policy. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: enabled.</li>
     * <li><strong>Disabled</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IDs of the user groups associated with the device registration policy. This parameter is valid when the match mode of the policy is <strong>UserGroupNormal</strong>.</p>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The list of whitelisted users in the device registration policy.</p>
     */
    @NameInMap("Whitelist")
    public java.util.List<String> whitelist;

    public static GetRegistrationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRegistrationPolicyResponseBody self = new GetRegistrationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRegistrationPolicyResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRegistrationPolicyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetRegistrationPolicyResponseBody setLimitDetail(java.util.List<GetRegistrationPolicyResponseBodyLimitDetail> limitDetail) {
        this.limitDetail = limitDetail;
        return this;
    }
    public java.util.List<GetRegistrationPolicyResponseBodyLimitDetail> getLimitDetail() {
        return this.limitDetail;
    }

    public GetRegistrationPolicyResponseBody setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public GetRegistrationPolicyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetRegistrationPolicyResponseBody setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public GetRegistrationPolicyResponseBody setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public GetRegistrationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRegistrationPolicyResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRegistrationPolicyResponseBody setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public GetRegistrationPolicyResponseBody setWhitelist(java.util.List<String> whitelist) {
        this.whitelist = whitelist;
        return this;
    }
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static class GetRegistrationPolicyResponseBodyLimitDetailLimitCount extends TeaModel {
        /**
         * <p>The total device registration limit. This parameter is valid when the device registration limit type is <strong>LimitAll</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <p>The number of mobile logins allowed by the device registration limit. This parameter is valid when the device registration limit type is <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
         * <p>The number of PC logins allowed by the device registration limit. This parameter is valid when the device registration limit type is <strong>LimitDiff</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PC")
        public Integer PC;

        public static GetRegistrationPolicyResponseBodyLimitDetailLimitCount build(java.util.Map<String, ?> map) throws Exception {
            GetRegistrationPolicyResponseBodyLimitDetailLimitCount self = new GetRegistrationPolicyResponseBodyLimitDetailLimitCount();
            return TeaModel.build(map, self);
        }

        public GetRegistrationPolicyResponseBodyLimitDetailLimitCount setAll(Integer all) {
            this.all = all;
            return this;
        }
        public Integer getAll() {
            return this.all;
        }

        public GetRegistrationPolicyResponseBodyLimitDetailLimitCount setMobile(Integer mobile) {
            this.mobile = mobile;
            return this;
        }
        public Integer getMobile() {
            return this.mobile;
        }

        public GetRegistrationPolicyResponseBodyLimitDetailLimitCount setPC(Integer PC) {
            this.PC = PC;
            return this;
        }
        public Integer getPC() {
            return this.PC;
        }

    }

    public static class GetRegistrationPolicyResponseBodyLimitDetail extends TeaModel {
        /**
         * <p>The ownership of the device. Valid values:</p>
         * <ul>
         * <li><strong>Company</strong>: company-owned device.</li>
         * <li><strong>Personal</strong>: personal device.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Personal</p>
         */
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        /**
         * <p>The device registration limit count.</p>
         */
        @NameInMap("LimitCount")
        public GetRegistrationPolicyResponseBodyLimitDetailLimitCount limitCount;

        /**
         * <p>The type of the device registration limit. Valid values:</p>
         * <ul>
         * <li><strong>Unlimited</strong>: no limit.</li>
         * <li><strong>LimitAll</strong>: limit by total count.</li>
         * <li><strong>LimitDiff</strong>: limit by terminal category.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LimitDiff</p>
         */
        @NameInMap("LimitType")
        public String limitType;

        public static GetRegistrationPolicyResponseBodyLimitDetail build(java.util.Map<String, ?> map) throws Exception {
            GetRegistrationPolicyResponseBodyLimitDetail self = new GetRegistrationPolicyResponseBodyLimitDetail();
            return TeaModel.build(map, self);
        }

        public GetRegistrationPolicyResponseBodyLimitDetail setDeviceBelong(String deviceBelong) {
            this.deviceBelong = deviceBelong;
            return this;
        }
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        public GetRegistrationPolicyResponseBodyLimitDetail setLimitCount(GetRegistrationPolicyResponseBodyLimitDetailLimitCount limitCount) {
            this.limitCount = limitCount;
            return this;
        }
        public GetRegistrationPolicyResponseBodyLimitDetailLimitCount getLimitCount() {
            return this.limitCount;
        }

        public GetRegistrationPolicyResponseBodyLimitDetail setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

    }

}
