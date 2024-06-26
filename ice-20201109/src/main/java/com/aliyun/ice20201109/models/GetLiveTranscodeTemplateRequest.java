// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveTranscodeTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287666</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetLiveTranscodeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveTranscodeTemplateRequest self = new GetLiveTranscodeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveTranscodeTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
