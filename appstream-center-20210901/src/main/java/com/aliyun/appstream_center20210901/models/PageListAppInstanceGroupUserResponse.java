// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class PageListAppInstanceGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageListAppInstanceGroupUserResponseBody body;

    public static PageListAppInstanceGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        PageListAppInstanceGroupUserResponse self = new PageListAppInstanceGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public PageListAppInstanceGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageListAppInstanceGroupUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageListAppInstanceGroupUserResponse setBody(PageListAppInstanceGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public PageListAppInstanceGroupUserResponseBody getBody() {
        return this.body;
    }

}
