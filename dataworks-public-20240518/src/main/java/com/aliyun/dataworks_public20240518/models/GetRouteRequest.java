// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetRouteRequest extends TeaModel {
    /**
     * <p>The route ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRouteRequest self = new GetRouteRequest();
        return TeaModel.build(map, self);
    }

    public GetRouteRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
