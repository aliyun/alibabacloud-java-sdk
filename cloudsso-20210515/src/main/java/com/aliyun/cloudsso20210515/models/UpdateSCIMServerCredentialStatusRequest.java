// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateSCIMServerCredentialStatusRequest extends TeaModel {
    @NameInMap("CredentialId")
    public String credentialId;

    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("NewStatus")
    public String newStatus;

    public static UpdateSCIMServerCredentialStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSCIMServerCredentialStatusRequest self = new UpdateSCIMServerCredentialStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSCIMServerCredentialStatusRequest setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }
    public String getCredentialId() {
        return this.credentialId;
    }

    public UpdateSCIMServerCredentialStatusRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateSCIMServerCredentialStatusRequest setNewStatus(String newStatus) {
        this.newStatus = newStatus;
        return this;
    }
    public String getNewStatus() {
        return this.newStatus;
    }

}
