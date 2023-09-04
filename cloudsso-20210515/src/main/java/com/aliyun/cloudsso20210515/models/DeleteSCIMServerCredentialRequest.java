// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeleteSCIMServerCredentialRequest extends TeaModel {
    /**
     * <p>The ID of the SCIM credential.</p>
     */
    @NameInMap("CredentialId")
    public String credentialId;

    /**
     * <p>The ID of the directory.</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static DeleteSCIMServerCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSCIMServerCredentialRequest self = new DeleteSCIMServerCredentialRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSCIMServerCredentialRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public DeleteSCIMServerCredentialRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
