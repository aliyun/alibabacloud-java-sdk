// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshErObjectCachesByCacheTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17410889914</p>
     */
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    /**
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshErObjectCachesByCacheTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshErObjectCachesByCacheTagResponseBody self = new RefreshErObjectCachesByCacheTagResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshErObjectCachesByCacheTagResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    public RefreshErObjectCachesByCacheTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
