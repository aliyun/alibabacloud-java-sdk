// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListCameraShootingAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCameraShootingAttachmentsResponseBody body;

    public static ListCameraShootingAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCameraShootingAttachmentsResponse self = new ListCameraShootingAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListCameraShootingAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCameraShootingAttachmentsResponse setBody(ListCameraShootingAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCameraShootingAttachmentsResponseBody getBody() {
        return this.body;
    }

}
