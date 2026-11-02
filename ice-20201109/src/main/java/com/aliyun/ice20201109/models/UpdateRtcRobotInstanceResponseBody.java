// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateRtcRobotInstanceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7707F0A2-C6FD-5959-87EB-7C4D02384FD4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRtcRobotInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtcRobotInstanceResponseBody self = new UpdateRtcRobotInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRtcRobotInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
