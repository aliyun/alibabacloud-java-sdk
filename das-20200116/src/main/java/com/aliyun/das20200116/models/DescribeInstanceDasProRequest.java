// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeInstanceDasProRequest extends TeaModel {
    /**
     * <p>The database instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze8g2am97624****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DescribeInstanceDasProRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDasProRequest self = new DescribeInstanceDasProRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDasProRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
