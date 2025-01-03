// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateAccessGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
     */
    @NameInMap("AccessGroupId")
    public String accessGroupId;

    /**
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessGroupResponseBody self = new CreateAccessGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessGroupResponseBody setAccessGroupId(String accessGroupId) {
        this.accessGroupId = accessGroupId;
        return this;
    }
    public String getAccessGroupId() {
        return this.accessGroupId;
    }

    public CreateAccessGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
