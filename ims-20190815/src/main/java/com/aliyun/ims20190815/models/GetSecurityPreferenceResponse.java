// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetSecurityPreferenceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecurityPreference")
    @Validation(required = true)
    public GetSecurityPreferenceResponseSecurityPreference securityPreference;

    public static GetSecurityPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityPreferenceResponse self = new GetSecurityPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public GetSecurityPreferenceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityPreferenceResponse setSecurityPreference(GetSecurityPreferenceResponseSecurityPreference securityPreference) {
        this.securityPreference = securityPreference;
        return this;
    }
    public GetSecurityPreferenceResponseSecurityPreference getSecurityPreference() {
        return this.securityPreference;
    }

    public static class GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference extends TeaModel {
        @NameInMap("EnableSaveMFATicket")
        @Validation(required = true)
        public Boolean enableSaveMFATicket;

        @NameInMap("AllowUserToChangePassword")
        @Validation(required = true)
        public Boolean allowUserToChangePassword;

        @NameInMap("LoginSessionDuration")
        @Validation(required = true)
        public Integer loginSessionDuration;

        @NameInMap("LoginNetworkMasks")
        @Validation(required = true)
        public String loginNetworkMasks;

        public static GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference self = new GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }
        public Boolean getEnableSaveMFATicket() {
            return this.enableSaveMFATicket;
        }

        public GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
            this.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }
        public Boolean getAllowUserToChangePassword() {
            return this.allowUserToChangePassword;
        }

        public GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference setLoginSessionDuration(Integer loginSessionDuration) {
            this.loginSessionDuration = loginSessionDuration;
            return this;
        }
        public Integer getLoginSessionDuration() {
            return this.loginSessionDuration;
        }

        public GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference setLoginNetworkMasks(String loginNetworkMasks) {
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }
        public String getLoginNetworkMasks() {
            return this.loginNetworkMasks;
        }

    }

    public static class GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference extends TeaModel {
        @NameInMap("AllowUserToManageAccessKeys")
        @Validation(required = true)
        public Boolean allowUserToManageAccessKeys;

        public static GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference self = new GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }
        public Boolean getAllowUserToManageAccessKeys() {
            return this.allowUserToManageAccessKeys;
        }

    }

    public static class GetSecurityPreferenceResponseSecurityPreferenceMFAPreference extends TeaModel {
        @NameInMap("AllowUserToManageMFADevices")
        @Validation(required = true)
        public Boolean allowUserToManageMFADevices;

        public static GetSecurityPreferenceResponseSecurityPreferenceMFAPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseSecurityPreferenceMFAPreference self = new GetSecurityPreferenceResponseSecurityPreferenceMFAPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseSecurityPreferenceMFAPreference setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
            this.allowUserToManageMFADevices = allowUserToManageMFADevices;
            return this;
        }
        public Boolean getAllowUserToManageMFADevices() {
            return this.allowUserToManageMFADevices;
        }

    }

    public static class GetSecurityPreferenceResponseSecurityPreference extends TeaModel {
        @NameInMap("LoginProfilePreference")
        @Validation(required = true)
        public GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference loginProfilePreference;

        @NameInMap("AccessKeyPreference")
        @Validation(required = true)
        public GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference accessKeyPreference;

        @NameInMap("MFAPreference")
        @Validation(required = true)
        public GetSecurityPreferenceResponseSecurityPreferenceMFAPreference MFAPreference;

        public static GetSecurityPreferenceResponseSecurityPreference build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityPreferenceResponseSecurityPreference self = new GetSecurityPreferenceResponseSecurityPreference();
            return TeaModel.build(map, self);
        }

        public GetSecurityPreferenceResponseSecurityPreference setLoginProfilePreference(GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference loginProfilePreference) {
            this.loginProfilePreference = loginProfilePreference;
            return this;
        }
        public GetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference getLoginProfilePreference() {
            return this.loginProfilePreference;
        }

        public GetSecurityPreferenceResponseSecurityPreference setAccessKeyPreference(GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference accessKeyPreference) {
            this.accessKeyPreference = accessKeyPreference;
            return this;
        }
        public GetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference getAccessKeyPreference() {
            return this.accessKeyPreference;
        }

        public GetSecurityPreferenceResponseSecurityPreference setMFAPreference(GetSecurityPreferenceResponseSecurityPreferenceMFAPreference MFAPreference) {
            this.MFAPreference = MFAPreference;
            return this;
        }
        public GetSecurityPreferenceResponseSecurityPreferenceMFAPreference getMFAPreference() {
            return this.MFAPreference;
        }

    }

}
