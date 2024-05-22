// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLiveTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
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
