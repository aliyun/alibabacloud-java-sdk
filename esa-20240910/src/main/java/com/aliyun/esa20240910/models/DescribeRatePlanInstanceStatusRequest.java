// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeRatePlanInstanceStatusRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the <a href="~~ListUserRatePlanInstances~~">ListUserRatePlanInstances</a> operation to obtain the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xcdn-91fknmb80f0g***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The resource owner account.</p>
     * 
     * <strong>example:</strong>
     * <p>1700594193617909</p>
     */
    @NameInMap("ResourceOwner")
    public Long resourceOwner;

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

    public DescribeRatePlanInstanceStatusRequest setResourceOwner(Long resourceOwner) {
        this.resourceOwner = resourceOwner;
        return this;
    }
    public Long getResourceOwner() {
        return this.resourceOwner;
    }

}
