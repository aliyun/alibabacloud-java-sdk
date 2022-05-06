// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateAccessGroupResponseBody extends TeaModel {
    @NameInMap("AccessGroupId")
    public String accessGroupId;

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
