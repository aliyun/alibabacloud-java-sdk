// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountQueryLoginSettingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public EnterpriseAccountQueryLoginSettingsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseAccountQueryLoginSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountQueryLoginSettingsResponseBody self = new EnterpriseAccountQueryLoginSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountQueryLoginSettingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseAccountQueryLoginSettingsResponseBody setData(EnterpriseAccountQueryLoginSettingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnterpriseAccountQueryLoginSettingsResponseBodyData getData() {
        return this.data;
    }

    public EnterpriseAccountQueryLoginSettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseAccountQueryLoginSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountQueryLoginSettingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseAccountQueryLoginSettingsResponseBodyDataIpMaskDto extends TeaModel {
        @NameInMap("IpMaskEnabledStatus")
        public String ipMaskEnabledStatus;

        @NameInMap("IpMasks")
        public java.util.List<String> ipMasks;

        public static EnterpriseAccountQueryLoginSettingsResponseBodyDataIpMaskDto build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseAccountQueryLoginSettingsResponseBodyDataIpMaskDto self = new EnterpriseAccountQueryLoginSettingsResponseBodyDataIpMaskDto();
            return TeaModel.build(map, self);
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyDataIpMaskDto setIpMaskEnabledStatus(String ipMaskEnabledStatus) {
            this.ipMaskEnabledStatus = ipMaskEnabledStatus;
            return this;
        }
        public String getIpMaskEnabledStatus() {
            return this.ipMaskEnabledStatus;
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyDataIpMaskDto setIpMasks(java.util.List<String> ipMasks) {
            this.ipMasks = ipMasks;
            return this;
        }
        public java.util.List<String> getIpMasks() {
            return this.ipMasks;
        }

    }

    public static class EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto extends TeaModel {
        @NameInMap("ProtectLevel")
        public String protectLevel;

        @NameInMap("RiskControlEnabled")
        public Boolean riskControlEnabled;

        @NameInMap("VerifyDetail")
        public String verifyDetail;

        @NameInMap("VerifyType")
        public String verifyType;

        public static EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto self = new EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto();
            return TeaModel.build(map, self);
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto setProtectLevel(String protectLevel) {
            this.protectLevel = protectLevel;
            return this;
        }
        public String getProtectLevel() {
            return this.protectLevel;
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto setRiskControlEnabled(Boolean riskControlEnabled) {
            this.riskControlEnabled = riskControlEnabled;
            return this;
        }
        public Boolean getRiskControlEnabled() {
            return this.riskControlEnabled;
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto setVerifyDetail(String verifyDetail) {
            this.verifyDetail = verifyDetail;
            return this;
        }
        public String getVerifyDetail() {
            return this.verifyDetail;
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto setVerifyType(String verifyType) {
            this.verifyType = verifyType;
            return this;
        }
        public String getVerifyType() {
            return this.verifyType;
        }

    }

    public static class EnterpriseAccountQueryLoginSettingsResponseBodyData extends TeaModel {
        @NameInMap("IpMaskDto")
        public EnterpriseAccountQueryLoginSettingsResponseBodyDataIpMaskDto ipMaskDto;

        @NameInMap("MfaBindStatus")
        public String mfaBindStatus;

        @NameInMap("RiskControlDto")
        public EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto riskControlDto;

        @NameInMap("SecurityMobileLoginStatus")
        public String securityMobileLoginStatus;

        @NameInMap("SessionExpireTime")
        public Integer sessionExpireTime;

        public static EnterpriseAccountQueryLoginSettingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseAccountQueryLoginSettingsResponseBodyData self = new EnterpriseAccountQueryLoginSettingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyData setIpMaskDto(EnterpriseAccountQueryLoginSettingsResponseBodyDataIpMaskDto ipMaskDto) {
            this.ipMaskDto = ipMaskDto;
            return this;
        }
        public EnterpriseAccountQueryLoginSettingsResponseBodyDataIpMaskDto getIpMaskDto() {
            return this.ipMaskDto;
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyData setMfaBindStatus(String mfaBindStatus) {
            this.mfaBindStatus = mfaBindStatus;
            return this;
        }
        public String getMfaBindStatus() {
            return this.mfaBindStatus;
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyData setRiskControlDto(EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto riskControlDto) {
            this.riskControlDto = riskControlDto;
            return this;
        }
        public EnterpriseAccountQueryLoginSettingsResponseBodyDataRiskControlDto getRiskControlDto() {
            return this.riskControlDto;
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyData setSecurityMobileLoginStatus(String securityMobileLoginStatus) {
            this.securityMobileLoginStatus = securityMobileLoginStatus;
            return this;
        }
        public String getSecurityMobileLoginStatus() {
            return this.securityMobileLoginStatus;
        }

        public EnterpriseAccountQueryLoginSettingsResponseBodyData setSessionExpireTime(Integer sessionExpireTime) {
            this.sessionExpireTime = sessionExpireTime;
            return this;
        }
        public Integer getSessionExpireTime() {
            return this.sessionExpireTime;
        }

    }

}
