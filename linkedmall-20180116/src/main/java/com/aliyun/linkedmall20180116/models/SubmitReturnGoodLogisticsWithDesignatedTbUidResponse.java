// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogisticsWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitReturnGoodLogisticsWithDesignatedTbUidResponseBody body;

    public static SubmitReturnGoodLogisticsWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitReturnGoodLogisticsWithDesignatedTbUidResponse self = new SubmitReturnGoodLogisticsWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitReturnGoodLogisticsWithDesignatedTbUidResponse setBody(SubmitReturnGoodLogisticsWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitReturnGoodLogisticsWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
