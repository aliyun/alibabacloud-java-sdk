// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeWeb3RiskScoreRequest extends TeaModel {
    /**
     * <p>This is the short name of blockchain。</p>
     * <p>[ ETH, MATIC, BNB ]</p>
     */
    @NameInMap("ChainShortName")
    public String chainShortName;

    /**
     * <p>minimum: 1</p>
     * <p>maximum: 100</p>
     * <p>the maximum depth for risk analysis. For UTXO-based blockchains, default and maximum is enforced at 100.</p>
     * <p>For account-based blockchains, default and maximum is enforced at 6</p>
     */
    @NameInMap("Depth")
    public Integer depth;

    /**
     * <p>A unique business ID for tracing purpose. For example，the sequence ID from the merchant\"s business-related database.</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>For TRANSACTION objects, you need to provide the transaction hash。</p>
     * <p>For ADDRESS objects, you need to provide the address or reference address hash。</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The object of the analysis.</p>
     * <p>[ TRANSACTION, ADDRESS ]</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    public static DescribeWeb3RiskScoreRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWeb3RiskScoreRequest self = new DescribeWeb3RiskScoreRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWeb3RiskScoreRequest setChainShortName(String chainShortName) {
        this.chainShortName = chainShortName;
        return this;
    }
    public String getChainShortName() {
        return this.chainShortName;
    }

    public DescribeWeb3RiskScoreRequest setDepth(Integer depth) {
        this.depth = depth;
        return this;
    }
    public Integer getDepth() {
        return this.depth;
    }

    public DescribeWeb3RiskScoreRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DescribeWeb3RiskScoreRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public DescribeWeb3RiskScoreRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

}
