// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeSyncAvailableDBClusterListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSyncAvailableDBClusterListResponseBody body;

    public static DescribeSyncAvailableDBClusterListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncAvailableDBClusterListResponse self = new DescribeSyncAvailableDBClusterListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncAvailableDBClusterListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncAvailableDBClusterListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSyncAvailableDBClusterListResponse setBody(DescribeSyncAvailableDBClusterListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncAvailableDBClusterListResponseBody getBody() {
        return this.body;
    }

}
