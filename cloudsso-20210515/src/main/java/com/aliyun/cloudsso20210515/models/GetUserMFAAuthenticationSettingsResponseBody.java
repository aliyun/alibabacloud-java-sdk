// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetUserMFAAuthenticationSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether MFA is enabled for the user. Valid values:</p>
     * <br>
     * <p>*   Enabled: MFA is enabled for the user.</p>
     * <p>*   Disabled: MFA is disabled for the user.</p>
     */
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
