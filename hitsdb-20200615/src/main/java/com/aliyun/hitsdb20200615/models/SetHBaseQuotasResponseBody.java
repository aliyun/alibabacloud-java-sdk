// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class SetHBaseQuotasResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("RawData")
    public java.util.Map<String, ?> rawData;

    @NameInMap("RequestId")
    public String requestId;

    public static SetHBaseQuotasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetHBaseQuotasResponseBody self = new SetHBaseQuotasResponseBody();
        return TeaModel.build(map, self);
    }

    public SetHBaseQuotasResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public SetHBaseQuotasResponseBody setRawData(java.util.Map<String, ?> rawData) {
        this.rawData = rawData;
        return this;
    }
    public java.util.Map<String, ?> getRawData() {
        return this.rawData;
    }

    public SetHBaseQuotasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
