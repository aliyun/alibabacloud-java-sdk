// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class SearchImageFigureClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchImageFigureClusterResponseBody body;

    public static SearchImageFigureClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchImageFigureClusterResponse self = new SearchImageFigureClusterResponse();
        return TeaModel.build(map, self);
    }

    public SearchImageFigureClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchImageFigureClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchImageFigureClusterResponse setBody(SearchImageFigureClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchImageFigureClusterResponseBody getBody() {
        return this.body;
    }

}
