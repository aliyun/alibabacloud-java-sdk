// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeCurrentNodeInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeCurrentNodeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCurrentNodeInfoRequest self = new DescribeCurrentNodeInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCurrentNodeInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
