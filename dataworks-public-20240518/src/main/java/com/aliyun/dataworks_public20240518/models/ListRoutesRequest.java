// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListRoutesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("NetworkId")
    public Long networkId;

    public static ListRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoutesRequest self = new ListRoutesRequest();
        return TeaModel.build(map, self);
    }

    public ListRoutesRequest setNetworkId(Long networkId) {
        this.networkId = networkId;
        return this;
    }
    public Long getNetworkId() {
        return this.networkId;
    }

}
