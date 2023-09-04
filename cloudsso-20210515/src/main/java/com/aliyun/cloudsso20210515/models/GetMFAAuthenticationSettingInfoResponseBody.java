// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetMFAAuthenticationSettingInfoResponseBody extends TeaModel {
    /**
     * <p>The MFA setting of all users.</p>
     */
    @NameInMap("MFAAuthenticationSettingInfo")
    public GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo MFAAuthenticationSettingInfo;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMFAAuthenticationSettingInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMFAAuthenticationSettingInfoResponseBody self = new GetMFAAuthenticationSettingInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMFAAuthenticationSettingInfoResponseBody setMFAAuthenticationSettingInfo(GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo MFAAuthenticationSettingInfo) {
        this.MFAAuthenticationSettingInfo = MFAAuthenticationSettingInfo;
        return this;
    }
    public GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo getMFAAuthenticationSettingInfo() {
        return this.MFAAuthenticationSettingInfo;
    }

    public GetMFAAuthenticationSettingInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo extends TeaModel {
        /**
         * <p>The MFA policy of all users. Valid values:</p>
         * <br>
         * <p>*   Enabled: MFA is enabled for all users.</p>
         * <p>*   Byuser: User-specific settings are applied. For more information about how to configure MFA for a single user, see [UpdateUserMFAAuthenticationSettings](~~450135~~).</p>
         * <p>*   Disabled: MFA is disabled for all users.</p>
         * <p>*   OnlyRiskyLogin: MFA is required only for unusual logons.</p>
         */
        @NameInMap("MfaAuthenticationAdvanceSettings")
        public String mfaAuthenticationAdvanceSettings;

        /**
         * <p>The MFA policy for unusual logons. Valid values:</p>
         * <br>
         * <p>*   Autonomous: MFA is prompted for users who initiated unusual logons. However, the users are allowed to skip MFA. If an MFA device is bound to a user who initiated an unusual logon, the user must pass MFA.</p>
         * <p>*   EnforceVerify: MFA is required. If no MFA devices are bound to a user who initiated an unusual logon, the user must bind an MFA device. If an MFA device is already bound to a user who initiated an unusual logon, the user must pass MFA.</p>
         * <br>
         * <p>> This parameter is displayed only when Byuser or OnlyRiskyLogin is returned for the MfaAuthenticationAdvanceSettings parameter.</p>
         */
        @NameInMap("OperationForRiskLogin")
        public String operationForRiskLogin;

        public static GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo self = new GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo();
            return TeaModel.build(map, self);
        }

        public GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo setMfaAuthenticationAdvanceSettings(String mfaAuthenticationAdvanceSettings) {
            this.mfaAuthenticationAdvanceSettings = mfaAuthenticationAdvanceSettings;
            return this;
        }
        public String getMfaAuthenticationAdvanceSettings() {
            return this.mfaAuthenticationAdvanceSettings;
        }

        public GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo setOperationForRiskLogin(String operationForRiskLogin) {
            this.operationForRiskLogin = operationForRiskLogin;
            return this;
        }
        public String getOperationForRiskLogin() {
            return this.operationForRiskLogin;
        }

    }

}
