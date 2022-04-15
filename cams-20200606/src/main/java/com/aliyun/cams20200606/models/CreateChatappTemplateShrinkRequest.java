// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateShrinkRequest extends TeaModel {
    // 模板分类
    @NameInMap("Category")
    public String category;

    @NameInMap("Components")
    public String componentsShrink;

    // ISV客户WabaId
    @NameInMap("CustWabaId")
    public String custWabaId;

    // 变量，KEY-VALUE结构
    @NameInMap("Example")
    public String exampleShrink;

    // 语言
    @NameInMap("Language")
    public String language;

    // 模板名称
    @NameInMap("Name")
    public String name;

    // 模板类型
    @NameInMap("TemplateType")
    public String templateType;

    public static CreateChatappTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappTemplateShrinkRequest self = new CreateChatappTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatappTemplateShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateChatappTemplateShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
    }

    public CreateChatappTemplateShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public CreateChatappTemplateShrinkRequest setExampleShrink(String exampleShrink) {
        this.exampleShrink = exampleShrink;
        return this;
    }
    public String getExampleShrink() {
        return this.exampleShrink;
    }

    public CreateChatappTemplateShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateChatappTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateChatappTemplateShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
