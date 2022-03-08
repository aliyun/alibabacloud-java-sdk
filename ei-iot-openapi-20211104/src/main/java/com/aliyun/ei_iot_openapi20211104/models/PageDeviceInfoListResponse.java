// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class PageDeviceInfoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Response body;

    public static PageDeviceInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        PageDeviceInfoListResponse self = new PageDeviceInfoListResponse();
        return TeaModel.build(map, self);
    }

    public PageDeviceInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageDeviceInfoListResponse setBody(Response body) {
        this.body = body;
        return this;
    }
    public Response getBody() {
        return this.body;
    }

}
