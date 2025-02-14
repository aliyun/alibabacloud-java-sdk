// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetVodPackagingGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVodPackagingGroupResponseBody body;

    public static GetVodPackagingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVodPackagingGroupResponse self = new GetVodPackagingGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetVodPackagingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVodPackagingGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVodPackagingGroupResponse setBody(GetVodPackagingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVodPackagingGroupResponseBody getBody() {
        return this.body;
    }

}
