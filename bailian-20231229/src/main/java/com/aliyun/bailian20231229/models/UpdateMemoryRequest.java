// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateMemoryRequest extends TeaModel {
    /**
     * <p>The new description. The description must be 1 to 50 characters in length and can contain characters in the letter category of Unicode, which includes letters, Chinese characters, and digits. The description can also contain half-width colons (:), underscores (_), periods (.), or hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>我的大模型应用$APP_ID关于B用户的长期记忆体</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryRequest self = new UpdateMemoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
