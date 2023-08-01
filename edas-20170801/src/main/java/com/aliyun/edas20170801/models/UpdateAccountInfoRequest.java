// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateAccountInfoRequest extends TeaModel {
    /**
     * <p>The email address of the account.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The name of the account.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The contact information of the account.</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    public static UpdateAccountInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountInfoRequest self = new UpdateAccountInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccountInfoRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateAccountInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAccountInfoRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

}
