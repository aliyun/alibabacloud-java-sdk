// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateLoginPreferenceRequest extends TeaModel {
    @NameInMap("AllowedPostLogoutRedirectUris")
    public java.util.List<String> allowedPostLogoutRedirectUris;

    /**
     * <p>The logon preference configuration object. It contains the logon configuration fields to be updated.</p>
     */
    @NameInMap("LoginPreference")
    public UpdateLoginPreferenceRequestLoginPreference loginPreference;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static UpdateLoginPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginPreferenceRequest self = new UpdateLoginPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoginPreferenceRequest setAllowedPostLogoutRedirectUris(java.util.List<String> allowedPostLogoutRedirectUris) {
        this.allowedPostLogoutRedirectUris = allowedPostLogoutRedirectUris;
        return this;
    }
    public java.util.List<String> getAllowedPostLogoutRedirectUris() {
        return this.allowedPostLogoutRedirectUris;
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
        /**
         * <p>Specifies whether to enable password logon for users.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
