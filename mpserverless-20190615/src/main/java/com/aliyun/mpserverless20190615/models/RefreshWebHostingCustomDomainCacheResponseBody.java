// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RefreshWebHostingCustomDomainCacheResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RefreshWebHostingCustomDomainCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshWebHostingCustomDomainCacheResponseBody self = new RefreshWebHostingCustomDomainCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshWebHostingCustomDomainCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
