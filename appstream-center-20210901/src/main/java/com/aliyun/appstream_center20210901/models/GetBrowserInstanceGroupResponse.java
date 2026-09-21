// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetBrowserInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBrowserInstanceGroupResponseBody body;

    public static GetBrowserInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBrowserInstanceGroupResponse self = new GetBrowserInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetBrowserInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBrowserInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBrowserInstanceGroupResponse setBody(GetBrowserInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBrowserInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
