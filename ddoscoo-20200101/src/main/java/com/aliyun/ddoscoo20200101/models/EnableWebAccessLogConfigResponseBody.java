// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class EnableWebAccessLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableWebAccessLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableWebAccessLogConfigResponseBody self = new EnableWebAccessLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableWebAccessLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
