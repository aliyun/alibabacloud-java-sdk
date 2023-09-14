// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetRegistrationPolicyResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("LimitDetail")
    public java.util.List<GetRegistrationPolicyResponseBodyLimitDetail> limitDetail;

    @NameInMap("MatchMode")
    public String matchMode;

    @NameInMap("Name")
    public String name;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

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
        @NameInMap("All")
        public Integer all;

        @NameInMap("Mobile")
        public Integer mobile;

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
        @NameInMap("DeviceBelong")
        public String deviceBelong;

        @NameInMap("LimitCount")
        public GetRegistrationPolicyResponseBodyLimitDetailLimitCount limitCount;

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
