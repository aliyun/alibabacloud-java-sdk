// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateSmsTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSmsTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsTemplateResponseBody self = new CreateSmsTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmsTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
