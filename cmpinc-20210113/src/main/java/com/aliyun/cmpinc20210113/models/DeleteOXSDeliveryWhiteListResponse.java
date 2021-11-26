// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmpinc20210113.models;

import com.aliyun.tea.*;

public class DeleteOXSDeliveryWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOXSDeliveryWhiteListResponseBody body;

    public static DeleteOXSDeliveryWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOXSDeliveryWhiteListResponse self = new DeleteOXSDeliveryWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOXSDeliveryWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOXSDeliveryWhiteListResponse setBody(DeleteOXSDeliveryWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOXSDeliveryWhiteListResponseBody getBody() {
        return this.body;
    }

}
