// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class RemoveAllBlackListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAllBlackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAllBlackListResponseBody self = new RemoveAllBlackListResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAllBlackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
