// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class RemoveBlackListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveBlackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveBlackListResponseBody self = new RemoveBlackListResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveBlackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
