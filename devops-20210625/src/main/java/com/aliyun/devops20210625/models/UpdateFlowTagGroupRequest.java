// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateFlowTagGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdateFlowTagGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowTagGroupRequest self = new UpdateFlowTagGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowTagGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
