// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeRtcRobotInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>727dc0e296014bb58670940a3da95592</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeRtcRobotInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcRobotInstanceRequest self = new DescribeRtcRobotInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRtcRobotInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
