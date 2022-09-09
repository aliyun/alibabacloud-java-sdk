// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateRabbitmqPublisherAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRabbitmqPublisherAttributeResponseBody body;

    public static UpdateRabbitmqPublisherAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRabbitmqPublisherAttributeResponse self = new UpdateRabbitmqPublisherAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRabbitmqPublisherAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRabbitmqPublisherAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRabbitmqPublisherAttributeResponse setBody(UpdateRabbitmqPublisherAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRabbitmqPublisherAttributeResponseBody getBody() {
        return this.body;
    }

}
