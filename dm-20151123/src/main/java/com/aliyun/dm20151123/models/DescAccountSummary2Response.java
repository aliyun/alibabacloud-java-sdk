// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescAccountSummary2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescAccountSummary2ResponseBody body;

    public static DescAccountSummary2Response build(java.util.Map<String, ?> map) throws Exception {
        DescAccountSummary2Response self = new DescAccountSummary2Response();
        return TeaModel.build(map, self);
    }

    public DescAccountSummary2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescAccountSummary2Response setBody(DescAccountSummary2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescAccountSummary2ResponseBody getBody() {
        return this.body;
    }

}
