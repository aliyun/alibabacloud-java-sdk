// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CreateEnvironmentSnapshotRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    public static CreateEnvironmentSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvironmentSnapshotRequest self = new CreateEnvironmentSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvironmentSnapshotRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateEnvironmentSnapshotRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
