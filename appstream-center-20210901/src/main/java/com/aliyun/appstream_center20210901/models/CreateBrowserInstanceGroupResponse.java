// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateBrowserInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBrowserInstanceGroupResponseBody body;

    public static CreateBrowserInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBrowserInstanceGroupResponse self = new CreateBrowserInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateBrowserInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBrowserInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBrowserInstanceGroupResponse setBody(CreateBrowserInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBrowserInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
