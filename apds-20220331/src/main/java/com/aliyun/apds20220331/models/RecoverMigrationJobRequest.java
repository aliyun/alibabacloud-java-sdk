// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class RecoverMigrationJobRequest extends TeaModel {
    @NameInMap("id")
    public Long id;

    public static RecoverMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        RecoverMigrationJobRequest self = new RecoverMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public RecoverMigrationJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
