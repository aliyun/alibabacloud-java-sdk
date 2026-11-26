// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class SetSecurityInfoPreferenceRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow CloudSSO users in the directory to manage their security email addresses in the CloudSSO user portal, including setting, modifying, and deleting security email addresses, and sending verification emails. Valid values:</p>
     * <ul>
     * <li>true: allowed.</li>
     * <li>false: not allowed.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowUserManageSecurityEmail")
    public Boolean allowUserManageSecurityEmail;

    /**
     * <p>The directory ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    public static SetSecurityInfoPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityInfoPreferenceRequest self = new SetSecurityInfoPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public SetSecurityInfoPreferenceRequest setAllowUserManageSecurityEmail(Boolean allowUserManageSecurityEmail) {
        this.allowUserManageSecurityEmail = allowUserManageSecurityEmail;
        return this;
    }
    public Boolean getAllowUserManageSecurityEmail() {
        return this.allowUserManageSecurityEmail;
    }

    public SetSecurityInfoPreferenceRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

}
