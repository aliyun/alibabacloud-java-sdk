// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpgradeLindormV2StreamEngineResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static UpgradeLindormV2StreamEngineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeLindormV2StreamEngineResponseBody self = new UpgradeLindormV2StreamEngineResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeLindormV2StreamEngineResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpgradeLindormV2StreamEngineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
