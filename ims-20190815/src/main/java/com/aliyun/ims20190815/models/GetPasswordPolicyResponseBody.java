// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetPasswordPolicyResponseBody extends TeaModel {
    /**
     * <p>The password strength policy information.</p>
     */
    @NameInMap("PasswordPolicy")
    public GetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BDAA8408-E67C-428B-BFF0-1B2AC05C9610</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPasswordPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordPolicyResponseBody self = new GetPasswordPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPasswordPolicyResponseBody setPasswordPolicy(GetPasswordPolicyResponseBodyPasswordPolicy passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
        return this;
    }
    public GetPasswordPolicyResponseBodyPasswordPolicy getPasswordPolicy() {
        return this.passwordPolicy;
    }

    public GetPasswordPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPasswordPolicyResponseBodyPasswordPolicy extends TeaModel {
        /**
         * <p>Indicates whether logon is restricted after the password expires.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HardExpire")
        public Boolean hardExpire;

        /**
         * <p>The validity period of the initial password.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("InitialPasswordAge")
        public Integer initialPasswordAge;

        /**
         * <p>Indicates whether to block threat passwords when a password is set using OpenAPI.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true: Threat passwords are blocked when you set a password using OpenAPI.</p>
         * </li>
         * <li><p>false: Threat passwords are not blocked when you set a password using OpenAPI.</p>
         * </li>
         * </ul>
         * <p>Default value: false</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InterceptRiskPasswordOnApi")
        public Boolean interceptRiskPasswordOnApi;

        /**
         * <p>The maximum number of logon attempts.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxLoginAttemps")
        public Integer maxLoginAttemps;

        /**
         * <p>The password validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxPasswordAge")
        public Integer maxPasswordAge;

        /**
         * <p>The minimum number of different characters in the password.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinimumPasswordDifferentCharacter")
        public Integer minimumPasswordDifferentCharacter;

        /**
         * <p>The minimum password length.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MinimumPasswordLength")
        public Integer minimumPasswordLength;

        /**
         * <p>Indicates whether the password must not contain the username.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("PasswordNotContainUserName")
        public Boolean passwordNotContainUserName;

        /**
         * <p>The password reuse prevention policy.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PasswordReusePrevention")
        public Integer passwordReusePrevention;

        /**
         * <p>Indicates whether the password must contain lowercase letters.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RequireLowercaseCharacters")
        public Boolean requireLowercaseCharacters;

        /**
         * <p>Indicates whether the password must contain numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RequireNumbers")
        public Boolean requireNumbers;

        /**
         * <p>Indicates whether the password must contain symbols.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RequireSymbols")
        public Boolean requireSymbols;

        /**
         * <p>Indicates whether the password must contain uppercase letters.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("RequireUppercaseCharacters")
        public Boolean requireUppercaseCharacters;

        public static GetPasswordPolicyResponseBodyPasswordPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetPasswordPolicyResponseBodyPasswordPolicy self = new GetPasswordPolicyResponseBodyPasswordPolicy();
            return TeaModel.build(map, self);
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setHardExpire(Boolean hardExpire) {
            this.hardExpire = hardExpire;
            return this;
        }
        public Boolean getHardExpire() {
            return this.hardExpire;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setInitialPasswordAge(Integer initialPasswordAge) {
            this.initialPasswordAge = initialPasswordAge;
            return this;
        }
        public Integer getInitialPasswordAge() {
            return this.initialPasswordAge;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setInterceptRiskPasswordOnApi(Boolean interceptRiskPasswordOnApi) {
            this.interceptRiskPasswordOnApi = interceptRiskPasswordOnApi;
            return this;
        }
        public Boolean getInterceptRiskPasswordOnApi() {
            return this.interceptRiskPasswordOnApi;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMaxLoginAttemps(Integer maxLoginAttemps) {
            this.maxLoginAttemps = maxLoginAttemps;
            return this;
        }
        public Integer getMaxLoginAttemps() {
            return this.maxLoginAttemps;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMaxPasswordAge(Integer maxPasswordAge) {
            this.maxPasswordAge = maxPasswordAge;
            return this;
        }
        public Integer getMaxPasswordAge() {
            return this.maxPasswordAge;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMinimumPasswordDifferentCharacter(Integer minimumPasswordDifferentCharacter) {
            this.minimumPasswordDifferentCharacter = minimumPasswordDifferentCharacter;
            return this;
        }
        public Integer getMinimumPasswordDifferentCharacter() {
            return this.minimumPasswordDifferentCharacter;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setMinimumPasswordLength(Integer minimumPasswordLength) {
            this.minimumPasswordLength = minimumPasswordLength;
            return this;
        }
        public Integer getMinimumPasswordLength() {
            return this.minimumPasswordLength;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setPasswordNotContainUserName(Boolean passwordNotContainUserName) {
            this.passwordNotContainUserName = passwordNotContainUserName;
            return this;
        }
        public Boolean getPasswordNotContainUserName() {
            return this.passwordNotContainUserName;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setPasswordReusePrevention(Integer passwordReusePrevention) {
            this.passwordReusePrevention = passwordReusePrevention;
            return this;
        }
        public Integer getPasswordReusePrevention() {
            return this.passwordReusePrevention;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireLowercaseCharacters(Boolean requireLowercaseCharacters) {
            this.requireLowercaseCharacters = requireLowercaseCharacters;
            return this;
        }
        public Boolean getRequireLowercaseCharacters() {
            return this.requireLowercaseCharacters;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireNumbers(Boolean requireNumbers) {
            this.requireNumbers = requireNumbers;
            return this;
        }
        public Boolean getRequireNumbers() {
            return this.requireNumbers;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireSymbols(Boolean requireSymbols) {
            this.requireSymbols = requireSymbols;
            return this;
        }
        public Boolean getRequireSymbols() {
            return this.requireSymbols;
        }

        public GetPasswordPolicyResponseBodyPasswordPolicy setRequireUppercaseCharacters(Boolean requireUppercaseCharacters) {
            this.requireUppercaseCharacters = requireUppercaseCharacters;
            return this;
        }
        public Boolean getRequireUppercaseCharacters() {
            return this.requireUppercaseCharacters;
        }

    }

}
