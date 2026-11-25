// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ShowProcessListResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("RawData")
    public java.util.Map<String, ?> rawData;

    @NameInMap("RequestId")
    public String requestId;

    public static ShowProcessListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ShowProcessListResponseBody self = new ShowProcessListResponseBody();
        return TeaModel.build(map, self);
    }

    public ShowProcessListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ShowProcessListResponseBody setRawData(java.util.Map<String, ?> rawData) {
        this.rawData = rawData;
        return this;
    }
    public java.util.Map<String, ?> getRawData() {
        return this.rawData;
    }

    public ShowProcessListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
