// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosFlowProportionDiagramResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDdosFlowProportionDiagramResponseBody body;

    public static DescribeDdosFlowProportionDiagramResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosFlowProportionDiagramResponse self = new DescribeDdosFlowProportionDiagramResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDdosFlowProportionDiagramResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDdosFlowProportionDiagramResponse setBody(DescribeDdosFlowProportionDiagramResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDdosFlowProportionDiagramResponseBody getBody() {
        return this.body;
    }

}
