// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CreateBodyDbRequest extends TeaModel {
    // 数据库名称
    @NameInMap("Name")
    public String name;

    public static CreateBodyDbRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBodyDbRequest self = new CreateBodyDbRequest();
        return TeaModel.build(map, self);
    }

    public CreateBodyDbRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
