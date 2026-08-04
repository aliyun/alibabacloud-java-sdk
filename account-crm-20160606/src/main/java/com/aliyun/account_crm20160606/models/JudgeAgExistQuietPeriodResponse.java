// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class JudgeAgExistQuietPeriodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public JudgeAgExistQuietPeriodResponseBody body;

    public static JudgeAgExistQuietPeriodResponse build(java.util.Map<String, ?> map) throws Exception {
        JudgeAgExistQuietPeriodResponse self = new JudgeAgExistQuietPeriodResponse();
        return TeaModel.build(map, self);
    }

    public JudgeAgExistQuietPeriodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JudgeAgExistQuietPeriodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JudgeAgExistQuietPeriodResponse setBody(JudgeAgExistQuietPeriodResponseBody body) {
        this.body = body;
        return this;
    }
    public JudgeAgExistQuietPeriodResponseBody getBody() {
        return this.body;
    }

}
