// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetMFAAuthenticationSettingsResponseBody extends TeaModel {
    @NameInMap("MFAAuthenticationAdvanceSettings")
    public String MFAAuthenticationAdvanceSettings;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMFAAuthenticationSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMFAAuthenticationSettingsResponseBody self = new GetMFAAuthenticationSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMFAAuthenticationSettingsResponseBody setMFAAuthenticationAdvanceSettings(String MFAAuthenticationAdvanceSettings) {
        this.MFAAuthenticationAdvanceSettings = MFAAuthenticationAdvanceSettings;
        return this;
    }
    public String getMFAAuthenticationAdvanceSettings() {
        return this.MFAAuthenticationAdvanceSettings;
    }

    public GetMFAAuthenticationSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
