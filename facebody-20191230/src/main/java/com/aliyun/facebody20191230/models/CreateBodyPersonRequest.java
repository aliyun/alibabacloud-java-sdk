// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateBodyPersonRequest extends TeaModel {
    // 数据库ID
    @NameInMap("DbId")
    public Long dbId;

    // 实体ID，可以包含数字、字母和下划线，相同db下不可以重复，长度1-64。
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
