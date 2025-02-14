// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVodPackagingGroupResponseBody body;

    public static CreateVodPackagingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingGroupResponse self = new CreateVodPackagingGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVodPackagingGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVodPackagingGroupResponse setBody(CreateVodPackagingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVodPackagingGroupResponseBody getBody() {
        return this.body;
    }

}
