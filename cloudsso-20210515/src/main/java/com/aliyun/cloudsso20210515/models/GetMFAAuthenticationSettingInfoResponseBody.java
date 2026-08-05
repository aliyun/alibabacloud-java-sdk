// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class GetMFAAuthenticationSettingInfoResponseBody extends TeaModel {
    /**
     * <p>The global MFA verification configuration.</p>
     */
    @NameInMap("MFAAuthenticationSettingInfo")
    public GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo MFAAuthenticationSettingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>95D3B107-DA80-5B34-A3D0-9E82F8F0DA0E</p>
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
        @NameInMap("AllowedVerificationTypes")
        public java.util.List<String> allowedVerificationTypes;

        /**
         * <p>The global MFA verification policy. Valid values:</p>
         * <ul>
         * <li>Enabled: MFA verification is enabled for all users.</li>
         * <li>Byuser: MFA verification depends on the independent MFA configuration of each user. For more information about user-specific MFA configuration, see <a href="https://help.aliyun.com/document_detail/450135.html">UpdateUserMFAAuthenticationSettings</a>.</li>
         * <li>Disabled: MFA verification is disabled for all users.</li>
         * <li>OnlyRiskyLogin: MFA verification is required only for unusual logon attempts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OnlyRiskyLogin</p>
         */
        @NameInMap("MfaAuthenticationAdvanceSettings")
        public String mfaAuthenticationAdvanceSettings;

        /**
         * <p>The MFA verification policy for unusual logon attempts. Valid values:</p>
         * <ul>
         * <li>Autonomous: Users can skip MFA binding during unusual logon, but users who have already bound MFA must complete verification.</li>
         * <li>EnforceVerify: Users are required to bind or verify MFA during unusual logon.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is displayed only when MfaAuthenticationAdvanceSettings is set to Byuser or OnlyRiskyLogin.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>EnforceVerify</p>
         */
        @NameInMap("OperationForRiskLogin")
        public String operationForRiskLogin;

        public static GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo self = new GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo();
            return TeaModel.build(map, self);
        }

        public GetMFAAuthenticationSettingInfoResponseBodyMFAAuthenticationSettingInfo setAllowedVerificationTypes(java.util.List<String> allowedVerificationTypes) {
            this.allowedVerificationTypes = allowedVerificationTypes;
            return this;
        }
        public java.util.List<String> getAllowedVerificationTypes() {
            return this.allowedVerificationTypes;
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
