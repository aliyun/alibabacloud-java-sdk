// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class UpdateCustomDomainRequest extends TeaModel {
    @NameInMap("request")
    public UpdateCustomDomainInput request;

    public static UpdateCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomDomainRequest self = new UpdateCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomDomainRequest setRequest(UpdateCustomDomainInput request) {
        this.request = request;
        return this;
    }
    public UpdateCustomDomainInput getRequest() {
        return this.request;
    }

}
