// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionReceiptRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("Hash")
    public String hash;

    public static DescribeAntChainTransactionReceiptRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionReceiptRequest self = new DescribeAntChainTransactionReceiptRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionReceiptRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainTransactionReceiptRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
