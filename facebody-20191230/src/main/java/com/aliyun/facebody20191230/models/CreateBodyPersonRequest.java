// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateBodyPersonRequest extends TeaModel {
    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("Name")
    public String name;

    public static CreateBodyPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBodyPersonRequest self = new CreateBodyPersonRequest();
        return TeaModel.build(map, self);
    }

    public CreateBodyPersonRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public CreateBodyPersonRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
