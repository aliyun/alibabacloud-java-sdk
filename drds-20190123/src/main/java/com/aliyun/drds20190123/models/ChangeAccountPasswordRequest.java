// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeAccountPasswordRequest extends TeaModel {
    /**
     * <p>The name of the member account.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The ID of the DRDS instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>The new password.</p>
     */
    @NameInMap("Password")
    public String password;

    public static ChangeAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeAccountPasswordRequest self = new ChangeAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ChangeAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ChangeAccountPasswordRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ChangeAccountPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
