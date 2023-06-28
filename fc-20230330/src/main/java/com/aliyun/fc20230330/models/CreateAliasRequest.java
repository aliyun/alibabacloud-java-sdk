// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateAliasRequest extends TeaModel {
    @NameInMap("request")
    public CreateAliasInput request;

    public static CreateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasRequest self = new CreateAliasRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliasRequest setRequest(CreateAliasInput request) {
        this.request = request;
        return this;
    }
    public CreateAliasInput getRequest() {
        return this.request;
    }

}
