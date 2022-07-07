// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CheckAccountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("Name")
    public String name;

    public static CheckAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountRequest self = new CheckAccountRequest();
        return TeaModel.build(map, self);
    }

    public CheckAccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public CheckAccountRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
