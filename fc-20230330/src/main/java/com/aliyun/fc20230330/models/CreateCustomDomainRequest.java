// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateCustomDomainRequest extends TeaModel {
    /**
     * <p>The information about the custom domain name.</p>
     */
    @NameInMap("body")
    public CreateCustomDomainInput body;

    public static CreateCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainRequest self = new CreateCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainRequest setBody(CreateCustomDomainInput body) {
        this.body = body;
        return this;
    }
    public CreateCustomDomainInput getBody() {
        return this.body;
    }

}
