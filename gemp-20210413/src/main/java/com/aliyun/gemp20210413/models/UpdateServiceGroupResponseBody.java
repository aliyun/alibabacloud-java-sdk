// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateServiceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceGroupResponseBody self = new UpdateServiceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
