// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserMFAAuthenticationSettingsRequest extends TeaModel {
    /**
     * <p>The ID of the directory.</p>
     * 
     * <strong>example:</strong>
     * <p>d-00fc2p61****</p>
     */
    @NameInMap("DirectoryId")
    public String directoryId;

    /**
     * <p>The ID of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>u-00q8wbq42wiltcrk****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>Specifies whether to enable MFA for the user. Valid values:</p>
     * <ul>
     * <li>Enabled: enables MFA for the user.</li>
     * <li>Disabled: disables MFA for the user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("UserMFAAuthenticationSettings")
    public String userMFAAuthenticationSettings;

    public static UpdateUserMFAAuthenticationSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserMFAAuthenticationSettingsRequest self = new UpdateUserMFAAuthenticationSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserMFAAuthenticationSettingsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateUserMFAAuthenticationSettingsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateUserMFAAuthenticationSettingsRequest setUserMFAAuthenticationSettings(String userMFAAuthenticationSettings) {
        this.userMFAAuthenticationSettings = userMFAAuthenticationSettings;
        return this;
    }
    public String getUserMFAAuthenticationSettings() {
        return this.userMFAAuthenticationSettings;
    }

}
