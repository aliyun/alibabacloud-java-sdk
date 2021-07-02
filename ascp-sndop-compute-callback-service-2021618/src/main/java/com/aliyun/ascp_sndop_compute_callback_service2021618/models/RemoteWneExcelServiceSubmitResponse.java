// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneExcelServiceSubmitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoteWneExcelServiceSubmitResponseBody body;

    public static RemoteWneExcelServiceSubmitResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneExcelServiceSubmitResponse self = new RemoteWneExcelServiceSubmitResponse();
        return TeaModel.build(map, self);
    }

    public RemoteWneExcelServiceSubmitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoteWneExcelServiceSubmitResponse setBody(RemoteWneExcelServiceSubmitResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoteWneExcelServiceSubmitResponseBody getBody() {
        return this.body;
    }

}
