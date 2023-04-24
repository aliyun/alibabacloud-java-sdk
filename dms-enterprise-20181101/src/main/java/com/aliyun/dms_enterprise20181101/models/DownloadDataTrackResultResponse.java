// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DownloadDataTrackResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadDataTrackResultResponseBody body;

    public static DownloadDataTrackResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadDataTrackResultResponse self = new DownloadDataTrackResultResponse();
        return TeaModel.build(map, self);
    }

    public DownloadDataTrackResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadDataTrackResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadDataTrackResultResponse setBody(DownloadDataTrackResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadDataTrackResultResponseBody getBody() {
        return this.body;
    }

}
