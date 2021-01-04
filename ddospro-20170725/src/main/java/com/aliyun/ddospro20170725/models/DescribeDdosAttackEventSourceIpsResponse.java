// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosAttackEventSourceIpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDdosAttackEventSourceIpsResponseBody body;

    public static DescribeDdosAttackEventSourceIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosAttackEventSourceIpsResponse self = new DescribeDdosAttackEventSourceIpsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosAttackEventSourceIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosAttackEventSourceIpsResponse setBody(DescribeDdosAttackEventSourceIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosAttackEventSourceIpsResponseBody getBody() {
        return this.body;
    }

}
