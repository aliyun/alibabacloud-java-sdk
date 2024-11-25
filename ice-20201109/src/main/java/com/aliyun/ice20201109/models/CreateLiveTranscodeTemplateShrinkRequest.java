// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveTranscodeTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The name of the template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration of the template.</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    /**
     * <p>The type of the template. Valid values:</p>
     * <ul>
     * <li>normal</li>
     * <li>narrow-band</li>
     * <li>audio-only</li>
     * <li>origin</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
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
