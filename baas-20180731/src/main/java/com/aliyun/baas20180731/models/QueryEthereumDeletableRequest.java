// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryEthereumDeletableRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EthereumId")
    public String ethereumId;

    public static QueryEthereumDeletableRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEthereumDeletableRequest self = new QueryEthereumDeletableRequest();
        return TeaModel.build(map, self);
    }

    public QueryEthereumDeletableRequest setEthereumId(String ethereumId) {
        this.ethereumId = ethereumId;
        return this;
    }
    public String getEthereumId() {
        return this.ethereumId;
    }

}
