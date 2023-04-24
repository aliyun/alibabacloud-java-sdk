// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class QueryDataTrackResultDownloadStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDataTrackResultDownloadStatusResponseBody body;

    public static QueryDataTrackResultDownloadStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDataTrackResultDownloadStatusResponse self = new QueryDataTrackResultDownloadStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDataTrackResultDownloadStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDataTrackResultDownloadStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDataTrackResultDownloadStatusResponse setBody(QueryDataTrackResultDownloadStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDataTrackResultDownloadStatusResponseBody getBody() {
        return this.body;
    }

}
