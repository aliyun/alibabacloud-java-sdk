// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class GetWorkflowRequest extends TeaModel {
    @NameInMap("EnvType")
    public String envType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static GetWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkflowRequest self = new GetWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkflowRequest setEnvType(String envType) {
        this.envType = envType;
        return this;
    }
    public String getEnvType() {
        return this.envType;
    }

    public GetWorkflowRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
