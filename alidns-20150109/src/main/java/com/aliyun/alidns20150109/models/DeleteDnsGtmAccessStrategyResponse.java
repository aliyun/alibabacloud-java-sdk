// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAccessStrategyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDnsGtmAccessStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsGtmAccessStrategyResponse self = new DeleteDnsGtmAccessStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDnsGtmAccessStrategyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
