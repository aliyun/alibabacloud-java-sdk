// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateWebsiteInstanceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWebsiteInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebsiteInstanceStatusResponseBody self = new UpdateWebsiteInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWebsiteInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
