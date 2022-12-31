// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // 代表资源一级ID的资源属性字段
    @NameInMap("TemplateId")
    public String templateId;

    public static CreateLiveRecordTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveRecordTemplateResponseBody self = new CreateLiveRecordTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveRecordTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLiveRecordTemplateResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
