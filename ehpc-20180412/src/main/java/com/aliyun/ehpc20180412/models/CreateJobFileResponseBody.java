// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateJobFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateId")
    public String templateId;

    public static CreateJobFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateJobFileResponseBody self = new CreateJobFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateJobFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateJobFileResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
