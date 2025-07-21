// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFlowNodePrototypeV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlowNodePrototypeV2ResponseBody body;

    public static ListFlowNodePrototypeV2Response build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodePrototypeV2Response self = new ListFlowNodePrototypeV2Response();
        return TeaModel.build(map, self);
    }

    public ListFlowNodePrototypeV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlowNodePrototypeV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlowNodePrototypeV2Response setBody(ListFlowNodePrototypeV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlowNodePrototypeV2ResponseBody getBody() {
        return this.body;
    }

}
