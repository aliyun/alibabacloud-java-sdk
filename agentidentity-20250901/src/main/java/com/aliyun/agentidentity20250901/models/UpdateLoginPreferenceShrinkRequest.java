// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateLoginPreferenceShrinkRequest extends TeaModel {
    @NameInMap("AllowedPostLogoutRedirectUris")
    public String allowedPostLogoutRedirectUrisShrink;

    /**
     * <p>The logon preference configuration object. It contains the logon configuration fields to be updated.</p>
     */
    @NameInMap("LoginPreference")
    public String loginPreferenceShrink;

    /**
     * <p>The name of the user pool.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent-userpool</p>
     */
    @NameInMap("UserPoolName")
    public String userPoolName;

    public static UpdateLoginPreferenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginPreferenceShrinkRequest self = new UpdateLoginPreferenceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLoginPreferenceShrinkRequest setAllowedPostLogoutRedirectUrisShrink(String allowedPostLogoutRedirectUrisShrink) {
        this.allowedPostLogoutRedirectUrisShrink = allowedPostLogoutRedirectUrisShrink;
        return this;
    }
    public String getAllowedPostLogoutRedirectUrisShrink() {
        return this.allowedPostLogoutRedirectUrisShrink;
    }

    public UpdateLoginPreferenceShrinkRequest setLoginPreferenceShrink(String loginPreferenceShrink) {
        this.loginPreferenceShrink = loginPreferenceShrink;
        return this;
    }
    public String getLoginPreferenceShrink() {
        return this.loginPreferenceShrink;
    }

    public UpdateLoginPreferenceShrinkRequest setUserPoolName(String userPoolName) {
        this.userPoolName = userPoolName;
        return this;
    }
    public String getUserPoolName() {
        return this.userPoolName;
    }

}
