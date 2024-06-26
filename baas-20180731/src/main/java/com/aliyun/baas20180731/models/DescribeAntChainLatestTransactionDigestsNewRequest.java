// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestTransactionDigestsNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("ConsortiumId")
    public String consortiumId;

    public static DescribeAntChainLatestTransactionDigestsNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestTransactionDigestsNewRequest self = new DescribeAntChainLatestTransactionDigestsNewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestTransactionDigestsNewRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainLatestTransactionDigestsNewRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
