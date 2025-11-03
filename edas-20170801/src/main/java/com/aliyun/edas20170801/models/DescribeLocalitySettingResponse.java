// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DescribeLocalitySettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLocalitySettingResponseBody body;

    public static DescribeLocalitySettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocalitySettingResponse self = new DescribeLocalitySettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLocalitySettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLocalitySettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLocalitySettingResponse setBody(DescribeLocalitySettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLocalitySettingResponseBody getBody() {
        return this.body;
    }

}
