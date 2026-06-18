// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdatePromptTemplateRequest extends TeaModel {
    /**
     * <p>The template content.</p>
     * 
     * <strong>example:</strong>
     * <p>请写一篇小红书种草笔记，增加丰富的emoji元素，结尾作总结，并加上相关标签。主题为：${theme}</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>小红书文案助手</p>
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
