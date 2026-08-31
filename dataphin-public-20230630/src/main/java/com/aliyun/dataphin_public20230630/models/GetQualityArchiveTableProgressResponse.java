// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetQualityArchiveTableProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQualityArchiveTableProgressResponseBody body;

    public static GetQualityArchiveTableProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQualityArchiveTableProgressResponse self = new GetQualityArchiveTableProgressResponse();
        return TeaModel.build(map, self);
    }

    public GetQualityArchiveTableProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQualityArchiveTableProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQualityArchiveTableProgressResponse setBody(GetQualityArchiveTableProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQualityArchiveTableProgressResponseBody getBody() {
        return this.body;
    }

}
