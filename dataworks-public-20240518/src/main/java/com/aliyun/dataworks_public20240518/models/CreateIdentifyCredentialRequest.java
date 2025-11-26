// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateIdentifyCredentialRequest extends TeaModel {
    @NameInMap("IdentifyCredential")
    public IdentifyCredential identifyCredential;

    public static CreateIdentifyCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentifyCredentialRequest self = new CreateIdentifyCredentialRequest();
        return TeaModel.build(map, self);
    }

    public CreateIdentifyCredentialRequest setIdentifyCredential(IdentifyCredential identifyCredential) {
        this.identifyCredential = identifyCredential;
        return this;
    }
    public IdentifyCredential getIdentifyCredential() {
        return this.identifyCredential;
    }

}
