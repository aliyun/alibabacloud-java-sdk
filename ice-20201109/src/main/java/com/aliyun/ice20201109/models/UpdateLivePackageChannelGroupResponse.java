// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageChannelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLivePackageChannelGroupResponseBody body;

    public static UpdateLivePackageChannelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageChannelGroupResponse self = new UpdateLivePackageChannelGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageChannelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLivePackageChannelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLivePackageChannelGroupResponse setBody(UpdateLivePackageChannelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLivePackageChannelGroupResponseBody getBody() {
        return this.body;
    }

}
