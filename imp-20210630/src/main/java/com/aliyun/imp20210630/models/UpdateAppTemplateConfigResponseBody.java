// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateAppTemplateConfigResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppTemplateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppTemplateConfigResponseBody self = new UpdateAppTemplateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppTemplateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
