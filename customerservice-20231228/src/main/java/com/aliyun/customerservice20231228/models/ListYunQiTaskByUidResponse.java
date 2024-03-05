// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class ListYunQiTaskByUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListYunQiTaskByUidResponseBody body;

    public static ListYunQiTaskByUidResponse build(java.util.Map<String, ?> map) throws Exception {
        ListYunQiTaskByUidResponse self = new ListYunQiTaskByUidResponse();
        return TeaModel.build(map, self);
    }

    public ListYunQiTaskByUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListYunQiTaskByUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListYunQiTaskByUidResponse setBody(ListYunQiTaskByUidResponseBody body) {
        this.body = body;
        return this;
    }
    public ListYunQiTaskByUidResponseBody getBody() {
        return this.body;
    }

}
