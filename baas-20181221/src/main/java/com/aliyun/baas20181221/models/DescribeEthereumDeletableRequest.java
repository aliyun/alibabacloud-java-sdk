// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeEthereumDeletableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eth-1ilrhcav4ibdl</p>
     */
    @NameInMap("EthereumId")
    public String ethereumId;

    public static DescribeEthereumDeletableRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEthereumDeletableRequest self = new DescribeEthereumDeletableRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEthereumDeletableRequest setEthereumId(String ethereumId) {
        this.ethereumId = ethereumId;
        return this;
    }
    public String getEthereumId() {
        return this.ethereumId;
    }

}
