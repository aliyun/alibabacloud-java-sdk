// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class OpenLdpsColumnarIndexResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static OpenLdpsColumnarIndexResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenLdpsColumnarIndexResponseBody self = new OpenLdpsColumnarIndexResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenLdpsColumnarIndexResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public OpenLdpsColumnarIndexResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
