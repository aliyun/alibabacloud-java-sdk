// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateMcuTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateId")
    public String templateId;

    public static CreateMcuTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcuTemplateResponseBody self = new CreateMcuTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcuTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcuTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
