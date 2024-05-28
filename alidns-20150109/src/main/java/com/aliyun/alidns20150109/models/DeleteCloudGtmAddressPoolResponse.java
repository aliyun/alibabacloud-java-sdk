// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCloudGtmAddressPoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudGtmAddressPoolResponseBody body;

    public static DeleteCloudGtmAddressPoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudGtmAddressPoolResponse self = new DeleteCloudGtmAddressPoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudGtmAddressPoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudGtmAddressPoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudGtmAddressPoolResponse setBody(DeleteCloudGtmAddressPoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudGtmAddressPoolResponseBody getBody() {
        return this.body;
    }

}
