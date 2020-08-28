// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RemoveClientFromBlackListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RemoveClientFromBlackListResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveClientFromBlackListResponse self = new RemoveClientFromBlackListResponse();
        return TeaModel.build(map, self);
    }

    public RemoveClientFromBlackListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
