// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOrderAttachmentFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOrderAttachmentFileResponseBody body;

    public static GetOrderAttachmentFileResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderAttachmentFileResponse self = new GetOrderAttachmentFileResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderAttachmentFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderAttachmentFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrderAttachmentFileResponse setBody(GetOrderAttachmentFileResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrderAttachmentFileResponseBody getBody() {
        return this.body;
    }

}
