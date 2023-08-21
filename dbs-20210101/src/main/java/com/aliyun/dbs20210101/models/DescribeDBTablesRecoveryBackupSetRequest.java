// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDBTablesRecoveryBackupSetRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionCode")
    public String regionCode;

    public static DescribeDBTablesRecoveryBackupSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBTablesRecoveryBackupSetRequest self = new DescribeDBTablesRecoveryBackupSetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBTablesRecoveryBackupSetRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDBTablesRecoveryBackupSetRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

}
