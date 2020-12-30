// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RefreshObjectCachesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RefreshTaskId")
    public String refreshTaskId;

    public static RefreshObjectCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshObjectCachesResponseBody self = new RefreshObjectCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshObjectCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshObjectCachesResponseBody setRefreshTaskId(String refreshTaskId) {
        this.refreshTaskId = refreshTaskId;
        return this;
    }
    public String getRefreshTaskId() {
        return this.refreshTaskId;
    }

}
