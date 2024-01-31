// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainOrderQueryV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TrainOrderQueryV2ResponseBody body;

    public static TrainOrderQueryV2Response build(java.util.Map<String, ?> map) throws Exception {
        TrainOrderQueryV2Response self = new TrainOrderQueryV2Response();
        return TeaModel.build(map, self);
    }

    public TrainOrderQueryV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TrainOrderQueryV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TrainOrderQueryV2Response setBody(TrainOrderQueryV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public TrainOrderQueryV2ResponseBody getBody() {
        return this.body;
    }

}
