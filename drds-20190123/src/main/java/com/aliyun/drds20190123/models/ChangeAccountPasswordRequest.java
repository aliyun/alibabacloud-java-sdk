// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeAccountPasswordRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("Password")
    @Validation(required = true)
    public String password;

    public static ChangeAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAccountPasswordRequest self = new ChangeAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAccountPasswordRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ChangeAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ChangeAccountPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
