// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateLoginPreferenceRequest extends TeaModel {
    @NameInMap("LoginPreference")
    public UpdateLoginPreferenceRequestLoginPreference loginPreference;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static UpdateLoginPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginPreferenceRequest self = new UpdateLoginPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoginPreferenceRequest setLoginPreference(UpdateLoginPreferenceRequestLoginPreference loginPreference) {
        this.loginPreference = loginPreference;
        return this;
    }
    public UpdateLoginPreferenceRequestLoginPreference getLoginPreference() {
        return this.loginPreference;
    }

    public UpdateLoginPreferenceRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

    public static class UpdateLoginPreferenceRequestLoginPreference extends TeaModel {
        @NameInMap("EnablePasswordLogin")
        public Boolean enablePasswordLogin;

        public static UpdateLoginPreferenceRequestLoginPreference build(java.util.Map<String, ?> map) throws Exception {
            UpdateLoginPreferenceRequestLoginPreference self = new UpdateLoginPreferenceRequestLoginPreference();
            return TeaModel.build(map, self);
        }

        public UpdateLoginPreferenceRequestLoginPreference setEnablePasswordLogin(Boolean enablePasswordLogin) {
            this.enablePasswordLogin = enablePasswordLogin;
            return this;
        }
        public Boolean getEnablePasswordLogin() {
            return this.enablePasswordLogin;
        }

    }

}
