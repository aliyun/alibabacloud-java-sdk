// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class MigrateSingleZoneToMultiZoneResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static MigrateSingleZoneToMultiZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateSingleZoneToMultiZoneResponseBody self = new MigrateSingleZoneToMultiZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateSingleZoneToMultiZoneResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public MigrateSingleZoneToMultiZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
