// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserMFAAuthenticationSettingsRequest extends TeaModel {
    @NameInMap("DirectoryId")
    public String directoryId;

    @NameInMap("UserId")
    public String userId;

    public static GetUserMFAAuthenticationSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAAuthenticationSettingsRequest self = new GetUserMFAAuthenticationSettingsRequest();
        return TeaModel.build(map, self);
    }

    public GetUserMFAAuthenticationSettingsRequest setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }
    public String getDirectoryId() {
        return this.directoryId;
    }

    public GetUserMFAAuthenticationSettingsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
