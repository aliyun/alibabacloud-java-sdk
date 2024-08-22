// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateMemoryNodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("content")
    public String content;

    public static CreateMemoryNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryNodeRequest self = new CreateMemoryNodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryNodeRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
