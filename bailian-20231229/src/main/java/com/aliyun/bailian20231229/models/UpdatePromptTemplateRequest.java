// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdatePromptTemplateRequest extends TeaModel {
    /**
     * <p>The template content.</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The template name.</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdatePromptTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePromptTemplateRequest self = new UpdatePromptTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePromptTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdatePromptTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
