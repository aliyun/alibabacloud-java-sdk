// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateShrinkRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Components")
    public String componentsShrink;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    @NameInMap("Example")
    public String exampleShrink;

    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("Language")
    public String language;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateType")
    public String templateType;

    public static ModifyChatappTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyChatappTemplateShrinkRequest self = new ModifyChatappTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyChatappTemplateShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyChatappTemplateShrinkRequest setComponentsShrink(String componentsShrink) {
        this.componentsShrink = componentsShrink;
        return this;
    }
    public String getComponentsShrink() {
        return this.componentsShrink;
    }

    public ModifyChatappTemplateShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ModifyChatappTemplateShrinkRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public ModifyChatappTemplateShrinkRequest setExampleShrink(String exampleShrink) {
        this.exampleShrink = exampleShrink;
        return this;
    }
    public String getExampleShrink() {
        return this.exampleShrink;
    }

    public ModifyChatappTemplateShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public ModifyChatappTemplateShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ModifyChatappTemplateShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ModifyChatappTemplateShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
