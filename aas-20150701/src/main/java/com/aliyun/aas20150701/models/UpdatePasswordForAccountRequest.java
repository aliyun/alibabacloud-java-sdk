// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class UpdatePasswordForAccountRequest extends TeaModel {
    @NameInMap("NewPassword")
    public String newPassword;

    @NameInMap("PK")
    public String PK;

    public static UpdatePasswordForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePasswordForAccountRequest self = new UpdatePasswordForAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePasswordForAccountRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
    public String getNewPassword() {
        return this.newPassword;
    }

    public UpdatePasswordForAccountRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
