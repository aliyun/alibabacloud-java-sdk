// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class CreateUserExclusiveCredentialResponseBody extends TeaModel {
    @NameInMap("credentialCiphertext")
    public String credentialCiphertext;

    /**
     * <p>The credential ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cred_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
     */
    @NameInMap("credentialId")
    public String credentialId;

    /**
     * <p>The credential identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>credential_identifier_test</p>
     */
    @NameInMap("credentialIdentifier")
    public String credentialIdentifier;

    public static CreateUserExclusiveCredentialResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserExclusiveCredentialResponseBody self = new CreateUserExclusiveCredentialResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserExclusiveCredentialResponseBody setCredentialCiphertext(String credentialCiphertext) {
        this.credentialCiphertext = credentialCiphertext;
        return this;
    }
    public String getCredentialCiphertext() {
        return this.credentialCiphertext;
    }

    public CreateUserExclusiveCredentialResponseBody setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public CreateUserExclusiveCredentialResponseBody setCredentialIdentifier(String credentialIdentifier) {
        this.credentialIdentifier = credentialIdentifier;
        return this;
    }
    public String getCredentialIdentifier() {
        return this.credentialIdentifier;
    }

}
