// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ModifyLindormV2WhiteIpListResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static ModifyLindormV2WhiteIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyLindormV2WhiteIpListResponseBody self = new ModifyLindormV2WhiteIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyLindormV2WhiteIpListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyLindormV2WhiteIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
