// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateIspFlushCacheInstanceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIspFlushCacheInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIspFlushCacheInstanceConfigResponseBody self = new UpdateIspFlushCacheInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIspFlushCacheInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
