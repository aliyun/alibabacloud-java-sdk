// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectInfoRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeProjectInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectInfoRequest self = new DescribeProjectInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
