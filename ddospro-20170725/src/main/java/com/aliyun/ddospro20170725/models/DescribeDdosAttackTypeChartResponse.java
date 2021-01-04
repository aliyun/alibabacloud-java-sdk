// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosAttackTypeChartResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDdosAttackTypeChartResponseBody body;

    public static DescribeDdosAttackTypeChartResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosAttackTypeChartResponse self = new DescribeDdosAttackTypeChartResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosAttackTypeChartResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosAttackTypeChartResponse setBody(DescribeDdosAttackTypeChartResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosAttackTypeChartResponseBody getBody() {
        return this.body;
    }

}
