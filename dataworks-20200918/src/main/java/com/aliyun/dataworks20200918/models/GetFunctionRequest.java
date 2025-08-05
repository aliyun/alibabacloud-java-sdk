// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetFunctionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("ProjectId")
    public Long projectId;

    public static GetFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFunctionRequest self = new GetFunctionRequest();
        return TeaModel.build(map, self);
    }

    public GetFunctionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetFunctionRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
