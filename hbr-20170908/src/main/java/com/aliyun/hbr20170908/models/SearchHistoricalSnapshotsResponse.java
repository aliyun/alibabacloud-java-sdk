// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class SearchHistoricalSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchHistoricalSnapshotsResponseBody body;

    public static SearchHistoricalSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchHistoricalSnapshotsResponse self = new SearchHistoricalSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public SearchHistoricalSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchHistoricalSnapshotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchHistoricalSnapshotsResponse setBody(SearchHistoricalSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchHistoricalSnapshotsResponseBody getBody() {
        return this.body;
    }

}
