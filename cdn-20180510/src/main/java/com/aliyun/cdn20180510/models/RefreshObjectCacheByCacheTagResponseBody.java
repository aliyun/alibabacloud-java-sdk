// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCacheByCacheTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17772470184</p>
     */
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    /**
     * <strong>example:</strong>
     * <p>2E5AD83F-BD7B-462E-8319-2E30E305519A</p>
     */
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
