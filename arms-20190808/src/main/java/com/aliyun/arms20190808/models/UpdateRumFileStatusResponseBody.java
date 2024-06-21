// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateRumFileStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>626037F5-FDEB-45B0-804C-B3C92797****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRumFileStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRumFileStatusResponseBody self = new UpdateRumFileStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRumFileStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
