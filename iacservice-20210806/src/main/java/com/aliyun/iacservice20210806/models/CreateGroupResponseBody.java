// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>g-4267dcfbf1b6d128c87adf0e95f</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>E2D0E863-1651-5E58-823F-B451C8C24615</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupResponseBody self = new CreateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
