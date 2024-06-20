// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestTransactionDigestsV2Request extends TeaModel {
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

    public static DescribeAntChainLatestTransactionDigestsV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestTransactionDigestsV2Request self = new DescribeAntChainLatestTransactionDigestsV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestTransactionDigestsV2Request setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainLatestTransactionDigestsV2Request setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
