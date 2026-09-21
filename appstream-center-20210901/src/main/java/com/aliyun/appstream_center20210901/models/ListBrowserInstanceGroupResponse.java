// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBrowserInstanceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBrowserInstanceGroupResponseBody body;

    public static ListBrowserInstanceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBrowserInstanceGroupResponse self = new ListBrowserInstanceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListBrowserInstanceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBrowserInstanceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBrowserInstanceGroupResponse setBody(ListBrowserInstanceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBrowserInstanceGroupResponseBody getBody() {
        return this.body;
    }

}
