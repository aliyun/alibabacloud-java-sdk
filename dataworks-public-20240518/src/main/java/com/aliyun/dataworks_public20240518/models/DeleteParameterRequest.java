// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteParameterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterRequest self = new DeleteParameterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteParameterRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
