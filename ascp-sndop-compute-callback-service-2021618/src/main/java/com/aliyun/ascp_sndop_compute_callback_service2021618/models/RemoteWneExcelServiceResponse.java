// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneExcelServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoteWneExcelServiceResponseBody body;

    public static RemoteWneExcelServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneExcelServiceResponse self = new RemoteWneExcelServiceResponse();
        return TeaModel.build(map, self);
    }

    public RemoteWneExcelServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoteWneExcelServiceResponse setBody(RemoteWneExcelServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoteWneExcelServiceResponseBody getBody() {
        return this.body;
    }

}
