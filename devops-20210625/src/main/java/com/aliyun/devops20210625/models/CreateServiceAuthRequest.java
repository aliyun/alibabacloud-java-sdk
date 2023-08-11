// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateServiceAuthRequest extends TeaModel {
    @NameInMap("serviceAuthType")
    public String serviceAuthType;

    public static CreateServiceAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceAuthRequest self = new CreateServiceAuthRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceAuthRequest setServiceAuthType(String serviceAuthType) {
        this.serviceAuthType = serviceAuthType;
        return this;
    }
    public String getServiceAuthType() {
        return this.serviceAuthType;
    }

}
