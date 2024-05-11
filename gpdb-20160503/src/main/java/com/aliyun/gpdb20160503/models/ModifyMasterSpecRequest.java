// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyMasterSpecRequest extends TeaModel {
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("MasterCU")
    public Integer masterCU;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyMasterSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMasterSpecRequest self = new ModifyMasterSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMasterSpecRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public ModifyMasterSpecRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyMasterSpecRequest setMasterCU(Integer masterCU) {
        this.masterCU = masterCU;
        return this;
    }
    public Integer getMasterCU() {
        return this.masterCU;
    }

    public ModifyMasterSpecRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
