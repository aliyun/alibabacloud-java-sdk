// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateFlowTagGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    public static CreateFlowTagGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowTagGroupRequest self = new CreateFlowTagGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowTagGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
