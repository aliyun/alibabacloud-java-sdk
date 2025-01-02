// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserBuyVersionRequest extends TeaModel {
    /**
     * <p>Instance ID. If the Instance ID is provided, the query will be based on this ID. If not provided, the latest instance will be queried by default.</p>
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
