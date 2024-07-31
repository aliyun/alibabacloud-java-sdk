// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartRtcRobotInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>727dc0e296014bb58670940a3da95592</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11DE0AB3-603B-5055-8A72-9C424854F983</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartRtcRobotInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRtcRobotInstanceResponseBody self = new StartRtcRobotInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRtcRobotInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StartRtcRobotInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
