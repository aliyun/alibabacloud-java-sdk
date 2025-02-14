// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteVodPackagingGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVodPackagingGroupResponseBody body;

    public static DeleteVodPackagingGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVodPackagingGroupResponse self = new DeleteVodPackagingGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVodPackagingGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVodPackagingGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVodPackagingGroupResponse setBody(DeleteVodPackagingGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVodPackagingGroupResponseBody getBody() {
        return this.body;
    }

}
