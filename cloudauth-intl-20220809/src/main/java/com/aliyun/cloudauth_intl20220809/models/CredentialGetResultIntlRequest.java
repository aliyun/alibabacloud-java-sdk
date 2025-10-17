// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialGetResultIntlRequest extends TeaModel {
    /**
     * <p>Unique identifier for the authentication request</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4ab0b***abde97</p>
     */
    @NameInMap("TransactionId")
    public String transactionId;

    public static CredentialGetResultIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        CredentialGetResultIntlRequest self = new CredentialGetResultIntlRequest();
        return TeaModel.build(map, self);
    }

    public CredentialGetResultIntlRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
