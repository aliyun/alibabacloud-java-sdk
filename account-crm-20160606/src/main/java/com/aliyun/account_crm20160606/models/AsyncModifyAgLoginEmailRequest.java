// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AsyncModifyAgLoginEmailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mpk")
    public String mpk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NewLoginEmail")
    public String newLoginEmail;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Pk")
    public String pk;

    public static AsyncModifyAgLoginEmailRequest build(java.util.Map<String, ?> map) throws Exception {
        AsyncModifyAgLoginEmailRequest self = new AsyncModifyAgLoginEmailRequest();
        return TeaModel.build(map, self);
    }

    public AsyncModifyAgLoginEmailRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public AsyncModifyAgLoginEmailRequest setNewLoginEmail(String newLoginEmail) {
        this.newLoginEmail = newLoginEmail;
        return this;
    }
    public String getNewLoginEmail() {
        return this.newLoginEmail;
    }

    public AsyncModifyAgLoginEmailRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
