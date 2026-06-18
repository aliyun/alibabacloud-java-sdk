// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateMemoryNodeRequest extends TeaModel {
    /**
     * <p>The content of the memory node. The content must be 1 to 200 characters in length and can contain letters, digits, underscores (_), hyphens (-), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>用户喜欢吃西红柿炒鸡蛋</p>
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
