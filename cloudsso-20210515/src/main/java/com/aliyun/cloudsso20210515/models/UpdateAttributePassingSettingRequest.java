// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateAttributePassingSettingRequest extends TeaModel {
    /**
     * <p>The directory ID.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The SourceIdentity pass-through mode. Three pass-through modes are supported. If this parameter is not specified, the existing configuration is not modified.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>IdP: Uses the SourceIdentity attribute value carried in the SAML assertion from the external identity provider (IdP). The attribute value must be 2 to 64 characters in length and can contain only letters, digits, and the following special characters: =,.@-_.</li>
     * <li>UserName: Uses the CloudSSO username as the SourceIdentity. The system automatically adds a reserved prefix, resulting in the format acs:sso:<username>, with a total length of no more than 64 characters.</li>
     * <li>Disabled: Does not pass through SourceIdentity.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("SourceIdentityPassing")
    public String sourceIdentityPassing;

    public static UpdateAttributePassingSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttributePassingSettingRequest self = new UpdateAttributePassingSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAttributePassingSettingRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateAttributePassingSettingRequest setSourceIdentityPassing(String sourceIdentityPassing) {
        this.sourceIdentityPassing = sourceIdentityPassing;
        return this;
    }
    public String getSourceIdentityPassing() {
        return this.sourceIdentityPassing;
    }

}
