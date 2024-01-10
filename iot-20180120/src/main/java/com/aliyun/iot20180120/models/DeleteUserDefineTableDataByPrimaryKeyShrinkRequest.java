// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteUserDefineTableDataByPrimaryKeyShrinkRequest extends TeaModel {
    @NameInMap("Conditions")
    public String conditionsShrink;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("TableIdentifier")
    public String tableIdentifier;

    public static DeleteUserDefineTableDataByPrimaryKeyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserDefineTableDataByPrimaryKeyShrinkRequest self = new DeleteUserDefineTableDataByPrimaryKeyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserDefineTableDataByPrimaryKeyShrinkRequest setConditionsShrink(String conditionsShrink) {
        this.conditionsShrink = conditionsShrink;
        return this;
    }
    public String getConditionsShrink() {
        return this.conditionsShrink;
    }

    public DeleteUserDefineTableDataByPrimaryKeyShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteUserDefineTableDataByPrimaryKeyShrinkRequest setTableIdentifier(String tableIdentifier) {
        this.tableIdentifier = tableIdentifier;
        return this;
    }
    public String getTableIdentifier() {
        return this.tableIdentifier;
    }

}
