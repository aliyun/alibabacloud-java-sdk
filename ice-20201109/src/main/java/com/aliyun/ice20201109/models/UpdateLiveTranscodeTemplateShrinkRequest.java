// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>The template 1130-2</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The template configuration.</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    /**
     * <p>The template ID. You can obtain the ID from the <a href="https://ims.console.aliyun.com/summary">Intelligent Media Services console</a> by choosing Templates &gt; Real-time Transcoding Templates, or from the response parameters of the <a href="https://help.aliyun.com/document_detail/449217.html">Create a real-time transcoding template</a> API operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
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
