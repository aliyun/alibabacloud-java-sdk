// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class AddStoryFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddStoryFilesResponseBody body;

    public static AddStoryFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddStoryFilesResponse self = new AddStoryFilesResponse();
        return TeaModel.build(map, self);
    }

    public AddStoryFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddStoryFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddStoryFilesResponse setBody(AddStoryFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddStoryFilesResponseBody getBody() {
        return this.body;
    }

}
