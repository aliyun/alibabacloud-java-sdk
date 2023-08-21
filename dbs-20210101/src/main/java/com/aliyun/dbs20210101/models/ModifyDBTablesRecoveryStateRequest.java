// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class ModifyDBTablesRecoveryStateRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionCode")
    public String regionCode;

    @NameInMap("Retention")
    public String retention;

    public static ModifyDBTablesRecoveryStateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBTablesRecoveryStateRequest self = new ModifyDBTablesRecoveryStateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBTablesRecoveryStateRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyDBTablesRecoveryStateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDBTablesRecoveryStateRequest setRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }
    public String getRegionCode() {
        return this.regionCode;
    }

    public ModifyDBTablesRecoveryStateRequest setRetention(String retention) {
        this.retention = retention;
        return this;
    }
    public String getRetention() {
        return this.retention;
    }

}
