// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class CreateAccessGroupResponseBody extends TeaModel {
    /**
     * <p>The name of the permission group.</p>
     */
    @NameInMap("AccessGroupName")
    public String accessGroupName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessGroupResponseBody self = new CreateAccessGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessGroupResponseBody setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    public CreateAccessGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
