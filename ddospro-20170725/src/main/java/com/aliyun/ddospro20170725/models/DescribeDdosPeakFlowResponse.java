// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosPeakFlowResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDdosPeakFlowResponseBody body;

    public static DescribeDdosPeakFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosPeakFlowResponse self = new DescribeDdosPeakFlowResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosPeakFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosPeakFlowResponse setBody(DescribeDdosPeakFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosPeakFlowResponseBody getBody() {
        return this.body;
    }

}
