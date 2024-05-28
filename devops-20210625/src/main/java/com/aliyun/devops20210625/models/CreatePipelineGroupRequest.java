// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreatePipelineGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    public static CreatePipelineGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineGroupRequest self = new CreatePipelineGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelineGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
