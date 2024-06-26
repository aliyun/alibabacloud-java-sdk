// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DestroyEthereumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EthereumId")
    public String ethereumId;

    public static DestroyEthereumRequest build(java.util.Map<String, ?> map) throws Exception {
        DestroyEthereumRequest self = new DestroyEthereumRequest();
        return TeaModel.build(map, self);
    }

    public DestroyEthereumRequest setEthereumId(String ethereumId) {
        this.ethereumId = ethereumId;
        return this;
    }
    public String getEthereumId() {
        return this.ethereumId;
    }

}
