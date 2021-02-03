// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGtmAccessStrategyResponse self = new DeleteGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGtmAccessStrategyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
