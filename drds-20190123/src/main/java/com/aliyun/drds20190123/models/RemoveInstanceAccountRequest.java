// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveInstanceAccountRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    public static RemoveInstanceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceAccountRequest self = new RemoveInstanceAccountRequest();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceAccountRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public RemoveInstanceAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
