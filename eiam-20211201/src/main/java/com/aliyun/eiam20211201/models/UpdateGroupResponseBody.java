// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupResponseBody self = new UpdateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
