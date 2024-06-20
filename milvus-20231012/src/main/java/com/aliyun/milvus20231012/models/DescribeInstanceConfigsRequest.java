// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-123xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceConfigsRequest self = new DescribeInstanceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceConfigsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
