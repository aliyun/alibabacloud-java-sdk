// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class RemoveClientFromBlackListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A70BEE5D-76D3-49FB-B58F-1F398211****</p>
     */
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
