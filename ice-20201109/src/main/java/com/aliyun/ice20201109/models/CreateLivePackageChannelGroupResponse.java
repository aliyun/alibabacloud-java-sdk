// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageChannelGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLivePackageChannelGroupResponseBody body;

    public static CreateLivePackageChannelGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePackageChannelGroupResponse self = new CreateLivePackageChannelGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateLivePackageChannelGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLivePackageChannelGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLivePackageChannelGroupResponse setBody(CreateLivePackageChannelGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLivePackageChannelGroupResponseBody getBody() {
        return this.body;
    }

}
