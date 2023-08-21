// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDBTablesRecoveryTimeRangeRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionCode")
    public String regionCode;

    public static DescribeDBTablesRecoveryTimeRangeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBTablesRecoveryTimeRangeRequest self = new DescribeDBTablesRecoveryTimeRangeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBTablesRecoveryTimeRangeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDBTablesRecoveryTimeRangeRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

}
