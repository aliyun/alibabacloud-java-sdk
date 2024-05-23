// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeInstanceVncUrlRequest extends TeaModel {
    /**
     * <p>The ID of the instance</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceVncUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceVncUrlRequest self = new DescribeInstanceVncUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceVncUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
