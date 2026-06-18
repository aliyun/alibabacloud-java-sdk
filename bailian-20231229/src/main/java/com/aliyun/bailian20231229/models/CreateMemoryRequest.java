// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateMemoryRequest extends TeaModel {
    /**
     * <p>The description of the long-term memory. The description must be 1 to 50 characters in length and can contain letters, digits, and characters in the Unicode letter category (including Chinese characters). The description can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>我的大模型应用$APP_ID关于A用户的长期记忆体</p>
     */
    @NameInMap("description")
    public String description;

    public static CreateMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemoryRequest self = new CreateMemoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
