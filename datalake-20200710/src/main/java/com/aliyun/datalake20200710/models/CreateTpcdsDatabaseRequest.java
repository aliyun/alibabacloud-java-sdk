// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateTpcdsDatabaseRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    public static CreateTpcdsDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTpcdsDatabaseRequest self = new CreateTpcdsDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateTpcdsDatabaseRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
