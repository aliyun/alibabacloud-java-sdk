// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateRegistrationPolicyResponseBody extends TeaModel {
    @NameInMap("Policy")
    public CreateRegistrationPolicyResponseBodyPolicy policy;

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
        @NameInMap("All")
        public Integer all;

        @NameInMap("Mobile")
        public Integer mobile;

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
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        @NameInMap("LimitCount")
        public CreateRegistrationPolicyResponseBodyPolicyLimitDetailLimitCount limitCount;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("LimitDetail")
        public java.util.List<CreateRegistrationPolicyResponseBodyPolicyLimitDetail> limitDetail;

        @NameInMap("MatchMode")
        public String matchMode;

        @NameInMap("Name")
        public String name;

        @NameInMap("PolicyId")
        public String policyId;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

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
