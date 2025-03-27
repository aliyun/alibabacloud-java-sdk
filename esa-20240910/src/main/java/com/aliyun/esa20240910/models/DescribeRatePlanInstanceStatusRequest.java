// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanInstanceStatusRequest extends TeaModel {
    /**
     * <p>The instance ID, which can be obtained by calling the <a href="~~ListUserRatePlanInstances~~">ListUserRatePlanInstances</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>xcdn-91fknmb80f0g***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeRatePlanInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRatePlanInstanceStatusRequest self = new DescribeRatePlanInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRatePlanInstanceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
