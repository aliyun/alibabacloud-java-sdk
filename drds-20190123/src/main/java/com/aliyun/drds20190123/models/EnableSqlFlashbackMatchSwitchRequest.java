// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableSqlFlashbackMatchSwitchRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static EnableSqlFlashbackMatchSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlFlashbackMatchSwitchRequest self = new EnableSqlFlashbackMatchSwitchRequest();
        return TeaModel.build(map, self);
    }

    public EnableSqlFlashbackMatchSwitchRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public EnableSqlFlashbackMatchSwitchRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
