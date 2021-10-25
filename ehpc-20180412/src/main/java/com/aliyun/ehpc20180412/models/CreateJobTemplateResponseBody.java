// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobTemplateResponseBody extends TeaModel {
    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateJobTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateResponseBody self = new CreateJobTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CreateJobTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
