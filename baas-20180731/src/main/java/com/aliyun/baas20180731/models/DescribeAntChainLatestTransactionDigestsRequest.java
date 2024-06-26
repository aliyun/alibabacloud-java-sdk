// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestTransactionDigestsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    public static DescribeAntChainLatestTransactionDigestsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestTransactionDigestsRequest self = new DescribeAntChainLatestTransactionDigestsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestTransactionDigestsRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
