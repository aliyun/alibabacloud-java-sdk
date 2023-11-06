// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RemoveInstanceAccountRequest extends TeaModel {
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

    public static RemoveInstanceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveInstanceAccountRequest self = new RemoveInstanceAccountRequest();
        return TeaModel.build(map, self);
    }

    public RemoveInstanceAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public RemoveInstanceAccountRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
