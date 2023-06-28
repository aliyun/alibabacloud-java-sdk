// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateCustomDomainRequest extends TeaModel {
    @NameInMap("request")
    public CreateCustomDomainInput request;

    public static CreateCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainRequest self = new CreateCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainRequest setRequest(CreateCustomDomainInput request) {
        this.request = request;
        return this;
    }
    public CreateCustomDomainInput getRequest() {
        return this.request;
    }

}
