// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DescribeXsInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeXsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeXsInstanceRequest self = new DescribeXsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeXsInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
