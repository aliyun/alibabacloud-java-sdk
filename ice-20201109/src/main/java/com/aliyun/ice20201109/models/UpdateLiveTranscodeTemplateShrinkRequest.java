// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeTemplateShrinkRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateLiveTranscodeTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTranscodeTemplateShrinkRequest self = new UpdateLiveTranscodeTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTranscodeTemplateShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLiveTranscodeTemplateShrinkRequest setTemplateConfigShrink(String templateConfigShrink) {
        this.templateConfigShrink = templateConfigShrink;
        return this;
    }
    public String getTemplateConfigShrink() {
        return this.templateConfigShrink;
    }

    public UpdateLiveTranscodeTemplateShrinkRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
