// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectOperateLogsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeProjectOperateLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectOperateLogsRequest self = new DescribeProjectOperateLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectOperateLogsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
