// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteUserDefineTableDataByPrimaryKeyRequest extends TeaModel {
    @NameInMap("Conditions")
    public java.util.Map<String, ?> conditions;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TableIdentifier")
    public String tableIdentifier;

    public static DeleteUserDefineTableDataByPrimaryKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefineTableDataByPrimaryKeyRequest self = new DeleteUserDefineTableDataByPrimaryKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefineTableDataByPrimaryKeyRequest setConditions(java.util.Map<String, ?> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.Map<String, ?> getConditions() {
        return this.conditions;
    }

    public DeleteUserDefineTableDataByPrimaryKeyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteUserDefineTableDataByPrimaryKeyRequest setTableIdentifier(String tableIdentifier) {
        this.tableIdentifier = tableIdentifier;
        return this;
    }
    public String getTableIdentifier() {
        return this.tableIdentifier;
    }

}
