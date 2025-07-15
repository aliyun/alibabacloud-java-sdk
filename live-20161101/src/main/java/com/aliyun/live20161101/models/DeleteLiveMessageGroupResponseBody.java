// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveMessageGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the deleted or non-existent group.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B95BE680-5A6A-1CAD-8AB1-09DFF5D6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveMessageGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveMessageGroupResponseBody self = new DeleteLiveMessageGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveMessageGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteLiveMessageGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
