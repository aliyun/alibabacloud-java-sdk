// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>The template ID. You can obtain the ID from the <a href="https://ice.console.aliyun.com/summary">Intelligent Media Services console</a> &gt; Template Management &gt; Real-time Transcoding Template, or from the response parameters of <a href="https://help.aliyun.com/document_detail/449217.html">CreateLiveTranscodeTemplate</a>.</p>
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
