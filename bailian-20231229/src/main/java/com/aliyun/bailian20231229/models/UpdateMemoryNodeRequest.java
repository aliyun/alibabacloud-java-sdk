// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateMemoryNodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("content")
    public String content;

    public static UpdateMemoryNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryNodeRequest self = new UpdateMemoryNodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryNodeRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
