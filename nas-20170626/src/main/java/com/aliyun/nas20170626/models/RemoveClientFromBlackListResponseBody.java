// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RemoveClientFromBlackListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveClientFromBlackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveClientFromBlackListResponseBody self = new RemoveClientFromBlackListResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveClientFromBlackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
