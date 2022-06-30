// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DeleteMigrationJobRequest extends TeaModel {
    @NameInMap("id")
    public Long id;

    public static DeleteMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigrationJobRequest self = new DeleteMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMigrationJobRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
