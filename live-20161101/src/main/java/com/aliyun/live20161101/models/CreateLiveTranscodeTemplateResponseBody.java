// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveTranscodeTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateId")
    public String templateId;

    public static CreateLiveTranscodeTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveTranscodeTemplateResponseBody self = new CreateLiveTranscodeTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveTranscodeTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLiveTranscodeTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
