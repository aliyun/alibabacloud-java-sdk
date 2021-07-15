// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateAppTemplateResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppTemplateResponseBody self = new UpdateAppTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
