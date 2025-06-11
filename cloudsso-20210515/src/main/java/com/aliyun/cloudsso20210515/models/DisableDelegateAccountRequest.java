// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DisableDelegateAccountRequest extends TeaModel {
    /**
     * <p>The ID of the delegated administrator account of CloudSSO.</p>
     * 
     * <strong>example:</strong>
     * <p>1200971777065046</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    public static DisableDelegateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDelegateAccountRequest self = new DisableDelegateAccountRequest();
        return TeaModel.build(map, self);
    }

    public DisableDelegateAccountRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
