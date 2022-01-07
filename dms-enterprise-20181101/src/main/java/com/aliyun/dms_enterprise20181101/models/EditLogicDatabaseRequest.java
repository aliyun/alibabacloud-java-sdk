// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EditLogicDatabaseRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("DatabaseIds")
    public java.util.List<Long> databaseIds;

    @NameInMap("LogicDbId")
    public Long logicDbId;

    @NameInMap("Tid")
    public Long tid;

    public static EditLogicDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        EditLogicDatabaseRequest self = new EditLogicDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public EditLogicDatabaseRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public EditLogicDatabaseRequest setDatabaseIds(java.util.List<Long> databaseIds) {
        this.databaseIds = databaseIds;
        return this;
    }
    public java.util.List<Long> getDatabaseIds() {
        return this.databaseIds;
    }

    public EditLogicDatabaseRequest setLogicDbId(Long logicDbId) {
        this.logicDbId = logicDbId;
        return this;
    }
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    public EditLogicDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
