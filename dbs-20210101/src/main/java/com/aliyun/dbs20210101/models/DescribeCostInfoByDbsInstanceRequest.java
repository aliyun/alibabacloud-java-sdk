// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeCostInfoByDbsInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dbsr1l3ro21****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionCode")
    public String regionCode;

    public static DescribeCostInfoByDbsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostInfoByDbsInstanceRequest self = new DescribeCostInfoByDbsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCostInfoByDbsInstanceRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DescribeCostInfoByDbsInstanceRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

}
