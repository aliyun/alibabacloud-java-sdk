// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLogicDatabaseRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("DatabaseIds")
    public java.util.List<Long> databaseIds;

    @NameInMap("Tid")
    public Long tid;

    public static CreateLogicDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogicDatabaseRequest self = new CreateLogicDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogicDatabaseRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateLogicDatabaseRequest setDatabaseIds(java.util.List<Long> databaseIds) {
        this.databaseIds = databaseIds;
        return this;
    }
    public java.util.List<Long> getDatabaseIds() {
        return this.databaseIds;
    }

    public CreateLogicDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
