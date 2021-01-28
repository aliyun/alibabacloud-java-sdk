// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshDcdnObjectCachesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    public static RefreshDcdnObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshDcdnObjectCachesResponseBody self = new RefreshDcdnObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshDcdnObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshDcdnObjectCachesResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

}
