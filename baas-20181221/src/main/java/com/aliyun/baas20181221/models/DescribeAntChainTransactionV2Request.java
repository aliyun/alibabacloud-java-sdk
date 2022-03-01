// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainTransactionV2Request extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("Hash")
    public String hash;

    public static DescribeAntChainTransactionV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainTransactionV2Request self = new DescribeAntChainTransactionV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainTransactionV2Request setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainTransactionV2Request setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeAntChainTransactionV2Request setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
