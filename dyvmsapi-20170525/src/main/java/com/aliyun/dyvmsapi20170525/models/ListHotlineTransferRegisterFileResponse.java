// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListHotlineTransferRegisterFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotlineTransferRegisterFileResponseBody body;

    public static ListHotlineTransferRegisterFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineTransferRegisterFileResponse self = new ListHotlineTransferRegisterFileResponse();
        return TeaModel.build(map, self);
    }

    public ListHotlineTransferRegisterFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotlineTransferRegisterFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotlineTransferRegisterFileResponse setBody(ListHotlineTransferRegisterFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotlineTransferRegisterFileResponseBody getBody() {
        return this.body;
    }

}
