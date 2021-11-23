// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceDescriptionRequest extends TeaModel {
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    public static ModifyDBInstanceDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceDescriptionRequest self = new ModifyDBInstanceDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceDescriptionRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public ModifyDBInstanceDescriptionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
