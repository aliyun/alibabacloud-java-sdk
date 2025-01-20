// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UnbindConfigGroupResponseBody extends TeaModel {
    @NameInMap("GroupIds")
    public java.util.List<String> groupIds;

    /**
     * <strong>example:</strong>
     * <p>AD0FF13D-FC7D-56AD-934F-91C8487*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindConfigGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindConfigGroupResponseBody self = new UnbindConfigGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindConfigGroupResponseBody setGroupIds(java.util.List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public UnbindConfigGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
