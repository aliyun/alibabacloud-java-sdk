// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDetailByIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetDetailByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetailByIdRequest self = new GetDetailByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetDetailByIdRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
