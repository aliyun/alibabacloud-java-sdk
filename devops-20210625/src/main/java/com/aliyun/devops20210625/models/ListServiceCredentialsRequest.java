// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListServiceCredentialsRequest extends TeaModel {
    @NameInMap("serviceCredentialType")
    public String serviceCredentialType;

    public static ListServiceCredentialsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceCredentialsRequest self = new ListServiceCredentialsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceCredentialsRequest setServiceCredentialType(String serviceCredentialType) {
        this.serviceCredentialType = serviceCredentialType;
        return this;
    }
    public String getServiceCredentialType() {
        return this.serviceCredentialType;
    }

}
