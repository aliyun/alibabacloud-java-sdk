// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>The template ID. To obtain the template ID, log on to the <a href="https://ice.console.aliyun.com/summary">Intelligent Media Services (IMS) console</a>, choose Real-time Media Processing &gt; Template Management, and then click the Transcoding tab. Alternatively, find the ID from the response parameters of the <a href="https://help.aliyun.com/document_detail/449217.html">CreateLiveTranscodeTemplate</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteLiveTranscodeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveTranscodeTemplateRequest self = new DeleteLiveTranscodeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveTranscodeTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
