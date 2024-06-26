// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Hash")
    public String hash;

    public static DescribeAntChainTransactionReceiptNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionReceiptNewRequest self = new DescribeAntChainTransactionReceiptNewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionReceiptNewRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainTransactionReceiptNewRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeAntChainTransactionReceiptNewRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
