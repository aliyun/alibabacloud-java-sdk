// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetNetworkRequest extends TeaModel {
    /**
     * <p>The network ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNetworkRequest self = new GetNetworkRequest();
        return TeaModel.build(map, self);
    }

    public GetNetworkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
