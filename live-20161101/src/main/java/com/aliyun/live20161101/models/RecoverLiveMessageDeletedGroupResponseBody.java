// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RecoverLiveMessageDeletedGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the group that was restored.</p>
     * 
     * <strong>example:</strong>
     * <p>grouptest</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>B95BE680-5A6A-1CAD-8AB1-09DFF5D6****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecoverLiveMessageDeletedGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverLiveMessageDeletedGroupResponseBody self = new RecoverLiveMessageDeletedGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverLiveMessageDeletedGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RecoverLiveMessageDeletedGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
