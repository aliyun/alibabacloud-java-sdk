// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAlertGroupRequest extends TeaModel {
    @NameInMap("AlertGroupId")
    public Integer alertGroupId;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAlertGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertGroupRequest self = new DescribeAlertGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertGroupRequest setAlertGroupId(Integer alertGroupId) {
        this.alertGroupId = alertGroupId;
        return this;
    }
    public Integer getAlertGroupId() {
        return this.alertGroupId;
    }

    public DescribeAlertGroupRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeAlertGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
