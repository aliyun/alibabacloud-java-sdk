// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4EF5E823-AC0D-5CB5-8F18-1352455A488D</p>
     */
    @NameInMap("requestId")
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
