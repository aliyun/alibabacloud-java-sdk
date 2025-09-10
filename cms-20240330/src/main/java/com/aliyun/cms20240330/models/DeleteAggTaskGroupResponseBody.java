// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteAggTaskGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteAggTaskGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggTaskGroupResponseBody self = new DeleteAggTaskGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAggTaskGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
