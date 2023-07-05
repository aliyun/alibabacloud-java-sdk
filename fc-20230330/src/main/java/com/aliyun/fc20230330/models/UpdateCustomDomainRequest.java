// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateCustomDomainRequest extends TeaModel {
    @NameInMap("body")
    public UpdateCustomDomainInput body;

    public static UpdateCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomDomainRequest self = new UpdateCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomDomainRequest setBody(UpdateCustomDomainInput body) {
        this.body = body;
        return this;
    }
    public UpdateCustomDomainInput getBody() {
        return this.body;
    }

}
