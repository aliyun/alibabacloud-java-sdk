// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordComplexityConfigurationResponseBody extends TeaModel {
    /**
     * <p>The password complexity configurations.</p>
     */
    @NameInMap("PasswordComplexityConfiguration")
    public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration passwordComplexityConfiguration;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPasswordComplexityConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordComplexityConfigurationResponseBody self = new GetPasswordComplexityConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPasswordComplexityConfigurationResponseBody setPasswordComplexityConfiguration(GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration passwordComplexityConfiguration) {
        this.passwordComplexityConfiguration = passwordComplexityConfiguration;
        return this;
    }
    public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration getPasswordComplexityConfiguration() {
        return this.passwordComplexityConfiguration;
    }

    public GetPasswordComplexityConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules extends TeaModel {
        /**
         * <p>The type of the password check. Valid values:</p>
         * <br>
         * <p>*   inclusion_upper_case: The password must contain uppercase letters.</p>
         * <p>*   inclusion_lower_case: The password must contain lowercase letters.</p>
         * <p>*   inclusion_special_case: The password must contain one or more of the following special characters: @ % + \\ / \\" ! # $ ^ ? : , ( ) { } [ ] ~ - _ .</p>
         * <p>*   inclusion_number: The password must contain digits.</p>
         * <p>*   exclusion_username: The password cannot contain a username.</p>
         * <p>*   exclusion_email: The password cannot contain an email prefix.</p>
         * <p>*   exclusion_phone_number: The password cannot contain a mobile number.</p>
         * <p>*   exclusion_display_name: The password cannot contain a display name.</p>
         */
        @NameInMap("PasswordCheckType")
        public String passwordCheckType;

        public static GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules self = new GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules();
            return TeaModel.build(map, self);
        }

        public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules setPasswordCheckType(String passwordCheckType) {
            this.passwordCheckType = passwordCheckType;
            return this;
        }
        public String getPasswordCheckType() {
            return this.passwordCheckType;
        }

    }

    public static class GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration extends TeaModel {
        /**
         * <p>The password complexity rules.</p>
         */
        @NameInMap("PasswordComplexityRules")
        public java.util.List<GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules> passwordComplexityRules;

        /**
         * <p>The minimum number of characters in a password.</p>
         */
        @NameInMap("PasswordMinLength")
        public Integer passwordMinLength;

        public static GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration self = new GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration();
            return TeaModel.build(map, self);
        }

        public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration setPasswordComplexityRules(java.util.List<GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules> passwordComplexityRules) {
            this.passwordComplexityRules = passwordComplexityRules;
            return this;
        }
        public java.util.List<GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules> getPasswordComplexityRules() {
            return this.passwordComplexityRules;
        }

        public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration setPasswordMinLength(Integer passwordMinLength) {
            this.passwordMinLength = passwordMinLength;
            return this;
        }
        public Integer getPasswordMinLength() {
            return this.passwordMinLength;
        }

    }

}
