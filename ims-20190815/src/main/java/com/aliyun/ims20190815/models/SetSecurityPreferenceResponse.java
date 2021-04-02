// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetSecurityPreferenceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SecurityPreference")
    @Validation(required = true)
    public SetSecurityPreferenceResponseSecurityPreference securityPreference;

    public static SetSecurityPreferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSecurityPreferenceResponse self = new SetSecurityPreferenceResponse();
        return TeaModel.build(map, self);
    }

    public SetSecurityPreferenceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetSecurityPreferenceResponse setSecurityPreference(SetSecurityPreferenceResponseSecurityPreference securityPreference) {
        this.securityPreference = securityPreference;
        return this;
    }
    public SetSecurityPreferenceResponseSecurityPreference getSecurityPreference() {
        return this.securityPreference;
    }

    public static class SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference extends TeaModel {
        @NameInMap("LoginSessionDuration")
        @Validation(required = true)
        public Integer loginSessionDuration;

        @NameInMap("LoginNetworkMasks")
        @Validation(required = true)
        public String loginNetworkMasks;

        @NameInMap("AllowUserToChangePassword")
        @Validation(required = true)
        public Boolean allowUserToChangePassword;

        @NameInMap("EnableSaveMFATicket")
        @Validation(required = true)
        public Boolean enableSaveMFATicket;

        public static SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference self = new SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference setLoginSessionDuration(Integer loginSessionDuration) {
            this.loginSessionDuration = loginSessionDuration;
            return this;
        }
        public Integer getLoginSessionDuration() {
            return this.loginSessionDuration;
        }

        public SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference setLoginNetworkMasks(String loginNetworkMasks) {
            this.loginNetworkMasks = loginNetworkMasks;
            return this;
        }
        public String getLoginNetworkMasks() {
            return this.loginNetworkMasks;
        }

        public SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference setAllowUserToChangePassword(Boolean allowUserToChangePassword) {
            this.allowUserToChangePassword = allowUserToChangePassword;
            return this;
        }
        public Boolean getAllowUserToChangePassword() {
            return this.allowUserToChangePassword;
        }

        public SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference setEnableSaveMFATicket(Boolean enableSaveMFATicket) {
            this.enableSaveMFATicket = enableSaveMFATicket;
            return this;
        }
        public Boolean getEnableSaveMFATicket() {
            return this.enableSaveMFATicket;
        }

    }

    public static class SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference extends TeaModel {
        @NameInMap("AllowUserToManageAccessKeys")
        @Validation(required = true)
        public Boolean allowUserToManageAccessKeys;

        public static SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference self = new SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference setAllowUserToManageAccessKeys(Boolean allowUserToManageAccessKeys) {
            this.allowUserToManageAccessKeys = allowUserToManageAccessKeys;
            return this;
        }
        public Boolean getAllowUserToManageAccessKeys() {
            return this.allowUserToManageAccessKeys;
        }

    }

    public static class SetSecurityPreferenceResponseSecurityPreferenceMFAPreference extends TeaModel {
        @NameInMap("AllowUserToManageMFADevices")
        @Validation(required = true)
        public Boolean allowUserToManageMFADevices;

        public static SetSecurityPreferenceResponseSecurityPreferenceMFAPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseSecurityPreferenceMFAPreference self = new SetSecurityPreferenceResponseSecurityPreferenceMFAPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseSecurityPreferenceMFAPreference setAllowUserToManageMFADevices(Boolean allowUserToManageMFADevices) {
            this.allowUserToManageMFADevices = allowUserToManageMFADevices;
            return this;
        }
        public Boolean getAllowUserToManageMFADevices() {
            return this.allowUserToManageMFADevices;
        }

    }

    public static class SetSecurityPreferenceResponseSecurityPreference extends TeaModel {
        @NameInMap("LoginProfilePreference")
        @Validation(required = true)
        public SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference loginProfilePreference;

        @NameInMap("AccessKeyPreference")
        @Validation(required = true)
        public SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference accessKeyPreference;

        @NameInMap("MFAPreference")
        @Validation(required = true)
        public SetSecurityPreferenceResponseSecurityPreferenceMFAPreference MFAPreference;

        public static SetSecurityPreferenceResponseSecurityPreference build(java.util.Map<String, ?> map) throws Exception {
            SetSecurityPreferenceResponseSecurityPreference self = new SetSecurityPreferenceResponseSecurityPreference();
            return TeaModel.build(map, self);
        }

        public SetSecurityPreferenceResponseSecurityPreference setLoginProfilePreference(SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference loginProfilePreference) {
            this.loginProfilePreference = loginProfilePreference;
            return this;
        }
        public SetSecurityPreferenceResponseSecurityPreferenceLoginProfilePreference getLoginProfilePreference() {
            return this.loginProfilePreference;
        }

        public SetSecurityPreferenceResponseSecurityPreference setAccessKeyPreference(SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference accessKeyPreference) {
            this.accessKeyPreference = accessKeyPreference;
            return this;
        }
        public SetSecurityPreferenceResponseSecurityPreferenceAccessKeyPreference getAccessKeyPreference() {
            return this.accessKeyPreference;
        }

        public SetSecurityPreferenceResponseSecurityPreference setMFAPreference(SetSecurityPreferenceResponseSecurityPreferenceMFAPreference MFAPreference) {
            this.MFAPreference = MFAPreference;
            return this;
        }
        public SetSecurityPreferenceResponseSecurityPreferenceMFAPreference getMFAPreference() {
            return this.MFAPreference;
        }

    }

}
