// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyAdvancedBackupStatusRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds-bp114f14849d****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static ModifyAdvancedBackupStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdvancedBackupStatusRequest self = new ModifyAdvancedBackupStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAdvancedBackupStatusRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
