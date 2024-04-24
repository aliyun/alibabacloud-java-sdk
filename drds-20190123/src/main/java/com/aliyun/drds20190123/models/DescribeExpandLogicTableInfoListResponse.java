// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeExpandLogicTableInfoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExpandLogicTableInfoListResponseBody body;

    public static DescribeExpandLogicTableInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpandLogicTableInfoListResponse self = new DescribeExpandLogicTableInfoListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExpandLogicTableInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExpandLogicTableInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExpandLogicTableInfoListResponse setBody(DescribeExpandLogicTableInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExpandLogicTableInfoListResponseBody getBody() {
        return this.body;
    }

}
