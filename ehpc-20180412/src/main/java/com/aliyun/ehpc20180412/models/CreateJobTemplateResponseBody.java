// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobTemplateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the job template.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateJobTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobTemplateResponseBody self = new CreateJobTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJobTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
