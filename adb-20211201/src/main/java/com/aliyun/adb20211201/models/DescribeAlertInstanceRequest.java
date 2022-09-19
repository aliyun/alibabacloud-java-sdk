// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAlertInstanceRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("InstanceId")
    public Integer instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAlertInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertInstanceRequest self = new DescribeAlertInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertInstanceRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAlertInstanceRequest setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Integer getInstanceId() {
        return this.instanceId;
    }

    public DescribeAlertInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
