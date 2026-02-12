// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainCredentialRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_identifier_test</p>
     */
    @NameInMap("credentialIdentifier")
    public String credentialIdentifier;

    public static ObtainCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        ObtainCredentialRequest self = new ObtainCredentialRequest();
        return TeaModel.build(map, self);
    }

    public ObtainCredentialRequest setCredentialIdentifier(String credentialIdentifier) {
        this.credentialIdentifier = credentialIdentifier;
        return this;
    }
    public String getCredentialIdentifier() {
        return this.credentialIdentifier;
    }

}
