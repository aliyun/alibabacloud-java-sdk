// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDBTablesRecoveryStateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionCode")
    public String regionCode;

    public static DescribeDBTablesRecoveryStateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBTablesRecoveryStateRequest self = new DescribeDBTablesRecoveryStateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBTablesRecoveryStateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDBTablesRecoveryStateRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

}
