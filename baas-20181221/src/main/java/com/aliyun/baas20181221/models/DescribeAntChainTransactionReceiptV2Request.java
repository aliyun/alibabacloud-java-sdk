// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <strong>example:</strong>
     * <p>M8GaMEyX</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
     */
    @NameInMap("Hash")
    public String hash;

    public static DescribeAntChainTransactionReceiptV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionReceiptV2Request self = new DescribeAntChainTransactionReceiptV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionReceiptV2Request setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainTransactionReceiptV2Request setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeAntChainTransactionReceiptV2Request setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
