// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypeSettingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBizTypeSettingResponseBody body;

    public static DescribeBizTypeSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypeSettingResponse self = new DescribeBizTypeSettingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypeSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBizTypeSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBizTypeSettingResponse setBody(DescribeBizTypeSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBizTypeSettingResponseBody getBody() {
        return this.body;
    }

}
