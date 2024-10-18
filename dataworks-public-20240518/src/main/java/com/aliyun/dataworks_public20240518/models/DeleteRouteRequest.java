// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteRouteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteRequest self = new DeleteRouteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
