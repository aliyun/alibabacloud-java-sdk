// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetPasswordComplexityConfigurationResponseBody extends TeaModel {
    @NameInMap("PasswordComplexityConfiguration")
    public GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfiguration passwordComplexityConfiguration;

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
        @NameInMap("PasswordComplexityRules")
        public java.util.List<GetPasswordComplexityConfigurationResponseBodyPasswordComplexityConfigurationPasswordComplexityRules> passwordComplexityRules;

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
