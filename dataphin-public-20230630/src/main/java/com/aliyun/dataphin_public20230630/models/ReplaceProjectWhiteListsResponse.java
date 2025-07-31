// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ReplaceProjectWhiteListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReplaceProjectWhiteListsResponseBody body;

    public static ReplaceProjectWhiteListsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceProjectWhiteListsResponse self = new ReplaceProjectWhiteListsResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceProjectWhiteListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceProjectWhiteListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceProjectWhiteListsResponse setBody(ReplaceProjectWhiteListsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceProjectWhiteListsResponseBody getBody() {
        return this.body;
    }

}
