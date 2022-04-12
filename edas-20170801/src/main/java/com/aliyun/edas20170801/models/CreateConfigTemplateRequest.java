// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateConfigTemplateRequest extends TeaModel {
    // 模板内容
    @NameInMap("Content")
    public String content;

    // 模板描述
    @NameInMap("Description")
    public String description;

    // 模板数据格式
    @NameInMap("Format")
    public String format;

    // 配置模板名称
    @NameInMap("Name")
    public String name;

    public static CreateConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigTemplateRequest self = new CreateConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateConfigTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConfigTemplateRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public CreateConfigTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
