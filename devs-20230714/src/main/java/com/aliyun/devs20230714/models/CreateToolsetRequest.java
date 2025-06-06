// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreateToolsetRequest extends TeaModel {
    @NameInMap("body")
    public Toolset body;

    public static CreateToolsetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateToolsetRequest self = new CreateToolsetRequest();
        return TeaModel.build(map, self);
    }

    public CreateToolsetRequest setBody(Toolset body) {
        this.body = body;
        return this;
    }
    public Toolset getBody() {
        return this.body;
    }

}
