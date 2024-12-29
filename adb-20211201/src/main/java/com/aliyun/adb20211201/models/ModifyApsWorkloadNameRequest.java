// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyApsWorkloadNameRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkloadId")
    public String workloadId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkloadName")
    public String workloadName;

    public static ModifyApsWorkloadNameRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApsWorkloadNameRequest self = new ModifyApsWorkloadNameRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApsWorkloadNameRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyApsWorkloadNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyApsWorkloadNameRequest setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
    }

    public ModifyApsWorkloadNameRequest setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
        return this;
    }
    public String getWorkloadName() {
        return this.workloadName;
    }

}
