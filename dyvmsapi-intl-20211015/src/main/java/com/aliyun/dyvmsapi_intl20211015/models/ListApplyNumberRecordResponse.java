// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class ListApplyNumberRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListApplyNumberRecordResponseBody body;

    public static ListApplyNumberRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplyNumberRecordResponse self = new ListApplyNumberRecordResponse();
        return TeaModel.build(map, self);
    }

    public ListApplyNumberRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplyNumberRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplyNumberRecordResponse setBody(ListApplyNumberRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplyNumberRecordResponseBody getBody() {
        return this.body;
    }

}
