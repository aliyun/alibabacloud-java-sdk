// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveTranscodeTemplateRequest extends TeaModel {
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
