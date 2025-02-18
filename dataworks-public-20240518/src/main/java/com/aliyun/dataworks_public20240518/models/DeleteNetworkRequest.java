// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteNetworkRequest extends TeaModel {
    /**
     * <p>The ID of the network that you want to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkRequest self = new DeleteNetworkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
