// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateWebsiteInstanceKeyUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWebsiteInstanceKeyUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebsiteInstanceKeyUrlResponseBody self = new UpdateWebsiteInstanceKeyUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWebsiteInstanceKeyUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
