// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLiveRecordTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // 资源一级ID
    @NameInMap("TemplateId")
    public byte[] templateId;

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

    public CreateLiveRecordTemplateResponseBody setTemplateId(byte[] templateId) {
        this.templateId = templateId;
        return this;
    }
    public byte[] getTemplateId() {
        return this.templateId;
    }

}
