// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreateMemoryRequest extends TeaModel {
    /**
     * <p>The description of the long-term memory. The description is empty by default. The value must be 1 to 50 characters in length and can contain characters in the letter category of Unicode, which includes letters, Chinese characters, and digits. The value can also contain colons (:), underscores (_), periods (.), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>Long-term memory of user A for my LLM application $APP_ID</p>
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
