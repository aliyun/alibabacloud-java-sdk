// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16035</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceRequest self = new GetDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public GetDataSourceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
