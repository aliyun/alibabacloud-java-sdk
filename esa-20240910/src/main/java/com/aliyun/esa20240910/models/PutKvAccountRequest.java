// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static PutKvAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        PutKvAccountRequest self = new PutKvAccountRequest();
        return TeaModel.build(map, self);
    }

    public PutKvAccountRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public PutKvAccountRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
