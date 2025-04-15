// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CheckVerifyLogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <strong>example:</strong>
     * <p>hksb7ba1b*********015d694361bee4</p>
     */
    @NameInMap("TransactionId")
    public String transactionId;

    public static CheckVerifyLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckVerifyLogRequest self = new CheckVerifyLogRequest();
        return TeaModel.build(map, self);
    }

    public CheckVerifyLogRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public CheckVerifyLogRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

}
