// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class RemoveStoryFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveStoryFilesResponseBody body;

    public static RemoveStoryFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveStoryFilesResponse self = new RemoveStoryFilesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveStoryFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveStoryFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveStoryFilesResponse setBody(RemoveStoryFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveStoryFilesResponseBody getBody() {
        return this.body;
    }

}
