// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class EditLogicDatabaseShrinkRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("DatabaseIds")
    public String databaseIdsShrink;

    @NameInMap("LogicDbId")
    public Long logicDbId;

    @NameInMap("Tid")
    public Long tid;

    public static EditLogicDatabaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        EditLogicDatabaseShrinkRequest self = new EditLogicDatabaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public EditLogicDatabaseShrinkRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public EditLogicDatabaseShrinkRequest setDatabaseIdsShrink(String databaseIdsShrink) {
        this.databaseIdsShrink = databaseIdsShrink;
        return this;
    }
    public String getDatabaseIdsShrink() {
        return this.databaseIdsShrink;
    }

    public EditLogicDatabaseShrinkRequest setLogicDbId(Long logicDbId) {
        this.logicDbId = logicDbId;
        return this;
    }
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    public EditLogicDatabaseShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
