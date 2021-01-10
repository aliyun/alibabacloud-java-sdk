// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateSmsSignResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsSignResponseBody self = new UpdateSmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmsSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
