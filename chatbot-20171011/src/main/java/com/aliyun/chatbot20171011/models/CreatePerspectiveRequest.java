// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreatePerspectiveRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    public static CreatePerspectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePerspectiveRequest self = new CreatePerspectiveRequest();
        return TeaModel.build(map, self);
    }

    public CreatePerspectiveRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
