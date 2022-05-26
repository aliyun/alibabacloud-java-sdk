// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CreateAccountProfileInfoRequest extends TeaModel {
    @NameInMap("AccountJson")
    public String accountJson;

    public static CreateAccountProfileInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountProfileInfoRequest self = new CreateAccountProfileInfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountProfileInfoRequest setAccountJson(String accountJson) {
        this.accountJson = accountJson;
        return this;
    }
    public String getAccountJson() {
        return this.accountJson;
    }

}
