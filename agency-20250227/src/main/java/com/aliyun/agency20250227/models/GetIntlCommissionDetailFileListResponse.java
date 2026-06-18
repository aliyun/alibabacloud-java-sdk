// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetIntlCommissionDetailFileListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIntlCommissionDetailFileListResponseBody body;

    public static GetIntlCommissionDetailFileListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIntlCommissionDetailFileListResponse self = new GetIntlCommissionDetailFileListResponse();
        return TeaModel.build(map, self);
    }

    public GetIntlCommissionDetailFileListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIntlCommissionDetailFileListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIntlCommissionDetailFileListResponse setBody(GetIntlCommissionDetailFileListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIntlCommissionDetailFileListResponseBody getBody() {
        return this.body;
    }

}
