// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveTranscodeTemplateShrinkRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    @NameInMap("Type")
    public String type;

    public static CreateLiveTranscodeTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveTranscodeTemplateShrinkRequest self = new CreateLiveTranscodeTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveTranscodeTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLiveTranscodeTemplateShrinkRequest setTemplateConfigShrink(String templateConfigShrink) {
        this.templateConfigShrink = templateConfigShrink;
        return this;
    }
    public String getTemplateConfigShrink() {
        return this.templateConfigShrink;
    }

    public CreateLiveTranscodeTemplateShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
