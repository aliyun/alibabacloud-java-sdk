// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DeleteMigrationGroupRequest extends TeaModel {
    @NameInMap("id")
    public Long id;

    public static DeleteMigrationGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigrationGroupRequest self = new DeleteMigrationGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMigrationGroupRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
