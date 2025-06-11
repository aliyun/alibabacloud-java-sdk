// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetMFAAuthenticationSettingsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether MFA is enabled for all users. Valid values:</p>
     * <ul>
     * <li>Enabled: MFA is enabled for all users.</li>
     * <li>Byuser: User-specific settings are applied.</li>
     * <li>Disabled: MFA is disabled for all users.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("MFAAuthenticationAdvanceSettings")
    public String MFAAuthenticationAdvanceSettings;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A2BC00C5-76A2-5FFC-A340-927940A98377</p>
     */
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
