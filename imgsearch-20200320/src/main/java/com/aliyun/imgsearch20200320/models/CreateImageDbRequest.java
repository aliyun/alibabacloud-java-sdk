// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imgsearch20200320.models;

import com.aliyun.tea.*;

public class CreateImageDbRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static CreateImageDbRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDbRequest self = new CreateImageDbRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageDbRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
