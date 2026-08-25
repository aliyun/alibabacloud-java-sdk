// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListServerIdeEcsSpecsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServerIdeEcsSpecsResponseBody body;

    public static ListServerIdeEcsSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServerIdeEcsSpecsResponse self = new ListServerIdeEcsSpecsResponse();
        return TeaModel.build(map, self);
    }

    public ListServerIdeEcsSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServerIdeEcsSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServerIdeEcsSpecsResponse setBody(ListServerIdeEcsSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServerIdeEcsSpecsResponseBody getBody() {
        return this.body;
    }

}
