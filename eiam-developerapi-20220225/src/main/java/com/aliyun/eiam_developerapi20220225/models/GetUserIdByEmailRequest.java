// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByEmailRequest extends TeaModel {
    /**
     * <p>The email address of the user who owns the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:example@example.com">example@example.com</a></p>
     */
    @NameInMap("email")
    public String email;

    public static GetUserIdByEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByEmailRequest self = new GetUserIdByEmailRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdByEmailRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

}
