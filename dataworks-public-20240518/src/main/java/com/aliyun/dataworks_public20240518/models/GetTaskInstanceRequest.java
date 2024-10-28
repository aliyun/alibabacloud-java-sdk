// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetTaskInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetTaskInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskInstanceRequest self = new GetTaskInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskInstanceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
