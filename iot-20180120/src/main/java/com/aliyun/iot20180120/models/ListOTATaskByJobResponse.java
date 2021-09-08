// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTATaskByJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOTATaskByJobResponseBody body;

    public static ListOTATaskByJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTATaskByJobResponse self = new ListOTATaskByJobResponse();
        return TeaModel.build(map, self);
    }

    public ListOTATaskByJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOTATaskByJobResponse setBody(ListOTATaskByJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOTATaskByJobResponseBody getBody() {
        return this.body;
    }

}
