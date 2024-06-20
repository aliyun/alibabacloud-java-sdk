// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainLatestBlocksV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <strong>example:</strong>
     * <p>M8GaMEyX</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    public static DescribeAntChainLatestBlocksV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainLatestBlocksV2Request self = new DescribeAntChainLatestBlocksV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainLatestBlocksV2Request setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DescribeAntChainLatestBlocksV2Request setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

}
