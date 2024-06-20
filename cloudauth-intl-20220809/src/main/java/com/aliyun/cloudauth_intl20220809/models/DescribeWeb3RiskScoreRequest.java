// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DescribeWeb3RiskScoreRequest extends TeaModel {
    /**
     * <p>This is the short name of blockchain。
     * [ ETH, MATIC, BNB ]</p>
     * 
     * <strong>example:</strong>
     * <p>ETH</p>
     */
    @NameInMap("ChainShortName")
    public String chainShortName;

    /**
     * <p>minimum: 1
     * maximum: 100
     * the maximum depth for risk analysis. For UTXO-based blockchains, default and maximum is enforced at 100.
     * For account-based blockchains, default and maximum is enforced at 6</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Depth")
    public Integer depth;

    /**
     * <p>A unique business ID for tracing purpose. For example，the sequence ID from the merchant\&quot;s business-related database.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>For TRANSACTION objects, you need to provide the transaction hash。
     * For ADDRESS objects, you need to provide the address or reference address hash。</p>
     * 
     * <strong>example:</strong>
     * <p>0000980145045a5c5acad3d2df0cf3b2afxxxxxx</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The object of the analysis.
     * [ TRANSACTION, ADDRESS ]</p>
     * 
     * <strong>example:</strong>
     * <p>TRANSACTION</p>
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
