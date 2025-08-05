// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetWorkflowInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetWorkflowInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowInstanceRequest self = new GetWorkflowInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowInstanceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
