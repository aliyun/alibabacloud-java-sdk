// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateMFAAuthenticationSettingsRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("MFAAuthenticationSettings")
    public String MFAAuthenticationSettings;

    public static UpdateMFAAuthenticationSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMFAAuthenticationSettingsRequest self = new UpdateMFAAuthenticationSettingsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMFAAuthenticationSettingsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public UpdateMFAAuthenticationSettingsRequest setMFAAuthenticationSettings(String MFAAuthenticationSettings) {
        this.MFAAuthenticationSettings = MFAAuthenticationSettings;
        return this;
    }
    public String getMFAAuthenticationSettings() {
        return this.MFAAuthenticationSettings;
    }

}
