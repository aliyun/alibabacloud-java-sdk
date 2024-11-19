// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class RestartLdpsComputeGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static RestartLdpsComputeGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartLdpsComputeGroupResponseBody self = new RestartLdpsComputeGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartLdpsComputeGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public RestartLdpsComputeGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
