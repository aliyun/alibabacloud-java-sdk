// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshDcdnObjectCacheByCacheTagResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>17410889914</p>
     */
    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    /**
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshDcdnObjectCacheByCacheTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDcdnObjectCacheByCacheTagResponseBody self = new RefreshDcdnObjectCacheByCacheTagResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDcdnObjectCacheByCacheTagResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

    public RefreshDcdnObjectCacheByCacheTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
