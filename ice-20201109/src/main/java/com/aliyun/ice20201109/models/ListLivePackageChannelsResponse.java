// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLivePackageChannelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLivePackageChannelsResponseBody body;

    public static ListLivePackageChannelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLivePackageChannelsResponse self = new ListLivePackageChannelsResponse();
        return TeaModel.build(map, self);
    }

    public ListLivePackageChannelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLivePackageChannelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLivePackageChannelsResponse setBody(ListLivePackageChannelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLivePackageChannelsResponseBody getBody() {
        return this.body;
    }

}
