// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInstanceForIsvRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>155****11</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceForIsvRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceForIsvRequest self = new DescribeInstanceForIsvRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceForIsvRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
