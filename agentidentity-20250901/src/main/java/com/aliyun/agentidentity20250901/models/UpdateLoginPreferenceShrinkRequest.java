// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class UpdateLoginPreferenceShrinkRequest extends TeaModel {
    @NameInMap("LoginPreference")
    public String loginPreferenceShrink;

    @NameInMap("UserPoolName")
    public String userPoolName;

    public static UpdateLoginPreferenceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLoginPreferenceShrinkRequest self = new UpdateLoginPreferenceShrinkRequest();
        return TeaModel.build(map, self);
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
