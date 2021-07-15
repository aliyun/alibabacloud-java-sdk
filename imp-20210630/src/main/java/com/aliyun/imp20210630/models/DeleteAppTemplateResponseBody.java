// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteAppTemplateResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppTemplateResponseBody self = new DeleteAppTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
