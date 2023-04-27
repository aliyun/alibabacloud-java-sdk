// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateLogicDatabaseShrinkRequest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("DatabaseIds")
    public String databaseIdsShrink;

    @NameInMap("Tid")
    public Long tid;

    public static CreateLogicDatabaseShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogicDatabaseShrinkRequest self = new CreateLogicDatabaseShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogicDatabaseShrinkRequest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public CreateLogicDatabaseShrinkRequest setDatabaseIdsShrink(String databaseIdsShrink) {
        this.databaseIdsShrink = databaseIdsShrink;
        return this;
    }
    public String getDatabaseIdsShrink() {
        return this.databaseIdsShrink;
    }

    public CreateLogicDatabaseShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
