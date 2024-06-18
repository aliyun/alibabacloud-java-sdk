// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateRegistrationPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public UpdateRegistrationPolicyResponseBodyPolicy policy;

    /**
     * <strong>example:</strong>
     * <p>27064ECA-0936-59F3-8A98-EC821E5BD08F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRegistrationPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRegistrationPolicyResponseBody self = new UpdateRegistrationPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRegistrationPolicyResponseBody setPolicy(UpdateRegistrationPolicyResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public UpdateRegistrationPolicyResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public UpdateRegistrationPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("All")
        public Integer all;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Mobile")
        public Integer mobile;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PC")
        public Integer PC;

        public static UpdateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount build(java.util.Map<String, ?> map) throws Exception {
            UpdateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount self = new UpdateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount();
            return TeaModel.build(map, self);
        }

        public UpdateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount setAll(Integer all) {
            this.all = all;
            return this;
        }
        public Integer getAll() {
            return this.all;
        }

        public UpdateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount setMobile(Integer mobile) {
            this.mobile = mobile;
            return this;
        }
        public Integer getMobile() {
            return this.mobile;
        }

        public UpdateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount setPC(Integer PC) {
            this.PC = PC;
            return this;
        }
        public Integer getPC() {
            return this.PC;
        }

    }

    public static class UpdateRegistrationPolicyResponseBodyPolicyLimitDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Company</p>
         */
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        @NameInMap("LimitCount")
        public UpdateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount limitCount;

        /**
         * <strong>example:</strong>
         * <p>LimitAll</p>
         */
        @NameInMap("LimitType")
        public String limitType;

        public static UpdateRegistrationPolicyResponseBodyPolicyLimitDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateRegistrationPolicyResponseBodyPolicyLimitDetail self = new UpdateRegistrationPolicyResponseBodyPolicyLimitDetail();
            return TeaModel.build(map, self);
        }

        public UpdateRegistrationPolicyResponseBodyPolicyLimitDetail setDeviceBelong(String deviceBelong) {
            this.deviceBelong = deviceBelong;
            return this;
        }
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        public UpdateRegistrationPolicyResponseBodyPolicyLimitDetail setLimitCount(UpdateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount limitCount) {
            this.limitCount = limitCount;
            return this;
        }
        public UpdateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount getLimitCount() {
            return this.limitCount;
        }

        public UpdateRegistrationPolicyResponseBodyPolicyLimitDetail setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

    }

    public static class UpdateRegistrationPolicyResponseBodyPolicy extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-05-16 17:18:46</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("LimitDetail")
        public java.util.List<UpdateRegistrationPolicyResponseBodyPolicyLimitDetail> limitDetail;

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

        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        @NameInMap("Whitelist")
        public java.util.List<String> whitelist;

        public static UpdateRegistrationPolicyResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateRegistrationPolicyResponseBodyPolicy self = new UpdateRegistrationPolicyResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateRegistrationPolicyResponseBodyPolicy setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateRegistrationPolicyResponseBodyPolicy setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateRegistrationPolicyResponseBodyPolicy setLimitDetail(java.util.List<UpdateRegistrationPolicyResponseBodyPolicyLimitDetail> limitDetail) {
            this.limitDetail = limitDetail;
            return this;
        }
        public java.util.List<UpdateRegistrationPolicyResponseBodyPolicyLimitDetail> getLimitDetail() {
            return this.limitDetail;
        }

        public UpdateRegistrationPolicyResponseBodyPolicy setMatchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }
        public String getMatchMode() {
            return this.matchMode;
        }

        public UpdateRegistrationPolicyResponseBodyPolicy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateRegistrationPolicyResponseBodyPolicy setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public UpdateRegistrationPolicyResponseBodyPolicy setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public UpdateRegistrationPolicyResponseBodyPolicy setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateRegistrationPolicyResponseBodyPolicy setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public UpdateRegistrationPolicyResponseBodyPolicy setWhitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

    }

}
