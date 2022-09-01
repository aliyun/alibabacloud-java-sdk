// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateUserMFAAuthenticationSettingsRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("UserId")
    public String userId;

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
