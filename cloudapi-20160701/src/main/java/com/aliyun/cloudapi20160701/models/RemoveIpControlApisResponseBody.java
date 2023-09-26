// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class RemoveIpControlApisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveIpControlApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveIpControlApisResponseBody self = new RemoveIpControlApisResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveIpControlApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
