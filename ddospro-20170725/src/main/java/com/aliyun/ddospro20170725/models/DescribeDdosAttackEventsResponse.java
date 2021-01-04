// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosAttackEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDdosAttackEventsResponseBody body;

    public static DescribeDdosAttackEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosAttackEventsResponse self = new DescribeDdosAttackEventsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosAttackEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosAttackEventsResponse setBody(DescribeDdosAttackEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosAttackEventsResponseBody getBody() {
        return this.body;
    }

}
