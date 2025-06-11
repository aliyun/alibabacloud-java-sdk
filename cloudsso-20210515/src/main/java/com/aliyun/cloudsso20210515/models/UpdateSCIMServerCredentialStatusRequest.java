// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateSCIMServerCredentialStatusRequest extends TeaModel {
    /**
     * <p>The ID of the SCIM credential.</p>
     * 
     * <strong>example:</strong>
     * <p>scimcred-004whl0kvfwcypbi****</p>
     */
    @NameInMap("CredentialId")
    public String credentialId;

    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The new status of the SCIM credential. Valid values:</p>
     * <ul>
     * <li>Enabled: The SCIM credential is enabled.</li>
     * <li>Disabled: The SCIM credential is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
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
