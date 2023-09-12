// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class ListProductGeneralBillsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GeneralBillPageResult body;

    public static ListProductGeneralBillsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductGeneralBillsResponse self = new ListProductGeneralBillsResponse();
        return TeaModel.build(map, self);
    }

    public ListProductGeneralBillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductGeneralBillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductGeneralBillsResponse setBody(GeneralBillPageResult body) {
        this.body = body;
        return this;
    }
    public GeneralBillPageResult getBody() {
        return this.body;
    }

}
