// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateServiceGroupResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C4BE3837-1A13-413B-A225-2C88188E8A43</p>
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
