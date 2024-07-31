// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StopRtcRobotInstanceResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AC84E5DD-AB56-56C0-A992-07ECB82008CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopRtcRobotInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopRtcRobotInstanceResponseBody self = new StopRtcRobotInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StopRtcRobotInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
