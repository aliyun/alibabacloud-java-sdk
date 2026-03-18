// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ValidateAuthenticationTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("active")
    public Boolean active;

    public static ValidateAuthenticationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateAuthenticationTokenResponseBody self = new ValidateAuthenticationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateAuthenticationTokenResponseBody setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

}
