// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyRefundWithDesignatedTbUidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRefundWithDesignatedTbUidResponseBody body;

    public static ModifyRefundWithDesignatedTbUidResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRefundWithDesignatedTbUidResponse self = new ModifyRefundWithDesignatedTbUidResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRefundWithDesignatedTbUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRefundWithDesignatedTbUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRefundWithDesignatedTbUidResponse setBody(ModifyRefundWithDesignatedTbUidResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRefundWithDesignatedTbUidResponseBody getBody() {
        return this.body;
    }

}
