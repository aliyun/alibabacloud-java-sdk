// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateFlowTagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("color")
    public String color;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("flowTagGroupId")
    public Long flowTagGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdateFlowTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowTagRequest self = new UpdateFlowTagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlowTagRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public UpdateFlowTagRequest setFlowTagGroupId(Long flowTagGroupId) {
        this.flowTagGroupId = flowTagGroupId;
        return this;
    }
    public Long getFlowTagGroupId() {
        return this.flowTagGroupId;
    }

    public UpdateFlowTagRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
