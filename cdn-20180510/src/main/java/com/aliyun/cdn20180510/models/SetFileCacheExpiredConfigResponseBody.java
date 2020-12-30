// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetFileCacheExpiredConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetFileCacheExpiredConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetFileCacheExpiredConfigResponseBody self = new SetFileCacheExpiredConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetFileCacheExpiredConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
