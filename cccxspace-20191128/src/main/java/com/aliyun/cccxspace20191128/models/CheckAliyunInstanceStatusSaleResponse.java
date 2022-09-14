// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CheckAliyunInstanceStatusSaleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAliyunInstanceStatusSaleResponseBody body;

    public static CheckAliyunInstanceStatusSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAliyunInstanceStatusSaleResponse self = new CheckAliyunInstanceStatusSaleResponse();
        return TeaModel.build(map, self);
    }

    public CheckAliyunInstanceStatusSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAliyunInstanceStatusSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAliyunInstanceStatusSaleResponse setBody(CheckAliyunInstanceStatusSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAliyunInstanceStatusSaleResponseBody getBody() {
        return this.body;
    }

}
