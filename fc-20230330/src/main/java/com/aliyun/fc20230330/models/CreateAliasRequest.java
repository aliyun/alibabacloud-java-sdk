// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateAliasRequest extends TeaModel {
    @NameInMap("body")
    public CreateAliasInput body;

    public static CreateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasRequest self = new CreateAliasRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliasRequest setBody(CreateAliasInput body) {
        this.body = body;
        return this;
    }
    public CreateAliasInput getBody() {
        return this.body;
    }

}
