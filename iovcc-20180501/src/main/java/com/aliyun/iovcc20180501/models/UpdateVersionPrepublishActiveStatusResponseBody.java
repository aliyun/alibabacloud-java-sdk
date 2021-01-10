// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class UpdateVersionPrepublishActiveStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVersionPrepublishActiveStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVersionPrepublishActiveStatusResponseBody self = new UpdateVersionPrepublishActiveStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVersionPrepublishActiveStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
