// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveTrafficControlApisResponseBody extends TeaModel {
    /**
     * <p>Unbinds a specified throttling policy from APIs.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveTrafficControlApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveTrafficControlApisResponseBody self = new RemoveTrafficControlApisResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveTrafficControlApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
