// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeMachineInfoOpersByUuidsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMachineInfoOpersByUuidsResponseBody body;

    public static DescribeMachineInfoOpersByUuidsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMachineInfoOpersByUuidsResponse self = new DescribeMachineInfoOpersByUuidsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMachineInfoOpersByUuidsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMachineInfoOpersByUuidsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMachineInfoOpersByUuidsResponse setBody(DescribeMachineInfoOpersByUuidsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMachineInfoOpersByUuidsResponseBody getBody() {
        return this.body;
    }

}
