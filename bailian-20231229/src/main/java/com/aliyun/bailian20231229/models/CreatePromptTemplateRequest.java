// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class CreatePromptTemplateRequest extends TeaModel {
    /**
     * <p>Prompt template content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>请写一篇小红书种草笔记，增加丰富的emoji元素，结尾作总结，并加上相关标签。主题为：${theme}</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>Template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>小红书文案助手</p>
     */
    @NameInMap("name")
    public String name;

    public static CreatePromptTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePromptTemplateRequest self = new CreatePromptTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreatePromptTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreatePromptTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
