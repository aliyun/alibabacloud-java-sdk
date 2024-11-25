// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLiveTranscodeTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The template name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The configuration of the template.</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfigShrink;

    /**
     * <p>The template ID. To obtain the template ID, log on to the <a href="https://ims.console.aliyun.com/summary">Intelligent Media Services (IMS) console</a>, choose Real-time Media Processing &gt; Template Management, and then click the Transcoding tab. Alternatively, find the ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/449217.html">CreateLiveTranscodeTemplate</a> operation.</p>
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
