// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMcuTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateId")
    public String templateId;

    public static UpdateMcuTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcuTemplateResponseBody self = new UpdateMcuTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMcuTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMcuTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
