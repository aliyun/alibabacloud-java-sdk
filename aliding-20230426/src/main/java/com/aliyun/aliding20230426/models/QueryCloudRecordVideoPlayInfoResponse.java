// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordVideoPlayInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCloudRecordVideoPlayInfoResponseBody body;

    public static QueryCloudRecordVideoPlayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordVideoPlayInfoResponse self = new QueryCloudRecordVideoPlayInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordVideoPlayInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCloudRecordVideoPlayInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCloudRecordVideoPlayInfoResponse setBody(QueryCloudRecordVideoPlayInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCloudRecordVideoPlayInfoResponseBody getBody() {
        return this.body;
    }

}
