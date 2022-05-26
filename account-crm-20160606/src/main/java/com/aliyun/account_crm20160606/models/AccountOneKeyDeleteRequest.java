// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AccountOneKeyDeleteRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Pk")
    public String pk;

    public static AccountOneKeyDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        AccountOneKeyDeleteRequest self = new AccountOneKeyDeleteRequest();
        return TeaModel.build(map, self);
    }

    public AccountOneKeyDeleteRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AccountOneKeyDeleteRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
