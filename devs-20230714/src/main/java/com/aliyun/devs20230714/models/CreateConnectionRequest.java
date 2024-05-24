// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreateConnectionRequest extends TeaModel {
    @NameInMap("body")
    public Connection body;

    public static CreateConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConnectionRequest self = new CreateConnectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateConnectionRequest setBody(Connection body) {
        this.body = body;
        return this;
    }
    public Connection getBody() {
        return this.body;
    }

}
