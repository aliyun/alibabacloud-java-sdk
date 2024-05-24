// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class CreateRepositoryRequest extends TeaModel {
    @NameInMap("body")
    public Repository body;

    public static CreateRepositoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryRequest self = new CreateRepositoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryRequest setBody(Repository body) {
        this.body = body;
        return this;
    }
    public Repository getBody() {
        return this.body;
    }

}
