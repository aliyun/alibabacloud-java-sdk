// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCacheByCacheTagResponseBody extends TeaModel {
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    @NameInMap("RequestId")
    public String requestId;

    public static RefreshObjectCacheByCacheTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshObjectCacheByCacheTagResponseBody self = new RefreshObjectCacheByCacheTagResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshObjectCacheByCacheTagResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    public RefreshObjectCacheByCacheTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
