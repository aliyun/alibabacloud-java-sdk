// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDnsGtmAccessStrategyResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDnsGtmAccessStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDnsGtmAccessStrategyResponseBody self = new DeleteDnsGtmAccessStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDnsGtmAccessStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
