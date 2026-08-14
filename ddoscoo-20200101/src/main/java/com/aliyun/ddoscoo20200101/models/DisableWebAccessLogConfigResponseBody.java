// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DisableWebAccessLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableWebAccessLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableWebAccessLogConfigResponseBody self = new DisableWebAccessLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableWebAccessLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
