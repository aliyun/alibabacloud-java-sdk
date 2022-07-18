// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateStressRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static CreateStressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStressRequest self = new CreateStressRequest();
        return TeaModel.build(map, self);
    }

    public CreateStressRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
