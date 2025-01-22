// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLivePackageChannelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLivePackageChannelGroupResponseBody body;

    public static GetLivePackageChannelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLivePackageChannelGroupResponse self = new GetLivePackageChannelGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetLivePackageChannelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLivePackageChannelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLivePackageChannelGroupResponse setBody(GetLivePackageChannelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLivePackageChannelGroupResponseBody getBody() {
        return this.body;
    }

}
