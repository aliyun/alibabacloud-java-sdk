// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveTranscodeTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The template configuration.</p>
     * <blockquote>
     * <p>The parameter requirements vary based on the template type (Type). If the Type parameter is set to normal, you must specify at least one of the width and height parameters, and the frame rate and bitrate parameters are required. For other template types, specify parameters as needed.</p>
     * </blockquote>
     */
    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    /**
     * <p>The template type. Valid values:</p>
     * <ul>
     * <li>normal: Normal template.</li>
     * <li>narrow-band: Narrowband HD template.</li>
     * <li>audio-only: Audio-only template.</li>
     * <li>origin: Original quality template.</li>
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
