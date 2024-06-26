// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Hash")
    public String hash;

    public static DescribeAntChainTransactionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionRequest self = new DescribeAntChainTransactionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainTransactionRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
