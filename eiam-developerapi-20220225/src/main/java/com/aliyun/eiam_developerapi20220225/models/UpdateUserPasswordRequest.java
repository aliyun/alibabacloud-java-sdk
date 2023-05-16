// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class UpdateUserPasswordRequest extends TeaModel {
    @NameInMap("password")
    public String password;

    public static UpdateUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserPasswordRequest self = new UpdateUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
