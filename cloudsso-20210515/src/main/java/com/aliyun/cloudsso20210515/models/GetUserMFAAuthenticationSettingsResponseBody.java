// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserMFAAuthenticationSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserMFAAuthenticationSettings")
    public String userMFAAuthenticationSettings;

    public static GetUserMFAAuthenticationSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAAuthenticationSettingsResponseBody self = new GetUserMFAAuthenticationSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserMFAAuthenticationSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserMFAAuthenticationSettingsResponseBody setUserMFAAuthenticationSettings(String userMFAAuthenticationSettings) {
        this.userMFAAuthenticationSettings = userMFAAuthenticationSettings;
        return this;
    }
    public String getUserMFAAuthenticationSettings() {
        return this.userMFAAuthenticationSettings;
    }

}
