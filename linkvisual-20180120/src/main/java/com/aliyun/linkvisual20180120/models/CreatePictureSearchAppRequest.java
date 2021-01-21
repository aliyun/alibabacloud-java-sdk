// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreatePictureSearchAppRequest extends TeaModel {
    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("Desc")
    @Validation(required = true)
    public String desc;

    public static CreatePictureSearchAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePictureSearchAppRequest self = new CreatePictureSearchAppRequest();
        return TeaModel.build(map, self);
    }

    public CreatePictureSearchAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePictureSearchAppRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
