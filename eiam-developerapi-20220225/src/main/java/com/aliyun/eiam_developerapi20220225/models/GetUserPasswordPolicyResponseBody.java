// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserPasswordPolicyResponseBody extends TeaModel {
    // 密码修改周期, 单位毫秒，-1表示永不过期
    @NameInMap("activeCycle")
    public Long activeCycle;

    // 实例ID
    @NameInMap("instanceId")
    public String instanceId;

    // 密码最短长度，-1表示不限制
    @NameInMap("minLength")
    public Integer minLength;

    // 密码复杂项
    @NameInMap("passwordComplexityItem")
    public GetUserPasswordPolicyResponseBodyPasswordComplexityItem passwordComplexityItem;

    // 保留最近密码记录数
    @NameInMap("reservationCount")
    public Integer reservationCount;

    public static GetUserPasswordPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserPasswordPolicyResponseBody self = new GetUserPasswordPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserPasswordPolicyResponseBody setActiveCycle(Long activeCycle) {
        this.activeCycle = activeCycle;
        return this;
    }
    public Long getActiveCycle() {
        return this.activeCycle;
    }

    public GetUserPasswordPolicyResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetUserPasswordPolicyResponseBody setMinLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }
    public Integer getMinLength() {
        return this.minLength;
    }

    public GetUserPasswordPolicyResponseBody setPasswordComplexityItem(GetUserPasswordPolicyResponseBodyPasswordComplexityItem passwordComplexityItem) {
        this.passwordComplexityItem = passwordComplexityItem;
        return this;
    }
    public GetUserPasswordPolicyResponseBodyPasswordComplexityItem getPasswordComplexityItem() {
        return this.passwordComplexityItem;
    }

    public GetUserPasswordPolicyResponseBody setReservationCount(Integer reservationCount) {
        this.reservationCount = reservationCount;
        return this;
    }
    public Integer getReservationCount() {
        return this.reservationCount;
    }

    public static class GetUserPasswordPolicyResponseBodyPasswordComplexityItem extends TeaModel {
        // 是否包含小写字母
        @NameInMap("containLowerCase")
        public Boolean containLowerCase;

        // 是否包含数字
        @NameInMap("containNumber")
        public Boolean containNumber;

        // 是否包含特殊字符
        @NameInMap("containSpecialChar")
        public Boolean containSpecialChar;

        // 是否包含大写字母
        @NameInMap("containUpperCase")
        public Boolean containUpperCase;

        // 是否进行包含显示名检测
        @NameInMap("displayNameCheck")
        public Boolean displayNameCheck;

        // 是否进行email检测
        @NameInMap("emailCheck")
        public Boolean emailCheck;

        // 是否进行包含手机号检测
        @NameInMap("phoneCheck")
        public Boolean phoneCheck;

        // 是否进行包含用户名检测
        @NameInMap("usernameCheck")
        public Boolean usernameCheck;

        public static GetUserPasswordPolicyResponseBodyPasswordComplexityItem build(java.util.Map<String, ?> map) throws Exception {
            GetUserPasswordPolicyResponseBodyPasswordComplexityItem self = new GetUserPasswordPolicyResponseBodyPasswordComplexityItem();
            return TeaModel.build(map, self);
        }

        public GetUserPasswordPolicyResponseBodyPasswordComplexityItem setContainLowerCase(Boolean containLowerCase) {
            this.containLowerCase = containLowerCase;
            return this;
        }
        public Boolean getContainLowerCase() {
            return this.containLowerCase;
        }

        public GetUserPasswordPolicyResponseBodyPasswordComplexityItem setContainNumber(Boolean containNumber) {
            this.containNumber = containNumber;
            return this;
        }
        public Boolean getContainNumber() {
            return this.containNumber;
        }

        public GetUserPasswordPolicyResponseBodyPasswordComplexityItem setContainSpecialChar(Boolean containSpecialChar) {
            this.containSpecialChar = containSpecialChar;
            return this;
        }
        public Boolean getContainSpecialChar() {
            return this.containSpecialChar;
        }

        public GetUserPasswordPolicyResponseBodyPasswordComplexityItem setContainUpperCase(Boolean containUpperCase) {
            this.containUpperCase = containUpperCase;
            return this;
        }
        public Boolean getContainUpperCase() {
            return this.containUpperCase;
        }

        public GetUserPasswordPolicyResponseBodyPasswordComplexityItem setDisplayNameCheck(Boolean displayNameCheck) {
            this.displayNameCheck = displayNameCheck;
            return this;
        }
        public Boolean getDisplayNameCheck() {
            return this.displayNameCheck;
        }

        public GetUserPasswordPolicyResponseBodyPasswordComplexityItem setEmailCheck(Boolean emailCheck) {
            this.emailCheck = emailCheck;
            return this;
        }
        public Boolean getEmailCheck() {
            return this.emailCheck;
        }

        public GetUserPasswordPolicyResponseBodyPasswordComplexityItem setPhoneCheck(Boolean phoneCheck) {
            this.phoneCheck = phoneCheck;
            return this;
        }
        public Boolean getPhoneCheck() {
            return this.phoneCheck;
        }

        public GetUserPasswordPolicyResponseBodyPasswordComplexityItem setUsernameCheck(Boolean usernameCheck) {
            this.usernameCheck = usernameCheck;
            return this;
        }
        public Boolean getUsernameCheck() {
            return this.usernameCheck;
        }

    }

}
