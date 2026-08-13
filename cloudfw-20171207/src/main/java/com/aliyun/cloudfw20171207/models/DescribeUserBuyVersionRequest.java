// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserBuyVersionRequest extends TeaModel {
    /**
     * <p>The instance ID. If you specify an instance ID, the system queries the specified instance. If you leave this parameter empty, the system queries the most recent instance by default.</p>
     * 
     * <strong>example:</strong>
     * <p>cfw_elasticity_public_cn-*******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeUserBuyVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBuyVersionRequest self = new DescribeUserBuyVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserBuyVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
