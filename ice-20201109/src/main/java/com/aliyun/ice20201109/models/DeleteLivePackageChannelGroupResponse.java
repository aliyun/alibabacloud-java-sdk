// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLivePackageChannelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLivePackageChannelGroupResponseBody body;

    public static DeleteLivePackageChannelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePackageChannelGroupResponse self = new DeleteLivePackageChannelGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLivePackageChannelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLivePackageChannelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLivePackageChannelGroupResponse setBody(DeleteLivePackageChannelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLivePackageChannelGroupResponseBody getBody() {
        return this.body;
    }

}
