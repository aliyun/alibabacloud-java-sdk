// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateAppResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppResponseBody self = new UpdateAppResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
