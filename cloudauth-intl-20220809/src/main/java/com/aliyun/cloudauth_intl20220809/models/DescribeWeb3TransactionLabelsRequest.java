// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeWeb3TransactionLabelsRequest extends TeaModel {
    /**
     * <p>This is the short name of blockchain。</p>
     * <p>[ ETH, MATIC, BNB ]</p>
     */
    @NameInMap("ChainShortName")
    public String chainShortName;

    /**
     * <p>A unique business ID for tracing purpose. For example，the sequence ID from the merchant\"s business-related database.</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The Transaction hash.</p>
     */
    @NameInMap("Transaction")
    public String transaction;

    public static DescribeWeb3TransactionLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWeb3TransactionLabelsRequest self = new DescribeWeb3TransactionLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWeb3TransactionLabelsRequest setChainShortName(String chainShortName) {
        this.chainShortName = chainShortName;
        return this;
    }
    public String getChainShortName() {
        return this.chainShortName;
    }

    public DescribeWeb3TransactionLabelsRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DescribeWeb3TransactionLabelsRequest setTransaction(String transaction) {
        this.transaction = transaction;
        return this;
    }
    public String getTransaction() {
        return this.transaction;
    }

}
